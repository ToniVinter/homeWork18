package ro.fasttrackit.shop.items;

import ro.fasttrackit.shop.category.Category;
import ro.fasttrackit.shop.services.ShopItem;

import javax.swing.text.html.Option;
import java.util.Objects;
import java.util.Optional;

public class Clothes implements ShopItem {
    private final String name;
    private final int price;
    private final Category category;
    private final Optional<String> brand;

    public Clothes(String name, int price, Category category, String brand) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.brand = Optional.of(brand);
    }

    public Clothes(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.brand = Optional.ofNullable("no brand");
    }


    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return category;
    }

    @Override
    public Optional<String> brand() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return price == clothes.price &&
                Objects.equals(name, clothes.name) &&
                category == clothes.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", brand='" + brand + '\'' +
                '}';
    }
}
