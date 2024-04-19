/*
Name: Mahmued Ahmed Alardawi
ID: 21352089
Section: ZJ
Course name: Programming II
Course code: CPCS 203
Assignment number: Assignment #2 (Car Insurance Claim System)
 */

import java.util.Date;

public class Claim {
    private long claimNo;
    private String location;
    private Date claimDate;
    private boolean hasPremium;
    private boolean hasSpecialOffer;

    //

    public Claim(String location, Date claimDate, boolean hasPremium, boolean hasSpecialOffer) {
        this.location = location;
        this.claimDate = claimDate;
        this.hasPremium = hasPremium;
        this.hasSpecialOffer = hasSpecialOffer;
        this.claimNo = System.currentTimeMillis();
    }

    public Claim() {
        this.claimNo = System.currentTimeMillis();
    }

    //

    public long getClaimNo() {
        return claimNo;
    }

    public void setClaimNo(long claimNo) {
        this.claimNo = claimNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public boolean isHasPremium() {
        return hasPremium;
    }

    public void setHasPremium(boolean hasPremium) {
        this.hasPremium = hasPremium;
    }

    public boolean isHasSpecialOffer() {
        return hasSpecialOffer;
    }

    public void setHasSpecialOffer(boolean hasSpecialOffer) {
        this.hasSpecialOffer = hasSpecialOffer;
    }

    //

    @Override
    public String toString() {
        return "Claim{" +
                "location='" + location + '\'' +
                ", claimDate=" + claimDate +
                ", hasPremium=" + hasPremium +
                ", hasSpecialOffer=" + hasSpecialOffer +
                ", claimNo=" + claimNo +
                '}';
    }
}