package Exercice30;
public class Etudiant{
    /**
     * Declaration des variables
     */
    protected String firstname;
    protected String lastname;
    protected int age;
    /**
     * Cette methode c'est notre constructeur de base
     * @param firstname: prenom
     * @param lastname: nom
     * @param age: age
     */
    public Etudiant(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
  
    public int getAge() {
        return age;
    }
    /**
     * imprime sur la console 
     * l’identité d’un étudiant national
     */
    public void afficheEtudiant() {
        System.out.println("Prenom: "+firstname);
        System.out.println("Nom :"+lastname);
        System.out.println("Age :"+age);
    }
    
}