class WrapperToPrimitive {
    public static void main(String[] args) {
        Double d = 45.67;
        double d1 = d;
        int i = (int) d1;
        System.out.println("Double: " + d1);
        System.out.println("Int: " + i);
    }
}