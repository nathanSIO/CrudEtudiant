package fr.lerebours.ecoleDirecte.Service;

import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Etudiant;

@Service
public interface EtudiantService {
    Iterable<Etudiant> getAllEtudiants();
    
    Etudiant getEtudiantByID(Integer etudiant_id);

    void addEtudiant(Etudiant etudiant);

    void editEtudiant(Etudiant etudiant);

    void deleteEtudiantByID(Integer etudiant_id);

    Iterable<Etudiant> getAllEtudiantsAvailable();
}
