package fr.lerebours.ecoleDirecte.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Matiere;
import fr.lerebours.ecoleDirecte.Repository.MatiereRepository;

@Service
public class MatiereServiceImplement implements MatiereService {
    @Autowired
    MatiereRepository MatiereRepository;

    public Iterable<Matiere> getAllMatieres() {
        return this.MatiereRepository.findAll();
    }
    
    public Matiere getMatiereByID(Integer Matiere_id) {
        return this.MatiereRepository.findById(Matiere_id).isPresent() ? MatiereRepository.findById(Matiere_id).get() : null;
    }

    public void addMatiere(Matiere Matiere) {
        this.MatiereRepository.save(Matiere);
    }

    public void editMatiere(Matiere Matiere) {
        this.MatiereRepository.save(Matiere);
    }

    public void deleteMatiereByID(Integer Matiere_id) {
        this.MatiereRepository.deleteById(Matiere_id);
    }
}
