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

import fr.lerebours.ecoleDirecte.Model.Matiere;
import fr.lerebours.ecoleDirecte.Service.MatiereService;

@RestController
@RequestMapping("/api/matiere")
@CrossOrigin(origins = "*")
public class MatiereController {
    @Autowired
    MatiereService MatiereService;

    @GetMapping("/all")
    public Iterable<Matiere> getAllMatieres() {
        return MatiereService.getAllMatieres();
    }

    @GetMapping("")
    public Matiere getMatiereByID(@RequestParam Integer id) {
        return this.MatiereService.getMatiereByID(id);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addMatiere(@RequestBody Matiere Matiere) {
        MatiereService.addMatiere(Matiere);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<?> editMatiere(@RequestBody Matiere Matiere) {
        MatiereService.editMatiere(Matiere);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteMatiereByID(@RequestParam Integer id) {
        MatiereService.deleteMatiereByID(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
