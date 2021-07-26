package zadanie3;

public class Author extends Address {
    private String authorName;
    private String authorSurname;

    public Author(int houseNumber, int apartmentNumber, String town, String authorName, String authorSurname) {
        super(houseNumber, apartmentNumber, town);
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("author's name: " + authorName);
        System.out.println("author's surname: " + authorSurname);
    }
}
