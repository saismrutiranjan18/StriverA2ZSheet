// 4. Switch Statement – Advanced Notes + Practice (Nested Switch + LeetCode Style + MCQ Traps)


/* =====================================================
   SWITCH STATEMENT – ADVANCED NOTES + PRACTICE
   (Nested Switch + LeetCode Style + MCQ Traps)
   =====================================================

1️⃣ IF–ELSE vs SWITCH (Quick Recall – Interview Ready)
-----------------------------------------------------
IF–ELSE:
- Used for ranges & complex conditions
- Uses <, >, <=, >=, &&, ||
- Example: grading, eligibility, ranges

SWITCH:
- Used for exact value matching
- Cleaner & more readable
- Faster decision mapping

RULE OF THUMB:
Range        → if–else
Exact value  → switch

------------------------------------------------------

2️⃣ SWITCH Statement Syntax (Java)
----------------------------------
switch(expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}

------------------------------------------------------

3️⃣ Why break is IMPORTANT
--------------------------
- Stops execution after matched case
- Prevents fall-through
- Very common interview trap

------------------------------------------------------

4️⃣ Fall-Through Example (VERY IMPORTANT)
-----------------------------------------
int x = 2;

switch (x) {
    case 1: System.out.println("One");
    case 2: System.out.println("Two");
    case 3: System.out.println("Three");
}

// Output:
// Two
// Three
// Reason: no break → execution continues

------------------------------------------------------

5️⃣ Types Allowed in Java switch (Interview Q)
----------------------------------------------
✅ Allowed:
- int
- char
- String
- enum

❌ Not Allowed:
- float
- double
- boolean

------------------------------------------------------

🔥 PART 1: NESTED SWITCH (Interview Favorite)
---------------------------------------------
- switch inside another switch
- Used when decision depends on multiple variables

Example: Role + Action System

String role = "Admin";
int action = 2;

switch (role) {
    case "Admin":
        switch (action) {
            case 1: System.out.println("Admin: Create User"); break;
            case 2: System.out.println("Admin: Delete User"); break;
            default: System.out.println("Invalid Admin Action");
        }
        break;

    case "User":
        switch (action) {
            case 1: System.out.println("User: View Profile"); break;
            case 2: System.out.println("User: Update Profile"); break;
        }
        break;

    default:
        System.out.println("Invalid Role");
}

// Output: Admin: Delete User

INTERVIEW TIP:
- Avoid deep nesting
- 2-level nesting is acceptable

------------------------------------------------------

🔥 PART 2: LEETCODE-STYLE CONDITIONAL QUESTIONS
-----------------------------------------------

Q1️⃣ Leap Year (Most Asked)
int year = 2024;

if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
    System.out.println("Leap Year");
else
    System.out.println("Not Leap Year");

------------------------------------------------------

Q2️⃣ FizzBuzz (Top Interview Question)
for (int i = 1; i <= 15; i++) {
    if (i % 3 == 0 && i % 5 == 0)
        System.out.println("FizzBuzz");
    else if (i % 3 == 0)
        System.out.println("Fizz");
    else if (i % 5 == 0)
        System.out.println("Buzz");
    else
        System.out.println(i);
}

------------------------------------------------------

Q3️⃣ Maximum of Three Numbers
int a = 10, b = 25, c = 15;

if (a >= b && a >= c)
    System.out.println(a);
else if (b >= a && b >= c)
    System.out.println(b);
else
    System.out.println(c);

// Output: 25

------------------------------------------------------

🔥 PART 3: MCQ / TRAP QUESTIONS (VERY IMPORTANT)
-----------------------------------------------

❓ Q1: What is output?
int x = 10;
if (x = 5) {
    System.out.println("Yes");
}

❌ Compile-time error
Reason: int cannot be assigned to boolean

------------------------------------------------------

❓ Q2:
int x = 10;

if (x > 5)
    System.out.println("A");
    System.out.println("B");

// Output:
// A
// B
// Reason: B is outside if block (no braces)

------------------------------------------------------

❓ Q3:
int x = 1;

switch (x) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
}

// Output:
// One
// Two
// Reason: missing break → fall-through

------------------------------------------------------

❓ Q4:
boolean b = true;

switch (b) {
    case true: System.out.println("Yes");
}

❌ Compile-time error
Reason: boolean not allowed in switch

------------------------------------------------------

❓ Q5:
final int x = 10;

switch (x) {
    case 10: System.out.println("Ten");
}

// Output: Ten
// Reason: final constant allowed

------------------------------------------------------

🔥 FINAL PRACTICE TASK (DO THIS)
--------------------------------
✔ Convert FizzBuzz → switch (where possible)
✔ Write calculator using switch
✔ Predict output before running
✔ Remove break & analyze fall-through
✔ Convert if–else → switch

------------------------------------------------------

🧠 ONE-LINE INTERVIEW SUMMARY
-----------------------------
"Use if–else for ranges and conditions, switch for exact matches, and always watch for fall-through."

=====================================================
END OF SWITCH STATEMENT NOTES
===================================================== */
