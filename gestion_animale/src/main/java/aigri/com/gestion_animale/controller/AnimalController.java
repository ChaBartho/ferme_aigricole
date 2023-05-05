package aigri.com.gestion_animale.controller;

import aigri.com.gestion_animale.form.AnimalForm;
import aigri.com.gestion_animale.mapper.AnimalMapper;
import aigri.com.gestion_animale.model.dto.AnimalDTO;
import aigri.com.gestion_animale.model.entity.Animal;
import aigri.com.gestion_animale.service.AnimalService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    private final AnimalService animalService;
    private final AnimalMapper mapper;
    public AnimalController(AnimalService animalService, AnimalMapper mapper) {
        this.animalService = animalService;
        this.mapper = mapper;
    }
    @GetMapping("/all")
    public List<AnimalDTO> getAll(){
        return animalService.getAll();
    }




    @GetMapping("/{id:[0-9]+}")
    public AnimalDTO getOne(@PathVariable long id){
        Animal animal = animalService.getOne(id).orElseThrow(() -> new RuntimeException());
        return mapper.toDto(animal);
    }



    @PostMapping("/add")
    public void createAnimal(@RequestBody @Valid AnimalForm form){
        animalService.createAnimal(form);
    }
    @DeleteMapping({"/{id:[0-9]+}", "/{id:[0-9]+}/delete"})
    public void deleteAnimal(@PathVariable long id){
        animalService.deleteAnimal(id);
    }
    @PatchMapping(path = "/{id:[0-9]+}/update")
    public void updateAnimal(@PathVariable long id, @RequestParam Map<String, String> params){
        Map<String, Object> mapValues = new HashMap<>();
        animalService.updateAnimal( id, mapValues );
    }


}
