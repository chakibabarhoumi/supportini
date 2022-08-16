/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.revision.Entities;

import td.revision.Entities.Etudiant;
import td.revision.Entities.etudiant3eme;
import td.revision.Entities.etudiantAlternance;

/**
 *
 * @author GIGABYTE
 */
public class TDRevision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Etudiant[] etudiants = null;
        
        
        Ecole E = new Ecole("ELIFE", etudiants);
        Etudiant et3= new etudiant3eme("it",3,"Mouhib","Hayouni", 15);
        Etudiant etA = new etudiantAlternance(1,"MMMM","HHHHH", 10,5000);
        //Ecole    et3 = new etudiantAlternance(1,"MMMM","HHHHH", 10,5000);
        
        try {
            E.ajouterEtud(etA);
        } catch (Exception e) {
            //System.out.println("L'etudiant existe déja");
        }
        
    
    }

}
