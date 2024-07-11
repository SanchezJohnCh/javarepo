////package simpleBanking;
////
////import java.util.Scanner;
////
////public class Banking {
////    static double balance = 0;
////
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        int choices = 0;
////        String email = "sanchezjohnc10";
////        String password = "1234";
////        String answer;
////
////        System.out.println("Do you have an account?");
////        answer = scanner.nextLine();
////        if (answer.equalsIgnoreCase("yes")) {
////            System.out.println("Enter your email: ");
////            email = scanner.nextLine();
////            System.out.println("Enter your password: ");
////            password = scanner.nextLine();
////            if (email.equals("sanchezjohnc10") && password.equals("1234")) {
////                System.out.println("Welcome" + email + "!");
////            } else {
////                System.out.println("Email or password is not match!");
////                return;
////            }
////        } else if(answer.equalsIgnoreCase("no")) {
////            System.out.println("You need to create your account!");
////            return;
////        } else{
////            System.out.println("Invalid input");
////            return;
////        }
////
////
////        System.out.println("Hello. welcome to the Bank of Jian");
////        while (choices != 4) {
////            System.out.println("What do you want to do?");
////            System.out.println("1.Withdraw");
////            System.out.println("2. Deposit");
////            System.out.println("3. Check your balance");
////            System.out.println("4. Exit");
////            choices = scanner.nextInt();
////
////            switch (choices) {
////                case 1:
////                    withdraw();
////                    break;
////                case 2:
////                    deposit();
////                    break;
////                case 3:
////                    checkBalance();
////                    break;
////                case 4:
////                    exit();
////                    break;
////                default:
////                    System.out.println("Invalid choice!");
////                    break;
////            }
////        }
////    }
////
////    public static void withdraw() {
////        Scanner sc = new Scanner(System.in);
////        double amountToWithdraw;
////
////        System.out.println("Withdrawal amount: ");
////        amountToWithdraw = sc.nextDouble();
////        if (amountToWithdraw > balance) {
////            System.out.println("Not enough funds");
////        } else {
////            System.out.println(amountToWithdraw + " has been withdrawn from your account!");
////            balance -= amountToWithdraw;
////            System.out.println("Your new balance is: " + balance);
////
////        }
////    }
////
////    public static void deposit() {
////        Scanner sc = new Scanner(System.in);
////        double amountToDeposit;
////        System.out.println("Deposit amount: ");
////        amountToDeposit = sc.nextDouble();
////        System.out.println(amountToDeposit + " has been deposited to your account!");
////        balance += amountToDeposit;
////        System.out.println("Your new balance is: " + balance);
////
////    }
////
////    public static void checkBalance() {
////        System.out.println("Your balance is: " + balance);
////
////    }
////
////    public static void exit() {
////        System.out.println("Thank you for using jian banking");
////    }
////}
//
//package simpleBanking;
//
//import java.util.Scanner;
//
//public class Banking {
//    static double balance = 0;
//    static String email = "sanchezjohnc10";
//    static String password = "1234";
//    static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        if (!authenticateUser()) {
//            return;
//        }
//
//        int choices = 0;
//        while (choices != 4) {
//            displayMenu();
//            choices = getChoice();
//            processChoice(choices);
//        }
//    }
//
//    public static boolean authenticateUser() {
//        System.out.println("Do you have an account? (yes/no)");
//        String answer = scanner.nextLine();
//        if (answer.equalsIgnoreCase("yes")) {
//            return login();
//        } else if (answer.equalsIgnoreCase("no")) {
//            System.out.println("You need to create your account!");
//            return false;
//        } else {
//            System.out.println("Invalid input");
//            return false;
//        }
//    }
//
//    public static boolean login() {
//        System.out.println("Enter your email: ");
//        String inputEmail = scanner.nextLine();
//        System.out.println("Enter your password: ");
//        String inputPassword = scanner.nextLine();
//        if (email.equals(inputEmail) && password.equals(inputPassword)) {
//            System.out.println("Welcome to the bank of jian,  " + email + "!");
//            return true;
//        } else {
//            System.out.println("Email or password does not match!");
//            return false;
//        }
//    }
//
//    public static void displayMenu() {
//        System.out.println("What do you want to do?");
//        System.out.println("1. Withdraw");
//        System.out.println("2. Deposit");
//        System.out.println("3. Check your balance");
//        System.out.println("4. Exit");
//    }
//
//    public static int getChoice() {
//        while (true) {
//            if (scanner.hasNextInt()) {
//                int choice = scanner.nextInt();
//                scanner.nextLine(); // Consume newline left-over
//                return choice;
//            } else {
//                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
//                scanner.next(); // Consume the invalid input
//            }
//        }
//    }
//
//    public static void processChoice(int choice) {
//        switch (choice) {
//            case 1:
//                withdraw();
//                break;
//            case 2:
//                deposit();
//                break;
//            case 3:
//                checkBalance();
//                break;
//            case 4:
//                exit();
//                break;
//            default:
//                System.out.println("Invalid choice!");
//                break;
//        }
//    }
//
//    public static void withdraw() {
//        System.out.println("Withdrawal amount: ");
//        double amountToWithdraw = getValidAmount();
//        if (amountToWithdraw > balance) {
//            System.out.println("Not enough funds");
//        } else {
//            balance -= amountToWithdraw;
//            System.out.println(amountToWithdraw + " has been withdrawn from your account!");
//            System.out.println("Your new balance is: " + balance);
//        }
//    }
//
//    public static void deposit() {
//        System.out.println("Deposit amount: ");
//        double amountToDeposit = getValidAmount();
//        balance += amountToDeposit;
//        System.out.println(amountToDeposit + " has been deposited to your account!");
//        System.out.println("Your new balance is: " + balance);
//    }
//
//    public static void checkBalance() {
//        System.out.println("Your balance is: " + balance);
//    }
//
//    public static void exit() {
//        System.out.println("Thank you for using Jian Banking");
//    }
//
//    public static double getValidAmount() {
//        while (true) {
//            if (scanner.hasNextDouble()) {
//                double amount = scanner.nextDouble();
//                scanner.nextLine(); // Consume newline left-over
//                if (amount >= 0) {
//                    return amount;
//                } else {
//                    System.out.println("Amount must be non-negative. Please enter again:");
//                }
//            } else {
//                System.out.println("Invalid input! Please enter a valid amount:");
//                scanner.next(); // Consume the invalid input
//            }
//        }
//    }
//}
//
package simpleBanking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.sql.*;

public class Banking extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;
    static double balance = 0;
    static Connection connection;
    static String email;

    private JTextField emailField;
    private JPasswordField passwordField;
    private JLabel balanceLabel;
    private JTextField amountField;

    public Banking() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Banking Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Login Panel
        JPanel loginPanel = new JPanel(new GridLayout(3, 2));
        emailField = new JTextField();
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        loginPanel.add(new JLabel("Email:"));
        loginPanel.add(emailField);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordField);
        loginPanel.add(new JLabel(""));
        loginPanel.add(loginButton);

        // Banking Panel
        JPanel bankingPanel = new JPanel(new GridLayout(4, 2));
        balanceLabel = new JLabel("Balance: 0.0");
        amountField = new JTextField();
        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                withdraw();
            }
        });
        JButton depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deposit();
            }
        });
        JButton checkBalanceButton = new JButton("Check Balance");
        checkBalanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkBalance();
            }
        });
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });

        bankingPanel.add(new JLabel("Balance:"));
        bankingPanel.add(balanceLabel);
        bankingPanel.add(new JLabel("Amount:"));
        bankingPanel.add(amountField);
        bankingPanel.add(withdrawButton);
        bankingPanel.add(depositButton);
        bankingPanel.add(checkBalanceButton);
        bankingPanel.add(exitButton);

        setLayout(new CardLayout());
        add(loginPanel, "Login");
        add(bankingPanel, "Banking");
        showCard("Login");

        try {
            // Setup the database connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDB", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showCard(String card) {
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), card);
    }

    private void login() {
        String inputEmail = emailField.getText();
        String inputPassword = new String(passwordField.getPassword());
        try {
            String query = "SELECT balance FROM users WHERE email = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, inputEmail);
            statement.setString(2, inputPassword);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                balance = resultSet.getDouble("balance");
                email = inputEmail;
                balanceLabel.setText("Balance: " + balance);
                showCard("Banking");
            } else {
                JOptionPane.showMessageDialog(this, "Email or password does not match!", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void withdraw() {
        double amountToWithdraw = getValidAmount();
        if (amountToWithdraw > balance) {
            JOptionPane.showMessageDialog(this, "Not enough funds", "Withdrawal Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            balance -= amountToWithdraw;
            updateBalance();
            JOptionPane.showMessageDialog(this, amountToWithdraw + " has been withdrawn from your account!");
            balanceLabel.setText("Balance: " + balance);
        }
    }

    private void deposit() {
        double amountToDeposit = getValidAmount();
        balance += amountToDeposit;
        updateBalance();
        JOptionPane.showMessageDialog(this, amountToDeposit + " has been deposited to your account!");
        balanceLabel.setText("Balance: " + balance);
    }

    private void checkBalance() {
        balanceLabel.setText("Balance: " + balance);
        JOptionPane.showMessageDialog(this, "Your balance is: " + balance);
    }

    private void exit() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    private double getValidAmount() {
        while (true) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                if (amount >= 0) {
                    return amount;
                } else {
                    JOptionPane.showMessageDialog(this, "Amount must be non-negative. Please enter again:", "Invalid Amount", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input! Please enter a valid amount:", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void updateBalance() {
        try {
            String updateQuery = "UPDATE users SET balance = ? WHERE email = ?";
            PreparedStatement statement = connection.prepareStatement(updateQuery);
            statement.setDouble(1, balance);
            statement.setString(2, email);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banking().setVisible(true);
            }
        });
    }
}
