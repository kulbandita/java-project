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

        String A = "Love";
        String B = "Love";
        String dash = "-";

        if (scorePlayerA == 4 && scorePlayerB == 3) {
            return "Advantage Player A";
        }
        if (scorePlayerB == 4 && scorePlayerA == 3) {
            return "Advantage Player B";
        }

        if (scorePlayerA == 0 && scorePlayerB == 0) {
            return "Love-All";
        } else if (scorePlayerA == 1 && scorePlayerB == 1) {
            return "Fifteen-All";
        } else if (scorePlayerA == 2 && scorePlayerB == 2) {
            return "Thirty-All";
        } else if (scorePlayerA == 3 && scorePlayerB == 3) {
            return "Deuce";
        } else if (scorePlayerA == 4 && scorePlayerB == 4) {
            return "Deuce";
        }

        switch (scorePlayerA) {
            case 1:
                A = "Fifteen";
                break;
            case 2:
                A = "Thirty";
                break;
            case 3:
                A = "Forty";
                break;
            case 4:
                return "Win for Player A";
        }

        switch (scorePlayerB) {
            case 1:
                B = "Fifteen";
                break;
            case 2:
                B = "Thirty";
                break;
            case 3:
                B = "Forty";
                break;
            case 4:
                return "Win for Player B";
        }

        return A + dash + B;
    }

}
