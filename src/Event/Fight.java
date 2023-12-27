package Event;

import Person.Fighter;

public class Fight {
    public enum FightType {
        MAIN,
        CO_MAIN,
        NORMAL
    }
    private FightType fightType;
    private Fighter fighter1;
    private Fighter fighter2;
    private Fighter winner;
    private int numberOfRounds;
    public enum Result {
        WIN_AND_DEFEAT,
        DRAW,
        NO_CONTEST
    }
    public Result result;

    public FightType getFightType() {
        return fightType;
    }

    public void setFightType(FightType fightType) {
        this.fightType = fightType;
    }

    public Fighter getFighter1() {
        return fighter1;
    }

    public void setFighter1(Fighter fighter1) {
        this.fighter1 = fighter1;
    }

    public Fighter getFighter2() {
        return fighter2;
    }

    public void setFighter2(Fighter fighter2) {
        this.fighter2 = fighter2;
    }

    public Fighter getWinner() {
        return winner;
    }

    public void setWinner(Fighter winner) {
        this.winner = winner;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
