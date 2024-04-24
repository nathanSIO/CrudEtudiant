package fr.lerebours.ecoleDirecte.Service;

import org.springframework.stereotype.Service;

import fr.lerebours.ecoleDirecte.Model.Classe;

@Service
public interface ClasseService {
    Iterable<Classe> getAllClasses();
    
    Classe getClasseByID(Integer classe_id);

    void addClasse(Classe classe);

    void editClasse(Classe classe);

    void deleteClasseByID(Integer classe_id);
}
