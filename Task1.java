import java.util.Scanner;

class Task1{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le nombre d'étudiants dans la classe
        System.out.print("nombre d'étudiants  dans la classe :");
        int nombreEtudiants = scanner.nextInt();

        // Déclarer des tableaux pour stocker les noms et les notes des étudiants
        double[] notesEtudiants = new double[nombreEtudiants];

        // Lire les noms et les notes des étudiants
     for (int i = 0; i < nombreEtudiants; i++) {  
         System.out.print("Entrez la note de l'étudiant " + (i + 1) + " : ");
         notesEtudiants[i] = scanner.nextDouble();
      }
        // Calculer la moyenne, la note la plus élevée et la note la plus basse
        double sommeNotes = 0;
        double noteLaPlusHaute = notesEtudiants[0];
        double noteLaPlusBasse = notesEtudiants[0];

        for (double note : notesEtudiants) {
            sommeNotes =sommeNotes+ note;
            if (note > noteLaPlusHaute) {
                noteLaPlusHaute = note;
            }
            if (note < noteLaPlusBasse) {
                noteLaPlusBasse = note;
            }
        }

        double moyenne = sommeNotes / nombreEtudiants;

        // Afficher les résultats
        System.out.println("Moyenne des notes: " + moyenne);
        System.out.println("Note la plus élevée: " + noteLaPlusHaute);
        System.out.println("Note la plus basse: " + noteLaPlusBasse);

        scanner.close();
    }
}