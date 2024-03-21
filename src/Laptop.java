public class PC extends Computer {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PC(String name, String ID, float price, String description) {
        super(name, ID, price);
        this.description = description;
    }

    @Override
    void showInfo() {
        System.out.println("Name = "+name);
        System.out.println("Id = "+ID);
        System.out.println("Price = "+price);
        System.out.println("Description = "+description);
    }
}
