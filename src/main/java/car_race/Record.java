package car_race;

public class Record {

    private Integer participatedCarSize;
    private Integer round;
    private Integer highScore;

    public Integer getParticipatedCarSize() {
        return participatedCarSize;
    }

    public void setParticipatedCarSize(Integer participatedCarSize) {
        this.participatedCarSize = participatedCarSize;
    }

    public Integer getRound() {
        return round;
    }

    public Integer getHighScore() {
        return highScore;
    }

    public void setHighScore(Integer highScore) {
        this.highScore = highScore;
    }

    public void setRound(Integer round) {
        this.round = round;
    }
}
