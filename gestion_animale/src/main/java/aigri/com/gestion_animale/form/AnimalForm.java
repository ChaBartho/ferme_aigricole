package aigri.com.gestion_animale.form;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AnimalForm {
    @NotNull
    private Long id;
    @NotNull
    private String espece;
    @NotNull
    private String nom;
    @NotNull
    private String age;
    @NotNull
    private String logement;
}
