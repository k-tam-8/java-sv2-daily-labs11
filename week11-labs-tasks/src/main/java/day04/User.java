package day04;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int budget;
    private List<Goods> goodsList = new ArrayList<>();

    public User(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void buyItem(Goods goods) {
        if (goods.getPrice() <= budget) {
            goodsList.add(goods);
            budget -= goods.getPrice();
        }
    }

}
