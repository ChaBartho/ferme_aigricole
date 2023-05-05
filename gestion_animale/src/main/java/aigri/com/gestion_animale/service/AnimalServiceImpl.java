package aigri.com.gestion_animale.service;

import aigri.com.gestion_animale.form.AnimalForm;
import aigri.com.gestion_animale.mapper.AnimalMapper;
import aigri.com.gestion_animale.model.dto.AnimalDTO;
import aigri.com.gestion_animale.model.entity.Animal;
import aigri.com.gestion_animale.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService{
    private final AnimalRepository animalRepository;
    private final AnimalMapper mapper;
    public AnimalServiceImpl(AnimalRepository animalRepository, AnimalMapper mapper) {
        this.animalRepository = animalRepository;
        this.mapper = mapper;
    }
    @Override
    public Optional<Animal> getOne(long id) {
        return animalRepository.findById(id);
    }


    @Override
    public List<AnimalDTO> getAll() {
        return null;
    }
    @Override
    public void createAnimal(AnimalForm form) {
    }
    @Override
    public void deleteAnimal(long id) {
    }
    @Override
    public void updateAnimal(long id, Map<String, Object> updateData) {

    }
}
