public class Bank2LoanApprovalService {
    public boolean approvePersonalLoanBank2(String customerName, double loanAmount) {
        // Logic specific to Bank 2
        System.out.println("Processing personal loan approval for " + customerName + " with amount $" + loanAmount + " at Bank 2.");
        // Complex approval logic here
        return true; // For the sake of  example, it's always approved
    }
}
