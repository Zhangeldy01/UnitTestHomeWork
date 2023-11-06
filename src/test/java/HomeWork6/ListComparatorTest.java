package HomeWork6;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListComparatorTest {

    @Test
    @DisplayName("Вычисления среднего значения списка")
    void testCalculateAverage() {
        List<Integer> lst = Arrays.asList(11, 12, 13, 14, 15);
        ListComparator comparator = new ListComparator(null, null);
        double result = comparator.getAverage(lst);
        Assertions.assertEquals(13.0, result);
    }
    @Test
    @DisplayName("Тест метода сравнения списков")
    public void testCompareLists() {
        // проверяем, что при сравнении списков с разными значениями метод compareLists()
        // возвращает "Второй список, который имеет большее среднее значение".

        List<Integer> lst1 = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15));
        List<Integer> lst2 = new ArrayList<>(Arrays.asList(21, 22, 23, 24, 25));
        ListComparator comparator = new ListComparator(lst1, lst2);
        String result = comparator.compareLists();
        Assert.assertEquals("Второй список имеет большее среднее значение", result);

        // проверяем, что при сравнении одинаковых по значениям списков метод
        // compareLists() возвращает "Средние значения равны".
        lst1 = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15));
        lst2 = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15));
        comparator = new ListComparator(lst1, lst2);
        result = comparator.compareLists();
        Assert.assertEquals("Средние значения равны", result);

        // проверяем, что при сравнении второго списка с пустым списком метод compareLists()
        // возвращает "Второй список, который имеет большее среднее значение".
        lst1 = new ArrayList<>();
        lst2 = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15));
        comparator = new ListComparator(lst1, lst2);
        result = comparator.compareLists();
        Assert.assertEquals("Второй список имеет большее среднее значение", result);

    }
}