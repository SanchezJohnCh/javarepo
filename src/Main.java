import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        int item1;
//        int item2;
//
//
//        System.out.println("item 1 price: ");
//        item1 = scanner.nextInt();
//        System.out.println("item 2 price: ");
//        item2 = scanner.nextInt();
//        int overall = item1 + item2;
//        System.out.println("overall: " + overall);

//        Scanner scanner = new Scanner(System.in);
//        int product1;
//        int product2;
//
//        System.out.print("Enter first product: ");
//        product1 = scanner.nextInt();
//        System.out.print("Enter second product: ");
//        product2 = scanner.nextInt();
//
//        int total = product1 + product2;
//
//        System.out.print("Total cost of theses 2 products is: " + total);



        /*calculate the percentage return per month on your investment*/
//
        Scanner scanner = new Scanner(System.in);
        double investment;
        double monthlyIncome;

        System.out.print("Please enter your Initial Investment: ");
        investment = scanner.nextInt();
        System.out.print("Please enter your Monthly Income: ");
        monthlyIncome = scanner.nextInt();

        double incomePerMonth = (monthlyIncome / investment) * 100;
        System.out.println("Your income per month is " + incomePerMonth + "%" + " of your initial investment");

/*new*/
//        Scanner scanner = new Scanner(System.in);
//        String choices;
//        double amount;
//
//        System.out.println("Please chose your preferred currency: 1. Dirhams 2. Canadian Dollar 3. USD");
//        choices = scanner.nextLine();
//        System.out.println("Please enter the amount: ");
//        amount = scanner.nextDouble();
//
//        if (choices.equals("1")) {
//            System.out.println("PHP to Dirhams: " + amount * 15.86);
//        } else if (choices.equals("2")) {
//            System.out.println("PHP to Canadian Dollar: " + amount * 42.79);
//        } else if (choices.equals("3")) {
//            System.out.println("PHP to USD: " + amount * 58.26);
//        }

                /*Best way*/
//                Scanner scanner = new Scanner(System.in);
//                double[] rates = {15.86, 42.79, 58.26};
//                String[] currencies = {"Dirhams", "Canadian Dollar", "USD"};
//
//                System.out.println("Please choose your preferred currency: 1. Dirhams 2. Canadian Dollar 3. USD");
//                String choice = scanner.nextLine();
//                System.out.println("Please enter the amount: ");
//                double amount = scanner.nextDouble();
//
//                int index = Integer.parseInt(choice) - 1;
//
//                if (index >= 0 && index < rates.length) {
//                    System.out.println("PHP to " + currencies[index] + ": " + amount * rates[index]);
//                } else {
//                    System.out.println("Invalid choice.");
//                }
            }
        }


