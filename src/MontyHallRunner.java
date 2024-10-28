public class MontyHallRunner {
    public static void main(String[] args) {
        MontyHallSimulation simulation = new MontyHallSimulation();
        double[] results = simulation.simulate(10000);
        System.out.println("Simulation results after 10000 simulations:");
        System.out.printf("Wins by staying with the initial choice: %.2f%%\n", results[0]);
        System.out.printf("Wins by switching the choice: %.2f%%\n", results[1]);

        if (results[0] > results[1]) {
            System.out.println("It is better to stay with the initial choice.");
        } else if (results[0] < results[1]) {
            System.out.println("It is better to switch the choice.");
        } else {
            System.out.println("Staying or switching the choice results in the same win rate.");
        }
    }
}

