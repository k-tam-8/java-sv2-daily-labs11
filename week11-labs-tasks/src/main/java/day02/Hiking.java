package day02;

import java.util.ArrayList;
import java.util.List;

public class Hiking {

    List<Double> coordinateX = new ArrayList<>();
    List<Double> coordinateY = new ArrayList<>();
    List<Double> heightList = new ArrayList<>();

    public Hiking(List<Double> heightList) {
        this.heightList = heightList;
    }

    public List<Double> getHeightList() {
        return heightList;
    }

    public double getPlusElevation(List<Double> heightList) {
        double heightSum = 0;
        for (int i = 0; i < heightList.size() - 1; i++) {
            if (heightList.get(i) < heightList.get(i + 1)) {
                heightSum += heightList.get(i + 1) - heightList.get(i);
            }
        }
        return heightSum;
    }
}
