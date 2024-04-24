package fr.lerebours.ecoleDirecte.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "public", name = "etudiants")
@Getter
@Setter
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    private String prenom;

    private String photo_URL;

    // @ManyToOne( fetch = FetchType.EAGER)
    // @JoinColumn(name = "id_classe")
    // private Classe classeId; 
}
