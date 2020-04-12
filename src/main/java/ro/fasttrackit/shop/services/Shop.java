package ro.fasttrackit.shop.services;

import ro.fasttrackit.shop.category.Category;

import java.util.ArrayList;
import java.util.List;

public class Shop<T extends ShopItem> {
    private final List<T> items;

    public Shop(List<T> items) {
        this.items = items;
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getStock(){
        return items;
    }

    public List<T> findByCategory(Category category) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.category().equals(category)) {
                result.add(item);
            }
        }
        return result;
    }

    public List<T> findWithLowerPrice(int maxPrice){
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if(item.price() < maxPrice){
                result.add(item);
            }
        }
        return result;
    }

    public T findByName(String name){
        return items.stream()
                .filter(t -> t.name().equals(name))
                .findFirst()
                .get();
    }

   public void removeItem(String name){
        items.removeIf(t -> t.name().equals(name));
   }

   public double getTvaByName(String name){
        T item = items.stream()
                .filter(t -> t.name().equals(name))
                .findFirst()
                .get();
        return item.price()%0.2;
   }

   public List<T> getAllByBrand(String brand){
        List<T> result = new ArrayList<>();
       for (T item : items) {
           if (item.category().equals(brand)) {
               result.add(item);
           }
       }
       return result;
   }


    @Override
    public String toString() {
        return "Shop{" +
                "items=" + items +
                '}';
    }
}
