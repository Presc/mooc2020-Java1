
public class YourFirstAccount {

    public static void main(String[] args) {
        Account account = new Account("test", 100.0);
        account.deposit(20);
        
        
        System.out.println(account);
    }
}
