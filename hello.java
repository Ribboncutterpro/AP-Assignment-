import java.util.Scanner;

public class hello{

    public static String generateUserId(String name, String email) {
        
        name = name.toLowerCase();
        email = email.toLowerCase();

        
        String simpleName = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') {
                simpleName += name.charAt(i);
            }
        }

      
        String namePart = "";
        for (int i = 0; i < 3 && i < simpleName.length(); i++) {
            namePart += simpleName.charAt(i);
        }

        
        String emailPart = "";
        for (int i = 0; i < 3 && i < email.length(); i++) {
            emailPart += email.charAt(i);
        }

        long currentTime = System.currentTimeMillis();
        String timePart = String.valueOf(currentTime);

        String userId = namePart + emailPart + "_" + timePart;

        return userId;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your email:");
        String email = scanner.nextLine();

        String userId = generateUserId(name, email);

        System.out.println("Generated User ID: " + userId);

        scanner.close();
    }
}
