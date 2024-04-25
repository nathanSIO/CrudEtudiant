package fr.lerebours.ecoleDirecte.Service;

import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Devoir;

@Service
public interface DevoirService {
    Iterable<Devoir> getAllDevoirs();
    
    Devoir getDevoirByID(Integer devoir_id);

    void addDevoir(Devoir devoir, Integer classe_id);

    void editDevoir(Devoir devoir);

    void deleteDevoirByID(Integer devoir_id);
}
