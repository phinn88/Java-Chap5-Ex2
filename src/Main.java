public class Main {
    public static void main(String[] args) {
        PC pc = new PC("HP123", "87", 815.99f, "Ultra Book");
        pc.showInfo();
        Laptop laptop = new Laptop("Macbook Air", "JK5354", 1299, 1800);
        laptop.showInfo();
    }
}
