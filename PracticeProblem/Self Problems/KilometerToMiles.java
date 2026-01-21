class KilometerToMiles{
    public static void main(String args[]) {

        int kilometers = 8;

        // 1 kilometer ≈ 621371 / 1000000 miles
        int miles = (kilometers * 621371) / 1000000;

        System.out.println("Miles = " + miles);
    }
}
