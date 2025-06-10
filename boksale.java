package boks;

public class boksale {
    String salerName;
    int numberOfSales;
    String salerId;

    public boksale(String salerName, int numberOfSales, String salerId) {
        this.salerName = salerName;
        this.numberOfSales = numberOfSales;
        this.salerId = salerId;
    }

    public static void main(String[] args) {
        bok book = new bok("Effective Java", "Joshua Bloch", "Addison-Wesley", 750.0, 2018);
        boksale sales = new boksale("Ravi", 120, "S102");

        book.display();
        System.out.println("Saler Name: " + sales.salerName);
        System.out.println("Number of Sales: " + sales.numberOfSales);
        System.out.println("Saler ID: " + sales.salerId);
    }
}
