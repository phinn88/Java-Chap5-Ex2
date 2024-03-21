public class Laptop extends Computer {
    int weight;

    public Laptop(String name, String ID, float price, int weight) {
        super(name, ID, price);
        this.weight = weight;
    }

    @Override
    void showInfo() {
        System.out.println("Name = "+name);
        System.out.println("Id = "+ID);
        System.out.println("Price = "+price);
        System.out.println("Weight = "+weight);
    }
}
