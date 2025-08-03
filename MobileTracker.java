import java.util.Random;

public class MobileTracker {

    public static void main(String[] args) {
        System.out.println("=== Mobile Tracker Simulator ===");

        String imei = generateFakeIMEI();
        String user = System.getProperty("user.name");
        String os = System.getProperty("os.name");
        String location = getMockLocation();

        System.out.println("User: " + user);
        System.out.println("Operating System: " + os);
        System.out.println("IMEI: " + imei);
        System.out.println("Location: " + location);
        System.out.println("Network Operator: Simulated Telecom");
    }

    // Generate a random 15-digit IMEI number
    public static String generateFakeIMEI() {
        Random rand = new Random();
        StringBuilder imei = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            imei.append(rand.nextInt(10));
        }
        return imei.toString();
    }

    // Simulate a random GPS location
    public static String getMockLocation() {
        String[] locations = {
            "13.0827° N, 80.2707° E (Chennai)",
            "28.7041° N, 77.1025° E (Delhi)",
            "19.0760° N, 72.8777° E (Mumbai)",
            "12.9716° N, 77.5946° E (Bangalore)"
        };
        return locations[new Random().nextInt(locations.length)];
    }
}
