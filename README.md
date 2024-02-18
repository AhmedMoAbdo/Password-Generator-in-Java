# Password Generator

This Java program generates random passwords based on user specifications. It offers flexibility in creating passwords with varying complexity levels and lengths.

#### Usage

1. Run the program.
2. Enter the type of password you want:
   - 1: Only numbers
   - 2: Only characters
   - 3: Numbers and characters
   - 4: All above with special characters

3. Enter the desired length of the password (minimum length: 8).

#### Features

- **generate(String a, int len):** Generates a password consisting of characters from string `a`.
- **generate(String a, String b, int len):** Generates a password consisting of characters from strings `a` and `b`.
- **generate(String a, String b, String c, int len):** Generates a password consisting of characters from strings `a`, `b`, and `c`.

#### Example

```java
public class Main {
    public static void main(String[] args) {
        PasswordGenerator.generatePassword();
    }
}
```

#### Note

- Ensure to input a minimum password length of 8 characters.
- The password generated may vary each time the program is executed due to the randomness involved.

Feel free to explore and modify the code according to your requirements. Happy coding! 🚀
