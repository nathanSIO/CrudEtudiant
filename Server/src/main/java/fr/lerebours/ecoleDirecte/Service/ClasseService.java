package fr.lerebours.ecoleDirecte.Service;

import fr.lerebours.ecoleDirecte.Model.DTO.EtudiantFullDTO;
import fr.lerebours.ecoleDirecte.Model.Etudiant;
import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Classe;

@Service
public interface ClasseService {
    Iterable<Classe> getAllClasses();
    
    Classe getClasseByID(Integer classe_id);

    void addClasse(Classe classe);

    void editClasse(Classe classe);

    void deleteClasseByID(Integer classe_id);

    void addEtudiantToClasse(Integer classe_id, Etudiant etudiant_id);

    Iterable<EtudiantFullDTO> getAllEtudiantsFromClasses();
}
