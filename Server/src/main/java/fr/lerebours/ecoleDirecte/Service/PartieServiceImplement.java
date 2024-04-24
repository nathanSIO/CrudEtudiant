package fr.lerebours.ecoleDirecte.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Partie;
import fr.lerebours.ecoleDirecte.Repository.PartieRepository;

@Service
public class PartieServiceImplement implements PartieService {
    @Autowired
    PartieRepository PartieRepository;

    public Iterable<Partie> getAllParties() {
        return this.PartieRepository.findAll();
    }
    
    public Partie getPartieByID(Integer Partie_id) {
        return this.PartieRepository.findById(Partie_id).isPresent() ? PartieRepository.findById(Partie_id).get() : null;
    }

    public void addPartie(Partie Partie) {
        this.PartieRepository.save(Partie);
    }

    public void editPartie(Partie Partie) {
        this.PartieRepository.save(Partie);
    }

    public void deletePartieByID(Integer Partie_id) {
        this.PartieRepository.deleteById(Partie_id);
    }
}
