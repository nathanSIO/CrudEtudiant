package fr.lerebours.ecoleDirecte.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.lerebours.ecoleDirecte.Model.Note;

@Repository
public interface NoteRepository extends CrudRepository<Note, Integer> {
    
}
