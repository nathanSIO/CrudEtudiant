import { Classe } from './classe';

export interface Etudiant {
  id?: number;
  nom?: string;
  prenom?: string;
  photo?: string;
  id_classe?: number | null;
  denomination?: string;


  // classeId?: Classe;
}
