package gadgetarium;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<KeyCharacter, List<String>> characterMap1 = new HashMap<>();
        characterMap1.put(KeyCharacter.CPU, List.of("Intel i7"));
        characterMap1.put(KeyCharacter.RAM, List.of("16GB"));
        characterMap1.put(KeyCharacter.STORAGE, List.of("512GB"));
        characterMap1.put(KeyCharacter.SCREEN_SIZE, List.of("15.6 inches"));

        Map<KeyCharacter, List<String>> characterMap2 = new HashMap<>();
        characterMap2.put(KeyCharacter.CPU, List.of("AMD Ryzen 9"));
        characterMap2.put(KeyCharacter.RAM, List.of("32GB"));
        characterMap2.put(KeyCharacter.STORAGE, List.of("1TB"));
        characterMap2.put(KeyCharacter.SCREEN_SIZE, List.of("13.3 inches"));

        Map<KeyCharacter, List<String>> characterMap3 =  new HashMap<>();
        characterMap3.put(KeyCharacter.CPU, List.of("Qualcomm Snapdragon 888"));
        characterMap3.put(KeyCharacter.RAM, List.of("8GB"));
        characterMap3.put(KeyCharacter.STORAGE, List.of("128GB"));
        characterMap3.put(KeyCharacter.SCREEN_SIZE, List.of("1.4 inches"));

        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1,Category.LAPTOP, "LaptopX", characterMap1, 1299.99);
        Product product2 = new Product(2,Category.LAPTOP, "Laptop", characterMap2, 1499.99);
        Product product3 = new Product(3,Category.PHONE, "IphoneX", characterMap3, 799.99);
        products.add(product1);
        products.add(product2);
        products.add(product3);
//        List<Map<KeyCharacter, String>> characterList1 = new ArrayList<>();
//        List<Map<KeyCharacter, String>> characterList2 = new ArrayList<>();
//        List<Map<KeyCharacter, String>> characterList3 = new ArrayList<>();
//        List<Map<KeyCharacter, String>> characterList4 = new ArrayList<>();
//        List<Map<KeyCharacter, String>> characterList5 = new ArrayList<>();
//
//        Map<KeyCharacter, String> characteristics1 = new HashMap<>();
//        characteristics1.put(KeyCharacter.CPU, " i7");
//        characteristics1.put(KeyCharacter.RAM, "16GB");
//        characteristics1.put(KeyCharacter.STORAGE, "180GB SSD");
//        characteristics1.put(KeyCharacter.SCREEN_SIZE, "10.6 inches");
//        characteristics1.put(KeyCharacter.BATTERY_LIFE, "6 hours");
//
//        Map<KeyCharacter, String> characteristics2 = new HashMap<>();
//        characteristics2.put(KeyCharacter.CPU, "Intel Core i7");
//        characteristics2.put(KeyCharacter.RAM, "16GB");
//        characteristics2.put(KeyCharacter.STORAGE, "512GB SSD");
//        characteristics2.put(KeyCharacter.SCREEN_SIZE, "15.6 inches");
//        characteristics2.put(KeyCharacter.BATTERY_LIFE, "8 hours");
//
//        Map<KeyCharacter, String> characteristics3 = new HashMap<>();
//        characteristics3.put(KeyCharacter.CPU, "7AA");
//        characteristics3.put(KeyCharacter.RAM, "8GB");
//        characteristics3.put(KeyCharacter.STORAGE, "56GB SSD");
//        characteristics3.put(KeyCharacter.SCREEN_SIZE, "15 inches");
//        characteristics3.put(KeyCharacter.BATTERY_LIFE, "4 hours");
//
//        Map<KeyCharacter, String> characteristics4 = new HashMap<>();
//        characteristics4.put(KeyCharacter.CPU, "Intel Core i3");
//        characteristics4.put(KeyCharacter.RAM, "4GB");
//        characteristics4.put(KeyCharacter.STORAGE, "16GB SSD");
//        characteristics4.put(KeyCharacter.SCREEN_SIZE, "12 inches");
//        characteristics4.put(KeyCharacter.BATTERY_LIFE, "8 hours");
//
//        Map<KeyCharacter, String> characteristics5 = new HashMap<>();
//        characteristics5.put(KeyCharacter.CPU, "Intel Core i5");
//        characteristics5.put(KeyCharacter.RAM, "32GB");
//        characteristics5.put(KeyCharacter.STORAGE, "128GB SSD");
//        characteristics5.put(KeyCharacter.SCREEN_SIZE, "36 inches");
//        characteristics5.put(KeyCharacter.BATTERY_LIFE, "4 hours");
//
//
//        characterList1.add(characteristics1);
//        characterList2.add(characteristics2);
//        characterList3.add(characteristics3);
//        characterList4.add(characteristics4);
//        characterList5.add(characteristics5);
//
//        List<Product> productList = new ArrayList<>();
//        productList.add(new Product(1, Category.PHONE, "Phone A", characterList1, 499.99));
//        productList.add(new Product(2, Category.LAPTOP, "Laptop B", characterList2, 999.99));
//        productList.add(new Product(3, Category.PHONE, "Phone C", characterList3, 399.99));
//        productList.add(new Product(4, Category.SMARTWATCH, "Smartwatch D", characterList4, 149.99));
//        DB database = new DB(productList);
//        Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        DB database = new DB(products,)

        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1 - Сохранить продукт");
            System.out.println("2 - Обновить продукт");
            System.out.println("3 - Получить продукт по ID");
            System.out.println("4 - Поиск по имени продукта");
            System.out.println("5 - Фильтрация по характеристике");
            System.out.println("6 - Сортировка по характеристике");
            System.out.println("7 - Удалить продукт по ID");
            System.out.println("8 - Получить все продукты");
            System.out.println("9 - Удалить характеристику по ключу");
            System.out.println("10 - Удалить все характеристики");

            int operationCode = scanner.nextInt();
            switch (operationCode) {
                case 1:
                    Product productToSave =new Product(5, Category.LAPTOP, "Laptop E", characterList5, 1299.99);
                    database.saveProduct(productToSave);
                    break;
                case 2:
                    Product productToUpdate = new Product(1, Category.PHONE, "Updated Phone A", characterList1, 599.99);
                    database.updateProduct(productToUpdate);
                    break;
                case 3:
                    System.out.println("Введите айди продукта");
                    int idToRetrieve = scanner.nextInt();
                    database.getByIdProduct(idToRetrieve);
                    break;
                case 4:
                    System.out.print("Введите имя продукта для поиска: ");
                    String nameToSearch = scanner.next();
                    System.out.println(database.searchByProductName(nameToSearch));

                    break;
                case 5:
                    System.out.print("Введите key для фильтрации: ");
                    KeyCharacter filterKey = KeyCharacter.valueOf(scanner.next());
                    System.out.print("Введите значение для фильтрации: ");
                    String filterValue = scanner.next();
                    List<Product> filteredProducts = database.filterByCharacter(filterKey, filterValue);
                    if (!filteredProducts.isEmpty()) {
                        System.out.println("Результаты фильтрации:");
                        for (Product p : filteredProducts) {
                            System.out.println(p);
                        }
                    } else {
                        System.out.println("Продукты не найдены.");
                    }
                    break;
                case 6:
                    KeyCharacter sortKey = KeyCharacter.RAM;
                    List<Product> sortedProducts = database.sortByCharacter(sortKey);
                    if (!sortedProducts.isEmpty()) {
                        System.out.println("Результаты сортировки:");
                        for (Product p : sortedProducts) {
                            System.out.println(p);
                        }
                    } else {
                        System.out.println("Продукты не найдены.");
                    }
                    break;
                case 7:
                    int idToDelete = scanner.nextInt();
                    database.deleteByProduct(idToDelete);
                    break;
                case 8:
                    System.out.println(database.getAllProduct());
                    break;
                case 9:
                    KeyCharacter keyToDelete = KeyCharacter.valueOf(scanner.next());
                    database.deleteCharacterByKeyName(keyToDelete);
                    break;
                case 10:
                    database.deleteAllCharacters();
                    break;
            }
        }
    }
}
