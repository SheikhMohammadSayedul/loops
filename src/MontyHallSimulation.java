import java.util.Random;
public class MontyHallSimulation {
    private Random random;
    public MontyHallSimulation() {
        this.random = new Random();
    }

    public double[] simulate(int numSimulations) {
        int stayWins = 0;
        int switchWins = 0;

        for (int i = 0; i < numSimulations; i++) {
            int carDoor = random.nextInt(3);

            int playerChoice = random.nextInt(3);
            int montyDoor;
            do {
                montyDoor = random.nextInt(3);
            } while (montyDoor == playerChoice || montyDoor == carDoor);

            int switchChoice;
            do {
                switchChoice = random.nextInt(3);
            } while (switchChoice == playerChoice || switchChoice == montyDoor);

            if (playerChoice == carDoor) {
                stayWins++;
            }

            if (switchChoice == carDoor) {
                switchWins++;
            }
        }

        double stayWinPercentage = (double) stayWins / numSimulations * 100;
        double switchWinPercentage = (double) switchWins / numSimulations * 100;

        return new double[]{stayWinPercentage, switchWinPercentage};
    }
}

