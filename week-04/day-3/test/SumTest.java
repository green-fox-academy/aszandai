import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
    List<Integer> list = new ArrayList<>();

    public Integer sumOfElements(List<Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        return sum;
    }

    @Test
    public void sumOfElements_isItWorking() {

        Integer expected = 15;
        Integer actual = sumOfElements(list);
        System.out.println(expected + " " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void sumOfElements_isEmptyList() {
        Integer expected = 0;
        Integer actual = sumOfElements(list);
        System.out.println(expected + " " + actual);
        assertNotEquals(expected, actual);
    }

    @Test
    public void sumOfElements_isOnlyElementAvailable() {
        list.add(1);
        List<Integer> expected = Collections.singletonList(1);
        List<Integer> actual = list;
        assertEquals(expected, actual);
    }

    @Test
    public void sumOfElements_isMultipleElementAvailable() {
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> expected = Arrays.asList(1,2,3);
        List<Integer> actual = list;
        assertEquals(expected, actual);
    }

    @Test
    public void sumOfElements_isNull() {
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> expected = null;
        List<Integer> actual = list;

        assertNotEquals(expected,actual);
    }
}
