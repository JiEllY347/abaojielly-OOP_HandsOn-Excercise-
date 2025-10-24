package ElectronicProduct;

public class ElectronicProductMain {
    public static void main(String[] args) {
        ElectronicProduct ep = new ElectronicProduct("EP0010", "Cellphone", 10000.0);
        ep.applyDiscount(10.0);
        System.out.println("Final Price: " + ep.calculateFinalPrice());
        
        WashingMachine wm = new WashingMachine("TM001", " Laptop ", 8000.0, 2);
        wm.applyDiscount(5.0);
        System.out.println("Laptop Final Price: " + wm.calculateFinalPrice());
        System.out.println("Warranty Period: " + wm.getWarrantyPeriod() + " years");
        wm.extendWarranty(1);
        System.out.println("Extended Warranty: " + wm.getWarrantyPeriod() + " years");
    }
}