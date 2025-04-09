import java.io.*;
import java.util.*;

public class CustomersLoader {
    private List<Customers> customersList;

    public CustomersLoader(String filePath) {
        customersList = new ArrayList<>();
        loadCustomers(filePath);
    }

    private void loadCustomers(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Read the first line (header) and skip it
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int customerNumber = Integer.parseInt(parts[0].trim());
                int arrivalTime = Integer.parseInt(parts[1].trim());
                int durationService = Integer.parseInt(parts[2].trim());
                customersList.add(new Customers(customerNumber, arrivalTime, durationService));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Customers> getCustomersList() {
        return customersList;
    }
    
}
