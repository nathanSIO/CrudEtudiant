package fr.lerebours.ecoleDirecte.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Devoir;
import fr.lerebours.ecoleDirecte.Repository.DevoirRepository;

@Service
public class DevoirServiceImplement implements DevoirService {
    @Autowired
    DevoirRepository DevoirRepository;

    public Iterable<Devoir> getAllDevoirs() {
        return this.DevoirRepository.findAll();
    }
    
    public Devoir getDevoirByID(Integer Devoir_id) {
        return this.DevoirRepository.findById(Devoir_id).isPresent() ? DevoirRepository.findById(Devoir_id).get() : null;
    }

    public void addDevoir(Devoir Devoir) {
        this.DevoirRepository.save(Devoir);
    }

    public void editDevoir(Devoir Devoir) {
        this.DevoirRepository.save(Devoir);
    }

    public void deleteDevoirByID(Integer Devoir_id) {
        this.DevoirRepository.deleteById(Devoir_id);
    }
}
