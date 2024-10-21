abstract class BankLoan {
    protected double rate;

    abstract void getInterestRate();
    public void calculateFees(){
        System.out.println("The annual interest : " + rate*12);
    }
}
 class educationLoan extends BankLoan {
     @Override
     public void getInterestRate( ) {
        this.rate = 15;
     }
 }
 class goldLoan extends BankLoan {


     @Override
     public void getInterestRate() {
        rate = 18;
     }

 }
 class houseLoan extends BankLoan {

     @Override
     public void getInterestRate() {
        rate =12;
     }

 }
