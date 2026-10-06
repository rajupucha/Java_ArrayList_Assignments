import java.util.ArrayList;

class Customer {
    private int customerId;
    private String customerName;
    private String city;
    private String phoneNumber;

    public Customer(int customerId, String customerName, String city, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerId() { return customerId; }
    public String getCustomerName() { return customerName; }
    public String getCity() { return city; }
    public String getPhoneNumber() { return phoneNumber; }

    public void setCustomerId(int customerId) { this.customerId = customerId; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setCity(String city) { this.city = city; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}

public class Assignment5_CustomerManagementSystem {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(101, "Raju", "Kurnool", "9876543210"));
        customers.add(new Customer(102, "Arun", "Hyderabad", "9876543211"));
        customers.add(new Customer(103, "Suresh", "Bangalore", "9876543212"));
        customers.add(new Customer(104, "Kiran", "Chennai", "9876543213"));
        customers.add(new Customer(105, "Rahul", "Mumbai", "9876543214"));

        customers.add(2, new Customer(106, "Vijay", "Delhi", "9876543215"));
        customers.set(3, new Customer(107, "Ajay", "Pune", "9876543216"));
        customers.remove(1);

        System.out.println("Customer Details:");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("Customer ID: " + customer.getCustomerId());
            System.out.println("Customer Name: " + customer.getCustomerName());
            System.out.println("City: " + customer.getCity());
            System.out.println("Phone Number: " + customer.getPhoneNumber());
            System.out.println("---------------------------");
        }

        System.out.println("Total Customers: " + customers.size());
        customers.clear();
        System.out.println("Is Customer List Empty? " + customers.isEmpty());
    }
}
