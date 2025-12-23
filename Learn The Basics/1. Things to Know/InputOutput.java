/* Complete the function printNumber which takes an integer input from the user and prints it on the screen. */

import java.util.Scanner;

class InputOutput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
    }
}

/* =====================================================
   STRUCTURE OF A JAVA PROGRAM (QUICK REVISION NOTES)
   =====================================================

1️⃣ Basic Structure of Java Program
-----------------------------------
- Every Java program starts with a class
- main() is the entry point of execution

class Main {
    public static void main(String[] args) {
        // Code execution starts here
    }
}

------------------------------------------------------

2️⃣ Output in Java (System.out.print / println)
-----------------------------------------------
- System.out.print()  → prints output in same line
- System.out.println() → prints output + new line

Example:
System.out.print("Hey, Striver!");
System.out.println("Hello World");

------------------------------------------------------

3️⃣ Taking User Input using Scanner
-----------------------------------
- Scanner class is present in java.util package
- Easy to use but slower (not preferred in DSA)

Steps:
1. import java.util.Scanner;
2. Create Scanner object
3. Use nextInt(), next(), nextLine(), etc.

Example:
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
System.out.println("Value of x: " + x);

------------------------------------------------------

4️⃣ Fast Input using BufferedReader (DSA Preferred)
---------------------------------------------------
- Faster than Scanner
- Used in Competitive Programming & Interviews
- Input is always read as String
- Needs type conversion

Steps:
1. import java.io.*;
2. Create BufferedReader object
3. Read input using readLine()
4. Convert using Integer.parseInt()

Example:
import java.io.*;

BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));

int x = Integer.parseInt(br.readLine());
System.out.println(x);

------------------------------------------------------

🔑 KEY DIFFERENCE (Scanner vs BufferedReader)
----------------------------------------------
Scanner        → Easy, Slow, High overhead
BufferedReader → Fast, Needs parsing, DSA preferred

=====================================================
END OF QUICK REVISION NOTES
===================================================== */
