public class Main {

    public static void main(String[] args) {
        int add2Return = add(34, 39);
        System.out.println(add2Return);
        int add4Return = add(12, 34, 98, 76);
        System.out.println(add4Return);
        String greetingMorning = morningGreeting("Tim");
        System.out.println(greetingMorning);
        String greetingAfternoon = afternoonGreeting("Tim");
        System.out.println(greetingAfternoon);
        String trip = triple("Justin Chen");
        System.out.println(trip);
        double halved = half(60);
        System.out.println(halved);
        int roundedPositive = roundPositiveValueToNearestInteger(17.43432);
        System.out.println(roundedPositive);
        int roundedNegative = roundNegativeValueToNearestInteger(-7.5434343434);
        System.out.println(roundedNegative);

    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(a, add(b, add(c, d)));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String string) {
        return string + string + string;
    }

    // 6. half
    public static double half(int a) {
        return a / 2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a) {
//        double b = a + 0.5;
//        return (int) b;
        return (int) Math.round(a);
    }
// 2 methods, other method is commented

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a) {
        double b = a - 0.5;
        return (int) b;
// Math.round() method cannot be used here as that method uses + 0.5 for both positive and negative, therefore rounding i.e. -1.5 values to -1 instead of -2
    }
}
