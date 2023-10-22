public class Bank1Adapter implements ILoanApprovalService {
    private Bank1LoanApprovalService bank1Service;

    public Bank1Adapter(Bank1LoanApprovalService bank1Service) {
        this.bank1Service = bank1Service;
    }

    @Override
    public boolean approveLoan(String customerName, double loanAmount) {
        // Adapt the call to Bank 1's service
        return bank1Service.approvePersonalLoanBank1(customerName, loanAmount);
    }
}