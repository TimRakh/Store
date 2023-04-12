public class Orange extends Product implements Foods {
    //Open Closed Principle - имплементируя интерфейс Food мы добавляем
    // классу функциональности, не модифицируя исходный
    private final String name = "Апельсины";
    private final int price = 200;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("Апельсины были сьедены");
    }
}