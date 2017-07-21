package exam1;

public class Exam01 {

    private int scorePlayerA = 0;

    public Exam01(String firstPerson, String secondPerson) {
    }

    public void playerAWin() {
        scorePlayerA++;
    }

    public void playerBWin() {
    }

    public String getScore() {
        int score = 0;

        if(scorePlayerA == 1){
            return "Fifteen-Love";
        }

        return "Love-All";
    }

}
