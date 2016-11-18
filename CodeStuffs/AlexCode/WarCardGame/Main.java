import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static ArrayList<Card> drawedCards;
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Player> players;
    private static boolean breakLoop;

    public static void main(String[] args) {
        game(new Player(), new Player());
    }

    public static void game(Player... playersParam) {
        Deck deck = new Deck();
        players = new ArrayList<Player>(Arrays.asList(playersParam));
        drawedCards = new ArrayList<Card>();

        int deckSize = deck.getDeckSize();
        int deckSizeShare = deckSize / players.size();
        for (Player player : players) {
            ArrayList<Card> cards = new ArrayList<Card>();
            for (int i = 0; i < deckSizeShare; i++) {
                Card card = deck.drawCard();
                cards.add(card);
            }
            player.hand = new Deck(cards);
        }

        breakLoop = false;
        while (true) {
            drawedCards.clear();
            for (Player player : players) {
                if (player.hand.getDeckSize() == 0) {
                    int playerNumber = players.indexOf(player) + 1;
                    System.out.println(String.format("No more cards. Player %s wins!", playerNumber));
                    breakLoop = true;
                    break;
                }
                int playerNumber = players.indexOf(player) + 1;
                System.out.println(String.format("Player %s (%s cards):", playerNumber, player.hand.getDeckSize()));
                System.out.println("Press enter to draw a card");
                scanner.nextLine();
                Card card = player.drawCard();
                System.out.println(String.format("* %s\n", card));
            }

            if (breakLoop) {
                break;
            }

            int tieCount = 0;
            while (checkForTie()) {
                if (tieCount == 0) {
                    handleTie1();
                } else if (tieCount == 1) {
                    handleTie2(true);
                } else if (tieCount == 2) {
                    handleTie2(false);
                } else {
                    System.out.println("Tie Game!");
                    break;
                }
                tieCount++;
            }

            if (breakLoop) {
                break;
            }

            Player winner = getWinner();
            int playerNumber = players.indexOf(winner) + 1;
            System.out.println(String.format("- Player %s wins this round!\n", playerNumber));

            int drawedCardsSize = drawedCards.size();
            int drawedCardsShare = drawedCardsSize / (players.size() - 1);

            for (Player player : players) {
                if (player == winner) {
                    continue;
                }

                for (int i = 0; i < drawedCardsShare; i++) {
                    Card card = drawedCards.get(0);
                    drawedCards.remove(0);
                    player.addCard(card);
                }
            }
        }
    }
    public static boolean checkForTie() {
        boolean tie = true;
        for (Player player : players) {
            if (player.card == null) {
                return false;
            }
            int checkValue = players.get(0).card.getValue();
            int value = player.card.getValue();
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
            Card maxCard = max.card;
            int maxValue = maxCard.getValue();

            Card card = player.card;
            int value = card.getValue();

            if (value > maxValue) {
                max = player;
            }
        }
        return max;
    }

    public static void handleTie1() {
        System.out.println("- Tie!");
        for (Player player : players) {
            int playerNumber = players.indexOf(player) + 1;
            System.out.println(String.format("Player %s (%s cards):", playerNumber, player.hand.getDeckSize()));
            System.out.println("Press enter to draw 3 cards");
            scanner.nextLine();
            Card[] tieBreakerCards = player.drawTieBreakerCards();
            if (tieBreakerCards == null) {
                player.card = null;
                breakLoop = true;
                System.out.println(String.format("No more cards. Player %s wins!", playerNumber));
                return;
            } else {
                player.card = tieBreakerCards[0];
            }
            System.out.println(String.format("* %s, [hidden], [hidden]\n", player.card));
        }
    }

    public static void handleTie2(boolean hideCard3) {
        System.out.println("- Tie!");
        for (Player player : players) {
            int playerNumber = players.indexOf(player) + 1;
            System.out.println(String.format("Player %s (%s cards):", playerNumber, player.hand.getDeckSize()));
            System.out.println("Press enter to flip your card");
            scanner.nextLine();
            Card card1 = player.getTieBreakerCards()[0];
            Card card2 = player.getTieBreakerCards()[1];
            Object card3 = "[hidden]";
            if (hideCard3) {
                player.card = card2;
            } else {
                card3 = player.getTieBreakerCards()[2];
                player.card = (Card) card3;
            }
            System.out.println(String.format("* %s, %s, %s\n", card1, card2, card3));
        }
    }
}

