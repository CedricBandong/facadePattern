public class HomeApp {
    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();

        System.out.println("\nServices turning On:");
        homeInterface.turnOnAll();

        System.out.println("\nServices turning Off:");
        homeInterface.turnOffAll();
    }
}