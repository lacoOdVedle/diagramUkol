import java.time.LocalDate;
import java.util.ArrayList;

public class EMail extends Document{
    private ArrayList<String> authors;
    private LocalDate date;
    private String subject;
    private ArrayList<String> to;

    public String getSubject() {
        return subject;
    }
    public ArrayList<String> getTo() {
        return to;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }
    @Override
    public void addAuthor(String name) {
        super.addAuthor(name);
    }
    @Override
    public ArrayList<String> getAuthors() {
        return super.getAuthors();
    }
}
