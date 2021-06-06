package Exercice30;

public class EtudiantEtrangers extends Etudiant {
    private String nativeCountry;
    /**
     * Cette methode c'est notre constructeur enfant
     * @param firstname
     * @param lastname
     * @param age
     * @param nativeCountry: pays d'origine
     */
    public EtudiantEtrangers(String firstname, String lastname, int age, String nativeCountry) {
        super(firstname, lastname, age);
        this.nativeCountry = nativeCountry;
    }
    
    public String getNativeCountry() {
        return nativeCountry;
    }

    /**
     * Cette methode imprime sur la console 
     * l’identité d’un étudiant etranger
     */
    @Override
    public void afficheEtudiant() {
        System.out.println("Prenom: "+firstname);
        System.out.println("Nom :"+lastname);
        System.out.println("Age :"+age);
        System.out.println("Pays d'origine :"+nativeCountry);
    }
    
}
