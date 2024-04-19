/*
Name: Mahmued Ahmed Alardawi
ID: 21352089
Section: ZJ
Course name: Programming II
Course code: CPCS 203
Assignment number: Assignment #2 (Car Insurance Claim System)
 */

public class InsuranceCoverage {
    private int insuranceCoverageCode;
    private String description;
    private double amount;

    //

    public InsuranceCoverage(int insuranceCoverageCode, String description, double amount) {
        this.insuranceCoverageCode = insuranceCoverageCode;
        this.description = description;
        this.amount = amount;
    }

    //

    public int getInsuranceCoverageCode() {
        return insuranceCoverageCode;
    }

    public void setInsuranceCoverageCode(int insuranceCoverageCode) {
        this.insuranceCoverageCode = insuranceCoverageCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //

    @Override
    public String toString() {
        return "InsuranceCoverage{" +
                "insuranceCoverageCode=" + insuranceCoverageCode +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }
}