class AgeValidation {
    public static boolean checkAge(String age) {
        try {
            int a = Integer.parseInt(age);
            return a >= 18;
        } catch (Exception e) {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkAge("20"));
        System.out.println(checkAge("abc"));
    }
}