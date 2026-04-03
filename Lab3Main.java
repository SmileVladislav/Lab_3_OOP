import java.util.Arrays;
import java.util.Comparator;


public class Lab3Main {

    public static void main(String[] args) {
        try {

            SportsEquipment[] inventory = {
                    new SportsEquipment("М'яч", "Adidas", 1200.0, 0.4, 15),
                    new SportsEquipment("Гантеля", "York", 800.0, 5.0, 10),
                    new SportsEquipment("Ракетка", "Wilson", 2500.0, 0.3, 5),
                    new SportsEquipment("Гантеля", "Interat", 800.0, 2.0, 20),
                    new SportsEquipment("М'яч", "Nike", 1100.0, 0.45, 12)
            };


            Arrays.sort(inventory, Comparator
                    .comparing(SportsEquipment::getPrice)
                    .thenComparing(Comparator.comparing(SportsEquipment::getWeight).reversed()));

            System.out.println("Список обладнання після сортування (Ціна та Вага) ");
            for (SportsEquipment equipmentItem : inventory) {
                System.out.println(equipmentItem);
            }


            SportsEquipment searchedItem = new SportsEquipment("М'яч", "Adidas", 1200.0, 0.4, 15);

            System.out.println("\nШукаємо ідентичний об'єкт у масиві...");
            for (SportsEquipment equipmentItem : inventory) {
                if (equipmentItem.equals(searchedItem)) {
                    System.out.println("Знайдено! Ось він: " + equipmentItem);
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println("Щось пішло не так : " + e.getMessage());
        }
    }
}