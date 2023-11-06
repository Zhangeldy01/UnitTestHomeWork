package HomeWork6;

import java.util.List;

public class ListComparator {

    private List<Integer> lst1;
    private List<Integer> lst2;

    public ListComparator(List<Integer> lst1, List<Integer> lst2) {
        this.lst1 = lst1;
        this.lst2 = lst2;
    }

    public double getAverage(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }

        double sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum / list.size();
    }

    public String compareLists() {
        double average1 = getAverage(lst1);
        double average2 = getAverage(lst2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
