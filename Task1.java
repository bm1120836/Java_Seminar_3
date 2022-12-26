/*
 * Дан массив записей: наименование товара, цена, сорт. 
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 *  
 */

public class Task1 {
    public static void main(String[] args) {
        Product[] list = new Product[] { new Product("Морковь. Высший сорт", 109.90, 1),
        new Product("Шоколад горький. Высший сорт", 280.15, 2),
        new Product("Чай индийский. Первый сорт", 380.0, 1),
        new Product("Зефир яблочный", 190.0, 3)
        };
        System.out.println("Наибольшая цена товаров 1-го и 2-го сорта, название которых содержит слово \"высший\" = "
        + tas(list) + " руб.");
    }

    static Double tas(Product[] list) {
        Double topPrice = 0.0;
        String str = "высший";

        for (int i = 0; i < list.length; i++) {
            if (list[i].name.toLowerCase().contains(str) && list[i].variety < 3) {
                if (list[i].price > topPrice) {
                    topPrice = list[i].price;
                }
            }
        }
        return topPrice;
    }
}
