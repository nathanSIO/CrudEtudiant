package fr.lerebours.ecoleDirecte.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.lerebours.ecoleDirecte.Model.DTO.EtudiantFullDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "public", name = "etudiants")
@Getter
@Setter
public class Etudiant {

    public Etudiant() {
    }

    public Etudiant(EtudiantFullDTO etudiantFullDTO) {
        this.id = etudiantFullDTO.getId();
        this.nom = etudiantFullDTO.getNom();
        this.prenom = etudiantFullDTO.getPrenom();
        this.photo_URL = etudiantFullDTO.getPhoto_URL();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    private String prenom;

    private String photo_URL;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_classe")
    private Classe classe;

    // @OneToMany
    // @JoinColumn(name="id_etudiant")
    // private Note note;
}

// @ManyToOne( fetch = FetchType.EAGER)
    // @JoinColumn(name = "id_classe")
    // private Classe classeId; 
