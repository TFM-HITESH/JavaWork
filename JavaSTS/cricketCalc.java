import java.util.Scanner;

public class cricketCalc {
    public static void main(String[] args) {
        int totalBalls;
        int totalRuns;
        int scoredRuns;
        int playedBalls;

        Scanner sc = new Scanner(System.in);

        totalBalls = sc.nextInt();
        totalRuns = sc.nextInt();
        scoredRuns = sc.nextInt();
        playedBalls = sc.nextInt();

        // int runsLeft = totalRuns - scoredRuns;
        // int ballsLeft = totalBalls - playedBalls;

        System.out.println((float) (totalBalls / 6.0));
        System.out.println((float) (playedBalls / 6.0));
        System.out.println((float) (scoredRuns / (playedBalls / 6.0)));
        System.out.println((float) (totalRuns / (totalBalls / 6.0)));
        String output = (scoredRuns / (playedBalls / 6.0) >= totalRuns / (totalBalls / 6.0)) ? "Eligible to Win"
                : "Not Eligibile to Win";

        System.out.println(output);
    }
}
