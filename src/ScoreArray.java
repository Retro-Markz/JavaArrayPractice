import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {
        System.out.println("*****Average Score*****");
        var console = new Scanner(System.in);

        System.out.print("how many Scores you want to add? ");

        var totalScores = Integer.parseInt( console.nextLine());

        //create the array
        var scores = new int[totalScores];
        //ask for the values of every score
        for(var i = 0; i < totalScores; i++){
            System.out.print("Scores[" + i + "] = ");
            scores[i] = Integer.parseInt(console.nextLine());
        }
        //get the average score

        var scoresAdd = 0;
        for(var i = 0; i < totalScores; i++){
            scoresAdd += scores[i];
        }
        var average = scoresAdd / totalScores;
        System.out.println("\nAverage of total scores: " + average);

    }
}
