public class Burgers extends Product implements Foods{
    private final String name = "Бургеры";
    private final int price = 150;
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("Бургеры были сьедены");
    }
}
