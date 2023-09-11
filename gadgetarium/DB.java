package gadgetarium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class DB {
        private List<Product> products = new ArrayList<>();
        private List<Characters> characters = new ArrayList<>();

    public DB(List<Product> products, List<Characters> characters) {
        this.products = products;
        this.characters = characters;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Characters> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Characters> characters) {
        this.characters = characters;
    }

    public void saveProduct(Product product) {
            products.add(product);
            System.out.println("Product saved");
        }

        public void updateProduct(Product product) {
            for (Product p : products) {
                if (p.equals(product)){
                    p.setPrice(product.getPrice());
                }
            }
        }

        public void getByIdProduct(int id) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId()==id) {
                    System.out.println(products.get(i));
                }
            }
        }

        public String searchByProductName(String name) {
            for (Product p:products) {
                if (p.getName().equalsIgnoreCase(name)){
                    System.out.println(p);
                }
            }
            return null;
        }

        public List<Product> filterByCharacter(KeyCharacter key, String value) {
            List<Product> filteredProducts = new ArrayList<>();
            for (Product p:products) {
                    for (Map<KeyCharacter, String> characterMap : p.getCharacters()) {
                        if (characterMap.containsKey(key) && characterMap.get(key).equals(value)) {
                            filteredProducts.add(p);
                        }
                }
            }
            return filteredProducts;
        }

        public List<Product> sortByCharacter(KeyCharacter key) {
            return null;
        }

        public void deleteByProduct(int id) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId()==id){
                    products.remove(products.get(i));
                    System.out.println("Product udalen");
                }
            }
        }

        public List<Product> getAllProduct() {
            return products;
        }

        public void deleteCharacterByKeyName(KeyCharacter key) {
            for (Product p : products) {
                for (Map<KeyCharacter, String> characterMap : p.getCharacters()) {
                    if (characterMap.containsKey(key)) {
                        products.remove(p);
                        System.out.println("Product udalen");
                    }
                }
            }
        }
        public void deleteAllCharacters() {
            characters.clear();
            System.out.println(products);
    }
}
