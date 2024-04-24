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

import fr.lerebours.ecoleDirecte.Model.Devoir;
import fr.lerebours.ecoleDirecte.Service.DevoirService;

@RestController
@RequestMapping("/api/devoir")
@CrossOrigin(origins = "*")
public class DevoirController {
    @Autowired
    DevoirService DevoirService;

    @GetMapping("/all")
    public Iterable<Devoir> getAllDevoirs() {
        return DevoirService.getAllDevoirs();
    }

    @GetMapping("")
    public Devoir getDevoirByID(@RequestParam Integer id) {
        return this.DevoirService.getDevoirByID(id);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addDevoir(@RequestBody Devoir Devoir) {
        DevoirService.addDevoir(Devoir);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<?> editDevoir(@RequestBody Devoir Devoir) {
        DevoirService.editDevoir(Devoir);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteDevoirByID(@RequestParam Integer id) {
        DevoirService.deleteDevoirByID(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
