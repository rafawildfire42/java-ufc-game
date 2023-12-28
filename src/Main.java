import Event.Event;
import Event.Card;
import Event.Fight;
import Location.Address;
import Location.Arena;
import Person.Fighter;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Definindo local
        Address address = new Address("Brazil", "São Paulo", "São Paulo");
        Arena arena = new Arena(
                "Ginásio do Ibirapuera",
                100,
                20,
                80,
                address);

        // Definindo lutadores
        Fighter fighter1 = new Fighter("Conor Mcgregor", 174, 70.5, 32, "The Notorious");
        Fighter fighter2 = new Fighter("Khabib Nurmagomedov", 172, 70.4, 31, "The Eagle");
        Fighter fighter3 = new Fighter("Brock Lesnar", 198, 120, 37, "The Next Big Thing");
        Fighter fighter4 = new Fighter("Demetrious Johnson", 170, 64, 38, "Mighty Mouse");

        // Definindo o evento tem apenas Card principal
        Event event = new Event(300, Event.EventType.UFC_NUMBERED);
        Card mainCard = new Card(Card.CardType.MAIN);
        Fight fight1 = new Fight(Fight.FightType.MAIN, fighter1, fighter2, mainCard);
        Fight fight2 = new Fight(Fight.FightType.CO_MAIN, fighter3, fighter4, mainCard);

        fight1.startFight();
        fight2.startFight();

        System.out.println("\nVencedores:");
        System.out.println(fight1.getWinner());
        System.out.println(fight2.getWinner());

    }
}