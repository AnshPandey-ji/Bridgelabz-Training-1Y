import java.util.*;
class StudentMarks {
    public static void main(String[] args) {
        Object[] data = {"85", 95, Integer.valueOf(88), "null"};
        int sum = 0, count = 0;
        for (Object obj : data) {
            try {
                int val = Integer.parseInt(obj.toString());
                sum += val;
                count++;
            } catch (Exception e) {
            }
        }
        System.out.println("Average: " + (sum / count));
    }
}