public class StoreOneA extends StoreToRent {
    private boolean specialCustomer;
    private double monthlyPayment;
    private static final double DISCOUNT_RATE = 0.1;

    // 构造函数
    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
    }

    // showStoreInfo 方法
    public void showStoreInfo() {
        System.out.println(toString());
    }

    // 覆盖 toString()
    @Override
    public String toString() {
        return super.toString() +
                "\n**LOAN DETAILS (if applicable):**\n" +
                "Loan Amount: " + getLoanAmount() + "\n" +
                "Loan Payment Term: " + getLoanPaymentTerm() + "\n" +
                "Interest Rate: " + getINTEREST_RATE() + "\n" +
                "Special Customer: " + specialCustomer + "\n" +
                "Monthly Loan Payment: " + monthlyPayment + "\n";
    }

    // 覆盖 calculateLoanFinancing
    public double calculateLoanFinancing() {
        monthlyPayment = super.calculateLoanFinancing();
        if (specialCustomer) {
            monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
        }
        return monthlyPayment;
    }
}