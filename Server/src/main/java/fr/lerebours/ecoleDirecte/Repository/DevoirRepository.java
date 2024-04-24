package fr.lerebours.ecoleDirecte.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.lerebours.ecoleDirecte.Model.Devoir;

@Repository
public interface DevoirRepository  extends CrudRepository<Devoir, Integer> {
    
}
