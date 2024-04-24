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

import fr.lerebours.ecoleDirecte.Model.Etudiant;
import fr.lerebours.ecoleDirecte.Service.EtudiantService;

@RestController
@RequestMapping("/api/etudiant")
@CrossOrigin(origins = "*")
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService;

    @GetMapping("/all")
    public Iterable<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("")
    public Etudiant getEtudiantByID(@RequestParam Integer id) {
        return this.etudiantService.getEtudiantByID(id);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addEtudiant(@RequestBody Etudiant Etudiant) {
        etudiantService.addEtudiant(Etudiant);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<?> editEtudiant(@RequestBody Etudiant Etudiant) {
        etudiantService.editEtudiant(Etudiant);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteEtudiantByID(@RequestParam Integer id) {
        etudiantService.deleteEtudiantByID(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/allAvailable")
    public Iterable<Etudiant> getAllEtudiantsAvailable() {
        return this.etudiantService.getAllEtudiantsAvailable();
    }
}