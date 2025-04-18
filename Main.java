import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomersLoader loader = new CustomersLoader("Customers.csv");
        List<Customers> customers = loader.getCustomersList();

        for (int tellers = 2; tellers <= 10; tellers++) {
            double avgTime = Simulation.runSimulation(customers, tellers);
            System.out.printf("Tellers: %d | Average Process Time: %.2f\n", tellers, avgTime);
        }
    }
}
