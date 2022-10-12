import java.util.Scanner;

public class Shape {
    public static void drawPyramid(){
        Scanner b = new Scanner(System.in);
        System.out.println("Enter the amount of rows");
        int rows= b.nextInt();
        int a = 0;
        for (int i = 1; i <= rows; ++i, a = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");}
            while (a != 2 * i - 1) {
                System.out.print("* ");
                ++a;}
            System.out.println();
        }
    }
}
