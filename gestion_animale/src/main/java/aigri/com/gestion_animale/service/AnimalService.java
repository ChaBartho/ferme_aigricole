package aigri.com.gestion_animale.service;

import aigri.com.gestion_animale.form.AnimalForm;
import aigri.com.gestion_animale.model.dto.AnimalDTO;
import aigri.com.gestion_animale.model.entity.Animal;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AnimalService {

    Optional<Animal> getOne(long id);

    List<AnimalDTO> getAll();

    void createAnimal(AnimalForm form);

    void deleteAnimal(long id);

    void updateAnimal(long id, Map<String, Object> updateData);
}
