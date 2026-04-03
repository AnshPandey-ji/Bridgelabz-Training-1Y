import java.util.*;
class EmployeeData {
    public static void main(String[] args) {
        int[] ages = {25, 30, 19, 45};
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : ages) {
            list.add(a);
        }
        System.out.println("Youngest: " + Collections.min(list));
        System.out.println("Oldest: " + Collections.max(list));
    }
}