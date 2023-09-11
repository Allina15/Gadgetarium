package gadgetarium;

import java.util.List;
import java.util.Map;

public class Product {
    private int id;
    private Category category;
    private String name;
    private Map<KeyCharacter, List<String>> Characters;
    private double price;

    public Product(int id, Category category, String name, Map<KeyCharacter, List<String>> characters, double price) {
        this.id = id;
        this.category = category;
        this.name = name;
        Characters = characters;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<KeyCharacter, List<String>> getCharacters() {
        return Characters;
    }

    public void setCharacters(Map<KeyCharacter, List<String>> characters) {
        Characters = characters;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " +
                "id = " + id +
                ", category = " + category +
                ", name = " + name +
                ", Characters = " + Characters +
                ", price = " + price;
    }
}
