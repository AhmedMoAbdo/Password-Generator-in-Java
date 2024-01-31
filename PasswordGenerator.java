import java.util.Scanner;

import static java.lang.Math.random;

//Create a program that generates random passwords based on user-defined criteria (e.g., length, complexity).
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len, cmplx;
        System.out.print("Enter the complexity level (1,2,3): "); cmplx = in.nextInt();
        System.out.print("Enter the length of the password: "); len = in.nextInt();

        String[] complex = new String[3];
        complex[0]="";
        for (int i = 65; i < 123; i++) {
            complex[0] += (char) i;
        }

        complex[1] = ""+complex[0];
        for (int i = 48; i <= 57; i++) {
            complex[1] += (char) i;
        }

        complex[2] = ""+complex[1];
        for (int i = 33; i <= 47; i++) {
            complex[2] += (char) i;
        }

        int sz = complex[cmplx-1].length();

        String pass = "";
        int rand;
        for (int i = 0; i < len; i++) {
            rand = (int) (random() * sz);
            pass+=complex[cmplx-1].charAt(rand);
        }

        System.out.println(pass);

        return;
    }
}
