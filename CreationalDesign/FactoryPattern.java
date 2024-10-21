public class FactoryPattern {
    public BankLoan getInstance(String loanTYpe){
        if (loanTYpe.equalsIgnoreCase("education")){
            return new educationLoan();
        } else if (loanTYpe.equalsIgnoreCase("house")) {
            return new houseLoan();
        }
        else {
            return new goldLoan();
        }
    }
}
