package encapsulationandpolymorphism.librarymanagementsystem;

public class DVD extends LibraryItem{
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public void getLoanDuration(int duration) {
        setDuration(duration);
    }
    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Loan Duration : "+getDuration());
    }
}
