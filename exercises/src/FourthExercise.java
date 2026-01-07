import java.util.Scanner;

public class FourthExercise  {
    public static int Countdown(int number) {
        for (int i = number; i>0; i--){
            System.out.println(number);
            number--;
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        System.out.println(Countdown(number));
    }
}