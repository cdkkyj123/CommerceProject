package commerce.step3;

public class Customer {
    private String customerName;
    private String customerEmail;
    private String grade;
    private int totalOrderAmount;

    public Customer(String customerName, String customerEmail) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.grade = "브론즈";
        this.totalOrderAmount = 0;
    }

    public void addOrder(int amount) {
        totalOrderAmount += amount;
        updateGrade();
    }

    public void updateGrade() {
        if (totalOrderAmount < 500000) {
            grade = "브론즈";
        } else if (totalOrderAmount < 1000000) {
            grade = "실버";
        } else if (totalOrderAmount < 2000000) {
            grade = "골드";
        } else grade = "플래티넘";
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getGrade() {
        return grade;
    }

    public int getTotalOrderAmount() {
        return totalOrderAmount;
    }
}