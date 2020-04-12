package ro.fasttrackit.shop;

import ro.fasttrackit.shop.items.Clothes;
import ro.fasttrackit.shop.services.Shop;

import java.util.ArrayList;
import java.util.Optional;

import static ro.fasttrackit.shop.category.Category.*;

public class Main {
    public static void main(String[] args) {

        Shop<Clothes> clothesShop = new Shop<>(new ArrayList<>());
        clothesShop.addItem(new Clothes("Shirt",100,ON_SALE, "j"));
        clothesShop.addItem(new Clothes("Pants",200,REFURBISHED, "ZARA"));
        clothesShop.addItem(new Clothes(" T-Shirt",49,NEW));
        clothesShop.addItem(new Clothes("Shoes",13,ON_SALE));
        System.out.println(clothesShop.findByName("Shirt"));
        System.out.println(clothesShop.getStock());
    }
}
