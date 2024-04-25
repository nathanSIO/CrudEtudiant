package fr.lerebours.ecoleDirecte.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Table(schema = "public", name = "matieres")
@Getter
@Setter
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String denomination;


    @JsonIgnore
    @OneToMany( fetch = FetchType.EAGER)
    @JoinColumn(name = "id_matiere")
    private List<Devoir> devoirs;

    // @OneToMany( fetch = FetchType.EAGER)
    // @JoinColumn(name = "id_partie")
    // private List<Partie> parties;
}
