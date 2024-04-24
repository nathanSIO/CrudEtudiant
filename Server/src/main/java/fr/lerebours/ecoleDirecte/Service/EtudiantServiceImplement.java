package fr.lerebours.ecoleDirecte.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Etudiant;
import fr.lerebours.ecoleDirecte.Repository.EtudiantRepository;

@Service
public class EtudiantServiceImplement implements EtudiantService {
    @Autowired
    EtudiantRepository etudiantRepository;

    public Iterable<Etudiant> getAllEtudiants() {
        return this.etudiantRepository.findAll();
    }
    
    public Etudiant getEtudiantByID(Integer Etudiant_id) {
        return this.etudiantRepository.findById(Etudiant_id).isPresent() ? etudiantRepository.findById(Etudiant_id).get() : null;
    }

    public void addEtudiant(Etudiant Etudiant) {
        this.etudiantRepository.save(Etudiant);
    }

    public void editEtudiant(Etudiant Etudiant) {
        this.etudiantRepository.save(Etudiant);
    }

    public void deleteEtudiantByID(Integer Etudiant_id) {
        this.etudiantRepository.deleteById(Etudiant_id);
    }

    // public Iterable<Etudiant> getAllEtudiantsAvailable() {
    //     return this.etudiantRepository.findAllByClasseIdIsNull();
    // }
}
