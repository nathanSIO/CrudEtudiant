package fr.lerebours.ecoleDirecte.Service;

import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Note;

@Service
public interface NoteService {
    Iterable<Note> getAllNotes();
    
    Note getNoteByID(Integer note_id);

    void addNote(Note note);

    void editNote(Note note);

    void deleteNoteByID(Integer note_id);
}
