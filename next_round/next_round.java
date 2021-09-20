import java.util.Scanner;

    public class NextRound {
        public static void main(String[] args) {
        int scores[];
        int contestants;
        int minimumScore, indexMinimumScore;
        int total = 0;

        Scanner in = new Scanner(System.in);
        contestants = in.nextInt();
        indexMinimumScore = (in.nextInt() - 1);
        scores = new int[contestants];

        for(int indexContestant = 0; indexContestant < contestants; indexContestant++) {
            scores[indexContestant] = in.nextInt();
        }

        minimumScore = scores[indexMinimumScore];

        for(int indexContestant = 0; indexContestant < contestants; indexContestant++) {
            if(scores[indexContestant] >= minimumScore && scores[indexContestant] > 0){
               total++;
            } 
        }

        System.out.println(total);
        }
    }
