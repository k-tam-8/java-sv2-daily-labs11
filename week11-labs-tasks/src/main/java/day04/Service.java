package day04;

import java.time.LocalDate;

public class Service extends Goods {
    private LocalDate expireDate;

    public Service(String name, int price, LocalDate expireDate) {
        super(name, price);
        this.expireDate = LocalDate.now().plusYears(1);
    }
}
