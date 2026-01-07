public class SecondExercise {
    public static String PrintWords(int x) {
        return switch (x) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "error: invalid input";
        };
    };

    public static void main(String[] args) {
        int number = 4;
        System.out.println(PrintWords(number));
    }
}