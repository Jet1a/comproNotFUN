package MemberCard;

public class MemberCard {
    private static final int POINTS2CASH100 = 800;
    private static final int BAHT2POINT = 25;
    private long memberId;
    private int remainingPoints;
    private double totalPurchaseAmount;
    private int totalPoints;
    private int usagePoints;

    private int numberOfRedeem;

    public MemberCard(long idCard) {
        this.memberId = idCard;
    }

    public long getMemberId() {
        return memberId;
    }

    public double getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void addPoints(double purchaseAmount) {
        totalPurchaseAmount += purchaseAmount;
    }

    public void buy(double purchaseAmount) {
        addPoints(purchaseAmount);
        double points = purchaseAmount / 25;
        totalPoints += (int) points;
    }

    public int redeem() {
        if (totalPoints >= 800) {
            usagePoints += 800;
            remainingPoints = totalPoints - usagePoints;
            numberOfRedeem++;
            return 100;
        } else return 0;
    }

    public int getRemainingPoints() {
        return remainingPoints;
    }

    public int getNumberOfRedeem() {
        return numberOfRedeem;
    }

    @Override
    public String toString() {
        return "MemberCard{" + "memberId=" + memberId + ", totalPurchaseAmount=" + totalPurchaseAmount + ", totalPoints=" + totalPoints + ", usagePoints=" + usagePoints + ", remainingPoints=" + remainingPoints + '}';
    }
}
