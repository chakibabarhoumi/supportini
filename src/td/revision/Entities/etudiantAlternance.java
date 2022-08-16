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
public class etudiantAlternance extends Etudiant{
    protected int salaire;

    public etudiantAlternance() {
    }

    public etudiantAlternance(int identifiant, String nom, String prenom, float moyenne,int salaire) {
        super(identifiant, nom, prenom, moyenne);
        this.salaire=salaire;
        
        
        
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void ajouterUneAbsence() {
        this.salaire -=50;
        System.out.println("Le salaire a été reduit du 50 DT");
    }

    @Override
    public String toString() {
        return super.toString()+ "etudiantAlternance{" + "salaire=" + salaire + '}';
    }
    
    
    
}
