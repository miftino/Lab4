import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        CustomersLoader loader = new CustomersLoader("Customers.csv");
        List<Customers> customers = loader.getCustomersList();
        for (Customers customer : customers) {
            System.out.println("Customer Number: " + customer.getCustomerNumber());
            System.out.println("Arrival Time: " + customer.getArrivalTime()); // Fixed method call
            System.out.println("Duration of Service: " + customer.getDurationService());
            System.out.println("Remaining Service Time: " + customer.getRemainingServiceTime());
            System.out.println("------------------------------");
        }
    }
}