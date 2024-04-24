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

import fr.lerebours.ecoleDirecte.Model.Classe;
import fr.lerebours.ecoleDirecte.Service.ClasseService;

@RestController
@RequestMapping("/api/classe")
@CrossOrigin(origins = "*")
public class ClasseController {
     
    @Autowired
    ClasseService classeService;

    @GetMapping("/all")
    public Iterable<Classe> getAllClasses() {
        return classeService.getAllClasses();
    }

    @GetMapping("")
    public Classe getClasseByID(@RequestParam Integer id) {
        return this.classeService.getClasseByID(id);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addClasse(@RequestBody Classe classe) {
        classeService.addClasse(classe);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<?> editClasse(@RequestBody Classe classe) {
        classeService.editClasse(classe);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteClasseByID(@RequestParam Integer id) {
        classeService.deleteClasseByID(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
