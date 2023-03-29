public class MethodChallenge {

    public static void main(String[] args) {

        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", playerPosition);

        playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Dave", playerPosition);

        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition("James", playerPosition);

        playerPosition = calculateHighScorePosition(25);
        displayHighScorePosition("Josh", playerPosition);

    }
        public static void displayHighScorePosition(String playerName, int playerPosition) {

            System.out.println(playerName + " achieved position "
                    + playerPosition + " on the high score list");
        }

        public static int calculateHighScorePosition(int playerScore) {

            if (playerScore >= 1000) {
                return 1;
            } else if (playerScore >= 500) {
                return 2;
            } else if (playerScore >= 100) {
                return 3;
            }

            return 4;
        }
}
