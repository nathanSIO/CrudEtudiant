package fr.lerebours.ecoleDirecte.Service;

import fr.lerebours.ecoleDirecte.Model.DTO.EtudiantFullDTO;
import fr.lerebours.ecoleDirecte.Model.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Classe;
import fr.lerebours.ecoleDirecte.Repository.ClasseRepository;

@Service
public class ClasseServiceImplement implements ClasseService {
    @Autowired
    ClasseRepository classeRepository;

    public Iterable<Classe> getAllClasses() {
        return this.classeRepository.findAll();
    }
    
    public Classe getClasseByID(Integer classe_id) {
        return this.classeRepository.findById(classe_id).isPresent() ? classeRepository.findById(classe_id).get() : null;
    }

    public void addClasse(Classe classe) {
        this.classeRepository.save(classe);
    }

    public void editClasse(Classe classe) {
        this.classeRepository.save(classe);
    }

    public void deleteClasseByID(Integer classe_id) {
        this.classeRepository.deleteById(classe_id);
    }

    public void addEtudiantToClasse(Integer classe_id, Etudiant etudiant_id) {
        Classe classe = this.classeRepository.findById(classe_id).get();
        classe.addEtudiant(etudiant_id);
        this.classeRepository.save(classe);
    }

    public Iterable<EtudiantFullDTO> getAllEtudiantsFromClasses() {
        return this.classeRepository.findAllEtudiants();
    }
}
