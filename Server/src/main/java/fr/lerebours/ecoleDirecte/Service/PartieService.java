package fr.lerebours.ecoleDirecte.Service;

import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Partie;

@Service
public interface PartieService {
    Iterable<Partie> getAllParties();
    
    Partie getPartieByID(Integer partie_id);

    void addPartie(Partie partie);

    void editPartie(Partie partie);

    void deletePartieByID(Integer partie_id);
}
