package GymMemberShip;

public class GymMemberShipMain {
    public static void main(String[] args) {
        GymMembership basicMember = new GymMembership("Jielly Abao", "Standard", 6);
        basicMember.displayMembershipDetails();
        basicMember.checkSpecialOffers();

        System.out.println("\n--------------------------------\n");

        PremiumMembership premiumMember = new PremiumMembership("Jose Marie", 12, true, true);
        premiumMember.displayMembershipDetails();
    }
}
