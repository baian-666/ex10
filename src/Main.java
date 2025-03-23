public class Main {
    public static void main(String[] args) {
        // 创建 StoreOneA 对象
        StoreOneA store = new StoreOneA(true, 100000, 12, true);

        // 调用方法
        store.enterStoreDetails();  // 输入父类信息
        store.calculateLoanFinancing(); // 计算月供
        store.showStoreInfo();      // 打印信息
    }
}