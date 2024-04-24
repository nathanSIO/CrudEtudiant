package fr.lerebours.ecoleDirecte.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "public", name = "classes")
@Getter
@Setter
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String denomination;

    // @OneToMany(mappedBy = "classeId", fetch = FetchType.EAGER)
    // private Etudiant[] etudiants;
    
    @OneToMany( fetch = FetchType.EAGER)
    @JoinColumn(name = "id_classe")
    private List<Etudiant> etudiants;

    @OneToMany( fetch = FetchType.EAGER)
    @JoinColumn(name = "id_devoir")
    private List<Devoir> devoirs;

    public void addEtudiant(Etudiant etudiant) {
        this.etudiants.add(etudiant);
    }
}