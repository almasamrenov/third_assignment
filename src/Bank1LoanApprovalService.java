public class Bank1LoanApprovalService {
    public boolean approvePersonalLoanBank1(String customerName, double loanAmount) {
        // Logic specific to Bank 1
        System.out.println("Processing personal loan approval for " + customerName + " with amount $" + loanAmount + " at Bank 1.");
        // Complex approval logic here
        return true; // For the sake of  example, it's always approved
    }
}
