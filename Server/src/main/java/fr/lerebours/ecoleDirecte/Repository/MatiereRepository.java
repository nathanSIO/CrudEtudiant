package fr.lerebours.ecoleDirecte.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.lerebours.ecoleDirecte.Model.Matiere;

@Repository
public interface MatiereRepository extends CrudRepository<Matiere, Integer> {
    
}
