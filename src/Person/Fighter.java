package Person;

import java.util.Random;

public class Fighter extends Person implements Actions{

    private String nickname;

    public Fighter(String name, int height, double weight, int age, String nickname) {
        super(name, height, weight, age);
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return nickname;
    }

    @Override
    public int attackHighKick() {
        System.out.println(nickname + " atacando com um chute alto!");
        return 8;
    }

    @Override
    public int attackLowKick() {
        System.out.println(nickname + " atacando com um chute baixo!");
        return 5;
    }

    @Override
    public int attackJab() {
        System.out.println(nickname + " atacando com um jab!");
        return 5;
    }

    @Override
    public int attackUppercut() {
        System.out.println(nickname + " atacando com um uppercut!");
        return 8;
    }

    @Override
    public int attackNearHeadChoke() {
        System.out.println(nickname + " atacando com um mata leão!");
        return 9;
    }

    @Override
    public int attackArmTriangle() {
        System.out.println(nickname + " atacando com um katagatame!");
        return 9;
    }

    @Override
    public int specialStrike() {
        System.out.println(nickname + " atacando com um ataque especial!");
        return 10;
    }

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

    public int chooseRandomDefense() {
        Random random = new Random();
        int defensePoint = random.nextInt(3, 11);
        if (defensePoint < 6) {
            System.out.println(nickname + " não defendeu bem!");
        } else if (defensePoint > 9) {
            System.out.println(nickname + " defendeu muito bem!!");
        } else {
            System.out.println(nickname + " defendeu bem!");
        }
        return defensePoint;
    }

    public int chooseRandomAttack() {
        Random random = new Random();
        int randomNumber = random.nextInt(7);

        switch (randomNumber) {
            case 0:
                return attackHighKick();
            case 1:
                return attackLowKick();
            case 2:
                return attackJab();
            case 3:
                return attackUppercut();
            case 4:
                return attackNearHeadChoke();
            case 5:
                return attackArmTriangle();
            case 6:
                return specialStrike();
            default:
                return 3;
        }
    }

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
