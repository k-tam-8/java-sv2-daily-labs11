package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {
    @Test
    void testElevation() {
        List<Double> heightList = Arrays.asList(10.0,20.0,15.0,18.0);
        Hiking hiking = new Hiking(heightList);
        assertEquals(13.0,hiking.getPlusElevation(hiking.getHeightList()));
        List<Double> heightList2 = Arrays.asList(10.0,20.0, 25.0,15.0,18.0);
        Hiking hiking2 = new Hiking(heightList2);
        assertEquals(18.0,hiking2.getPlusElevation(hiking2.getHeightList()));
    }
}