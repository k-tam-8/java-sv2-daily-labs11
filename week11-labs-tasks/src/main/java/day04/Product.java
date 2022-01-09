package day04;

import java.time.LocalDate;

public class Product extends Goods{
    private LocalDate expireDate;

    public Product(String name, int price, LocalDate expireDate) {
        super(name, price);
        this.expireDate = LocalDate.now().plusWeeks(3);
    }
}
