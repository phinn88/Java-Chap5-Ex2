public abstract class Computer {
    public String name;
    protected String ID;
    float price;
    abstract void showInfo();
    public Computer(String name, String ID, float price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }
}
