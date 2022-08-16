/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.revision.Entities.Exception;

/**
 *
 * @author GIGABYTE
 */
public class EtudiantExisteException extends Exception{

    public EtudiantExisteException() {
    }

    public EtudiantExisteException(String message) {
        super(message);
        System.out.println("****Cette etudiant existe déja");
    }
    
    
    
}
