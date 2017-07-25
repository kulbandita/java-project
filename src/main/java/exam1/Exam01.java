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

    public boolean isAll() {
        if (scorePlayerA == scorePlayerB) {
            return true;
        }
        return false;
    }

    public boolean isNormal() {
        if (scorePlayerA <= 3 || scorePlayerB <= 3) {
            return true;
        }
        return false;
    }

    public String getScore() {

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
        } else if(isNormal()) {
            for (int i = 0; i < 2; i++) {
                int tempScore = 0;
                if (i == 0) {
                    tempScore = scorePlayerA;
                } else {
                    score.append("-");
                    tempScore = scorePlayerB;
                }
                switch (tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
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

        return score.toString();
    }

}
