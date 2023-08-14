public class HW2_2 {
    public static void main(String[] args) {
        int treasure = 500;
        int pirates = 25;
        int costOwner = treasure / 2;
        int costCaptain = costOwner / 2;
        int costPirates = costCaptain / (pirates +1);
        int total = treasure - costOwner - costCaptain - ((costCaptain/pirates)*pirates);

        System.out.println("Owner receives: " + costOwner);
        System.out.println("Captain receives: " + (costCaptain + costPirates));
        System.out.println("1 pirate receive: " + costPirates);
        System.out.println("Is everything ok calculated? " + (total == 0));

    }
}
