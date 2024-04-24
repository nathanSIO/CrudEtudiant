package fr.lerebours.ecoleDirecte.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.lerebours.ecoleDirecte.Model.Note;
import fr.lerebours.ecoleDirecte.Service.NoteService;

@RestController
@RequestMapping("/api/note")
@CrossOrigin(origins = "*")
public class NoteController {
    @Autowired
    NoteService NoteService;

    @GetMapping("/all")
    public Iterable<Note> getAllNotes() {
        return NoteService.getAllNotes();
    }

    @GetMapping("")
    public Note getNoteByID(@RequestParam Integer id) {
        return this.NoteService.getNoteByID(id);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addNote(@RequestBody Note Note) {
        NoteService.addNote(Note);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<?> editNote(@RequestBody Note Note) {
        NoteService.editNote(Note);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteNoteByID(@RequestParam Integer id) {
        NoteService.deleteNoteByID(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
