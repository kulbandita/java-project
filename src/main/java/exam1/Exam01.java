package exam1;

public class Exam01 {

    private int scorePlayerA = 0;
    private int scorePlayerB = 0;

    public Exam01(String firstPerson, String secondPerson) {
    }

    public void playerAWin() {
        scorePlayerA++;
    }

    public void playerBWin() {
        scorePlayerB++;
    }

    public String getScore() {

        if (scorePlayerA == 1 && scorePlayerB == 1) {
            return "Fifteen-All";
        } else if (scorePlayerA == 2 && scorePlayerB == 2) {
            return "Thirty-All";
        }

        if (scorePlayerA == 1) {
            return "Fifteen-Love";
        } else if (scorePlayerA == 2) {
            return "Thirty-Love";
        } else if (scorePlayerA == 3) {
            return "Forty-Love";
        } else if (scorePlayerA >= 4) {
            return "Win for Player A";
        }

        if (scorePlayerB == 1) {
            return "Love-Fifteen";
        } else if (scorePlayerB == 2) {
            return "Love-Thirty";
        } else if (scorePlayerB == 3) {
            return "Love-Forty";
        } else if (scorePlayerB >= 4) {
            return "Win for Player B";
        }

        return "Love-All";
    }

}
