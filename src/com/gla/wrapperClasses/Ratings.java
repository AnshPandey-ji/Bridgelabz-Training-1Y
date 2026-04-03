import java.util.*;
class Ratings {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        list.add(5);
        list.add(null);
        int sum = 0, count = 0;
        for (Integer i : list) {
            if (i != null) {
                sum += i;
                count++;
            }
        }
        System.out.println("Average: " + (sum / count));
    }
}