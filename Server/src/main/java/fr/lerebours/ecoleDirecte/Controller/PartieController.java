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

import fr.lerebours.ecoleDirecte.Model.Partie;
import fr.lerebours.ecoleDirecte.Service.PartieService;

@RestController
@RequestMapping("/api/partie")
@CrossOrigin(origins = "*")
public class PartieController {
    @Autowired
    PartieService PartieService;

    @GetMapping("/all")
    public Iterable<Partie> getAllParties() {
        return PartieService.getAllParties();
    }

    @GetMapping("")
    public Partie getPartieByID(@RequestParam Integer id) {
        return this.PartieService.getPartieByID(id);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addPartie(@RequestBody Partie Partie) {
        PartieService.addPartie(Partie);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<?> editPartie(@RequestBody Partie Partie) {
        PartieService.editPartie(Partie);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deletePartieByID(@RequestParam Integer id) {
        PartieService.deletePartieByID(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
