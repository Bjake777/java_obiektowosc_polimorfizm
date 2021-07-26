package zadanie3;

import java.util.Scanner;

public class OnlineShopApp {
    public static void main(String[] args) {
        OnlineShopWarehouse onlineShopWarehouse = new OnlineShopWarehouse();
        Scanner scanner = new Scanner(System.in);
        int decision = 0;

        String name;
        double price;
        int quantity;
        String expirationDate;
        int houseNumber;
        int apartmentNumber;
        String town;

        do {
            System.out.println("select options");
            System.out.println("add Milk - press 1");
            System.out.println("add Fruits - press 2");
            System.out.println("add Books - press 3");
            System.out.println("add Shoes - press 4");
            System.out.println("display all products 5");
            System.out.println("close the program - press 0");
            decision = scanner.nextInt();

            switch (decision) {
                case 1:
                    System.out.println("enter name");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("enter price");
                    price = scanner.nextDouble();
                    System.out.println("enter quantity");
                    quantity = scanner.nextInt();
                    System.out.println("enter expirationDate");
                    scanner.nextLine();
                    expirationDate = scanner.nextLine();
                    System.out.println("enter protein content");
                    double proteinContentPercentage = scanner.nextDouble();

                    Milk milk = new Milk(name, price, quantity, expirationDate, proteinContentPercentage);
                    onlineShopWarehouse.addProduct(milk);
                    break;
                case 2:
                    System.out.println("enter name");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("enter price");
                    price = scanner.nextDouble();
                    System.out.println("enter quantity");
                    quantity = scanner.nextInt();
                    System.out.println("enter expirationDate");
                    scanner.nextLine();
                    expirationDate = scanner.nextLine();
                    System.out.println("enter type");
                    String type = scanner.nextLine();

                    Fruits fruits = new Fruits(name, price, quantity, expirationDate, type);
                    onlineShopWarehouse.addProduct(fruits);
                    break;
                case 3:
                    System.out.println("enter name");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("enter price");
                    price = scanner.nextDouble();
                    System.out.println("enter quantity");
                    quantity = scanner.nextInt();

                    System.out.println("enter author name");
                    String authorName = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("enter author surname");
                    String authorSurname = scanner.nextLine();
                    System.out.println("enter town");
                    town = scanner.nextLine();
                    System.out.println("enter int apartment number");
                    apartmentNumber = scanner.nextInt();
                    System.out.println("enter house number");
                    houseNumber = scanner.nextInt();

                    Author author = new Author(houseNumber, apartmentNumber, town, authorName, authorSurname);
                    Books books = new Books(name, price, quantity, author);

                    onlineShopWarehouse.addProduct(books);
                    break;
                case 4:
                    System.out.println("enter name");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("enter price");
                    price = scanner.nextDouble();
                    System.out.println("enter quantity");
                    quantity = scanner.nextInt();

                    System.out.println("enter producer name");
                    scanner.nextLine();
                    String producerName = scanner.nextLine();
                    System.out.println("enter tax number");
                    String taxNumber = scanner.nextLine();
                    System.out.println("enter town");
                    town = scanner.nextLine();
                    System.out.println("enter int apartment number");
                    apartmentNumber = scanner.nextInt();
                    System.out.println("enter house number");
                    houseNumber = scanner.nextInt();

                    Producer producer = new Producer(houseNumber, apartmentNumber, town, taxNumber, producerName);
                    Shoes shoes = new Shoes(name, price, quantity, producer);

                    onlineShopWarehouse.addProduct(shoes);
                    break;
                case 5:
                    System.out.println("-------------------------------------------");
                    onlineShopWarehouse.displayAll();
                    System.out.println("-------------------------------------------");
                    break;
            }
        } while (decision != 0);
    }
}
