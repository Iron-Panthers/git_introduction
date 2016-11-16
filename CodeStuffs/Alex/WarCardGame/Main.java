import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Deck deck;
    public static ArrayList<Player> players;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        deck = new Deck();
        players = new ArrayList<>();

        Player human = new Player();
        Player computer = new Player(true);

        players.add(human);
        players.add(computer);


        while (true) {
            if (deck.getDeckSize() < players.size()) {
                System.out.println("No more cards. Game Over!");
                break;
            }

            for (Player player : players) {
                int playerNumber = players.indexOf(player) + 1;
                System.out.println(String.format("Player %s:", playerNumber));
                System.out.println("Press enter to draw a card");
                scanner.nextLine();
                Card card = player.drawCard();
                System.out.println(String.format("* %s\n", card));

            }

            boolean tie = checkForTie();

            if (!tie) {
                Player winner = getWinner();
                int winnerPNumber = players.indexOf(winner) + 1;
                System.out.println(String.format("Player %s wins!", winnerPNumber));
            } else {
                //tie
            }


        }
    }

    public static boolean checkForTie() {
        boolean tie = true;
        for (Player player : players) {
            int checkValue = players.get(0).getCard().getValue();
            int value = player.getCard().getValue();
            if (!(checkValue == value)) {
                tie = false;
                break;
            }
        }
        return tie;
    }

    public static Player getWinner() {
        Player max = players.get(0);
        for (Player player : players) {
            Card maxCard = max.getCard();
            int maxValue = maxCard.getValue();

            Card card = player.getCard();
            int value = card.getValue();

            if (value > maxValue) {
                max = player;
            }
        }
        return max;
    }
}
