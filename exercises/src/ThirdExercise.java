import java.util.Scanner;

public class ThirdExercise {
    public static boolean PrintLoop(String x) {
        while (!x.equals(":q")) {
            System.out.println(x.toCharArray());
        }
        return false;
    }
};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str1 = sc.nextLine();
        System.out.println(ThirdExercise.PrintLoop(str1));
    }