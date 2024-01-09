package expenseTracker;

import java.time.LocalDate;

public class Entry {

    private String item;
    private double cost;
    private LocalDate date;
    private String memo;

    public Entry(String item, double cost, int year, int month, int day, String memo) {
        setItem(item);
        setCost(cost);
        setDate(year, month, day);
        setMemo(memo);
    }

    public void setItem(String item) { this.item = item; }
    public void setCost(double cost) { this.cost = cost; }

    public void setDate(int year, int month, int day) {
        try {
            LocalDate date = LocalDate.of(year, month, day);
            this.date = date;
        } catch (Exception e) {
            System.err.println("Invalid date..");
        }
    }
    public void setMemo(String memo) { this.memo = memo; }

    public String getItem() { return item; }
    public double getCost() { return cost; }
    public LocalDate getDate() { return date; }
    public String getMemo() { return memo; }

    public String toString() {
        String entry = "Date: " + getDate()
                + "\nItem: " + getItem()
                + "\nCost: " + getCost()
                + "\nMemo: " + getMemo();
        return entry;
    }
}
