package aigri.com.gestion_animale.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnimalDTO {
    private Long id;
    private String espece;
    private String nom;
    private String age;
    private String logement;
}
