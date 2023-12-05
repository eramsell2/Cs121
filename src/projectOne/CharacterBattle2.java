package projectOne;


import java.util.Scanner;
public class CharacterBattle2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter an odd number of rounds: ");
        int rounds = Integer.parseInt(console.nextLine());
        Player player1 = new Player();
        Player player2 = new Player();
        for (int i = 0; i < rounds; i++) {
            player1.selectCharacter();
            player1.enterCharacterStats();

            player2.selectCharacter();
            player2.enterCharacterStats();
            Player winner = RoundWinner(player1, player2);
            System.out.println("Round " + (i + 1) + " winner: " + winner.getName());

        }
        System.out.println("Player 1 wins: " + player1.getWins());
        System.out.println("Player 2 wins: " + player2.getWins());

        Player overallWinner = player1.getWins() > player2.getWins() ? player1 : player2;

        System.out.println("Battle winner: " + overallWinner.getName());

    }

    private static Player RoundWinner(Player player1, Player player2) {
        for (int i = 1; i > player1.getHitPoints() && i > player2.getHitPoints(); ) {
            if (player1.getAttackSpeed() > player2.getAttackSpeed()) {
                int hp1 = player1.getMovePower() - player2.getHitPoints();
            } else {
                int hp2 = player2.getMovePower() - player1.getHitPoints();
            }
        }
            if (player1.getHitPoints() < 1) {
                return player2;

            } else if (player2.getHitPoints() < 1) {
                return player1;
            }return player1;


    }
}

        class Player {

            private String name;
            private int hitPoints;
            private String move;
            private int movePower;
            private int attackSpeed;
            private int wins;

            public Player() {
                this.name = "";
                this.hitPoints = 0;
                this.move = "";
                this.movePower = 0;
                this.attackSpeed = 0;
                this.wins = 0;
            }

            public void selectCharacter() {
                System.out.println("Select a character: ");
                Scanner console = new Scanner(System.in);
                String character = console.nextLine();
                this.name = character;
            }

            public void enterCharacterStats() {
                System.out.println("Enter HP: ");
                Scanner console = new Scanner(System.in);
                int hitPoints = Integer.parseInt(console.nextLine());
                this.hitPoints = hitPoints;

                System.out.println("Enter move: ");
                String move = console.nextLine();
                this.move = move;

                System.out.println("Enter move power: ");
                int movePower = Integer.parseInt(console.nextLine());
                this.movePower = movePower;

                System.out.println("Enter attack speed: ");
                int attackSpeed = Integer.parseInt(console.nextLine());
                this.attackSpeed = attackSpeed;
            }

            //setters and getters
            public String getName() {
                return name;
            }

            public int getHitPoints() {
                return hitPoints;
            }

            public String getMove() {
                return move;
            }

            public int getMovePower() {
                return movePower;
            }

            public int getAttackSpeed() {
                return attackSpeed;
            }

            public int getWins() {
                return wins;
            }

            public void setWins(int wins) {
                this.wins = wins;


            }
        }
