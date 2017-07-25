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
        if (scorePlayerA <= 3 && scorePlayerB <= 3) {
            return true;
        }
        return false;
    }

    public String convertScore(int scoreValue) {
        switch (scoreValue) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        return "";
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
        } else if (isNormal()) {
            score.append(convertScore(scorePlayerA));
            score.append("-");
            score.append(convertScore(scorePlayerB));
        } else {
            int differentScore = scorePlayerA - scorePlayerB;
            if (differentScore == 1) {
                score = new StringBuffer("Advantage ");
                score.append(namePlayerA);
            } else if (differentScore == -1) {
                score = new StringBuffer("Advantage ");
                score.append(namePlayerB);
            } else if (differentScore >= 2) {
                score = new StringBuffer("Win for ");
                score.append(namePlayerA);
            } else if (differentScore <= -2) {
                score = new StringBuffer("Win for ");
                score.append(namePlayerB);
            }
        }
        return score.toString();
    }
}
