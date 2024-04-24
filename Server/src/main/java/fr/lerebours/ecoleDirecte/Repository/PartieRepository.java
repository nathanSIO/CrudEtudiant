package fr.lerebours.ecoleDirecte.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.lerebours.ecoleDirecte.Model.Partie;

@Repository
public interface PartieRepository extends CrudRepository<Partie, Integer> {
    
}
