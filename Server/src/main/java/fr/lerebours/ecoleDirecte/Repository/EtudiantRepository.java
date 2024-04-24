package fr.lerebours.ecoleDirecte.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.lerebours.ecoleDirecte.Model.Etudiant;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Integer> {
    Iterable<Etudiant> findAllByClasseIdIsNull();
}
