import java.util.Scanner;

import static java.lang.Math.random;

public class PasswordGenerator {
    public static String generate(String a, int len) {
        String pass = "";
        while (len-- > 0) {
            pass += a.charAt((int) (random() * a.length()));
        }
        return pass;
    }
    
    public static String generate(String a, String b, int len) {
        String pass = "";
        while (len-- > 0) {
            byte x = (byte) (random() * 2);
            if (x == 0)
                pass += a.charAt((int) (random() * a.length()));
            else
                pass += b.charAt((int) (random() * b.length()));
        }
        return pass;
    }

    public static String generate(String a, String b, String c, int len) {
        String pass = "";
        while (len-- > 0) {
            byte x = (byte) (random() * 3);
            if (x == 0)
                pass += a.charAt((int) (random() * a.length()));
            else if (x == 1)
                pass += b.charAt((int) (random() * b.length()));
            else
                pass += c.charAt((int) (random() * c.length()));
        }
    
        return pass;
    }

    public static void generatePassword()
    {
        Scanner in = new Scanner(System.in);

        int len = 0, cmplx = 0;
        System.out.print("Enter the Type of password you want (1,2,3,4):\n1: Only numbers\n2: Only Characters\n3: Numbers and Characters\n4: All above with special characters\n");
        while (cmplx>4||cmplx<1){
            cmplx = in.nextInt();
        }
        System.out.print("Enter the length of the password(minimum length -> 8): ");
        while (len < 8) {
            len = in.nextInt();
        }

        String[] complex = new String[3];
        complex[0] = "123456789";
        for (int i = 65; i <= 122; i++) {
            if(i > 90 && i < 97) continue;
            complex[1] += (char) i;
        }

        complex[2] = "!@#$%&_-";

        String pass = "";

        switch (cmplx) {
            case 1:
                pass = generate(complex[0], len);
                break;
            case 2:
                pass = generate(complex[1], len);
                break;
            case 3:
                pass = generate(complex[0],complex[1], len);
                break;
            case 4:
                pass = generate(complex[0],complex[1], complex[2], len);
                break;
            default:
                break;
        }
        System.out.println(pass);
    }

    public static void main(String[] args) {
        generatePassword();
        return;
    }
}
