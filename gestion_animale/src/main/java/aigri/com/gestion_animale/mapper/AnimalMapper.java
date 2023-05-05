package aigri.com.gestion_animale.mapper;

import aigri.com.gestion_animale.form.AnimalForm;
import aigri.com.gestion_animale.model.dto.AnimalDTO;
import aigri.com.gestion_animale.model.entity.Animal;
import org.springframework.stereotype.Service;

@Service
public class AnimalMapper {
    public AnimalDTO toDto(Animal entity){
        if(entity == null)
            return null;
        return AnimalDTO.builder()
                .id(entity.getId())
                .espece(entity.getEspece())
                .nom(entity.getNom())
                .age(entity.getAge())
                .logement(entity.getLogement())
                .build();
    }

    public Animal toEntity(AnimalForm form){
        Animal entity = new Animal();

        return entity;
    }

}
