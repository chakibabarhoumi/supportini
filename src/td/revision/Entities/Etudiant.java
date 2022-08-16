/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.revision.Entities;

import java.util.Objects;

/**
 *
 * @author GIGABYTE
 */
public abstract class Etudiant {

    protected int identifiant;
    protected String nom;
    protected String prenom;
    protected float moyenne;

    public Etudiant() {

    }

    public Etudiant(int identifiant, String nom, String prenom, float moyenne) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        if (this.identifiant != other.identifiant) {
            return false;
        }
        return true;
    }

    
   
    public abstract void ajouterUneAbsence();

    @Override
    public String toString() {
        return "Etudiant{" + "identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom + ", moyenne=" + moyenne + '}';
    }

}
