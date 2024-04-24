package fr.lerebours.ecoleDirecte.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "public", name = "devoirs")
@Getter
@Setter
public class Devoir {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String type;

    private Date date;

    private int coefficient;

    // @ManyToOne
    // @JoinColumn(name = "id_classe")
    // private Classe classe;

    @OneToOne
    @JoinColumn(name = "id_matiere")
    private Matiere matiere;

    @OneToMany
    @JoinColumn(name = "id_parties")
    private List<Partie> parties = new ArrayList<>();
}
