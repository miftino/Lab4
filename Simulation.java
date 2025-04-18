import java.util.*;

public class Simulation {
    
    public static double runSimulation (List <Customers> customers, int numTeller){
        int currentTime = 0;
        int totalProcessTime = 0;
        int customersProcessed = 0;

        List<Customers> queue = new ArrayList<>();
        for (Customers customer : customers) {
            queue.add(customer);
        }
        List<Customers> teller = new ArrayList<>();
        for (int i = 0; i < numTeller; i++) {
            teller.add(null);
        }
        while (!queue.isEmpty() || teller.stream().anyMatch(Objects::nonNull)) {
            // Check if any teller is free
            for (int i = 0; i < numTeller; i++) {
                if (teller.get(i) == null && !queue.isEmpty()) {
                    Customers customer = queue.remove(0);
                    teller.set(i, customer);
                    currentTime = Math.max(currentTime, customer.getArrivalTime());
                }
            }

            // Process customers
            for (int i = 0; i < numTeller; i++) {
                if (teller.get(i) != null) {
                    Customers customer = teller.get(i);
                    customer.remainingServiceTime--;
                    if (customer.getRemainingServiceTime() == 0) {
                        totalProcessTime += currentTime - customer.getArrivalTime();
                        customersProcessed++;
                        teller.set(i, null);
                    }
                }
            }
            currentTime++;
        }
        double averageProcessTime = (double) totalProcessTime / customersProcessed;
        return averageProcessTime;
    }

}
