package bankApp;

public class bank {
    // Plain old JAVA object
    private int accNo;
    private String name;
    private double accBal;
    private int transId; // using AtomicInteger
    private String accType;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccBal() {
        return accBal;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public bank(int accNo, String name, double accBal, String accType) {
        this.name = name;
        this.accBal = accBal;
        this.accType = accType;
        this.accNo = accNo;

    }

    @Override
    public String toString() {
        return "bank [accNo=" + accNo + ", name=" + name + ", accBal=" + accBal + ", accType=" + accType + "]";
    }

}
