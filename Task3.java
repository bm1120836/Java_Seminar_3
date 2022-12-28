/*
 * Сведения о книге состоят из названия, фамилии автора, цены, 
 * года издания и количества страниц. 
 * Найти названия книг, в которых простое количество страниц, 
 * фамилия автора содержит «А» и год издания не позднее 2010 г.
 * 
 * 
 */



public class Task3 {
    public static void main(String[] args) {
        Book[] books = new Book[] { new Book("Фантастика", "Акунин", 346.0, 2005, 462),
        new Book("Убить пересмешника", "Харпер", 1200.0, 1960, 460),
        new Book("Гордость и предубеждение", "Остен", 620.50, 1813, 490),
        new Book("Книжный вор", "Зусак", 430.0, 2005, 290),
        new Book("Реквием", "Ахматова", 329.0, 1963, 313),
        new Book("Граф Монте-Кристо", "Дюма", 690.0, 1844, 431),
        new Book("Дюймовочка", "Андерсен", 780.0, 1835, 109),
        new Book("Пятьдесят оттенков серого", "Джеймс", 670.90, 2011, 425)
        };
        System.out.println("\nЗадача №3:");
        tas(books);
    }

    static void tas(Book[] books) {
        String letter = "А";
        Integer year = 2010;
        System.out.println(
                "Названия книг, в которых простое количество страниц, фамилия автора содержит \"А\" и год издания не позднее 2010 г.: ");
        for (int i = 0; i < books.length; i++) {
            if (books[i].authorSurname.contains(letter) && books[i].yearPublishing < year) {
                boolean flag = true;
                for (int j = 2; j < books[i].pages / 2; j++) {
                    if (books[i].pages % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    System.out.println(books[i].toString());
            }
        }
    }
    
}
