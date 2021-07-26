package zadanie3;

public class Producer extends Address {
    String taxNumber;
    String producerName;

    public Producer(int houseNumber, int apartmentNumber, String town, String taxNumber, String producerName) {
        super(houseNumber, apartmentNumber, town);
        this.taxNumber = taxNumber;
        this.producerName = producerName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("tax number: " + taxNumber);
        System.out.println("producer name: " + producerName);
    }
}
