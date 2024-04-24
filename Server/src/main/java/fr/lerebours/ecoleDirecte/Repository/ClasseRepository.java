package fr.lerebours.ecoleDirecte.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.lerebours.ecoleDirecte.Model.Classe;

@Repository
public interface ClasseRepository  extends CrudRepository<Classe, Integer> {

}
