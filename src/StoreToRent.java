import java.util.Scanner;

public class StoreToRent {
    private static final double MAINTENANCE_COST = 1000;
    private final double INTEREST_RATE = 0.25; // 新增 final 变量
    private boolean loanRequired;             // 新增
    private double loanAmount;                // 新增
    private int loanPaymentTerm;              // 新增

    private String storeName;
    private String storeBusiness;
    private double totalArea;
    private double sellingPrice;
    private double rent;
    private String minimumLeasePeriod;
    private String floorNumber;
    private boolean available;

    // 新增构造函数（带贷款参数）
    public StoreToRent(boolean loanRequired, double loanAmount, int loanPaymentTerm) {
        this.loanRequired = loanRequired;
        this.loanAmount = loanAmount;
        this.loanPaymentTerm = loanPaymentTerm;
    }

    // 新增默认构造函数（兼容原有代码）
    public StoreToRent() {}

    // 新增 Getter 方法
    public double getINTEREST_RATE() { return INTEREST_RATE; }
    public boolean isLoanRequired() { return loanRequired; }
    public double getLoanAmount() { return loanAmount; }
    public int getLoanPaymentTerm() { return loanPaymentTerm; }

    // 原有 Getter 和 Setter 方法保持不变
    public String getStoreName() { return storeName; }
    public void setStoreName(String storeName) { this.storeName = storeName; }
    // ...（其他 getter 和 setter 省略以节省空间）

    // 新增贷款计算方法
    public double calculateLoanFinancing() {
        if (loanRequired) {
            return (loanAmount * (1 + INTEREST_RATE)) / loanPaymentTerm;
        }
        return 0;
    }

    // 更新后的 toString() 方法
    @Override
    public String toString() {
        return "\n" +
                "Store Name: " + storeName + "\n" +
                "Store Business: " + storeBusiness + "\n" +
                "Total Area (sq.m): " + totalArea + "\n" +
                "Selling Price: €" + sellingPrice + "\n" +
                "Rent: €" + rent + "\n" +
                "Minimum Lease Period: " + minimumLeasePeriod + "\n" +
                "Floor Number: " + floorNumber + "\n" +
                "Maintenance Cost: €" + MAINTENANCE_COST + "\n" +
                "Available: " + available + "\n" +
                "Loan Required: " + loanRequired + "\n" +        // 新增贷款信息
                "Loan Amount: €" + loanAmount + "\n" +
                "Loan Term: " + loanPaymentTerm + " months\n" +
                "Interest Rate: " + INTEREST_RATE * 100 + "%\n";
    }

    // 原有输入方法保持不变
    public void enterStoreDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Store Name: ");
        setStoreName(input.nextLine());
        // ...（其他输入逻辑省略）
        input.close();
    }
}