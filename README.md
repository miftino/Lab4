# Lab4

This project simulates a bank with a configurable number of tellers, to determine the optimal number needed to minimize customer wait time while avoiding overstaffing.

The bank receives a list of customers with their **arrival time** and **service duration**. The simulation runs from time `0` until all customers are processed.

The simulation runs with teller counts ranging from **2 to 10**, and prints out the **average process time** for each configuration.


How to Run the Code

1. Make sure all Java files and Customers.csv are in the same folder  
   Files:
   - Main.java
   - Customers.java
   - CustomersLoader.java
   - Simulation.java
   - Customers.csv

2. Compile the project  
   Open a terminal in the project folder and run:
   javac *.java

3. Run the simulation:
   java Main

4. Expected output:  
   The simulation will print the average processing time for each number of tellers (from 2 to 10), like:

   Tellers: 2 | Average Process Time: 16.92  
   Tellers: 3 | Average Process Time: 14.11  
   ...  
   Tellers: 10 | Average Process Time: 7.05  


 Data Structures Used

Structure           | Where Used               | Purpose  
--------------------|--------------------------|--------------------------------------------  
List<Customers>     | Main queue/input list    | Holds all customers in simulation  
ArrayList<Customers>| Waiting line             | Holds customers waiting for a teller  
ArrayList<Customers>| Tellers                  | Tracks active customers per teller  
Iterator            | Arrival check loop       | Used to add customers based on time  


