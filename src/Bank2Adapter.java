public class Bank2Adapter implements ILoanApprovalService {
    private Bank2LoanApprovalService bank2Service;

    public Bank2Adapter(Bank2LoanApprovalService bank2Service) {
        this.bank2Service = bank2Service;
    }

    @Override
    public boolean approveLoan(String customerName, double loanAmount) {
        // Adapt the call to Bank 2's service
        return bank2Service.approvePersonalLoanBank2(customerName, loanAmount);
    }
}