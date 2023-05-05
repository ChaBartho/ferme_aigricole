package aigri.com.gestion_animale.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String espece;
    @Column(nullable = false, unique = true)
    private String nom;
    @Column(nullable = false)
    private String age;
    @Column(nullable = false)
    private String logement;
}
