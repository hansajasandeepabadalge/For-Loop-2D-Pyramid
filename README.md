# ForLoop Program

This program takes a user input (integer) and prints a pyramid pattern using asterisks (`*`). The program runs in an infinite loop, continuously asking for user input.

## Features
- Uses a `while(true)` loop to keep accepting input.
- Uses `Scanner` to take user input.
- Generates a pyramid pattern with spaces for alignment.
- Utilizes `repeat()` method for string formatting (Java 11+ required).

## Example
### Input:
```
5
```
### Output:
```
    *
   ***
  *****
 *******
*********
```

## Requirements
- Java 11 or later (for `repeat()` method support)

## How to Run
1. Compile the program:
   ```sh
   javac ForLoop.java
   ```
2. Run the program:
   ```sh
   java ForLoop
   ```
3. Enter an integer value to generate a pyramid pattern.
4. To stop execution, use `Ctrl + C`.

## Notes
- The `Scanner` object is created inside the loop, which may cause memory inefficiencies. Consider moving it outside the loop for better performance.
- This program does not handle non-integer inputs; adding input validation is recommended.

## License
This code is free to use and modify.
