/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.revision.Entities;

import td.revision.Entities.Exception.EtudiantExisteException;

/**
 *
 * @author GIGABYTE
 */
public class Ecole {

    String nom;
    public Etudiant[] etudiants;
    final int max_capacite=500;

    public Ecole(String nom, Etudiant[] etudiants) {
       this.nom = nom;
        this.etudiants = new Etudiant[max_capacite];

    }

    public void ajouterEtud(Etudiant etudiant) throws EtudiantExisteException{
            if (this.nom!=etudiant.nom){
              this.etudiants[max_capacite] = etudiant;
                System.out.println("Etudiant ajouter ...");
        //max_capacite++;
        }
           throw new EtudiantExisteException("Non ... étudiant existe déja");
        }
        

public int rechercheEtudiant(int id) {
        int position = 0;
        for (int i = 0; i < max_capacite; i++) {

            if (etudiants[i].getIdentifiant() == id) {
                position = i;
            }
        }
        return position;
    }
    
    public void getMoyenneDes3A(Etudiant etudiant){
        int total=0;
        for (int i = 0; i < max_capacite; i++) {
        }
    
    }
    
    
}
