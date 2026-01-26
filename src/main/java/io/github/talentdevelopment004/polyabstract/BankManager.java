package io.github.talentdevelopment004.polyabstract;

public class BankManager {
    private final   EligibilityChecker eligibilityChecker;
    private final RepaymentScheduler repaymentScheduler;

    public BankManager() {
        this.eligibilityChecker = new EligibilityChecker();
        this.repaymentScheduler = new RepaymentScheduler();
    }

    public boolean processLoan(double amount, String accountNumber) {
        // rules
        // eligibility
       boolean eligible = eligibilityChecker.check(accountNumber);
       if(eligible){
           boolean isRepaymentScheduleCreated = repaymentScheduler
                   .creatRepaymentScheduler(amount, accountNumber);
           // repayment schedule
           return true;
       }
       return false;

    }
}
