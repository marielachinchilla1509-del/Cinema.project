package cinema;

public class Administrator extends Employee {

    private double bonus;
    private double calculateTotalSales;
    private String adminId;
    private String performanceGrade;
    private String updatePrices;
    private String reviewCashRegistrer;

    public Administrator(double bonus, double calculateTotalSales,
            String adminId, String performanceGrade, String updatePrices,
            String reviewCashRegistrer) {
        this.bonus = bonus;
        this.calculateTotalSales = calculateTotalSales;
        this.adminId = adminId;
        this.performanceGrade = performanceGrade;
        this.updatePrices = updatePrices;
        this.reviewCashRegistrer = reviewCashRegistrer;
    }

    public Administrator() {
        double bonus = 0;
        double calculateTotalSales = 0;
        String adminId = "Not registred";
        String performanceGrade = "Not registred";
        String updatePrices = "Not registred";
        String reviewCashRegistrer = "Not registred";
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getCalculateTotalSales() {
        return calculateTotalSales;
    }

    public void setCalculateTotalSales(double calculateTotalSales) {
        this.calculateTotalSales = calculateTotalSales;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getPerformanceGrade() {
        return performanceGrade;
    }

    public void setPerformanceGrade(String performanceGrade) {
        this.performanceGrade = performanceGrade;
    }

    public String getUpdatePrices() {
        return updatePrices;
    }

    public void setUpdatePrices(String updatePrices) {
        this.updatePrices = updatePrices;
    }

    public String getReviewCashRegistrer() {
        return reviewCashRegistrer;
    }

    public void setReviewCashRegistrer(String reviewCashRegistrer) {
        this.reviewCashRegistrer = reviewCashRegistrer;
    }

    @Override
    public String toString() {
        return "Administrator{" + "bonus=" + bonus + ", calculateTotalSales="
                + calculateTotalSales + ", adminId=" + adminId + ", "
                + "performanceGrade=" + performanceGrade + ", updatePrices="
                + updatePrices + ", reviewCashRegistrer=" + reviewCashRegistrer
                + '}';
    }

}
