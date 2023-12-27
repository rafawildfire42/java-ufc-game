package Person;

public class Fighter extends Person {

    private String nickname;
    private enum weightClass {
        STRAW_WEIGHT,
        FLY_WEIGHT,
        BANTAM_WEIGHT,
        FEATHER_WEIGHT,
        LIGHT_WEIGHT,
        WELTER_WEIGHT,
        MIDDLE_WEIGHT,
        LIGHT_HEAVY_WEIGHT,
        HEAVY_WEIGHT;
    }
    private int numberOfFights;
    private int numberOfFightsWon;
    private int numberOfFightsLost;
    private int numberOfFightsDraw;
    private int numberOfFightsNoContest;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getNumberOfFights() {
        return numberOfFights;
    }

    public void setNumberOfFights(int numberOfFights) {
        this.numberOfFights = numberOfFights;
    }

    public int getNumberOfFightsWon() {
        return numberOfFightsWon;
    }

    public void setNumberOfFightsWon(int numberOfFightsWon) {
        this.numberOfFightsWon = numberOfFightsWon;
    }

    public int getNumberOfFightsLost() {
        return numberOfFightsLost;
    }

    public void setNumberOfFightsLost(int numberOfFightsLost) {
        this.numberOfFightsLost = numberOfFightsLost;
    }

    public int getNumberOfFightsDraw() {
        return numberOfFightsDraw;
    }

    public void setNumberOfFightsDraw(int numberOfFightsDraw) {
        this.numberOfFightsDraw = numberOfFightsDraw;
    }

    public int getNumberOfFightsNoContest() {
        return numberOfFightsNoContest;
    }

    public void setNumberOfFightsNoContest(int numberOfFightsNoContest) {
        this.numberOfFightsNoContest = numberOfFightsNoContest;
    }
}
