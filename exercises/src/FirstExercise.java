public class FirstExercise {
    public static boolean VerifyString(String x) {
        return x.length() % 2 == 0;
    }
public static boolean VerifyYear(int x) {
        return x % 4 == 0 && x % 100 == 0 || x % 400 == 0;
}

static void main(String[] args) {
    String str1 = "Ciaone";
    System.out.println(VerifyString(str1));
    int year = 2026;
    System.out.println(VerifyYear(year));
    }
}