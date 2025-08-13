package SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
        String role = "admin";
        // if (role == "admin")
        //     System.out.println("You're an admin");
        // else if (role == "moderator")
        //     System.out.println("You're an moderator");
        // else
        //     System.out.println("You're an guest");

        // we can do it by switch case as it look more cleaner
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You're an moderator");
                break;
                
            default:
                System.out.println("You're an guest");
                break;
        }

    }
}
