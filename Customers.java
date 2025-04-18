public class Customers {
    private int customerNumber;
    private int arrivalTime;
    private int durationService;
    private int remainingServiceTime;

    public Customers(int customerNumber, int arrivalTime, int durationService) {
        this.customerNumber = customerNumber;
        this.arrivalTime = arrivalTime;
        this.durationService = durationService;
        this.remainingServiceTime = durationService;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getDurationService() {
        return durationService;
    }

    public int getRemainingServiceTime() {
        return remainingServiceTime;
    }
    public void setRemainingServiceTime(int time) {
        this.remainingServiceTime = time;
    }
    

}