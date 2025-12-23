// 3. If-Else Statements in Java - Complete Quick Notes (DSA + Interview + Practice)

/* =====================================================
   IF–ELSE STATEMENTS IN JAVA – COMPLETE QUICK NOTES
   (DSA + INTERVIEW + PRACTICE)
   =====================================================

1️⃣ What are Conditional Statements?
------------------------------------
- Used to make decisions in a program
- Execution depends on true / false condition
- Java supports:
  • if
  • if–else
  • else if (ladder)

------------------------------------------------------

2️⃣ Basic if Statement
----------------------
- Executes only when condition is true

Example:
int x = 10;
if (x > 5) {
    System.out.println("x is greater than 5");
}

------------------------------------------------------

3️⃣ if–else Statement
---------------------
- if  → runs when condition is true
- else → runs when condition is false
- Condition must return boolean

Example:
int age = 16;
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Not Adult");
}

------------------------------------------------------

4️⃣ Flow of Control
-------------------
1. Condition is checked
2. If true  → if block executes
3. If false → else block executes
4. Only ONE block runs

------------------------------------------------------

5️⃣ else if Ladder (Multiple Conditions)
----------------------------------------
- Used when multiple choices exist
- Conditions checked top to bottom
- First matching condition executes

Example (Grading):
int marks = 62;

if (marks < 25) {
    System.out.println("Grade F");
} else if (marks <= 44) {
    System.out.println("Grade E");
} else if (marks <= 49) {
    System.out.println("Grade D");
} else if (marks <= 59) {
    System.out.println("Grade C");
} else if (marks <= 69) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade A");
}

------------------------------------------------------

6️⃣ Interview Logic: Why No Lower Bounds?
-----------------------------------------
❌ Bad:
marks >= 50 && marks <= 59

✅ Good:
marks <= 59

✔ Previous conditions already handle lower limits
✔ Cleaner, readable, less error-prone
✔ Preferred in interviews & DSA

------------------------------------------------------

7️⃣ Nested if–else
------------------
- if inside another if
- Used when decisions depend on multiple levels

Example:
int age = 20;
boolean hasID = true;

if (age >= 18) {
    if (hasID) {
        System.out.println("Allowed");
    } else {
        System.out.println("ID required");
    }
} else {
    System.out.println("Underage");
}

------------------------------------------------------

8️⃣ if–else vs switch (IMPORTANT)
---------------------------------
Use if–else when:
- Conditions involve ranges
- Conditions involve boolean expressions

Use switch when:
- Comparing one variable
- Fixed values (menu, days, choices)

------------------------------------------------------

9️⃣ switch Statement Example
----------------------------
int day = 3;

switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Invalid day");
}

------------------------------------------------------

🔟 Java Rules (VERY IMPORTANT)
------------------------------
- Condition must be boolean
- Java does NOT allow:
  if (x) ❌

- Must write:
  if (x > 0) ✅

------------------------------------------------------

1️⃣1️⃣ Common Interview Mistakes
--------------------------------
❌ Using = instead of ==
❌ Wrong condition order
❌ Using multiple if instead of else if
❌ Forgetting break in switch

------------------------------------------------------

🧠 PRACTICE QUESTIONS (DSA READY)
--------------------------------

Practice 1: Even or Odd
int n = 7;
if (n % 2 == 0)
    System.out.println("Even");
else
    System.out.println("Odd");

Practice 2: Largest of 3 Numbers
int a = 10, b = 20, c = 15;

if (a >= b && a >= c)
    System.out.println(a);
else if (b >= c)
    System.out.println(b);
else
    System.out.println(c);

Practice 3: Leap Year
int year = 2024;

if (year % 400 == 0)
    System.out.println("Leap Year");
else if (year % 100 == 0)
    System.out.println("Not Leap Year");
else if (year % 4 == 0)
    System.out.println("Leap Year");
else
    System.out.println("Not Leap Year");

Practice 4: Valid Triangle
int a1 = 3, b1 = 4, c1 = 5;

if (a1 + b1 > c1 && a1 + c1 > b1 && b1 + c1 > a1)
    System.out.println("Valid Triangle");
else
    System.out.println("Invalid Triangle");

Practice 5: Calculator using switch
int x = 10, y = 5;
char op = '+';

switch (op) {
    case '+': System.out.println(x + y); break;
    case '-': System.out.println(x - y); break;
    case '*': System.out.println(x * y); break;
    case '/': System.out.println(x / y); break;
    default: System.out.println("Invalid operator");
}

------------------------------------------------------

🎯 INTERVIEW ONE-LINE SUMMARY
-----------------------------
- Use if for single condition
- Use else if for ranges
- Use switch for fixed values
- Condition must be boolean
- Order of conditions matters

=====================================================
END OF QUICK REVISION NOTES
===================================================== */
