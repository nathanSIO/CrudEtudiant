package fr.lerebours.ecoleDirecte.Repository;

import fr.lerebours.ecoleDirecte.Model.DTO.EtudiantFullDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.lerebours.ecoleDirecte.Model.Classe;

@Repository
public interface ClasseRepository  extends CrudRepository<Classe, Integer> {

    @Query("SELECT new fr.lerebours.ecoleDirecte.Model.DTO.EtudiantFullDTO(e.id, e.nom, e.prenom, e.photo_URL, c.id) FROM Classe c JOIN c.etudiants e")
    Iterable<EtudiantFullDTO> findAllEtudiants();
}
