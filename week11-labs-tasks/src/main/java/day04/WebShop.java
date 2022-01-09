package day04;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    private List<Goods> goodsList = new ArrayList<>();
    private List<User> userList = new ArrayList<>();

    public void buyGoods(String user, String goods) {
        int userId = 0;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals(user)) {
                userId = i;
            }
        }
        int goodsId = 0;
        for (int i = 0; i < goodsList.size(); i++) {
            if (goodsList.get(i).getName().equals(goods)) {
                goodsId = i;
            }
        }
        userList.get(userId).buyItem(goodsList.get(goodsId));
    }
}
