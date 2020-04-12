package ro.fasttrackit.shop.services;

import ro.fasttrackit.shop.category.Category;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface ShopItem {
     String name();
    int price();
    Category category();
    Optional<String> brand();
}
