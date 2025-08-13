package accessModifier;

class Account {
    String name; // default → only in same package
    public String email; // public → accessible anywhere
    protected String salary; // protected → same package + subclasses
    private String password; // private → only inside Account


    // Getter for private field
    public String getPassword() {
        return this.password;
    }

    // Setter for private field
    public void setPassword(String password) {
        this.password = password;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "kalzang"; // ✅ default → same package
        account1.email = "kalzanglama77@gmail.com"; // ✅ public → anywhere
        account1.salary = "20,0012"; // ✅ protected → same package
        // account1.passwords = "hero"; // ❌ private → not accessible here

        // using getters and setters method we can access hai
        account1.setPassword("ironman"); // ✅ using setter
        System.out.println(account1.getPassword());
        ; // ✅ using getter

    }

}
