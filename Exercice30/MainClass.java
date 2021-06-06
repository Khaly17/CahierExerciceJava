package Exercice30;

public class MainClass {
    public static void main(String []args) {

        //On instancie nos 3 objets etudiant
        Etudiant etudiant1 = new Etudiant("Khaly", "DIENG", 22);
        Etudiant etudiant2 = new Etudiant("Maman", "DIENG", 21);
        Etudiant etudiant3 = new Etudiant("Cheikh", "Fall", 24);

        //On instancie nos 1 objet etudiant etranger
        Etudiant etudiantEtranger1 = new EtudiantEtrangers("Mouhamed", "Gnigue", 25, "Mauritanie");

        //On instancie 1 groupe de TD 
        GroupeTD groupeTD1 = new GroupeTD(4);

        //On ajoute les etudiants dans le groupe TD1
        groupeTD1.addStudent(etudiant1);
        groupeTD1.addStudent(etudiant2);
        groupeTD1.addStudent(etudiant3);
        groupeTD1.addStudent(etudiantEtranger1);

        //On affiche la liste des etudiant du groupe TD1
        groupeTD1.afficherListe();

        
    }
    
}
