package fr.lerebours.ecoleDirecte.Service;

import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Matiere;

@Service
public interface MatiereService {
    Iterable<Matiere> getAllMatieres();
    
    Matiere getMatiereByID(Integer matiere_id);

    void addMatiere(Matiere matiere);

    void editMatiere(Matiere matiere);

    void deleteMatiereByID(Integer matiere_id);
}
