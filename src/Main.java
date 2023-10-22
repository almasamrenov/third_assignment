public class Main {
    public static void main(String[] args) {
        ILoanApprovalService bank1 = new Bank1Adapter(new Bank1LoanApprovalService());
        ILoanApprovalService bank2 = new Bank2Adapter(new Bank2LoanApprovalService());

        String customer = "John";
        double loanAmount = 10000;

        boolean approved1 = bank1.approveLoan(customer, loanAmount);
        boolean approved2 = bank2.approveLoan(customer, loanAmount);

        System.out.println("Loan approval at Bank 1: " + approved1);
        System.out.println("Loan approval at Bank 2: " + approved2);
    }
}