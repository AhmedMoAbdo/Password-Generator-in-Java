# Password Generator

## Overview
This Java program is a Password Generator that allows users to create random passwords based on their specified criteria, including length and complexity level. By defining the complexity level (1, 2, or 3) and the desired length of the password, users can generate secure and random passwords for various purposes.

## How to Use
1. Run the program.
2. Enter the desired complexity level (1, 2, or 3) when prompted.
3. Enter the desired length of the password when prompted.
4. The program generates a random password based on the specified criteria.
5. The generated password is displayed on the console.

## Features
- **User Input:** Utilizes the `Scanner` class to receive user input for complexity level and password length.
- **Random Password Generation:** Utilizes the `random()` method from the `Math` class to generate a random password based on the specified complexity level.
- **Complexity Levels:** Defines three complexity levels, each with different character sets (uppercase, lowercase, digits, and special characters) for password generation.
- **Loop Structure:** Iterates through the character sets to create a password of the desired length.
- **Password Display:** Displays the generated password on the console.

## Code Snippet
```java
// Example of user input and password generation
Scanner in = new Scanner(System.in);
int cmplx, len;

System.out.print("Enter the complexity level (1, 2, 3): ");
cmplx = in.nextInt();

System.out.print("Enter the length of the password: ");
len = in.nextInt();

// ... (rest of the code)
