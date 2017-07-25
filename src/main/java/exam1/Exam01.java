package exam1;

public class Exam01 {

    private String namePlayerA;
    private String namePlayerB;
    private StringBuffer score;
    private int scorePlayerA = 0;
    private int scorePlayerB = 0;

    public Exam01(String firstPerson, String secondPerson) {
        this.namePlayerA = firstPerson;
        this.namePlayerB = secondPerson;
        score = new StringBuffer();
    }

    public void playerAWin() {
        scorePlayerA++;
    }

    public void playerBWin() {
        scorePlayerB++;
    }

    public boolean isLove() {
        if (scorePlayerA == 0 && scorePlayerB == 0) {
            return true;
        }
        return false;
    }

    public boolean isAll() {
        if (scorePlayerA == scorePlayerB) {
            return true;
        }
        return false;
    }

    public String getScore() {

        String A = "Love";
        String B = "Love";
        String dash = "-";

        if (isAll()) {
            switch (scorePlayerA) {
                case 0:
                    score = new StringBuffer("Love-All");
                    break;
                case 1:
                    score = new StringBuffer("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuffer("Thirty-All");
                    break;
                default:
                    score = new StringBuffer("Deuce");
            }
        }

        if (scorePlayerA > 3) {
            if (scorePlayerA - scorePlayerB == 1) {
                return "Advantage Player A";
            } else if (scorePlayerA - scorePlayerB > 1) {
                return "Win for Player A";
            }
        }
        if (scorePlayerB > 3) {
            if (scorePlayerB - scorePlayerA == 1) {
                return "Advantage Player B";

            } else if (scorePlayerB - scorePlayerA >= 1) {
                return "Win for Player B";
            }
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

        return score.toString();
    }

}
