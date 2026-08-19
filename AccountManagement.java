import java.util.Scanner;

class AccountManagement {

    void data() {

        String name;
        long account_no;
        double amount;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        name = sc.nextLine();

        System.out.print("Enter Account No : ");
        account_no = sc.nextLong();

        System.out.print("Enter Initial Balance : ");
        amount = sc.nextDouble();

        System.out.print("Enter Deposit Amount : ");
        long deposit = sc.nextLong();

        amount += deposit;

        System.out.println("========= TOTAL BALANCE =========");
        System.out.print("Total Balance : " + amount);

        System.out.print("\nEnter Withdraw Amount : ");
        long withdraw = sc.nextLong();

        amount -= withdraw;

        
        System.out.println("========= TOTAL BALANCE =========");
        System.out.print("Total Balance : " + amount);
    }

    public static void main(String[] args) {

        AccountManagement obj = new AccountManagement();

        obj.data();
    }
}