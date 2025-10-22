package ua.opnu.list;

import java.util.Comparator;

public class AverageSorter implements Comparator {

    private boolean order;

    public AverageSorter(boolean order) {
        this.order = order;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            double d = s1.getAvgMark() - s2.getAvgMark();

            if (d < 0) return -(order ? 1 : -1);
            if (d > 0) return (order ? 1 : -1);
            return 0;

        }
        return 0;
    }
}
