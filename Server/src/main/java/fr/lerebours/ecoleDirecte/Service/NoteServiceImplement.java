package fr.lerebours.ecoleDirecte.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Note;

@Service
public class NoteServiceImplement implements NoteService {
    @Autowired
    fr.lerebours.ecoleDirecte.Repository.NoteRepository NoteRepository;

    public Iterable<Note> getAllNotes() {
        return this.NoteRepository.findAll();
    }
    
    public Note getNoteByID(Integer Note_id) {
        return this.NoteRepository.findById(Note_id).isPresent() ? NoteRepository.findById(Note_id).get() : null;
    }

    public void addNote(Note Note) {
        this.NoteRepository.save(Note);
    }

    public void editNote(Note Note) {
        this.NoteRepository.save(Note);
    }

    public void deleteNoteByID(Integer Note_id) {
        this.NoteRepository.deleteById(Note_id);
    }
}
