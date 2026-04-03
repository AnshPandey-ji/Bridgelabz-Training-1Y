import java.util.*;
class PerformanceTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        long sum = 0;
        for (int i : arr) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Array time: " + (end - start));

        start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (end - start));
    }
}