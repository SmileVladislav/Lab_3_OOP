public class Lab3Main {
    public static void main(String[] args) {
        try {
            SportsEquipment[] items = {
                    new SportsEquipment("М'яч", "Adidas", 1200.0, 0.4, 15),
                    new SportsEquipment("Гантеля", "York", 800.0, 5.0, 10),
                    new SportsEquipment("Ракетка", "Wilson", 2500.0, 0.3, 5),
                    new SportsEquipment("Гантеля", "Interat", 800.0, 2.0, 20),
                    new SportsEquipment("М'яч", "Nike", 1100.0, 0.45, 12)
            };

            for (int i = 0; i < items.length - 1; i++) {
                for (int j = 0; j < items.length - i - 1; j++) {
                    boolean swap = false;
                    if (items[j].getPrice() > items[j + 1].getPrice()) {
                        swap = true;
                    } else if (items[j].getPrice() == items[j + 1].getPrice()) {
                        if (items[j].getWeight() < items[j + 1].getWeight()) {
                            swap = true;
                        }
                    }

                    if (swap) {
                        SportsEquipment temp = items[j];
                        items[j] = items[j + 1];
                        items[j + 1] = temp;
                    }
                }
            }

            System.out.println("Результат сортування (ціна та вага):");
            for (SportsEquipment item : items) {
                System.out.println(item);
            }

            SportsEquipment target = new SportsEquipment("М'яч", "Adidas", 1200.0, 0.4, 15);
            System.out.println("\nПошук ідентичного об'єкта...");
            
            boolean found = false;
            for (SportsEquipment item : items) {
                if (item.equals(target)) {
                    System.out.println("Знайдено: " + item);
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println("Об'єкт не знайдено.");

        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
