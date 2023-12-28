package Event;

import Person.Fighter;

import java.util.Random;

public class Fight {
    public Fight(FightType fightType, Fighter fighter1, Fighter fighter2, Card card) {
        this.fightType = fightType;
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.card = card;
    }

    public enum FightType {
        MAIN,
        CO_MAIN,
        NORMAL
    }
    private FightType fightType;
    private Fighter fighter1;
    private int fighter1Points;
    private Fighter fighter2;
    private int fighter2Points;
    private Fighter winner;
    private int numberOfRounds;
    private Card card;
    public enum Result {
        WIN_AND_DEFEAT,
        DRAW,
        NO_CONTEST
    }
    private Result result;

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

    public void startFight() throws InterruptedException {
        Random random = new Random();
        int numberOfRounds = random.nextInt(1,6);

        System.out.println("Início da luta entre " + fighter1.getNickname() + " e " + fighter2.getNickname());

        for (int round = 1; round <= numberOfRounds; round++) {
            System.out.println("Início do round " + round);
            for (int fightEvent = 0; fightEvent < 4; fightEvent++) {
                int illegalStrike = random.nextInt(20);
                if (illegalStrike == 1) {
                    this.result = Result.NO_CONTEST;
                    System.out.println("\nResultado:");
                    System.out.println("A luta acabou com NO CONTEST!!");
                    return;
                }

                System.out.println("*****FIGHT!*****");

                System.out.println("Evento:");
                fighter1Points += fighter1.chooseRandomAttack();
                fighter2Points +=fighter2.chooseRandomDefense();
                Thread.sleep(1000);

                System.out.println("Evento:");
                fighter2Points += fighter2.chooseRandomAttack();
                fighter1Points += fighter1.chooseRandomDefense();
                Thread.sleep(1000);
            }
        }

        System.out.println("\nResultado:");
        if (fighter1Points > fighter2Points) {
            System.out.println(fighter1.getNickname() + " venceu!!");
            this.winner = fighter1;
            this.result = Result.WIN_AND_DEFEAT;
        } else if (fighter1Points < fighter2Points) {
            System.out.println(fighter2.getNickname() + " venceu!!");
            this.winner = fighter2;
            this.result = Result.WIN_AND_DEFEAT;
        } else {
            System.out.println("Empate!!");
            this.result = Result.DRAW;
        }

    }

}
