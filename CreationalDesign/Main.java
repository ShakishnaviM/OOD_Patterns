import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        FactoryPattern PersonalLoan = new FactoryPattern();
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Select the loan type \n1. Education loan \n2. Housing loan \n3.Gold loan");
            int num = input.nextInt();

            switch (num) {
                //education loan
                case 1: System.out.println("You are getting the education loan");
                        BankLoan edu = PersonalLoan.getInstance("education");
                        edu.getInterestRate();
                        edu.calculateFees();
                        break;

                        //housing loan
                case 2: System.out.println("\n\nYou are getting the Housing loan");
                        BankLoan hou = PersonalLoan.getInstance("house");
                        hou.getInterestRate();
                        hou.calculateFees();
                        break;

                //gold loan
                case 3:
                        System.out.println("\n\nYou are getting the Gold loan");
                        BankLoan gold = PersonalLoan.getInstance("gold");
                        gold.getInterestRate();
                        gold.calculateFees();
                        break;
            }
        }
    }
}
