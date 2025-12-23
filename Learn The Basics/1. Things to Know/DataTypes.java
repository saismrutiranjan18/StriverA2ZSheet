/* =====================================================
   DATA TYPES IN JAVA – QUICK REVISION NOTES
   =====================================================

1️⃣ What are Data Types?
------------------------
- Data types define:
  • Memory size
  • Range of values
  • Allowed operations
- Java is a statically typed language
- Variable type must be declared before use

Example:
int x = 10;   // int → data type, x → variable

------------------------------------------------------

2️⃣ Categories of Data Types in Java
------------------------------------
Java data types are divided into:
1. Primitive Data Types
2. Non-Primitive (Reference) Data Types

------------------------------------------------------

3️⃣ Primitive Data Types
------------------------
- Store actual values
- Fixed size
- Faster performance

Type      Size      Description
--------------------------------
byte      1 byte    Small integer
short     2 bytes   Medium integer
int       4 bytes   Most used integer
long      8 bytes   Large integer
float     4 bytes   Decimal (single precision)
double    8 bytes   Decimal (double precision)
char      2 bytes   Single Unicode character
boolean   1 bit     true / false

Example:
int age = 20;
double price = 99.99;
char grade = 'A';
boolean isPassed = true;

------------------------------------------------------

4️⃣ Important Notes (Primitive Types)
-------------------------------------
- No unsigned data types (except char)
- boolean stores only true / false
- Sizes are platform independent

------------------------------------------------------

5️⃣ Non-Primitive (Reference) Data Types
----------------------------------------
- Store reference (address) of object
- Size not fixed
- Can store null

Common Types:
- String
- Arrays
- Classes
- Interfaces
- Enums
- Wrapper classes

Example:
String name = "Sai";
int[] arr = {1, 2, 3};

------------------------------------------------------

6️⃣ Primitive vs Non-Primitive (Key Differences)
-----------------------------------------------
Primitive            | Non-Primitive
-----------------------------------------------
Stores value         | Stores reference
Fixed size           | Variable size
Faster               | Slightly slower
Cannot be null       | Can be null

------------------------------------------------------

7️⃣ Wrapper Classes in Java
---------------------------
- Object form of primitive types
- Used in Collections & Generics

Primitive   → Wrapper
---------------------
int         → Integer
double      → Double
char        → Character
boolean     → Boolean

Example:
Integer x = 10;

Used in:
- ArrayList<Integer>
- Generics
- Object-based APIs

------------------------------------------------------

8️⃣ Type Casting in Java
------------------------
a) Implicit (Widening)
int x = 10;
double y = x;

b) Explicit (Narrowing)
double d = 10.5;
int x = (int) d;

------------------------------------------------------

9️⃣ Special Value: null
-----------------------
- Means no object reference
- Only for non-primitive types

Example:
String s = null;

------------------------------------------------------

🔟 Why Data Types Matter (Interview Point)
------------------------------------------
- Prevents compile-time errors
- Improves performance
- Controls memory usage
- Makes code readable & maintainable

------------------------------------------------------

1️⃣1️⃣ Java Data Types Summary
------------------------------
Integer        → byte, short, int, long
Floating Point → float, double
Character      → char
Boolean        → boolean
Reference      → String, arrays, objects

------------------------------------------------------

1️⃣2️⃣ Interview Tips (VERY IMPORTANT)
-------------------------------------
- Prefer int for integers
- Prefer double for decimals
- Use wrapper classes only when required
- NEVER compare strings using == (use .equals())

=====================================================
END OF QUICK REVISION NOTES
===================================================== */
