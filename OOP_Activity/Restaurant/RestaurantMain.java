package Restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        
        rest.addItem("Pasta", 20.2, 5.5);
        rest.addItem("Steak", 30.5, 4.0);
        rest.addItem("Halo-Halo", 7.99, 4.5);
        
        System.out.println("Menu Items: " + rest.getMenuItems());
        System.out.println("Prices: " + rest.getPrices());
        System.out.println("Ratings: " + rest.getRatings());
        System.out.println("Average Rating: " + rest.calculateAverageRating());
        
        rest.removeItem("Steak");
        System.out.println("After removal - Menu Items: " + rest.getMenuItems());
        System.out.println("After removal - Average Rating: " + rest.calculateAverageRating());
    }
}