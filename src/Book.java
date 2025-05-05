import java.time.LocalDate;
import java.util.ArrayList;

public class Book extends Document {
    private String title;
    private ArrayList<String> authors;
    private LocalDate date;

    public String getTitle() {
        return title;
    }
    @Override
    public void addAuthor(String name) {
        super.addAuthor(name);
    }

    @Override
    public ArrayList<String> getAuthors() {
        return super.getAuthors();
    }
    @Override
    public LocalDate getDate() {
        return super.getDate();
    }

}
