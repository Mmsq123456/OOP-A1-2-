public class HealthProfessional {
    private int id;
    private String name;
    private String title;

    // Constructor
    public HealthProfessional(int id, String name, String title) {
        this.id = id;
        this.name = name;
        this.title = title;
    }

    // Default constructor (for completeness)
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.title = "";
    }

    // Getters and setters (if needed)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nTitle: " + title + "\n";
    }
}
