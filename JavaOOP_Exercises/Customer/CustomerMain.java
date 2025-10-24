package Customer;

public class CustomerMain {
    public static void main(String[] args) {
        Customer c = new Customer(" Jielly ", " jielly@gmail.com ");
        c.addPurchase(500.0);
        c.addPurchase(100.0);
        System.out.println("Customer: " + c.getName());
        System.out.println("Total Expenditure: $" + c.calculateTotalExpenditure());
        
        LoyalCustomer lc = new LoyalCustomer(" Jamaica Abao ", " abao@gmail.com ", 10.0);
        lc.addPurchase(1000.0);
        lc.addPurchase(90.0);
        System.out.println("Loyal Customer: " + lc.getName());
        System.out.println("Total Expenditure: $" + lc.calculateTotalExpenditure());
        System.out.println("Discounted Price for $100: $" + lc.applyDiscount(100.0));
    }
}