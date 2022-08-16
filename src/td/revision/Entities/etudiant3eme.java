/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.revision.Entities;

import td.revision.Entities.Etudiant;

/**
 *
 * @author GIGABYTE
 */
public class etudiant3eme extends Etudiant {

    protected String branche;

    public etudiant3eme() {
    }

    public etudiant3eme(String branche,int identifiant, String nom, String prenom, float moyenne) {
        super(identifiant, nom, prenom, moyenne);
        this.branche=branche;
        
        
        
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

  
    


    @Override
    public String toString() {
        return super.toString()+ "etudiant3eme{" + "branche=" + branche + '}';
    }

    @Override
    public void ajouterUneAbsence() {
        this.moyenne-=0.5;
        System.out.println("Point reduit 0.5");

    }
    
    

     
     
     
}
