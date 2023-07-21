import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 * The Bank class represents a simple bank account with basic operations like account information,
 * balance check, deposit, and withdrawal. It also generates an email for the customer.
 */
public class Bank {

    private int customerID;
    private String name;
    private double allowance;

    /**
     * Creates a Bank object with the specified customer ID, name, and initial allowance.
     *
     * @param customerID The unique customer ID.
     * @param name       The name of the customer.
     * @param allowance  The initial allowance in the account.
     * @throws InterruptedException If interrupted while displaying a greeting message.
     */
    public Bank(int customerID, String name, double allowance) throws InterruptedException {
        this.customerID = customerID;
        this.name = name;
        this.allowance = allowance;
        String text = "\nHello " + name + ", thank you for being a valued customer." +
                "\nHow can we assist you today. \n\n";
        for (char c : text.toCharArray()) {
            Thread.sleep(10);
            System.out.print(c);
        }
        Thread.sleep(500); // 0.5 second delay

        run_transaction();
    }

    /**
     * Displays the main menu and handles user input for various banking operations.
     *
     * @throws InterruptedException If interrupted while waiting for user input.
     */
    public void run_transaction() throws InterruptedException {
        String text = "\n[See You Later]\n";
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            menu();
            input = scanner.next().toLowerCase();

            if (input.equals("e")) {
                for (char c : text.toCharArray()) {
                    Thread.sleep(50);
                    System.out.print(c);
                }
                break;
            } else if (input.equals("a")) {
                account_info();
            } else if (input.equals("b")) {
                balance_info();
            } else if (input.equals("c")) {
                deposit();
            } else if (input.equals("d")) {
                withdraw();
            } else {
                System.out.println("Invalid option. Please enter a valid option (A, B, C, D, or E).");
            }
        }
    }

    /**
     * Displays the main menu options.
     */
    public void menu() {
        System.out.println("\n\nA. Account Information");
        System.out.println("B. Balance");
        System.out.println("C. Deposit");
        System.out.println("D. Withdraw");
        System.out.println("E. Exit");
        System.out.println("=============================");
        System.out.print("Enter A Letter: ");
    }

    /**
     * Generates and returns an email address for the customer based on their name and a random number.
     *
     * @return The generated email address.
     */
    public String email_creator() {
        String[] email_array = {"@gmail.com", "@yahoo.com", "@outlook.com", "@hotmail.com", "@example.com",
                "@protonmail.com", "@aol.com", "@icloud.com", "@mail.com", "@msn.com",
                "@yandex.com", "@zoho.com", "@mailinator.com", "@rocketmail.com",
                "@inbox.com", "@live.com"};

        int index = new Random().nextInt(email_array.length);
        Random random = new Random();
        int number = random.nextInt(50);
        return name.toLowerCase(Locale.ROOT) + Integer.toString(number) + email_array[index];
    }

    public String random_ethnicity() {
        String[] ethnicities_array = {
                "African",
                "Asian",
                "European",
                "Native American",
                "Pacific Islander",
                "Middle Eastern",
                "Latino/Hispanic",
                "South Asian",
                "Mixed"
        };
        int index = new Random().nextInt(ethnicities_array.length);

        return ethnicities_array[index];


    }

    /**
     * Displays the account information for the customer, including name, email, and ID.
     *
     * @throws InterruptedException If interrupted while displaying the account information.
     */
    public void account_info() throws InterruptedException {
        System.out.println("\n" +
                "─█▀▀█ █▀▀ █▀▀ █▀▀█ █──█ █▀▀▄ ▀▀█▀▀ 　 ▀█▀ █▀▀▄ █▀▀ █▀▀█ ▄ \n" +
                "░█▄▄█ █── █── █──█ █──█ █──█ ──█── 　 ░█─ █──█ █▀▀ █──█ ─ \n" +
                "░█─░█ ▀▀▀ ▀▀▀ ▀▀▀▀ ─▀▀▀ ▀──▀ ──▀── 　 ▄█▄ ▀──▀ ▀── ▀▀▀▀ ▀");
        String email = email_creator();
        String ethnicity = random_ethnicity();
        String text = "Name: " + name + "\n" + "Email: " + email + "\n" + "ID: " + customerID + "\n" + "Ethnicity: " + ethnicity;
        System.out.println("\n------------------------------------");
        for (char c : text.toCharArray()) {
            Thread.sleep(50);
            System.out.print(c);
        }
        Thread.sleep(150);
        System.out.println("\n------------------------------------");
    }

    /**
     * Displays the current account balance.
     *
     * @throws InterruptedException If interrupted while displaying the balance information.
     */
    public void balance_info() throws InterruptedException {
        System.out.println("\n" +
                "░█▀▀█ █▀▀█ █── █▀▀█ █▀▀▄ █▀▀ █▀▀ ▄ \n" +
                "░█▀▀▄ █▄▄█ █── █▄▄█ █──█ █── █▀▀ ─ \n" +
                "░█▄▄█ ▀──▀ ▀▀▀ ▀──▀ ▀▀▀─ ▀─▀▀ ▀▀▀ ▀");
        String text = "You currently have: $" + allowance;
        System.out.println("\n------------------------------------");
        for (char c : text.toCharArray()) {
            Thread.sleep(50);
            System.out.print(c);
        }
        Thread.sleep(150);
        System.out.println("\n------------------------------------");
    }

    /**
     * Allows the user to withdraw an amount from their account balance.
     */
    public void withdraw() {
        System.out.println("\n" +
                "░█──░█ ─▀─ ▀▀█▀▀ █──█ █▀▀▄ █▀▀█ █▀▀█ █───█ ▄ \n" +
                "░█░█░█ ▀█▀ ──█── █▀▀█ █──█ █▄▄▀ █▄▄█ █▄█▄█ ─ \n" +
                "░█▄▀▄█ ▀▀▀ ──▀── ▀──▀ ▀▀▀─ ▀─▀▀ ▀──▀ ─▀─▀─ ▀");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n------------------------------------");
        System.out.print("Amount To Withdraw: ");
        double amount = scanner.nextDouble();
        System.out.println("------------------------------------");
        if (allowance < 0) {
            allowance = 0;
            System.out.println("=============================");
            System.out.println("We apologize, but withdrawals are currently unavailable.");
            System.out.println("=============================");
        } else {
            allowance -= amount;
        }
    }

    /**
     * Allows the user to deposit an amount into their account balance.
     */

    public void deposit() {
        System.out.println("\n" +
                "░█▀▀▄ █▀▀ █▀▀█ █▀▀█ █▀▀ ─▀─ ▀▀█▀▀ ▄ \n" +
                "░█─░█ █▀▀ █──█ █──█ ▀▀█ ▀█▀ ──█── ─ \n" +
                "░█▄▄▀ ▀▀▀ █▀▀▀ ▀▀▀▀ ▀▀▀ ▀▀▀ ──▀── ▀");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n------------------------------------");
        System.out.print("Amount To Deposit: ");
        double amount = scanner.nextDouble();
        System.out.println("------------------------------------");
        allowance += amount;
    }


    // Everything Below Here Are The Getter And Setter Methods

    /**
     * Returns the customer ID associated with this bank account.
     *
     * @return The customer ID.
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets the customer ID for this bank account.
     *
     * @param customerID The new customer ID to set.
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * Returns the name of the account holder.
     *
     * @return The name of the account holder.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the account holder.
     *
     * @param name The new name to set for the account holder.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the current allowance (balance) of the bank account.
     *
     * @return The current allowance (balance) in the account.
     */
    public double getAllowance() {
        return allowance;
    }

    /**
     * Sets the new allowance (balance) for the bank account.
     *
     * @param allowance The new allowance (balance) to set for the account.
     */
    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
}
