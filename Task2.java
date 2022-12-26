import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. 
 * Получить наименования товаров заданного сорта с наименьшей ценой
 */


public class Task2 {

    public static void main(String[] args) {
        Product[] list2 = new Product[] { new Product("Лук", "Россия", 5.100, 109.90, 2),
        new Product("Шоколад", "Франция", 0.200, 350.0, 2),
        new Product("Чай листовой", "Индия", 290.0, 380.0, 1),
        new Product("Зефир фруктовый, высшей категории", "Беларусь", 260.5, 190.0,3),
        new Product("Кофе зерновой", "Колумбия", 0.800, 350.0, 2),
        new Product("Конфеты. Ириска золотая", "Россия", 0.100, 109.90, 2)
        };
        tas(list2);
    }

    static void tas(Product[] list) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите сорт товара (от 1 до 3):");
            Integer variety = scanner.nextInt();
            if (variety >= 1 && variety <= 3) {
                scanner.close();
        
                ArrayList<Product> listSpecifiedVariety = new ArrayList<>();
        
                for (int i = 0; i < list.length; i++) {
                    if (list[i].variety == variety) {
                        listSpecifiedVariety.add(list[i]);
                    }
                }
        
                Product[] sortListSpecifiedVariety = listSpecifiedVariety.toArray(new Product[listSpecifiedVariety.size()]);
                Arrays.sort(sortListSpecifiedVariety);
                Double minPrice = sortListSpecifiedVariety[0].price;
        
                System.out.println("Товары " + variety + " сорта с наименьшей ценой:");
                for (int i = 0; i < sortListSpecifiedVariety.length; i++) {
                    if (Math.abs(sortListSpecifiedVariety[i].price - minPrice) <= 0.00001) {
                        System.out.println(sortListSpecifiedVariety[i].toString());
                    } else {
                        break;
                    }
                }
                break;
            }
        } 
    }

    
}
