public class Employee {
    private int id;
    private String name;
    private String position;

    // example like student deteils
    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    /*
     * toString method
     * public String toString() {
     * return "ID: " + id + ", Name: " + name + ", Position: " + position;
     * }
     */
}
