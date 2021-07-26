package zadanie3;

public class Address {
    private int houseNumber;
    private int apartmentNumber;
    private String town;

    public Address(int houseNumber, int apartmentNumber, String town) {
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.town = town;
    }

    public void display() {
        System.out.println("house number: " + houseNumber);
        System.out.println("apartment number: " + apartmentNumber);
        System.out.println("town: " + town);
    }
}
