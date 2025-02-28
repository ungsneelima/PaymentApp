
/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingMenu {
    private static List<User> users = new ArrayList<>();
    private static List<BankAccount> bankAccounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Create User");
            System.out.println("2. Create Bank Account");
            System.out.println("3. View Users");
            System.out.println("4. View Bank Accounts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    createBankAccount();
                    break;
                case 3:
                    viewUsers();
                    break;
                case 4:
                    viewBankAccounts();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }

    private static void createUser() {
        User user = new User();
        System.out.print("Enter User ID: ");
        user.setUser_id(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter Username: ");
        user.setUser_name(scanner.nextLine());
        System.out.print("Enter Password: ");
        user.setPassword(scanner.nextLine());
        System.out.print("Enter First Name: ");
        user.setFirst_name(scanner.nextLine());
        System.out.print("Enter Last Name: ");
        user.setLast_name(scanner.nextLine());
        System.out.print("Enter Phone Number: ");
        user.setPhone_num(scanner.nextLine());
        System.out.print("Enter Email: ");
        user.setEmail(scanner.nextLine());
        System.out.print("Enter Address: ");
        user.setAddress(scanner.nextLine());

        users.add(user);
        System.out.println("User created successfully!");
    }

    private static void createBankAccount() {
        System.out.print("Enter User ID for bank account: ");
        int userId = scanner.nextInt();
        scanner.nextLine();
        
        User user = users.stream().filter(u -> u.getUser_id() == userId).findFirst().orElse(null);
        
        if (user == null) {
            System.out.println("User not found!");
            return;
        }
        
        BankAccount bankAccount = new BankAccount();
        System.out.print("Enter Bank Account ID: ");
        bankAccount.setBankAcctId(scanner.nextLong());
        scanner.nextLine();
        System.out.print("Enter Account Number: ");
        bankAccount.setAcctNumber(scanner.nextLine());
        System.out.print("Enter IFSC Code: ");
        bankAccount.setIfscCode(scanner.nextLine());
        System.out.print("Enter Bank Name: ");
        bankAccount.setBankName(scanner.nextLine());
        System.out.print("Enter Branch: ");
        bankAccount.setBranch(scanner.nextLine());
        bankAccount.setAcctStatus(BankAccountStatusEnum.ACTIVE);
        bankAccount.setUser(user);
        
        bankAccounts.add(bankAccount);
        System.out.println("Bank account created successfully!");
    }

    private static void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found!");
            return;
        }
        for (User user : users) {
            System.out.println("User ID: " + user.getUser_id() + ", Name: " + user.getFirst_name() + " " + user.getLast_name());
        }
    }
    
    private static void viewBankAccounts() {
        if (bankAccounts.isEmpty()) {
            System.out.println("No bank accounts found!");
            return;
        }
        for (BankAccount account : bankAccounts) {
            System.out.println("Account Number: " + account.getAcctNumber() + ", Bank: " + account.getBankName() + ", User: " + account.getUser().getFirst_name());
        }
    }
}*/
