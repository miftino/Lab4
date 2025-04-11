import java.util.List;

public class Main{
    public static void main(String[] args) {
        CustomersLoader loader = new CustomersLoader("Customers.csv");
        List<Customers> customers = loader.getCustomersList();
        for (Customers customer : customers) {
            System.out.println("Customer Number: " + customer.getCustomerNumber());
        }
    }
}