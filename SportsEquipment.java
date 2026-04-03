import java.util.Objects;

public class SportsEquipment {
    private String name;
    private String brand;
    private double price;
    private double weight;
    private int stock;


    public SportsEquipment(String name, String brand, double price, double weight, int stock) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportsEquipment that = (SportsEquipment) o;
        return Double.compare(that.price, price) == 0 &&
                Double.compare(that.weight, weight) == 0 &&
                stock == that.stock &&
                Objects.equals(name, that.name) &&
                Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, price, weight, stock);
    }

    @Override
    public String toString() {
        return String.format("Товар: %-10s | Бренд: %-8s | Ціна: %8.2f | Вага: %4.1f | На складі: %d",
                name, brand, price, weight, stock);
    }
}