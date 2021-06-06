package Exercice30;
public class GroupeTD {
    private Etudiant[] studentList;
    private int maxEt;
    private static int studentNumber = 0;
    /**
     * Cette constructeur sert a initialiser aussi la liste d'etudiant
     * @param maxEt
     */
    public GroupeTD(int maxEt) {
        this.maxEt = maxEt;
        studentList = new Etudiant[maxEt];
    }
    public void addStudent(Etudiant e) {
        if(studentNumber < maxEt) {
            studentList[studentNumber] = e;
            studentNumber++;
        } else {
            System.out.println("Sorry, the list is full");
            System.exit(-1);
        }
    }
    public void afficherListe() {
        for(int i = 0; i < studentList.length; i++){
            studentList[i].afficheEtudiant();
        }
    }
    

}
