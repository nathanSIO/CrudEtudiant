package fr.lerebours.ecoleDirecte.Model.DTO;

import fr.lerebours.ecoleDirecte.Model.Etudiant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EtudiantFullDTO {

    public EtudiantFullDTO() {
    }

    public EtudiantFullDTO(Integer id, String nom, String prenom, String photo_URL, Integer id_classe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.photo_URL = photo_URL;
        this.id_classe = id_classe;
    }

    public EtudiantFullDTO(Etudiant etudiant) {
        this.id = etudiant.getId();
        this.nom = etudiant.getNom();
        this.prenom = etudiant.getPrenom();
        this.photo_URL = etudiant.getPhoto_URL();
        this.id_classe = null;
    }

    public EtudiantFullDTO(Etudiant etudiant, Integer id_classe) {
        this.id = etudiant.getId();
        this.nom = etudiant.getNom();
        this.prenom = etudiant.getPrenom();
        this.photo_URL = etudiant.getPhoto_URL();
        this.id_classe = id_classe;
    }

    public EtudiantFullDTO(Integer id, String nom, String prenom, String photo_URL,Integer id_classe, String denomination) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.photo_URL = photo_URL;
        this.id_classe = id_classe;
        this.denomination = denomination;
    }

    private Integer id;

    private String nom;

    private String prenom;

    private String photo_URL;

    private Integer id_classe;

    private String denomination;
}
