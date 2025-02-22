### Exercise: "Treasure Hunt in a Treasure Map"

Imagine you have a grid (a 2D array) representing a treasure map. Each cell in the grid contains a number. One of the numbers is the "treasure" (for example, 42). Your tasks are:

1. **Fill the Grid:**
    - Use a **for loop** to populate a 5×5 grid with random numbers between 1 and 50.
2. **Display the Grid:**
    - Use a **for-each loop** to print out the grid in a readable format (each row on a new line).
3. **Find the Treasure:**
    - Use a **labeled for loop** to iterate through the grid. Once the number 42 is found, print the coordinates (row and column) and break out of both loops immediately.
    

**Bonus:** If the treasure is not found, display a message saying "Treasure not found!"

**Hints:**

- For generating random numbers, you can use `java.util.Random`.
- Use nested loops to work with the 2D array.
- The labeled loop allows you to break out of both the inner and outer loops once the treasure is found.

### Implementation :

```java
package org.velihangozek;

import java.util.Random;

public class TreasureHunt {
    public static void main(String[] args) {

            int[][] treasureMap = new int[5][5];
            Random randomNumber = new Random();

            // Task 1: Fill the grid using a for loop
            for (int i = 0; i < treasureMap.length; i++) {
                for (int j = 0; j < treasureMap[i].length; j++) {
                    treasureMap[i][j] = randomNumber.nextInt(50) + 1; // numbers between 1 and 50
                }
            }

            // Task 2: Display the grid using a for-each loop
            System.out.println("\nTreasure Map: \n");
            for (int[] treasureRow : treasureMap) {
                for (int number : treasureRow) {
                    System.out.printf("%2d ", number); // Printing the numbers as 2 digits (decimal format) for padding and alignment.
                }
                System.out.println();
            }

            // Task 3: Find the treasure (12) using a labeled loop
            boolean treasure = false;
            search:
            for (int i = 0; i < treasureMap.length; i++) {
                inner:
                for (int j = 0; j < treasureMap[i].length; j++) {
                    if (treasureMap[i][j] == 12) {
                        System.out.println("\nTreasure is found!!! :) Coordinates are -> row: " + i + ", column: " + j);
                        treasure = true;
                        break search;
                    }
                }
            }
            if (!treasure) {
                System.out.println("\nTreasure not found! :(");
            }
        }
    }
```

**What You Learn:**

- **For Loop:** How to iterate over indices to populate a 2D array.
- **For-each Loop:** How to iterate over the contents of an array in a concise way.
- **Labeled For Loop:** How to use labels to break out of nested loops when a condition is met.

This exercise not only reinforces loop constructs in Java but also shows how to manage control flow in nested scenarios. Enjoy coding your treasure hunt!

### **FAQ :**

- **How to add an element to an array?**
    
    
    Java arrays have a fixed size once they’re created, so you cannot directly add an element to an existing array. Instead, you have two main options:
    
    1. **Create a New Array:**
        
        Create a new array with a larger size, copy the elements from the old array, and then add the new element. For example:
        
        ```java
        int[] original = {1, 2, 3};
        int newElement = 4;
        
        // Create a new array with one extra slot
        int[] newArray = new int[original.length + 1];
        
        // Copy elements from the original array
        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        
        // Add the new element at the end
        newArray[newArray.length - 1] = newElement;
        ```
        
    
    1. **Use a Dynamic Data Structure (ArrayList):**
        
        The `ArrayList` class in Java allows dynamic resizing, meaning you can add elements without manually handling array sizes:
        
        ```java
        import java.util.ArrayList;
        
        public class DynamicArrayExample {
            public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(2);
                list.add(3);
        
                // Add a new element
                list.add(4);
        
                System.out.println(list);  // Output: [1, 2, 3, 4]
            }
        }
        ```
        
    
    Using an `ArrayList` is generally more convenient if you need a collection that can grow or shrink dynamically.
    
- **"treasureMap[i].length" what's the meaning of this?**
    
    
    In Java, if you have a two-dimensional array (often referred to as a "grid"), the expression `grid[i].length` gives you the number of elements in the i-th row. In other words, it tells you how many columns are in that specific row.
    
    For example, if you have:
    
    ```java
    int[][] grid = {
        {1, 2, 3},
        {4, 5, 6, 7},
        {8, 9}
    };
    ```
    
    - `grid[0].length` returns `3` because the first row has three elements.
    - `grid[1].length` returns `4` because the second row has four elements.
    - `grid[2].length` returns `2` because the third row has two elements.
    
    This is especially useful in nested loops where each row might have a different number of columns.
    
- **Explaining a code snippet :**
    
    
    Let's break down the code snippet step by step:
    
    ```java
    System.out.println("Treasure Map:");
    for (int[] row : grid) {
        for (int num : row) {
            System.out.printf("%2d ", num);
        }
        System.out.println();
    }
    ```
    
    ### Explanation:
    
    1. **Printing a Header:**
        - `System.out.println("Treasure Map:");` prints the title "Treasure Map:" to the console. This sets the stage for the grid display.
        
    2. **Outer For-each Loop:**
        - `for (int[] row : grid)` iterates over each row in the 2D array `grid`.
        - Here, `grid` is an array of arrays (each row is an array), so each element in `grid` is itself an array of integers.
        - The variable `row` represents each individual array (row) in the grid.
        
    3. **Inner For-each Loop:**
        - Inside the outer loop, `for (int num : row)` iterates over each element in the current row.
        - The variable `num` holds the value of each individual integer in the row.
        - This loop allows you to process every number within that row.
        
    4. **Formatted Output:**
        - `System.out.printf("%2d ", num);` prints each number with a format specifier `%2d`.
            - `%2d` means the number is printed as a decimal integer and will be padded to at least 2 characters wide. This ensures that the output is aligned, which helps create a neat grid.
            - A space `" "` is added after each number for separation.
            
    5. **New Line After Each Row:**
        - After the inner loop finishes printing all numbers in the current row, `System.out.println();` is called.
        - This moves the cursor to a new line, so the next row of numbers starts on a new line.
    
    ### What This Code Achieves:
    
    - **Readability:** The for-each loops make the code concise and easier to read when iterating through arrays.
    - **Grid Display:** The nested loops ensure that every element of the 2D array is printed in a grid format, with rows and columns.
    - **Alignment:** The formatted printing (`%2d`) ensures that the numbers are aligned, making the grid easier to visually parse.
    
    Overall, this snippet is a neat and efficient way to display the contents of a 2D array as a formatted "treasure map."
    
- **Explaining “grid.length” :**
    
    
    In Java, a two-dimensional array is essentially an array of arrays. The expression `grid.length` returns the number of rows in the grid—that is, the number of inner arrays it contains.
    
    - **Uniform Rows Example:**
        
        If you have a grid with 5 rows (each row being an array of 5 columns), then `grid.length` will be 5. Each row's length (number of columns) is given by `grid[i].length`.
        
    - **Non-uniform Rows Example:**
        
        If the rows have different lengths, for example:
        
        ```java
        int[][] grid = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        ```
        
        Here, `grid.length` would still be 3 because there are three rows (which are arrays here). However, the number of columns varies:
        
        - `grid[0].length` is 3,
        - `grid[1].length` is 2, and
        - `grid[2].length` is 4.
        
    
    In summary, `grid.length` always tells you how many rows (inner arrays) there are, regardless of how many elements (columns) each row contains.
    
- **Why didn't we use ArrayList here instead of an Array?**
    
    
    Arrays were chosen for this exercise primarily for simplicity and clarity, as well as because of the fixed-size nature of the grid. Here are some reasons:
    
    - **Fixed Dimensions:** The grid is defined as a 5×5 matrix, meaning its size doesn't change at runtime. Arrays are well-suited for fixed-size collections since they are created with a predetermined length.
    - **Direct Access:** Arrays allow you to directly access elements by index (e.g., `grid[i][j]`), which makes the nested loop operations straightforward and efficient.
    - **Simplicity:** For teaching purposes and a basic exercise, using arrays keeps the focus on loop constructs and control flow rather than introducing the additional complexity of dynamic data structures.
    - **Overhead:** An `ArrayList` is a dynamic data structure that can grow or shrink as needed. While this is powerful, it adds some overhead and is more appropriate when you don't know the size in advance or expect the size to change frequently. In this case, since the grid dimensions are fixed, arrays are more natural.
    
    In summary, while an `ArrayList` offers flexibility for dynamic collections, arrays are the simpler and more direct choice for a fixed-size 2D grid like the one used in this exercise.
    
- **Why don't we just set the i < and j < to 5's each instead of grid.length and grid[i].length? What's the logic behind it?**
    
    
    Using `grid.length` and `grid[i].length` instead of hard-coding the number 5 makes the code more flexible and maintainable. Here’s why:
    
    - **Generalization:** If you decide to change the grid size later (say to 6×6 or even a non-uniform grid), the loops will automatically adapt. Hard-coding 5 would require you to update the code in multiple places.
    - **Avoiding Magic Numbers:** Using the array's length properties removes “magic numbers” from your code. It makes the code self-explanatory by tying the loop boundaries directly to the actual dimensions of the array.
    - **Error Prevention:** Hard-coding values can lead to errors if the array dimensions are changed or if the grid is dynamically created. Using `grid.length` and `grid[i].length` ensures the loops always iterate the correct number of times.
    
    This practice is a common best practice in programming to keep the code adaptable and less prone to errors.
    
    "Magic numbers" refer to hard-coded literal values in your code that appear without context or explanation. For example, writing a loop like:
    
    ```java
    for (int i = 0; i < 5; i++) {
        // do something
    }
    ```
    
    uses the number `5` directly. If someone reads the code later, they might wonder why `5` is used—what does it represent? Is it the number of rows, columns, or something else?
    
    By using properties like `grid.length` instead, the code becomes more self-explanatory:
    
    ```java
    for (int i = 0; i < grid.length; i++) {
        // do something
    }
    ```
    
    This tells the reader that the loop iterates over all rows of the grid, without having to guess why `5` was chosen. In summary, avoiding magic numbers improves code clarity, maintainability, and flexibility.
    
- **Explaining if (!found) :**
    
    This code checks whether the treasure was found during the search. Let's break it down:
    
    1. **Boolean Variable "found":**
        
        Earlier in the program, a boolean variable named `found` is initialized (typically to `false`) and is set to `true` if the treasure (the number 42) is located in the grid.
        
    2. **The if Statement:**
    
    ```java
    if (!found) {
        System.out.println("Treasure not found!");
    }
    ```
    
    The `!` operator negates the boolean value. So, `!found` means "if `found` is false".
    
    1. **Conditional Message:**
    
    If the search loop didn't set `found` to `true` (meaning the treasure wasn't found in any cell of the grid), the code inside the if block is executed. It prints the message "Treasure not found!".
    
    In summary, this block ensures that if the entire grid is searched without finding the treasure, the program will notify the user by printing a message.
    
- **Why did we use decimal formatting here?**
    
    
    The `%2d` in the `System.out.printf` statement is a formatting specifier used to print integers in a field that is at least 2 characters wide. Here’s why it’s used:
    
    - **Alignment:** It ensures that each number is printed with a minimum width of 2 characters. If a number has fewer digits (for example, a single-digit number), it gets padded with spaces. This keeps the columns aligned when printing the grid.
    - **Clarity:** Using `%2d` makes the printed output look neat and organized. Without it, numbers might be printed with varying spaces between them, leading to a misaligned grid.
    
    Even though the values are integers, using a formatted output like `%2d` is a common practice for ensuring consistent spacing and readability in console output.
    
    The specifier `%2d` is used in formatted output (such as with `System.out.printf`) to format an integer. Here's what it means:
    
    - **`%`**: Indicates the start of a format specifier.
    - **`2`**: Specifies a minimum field width of 2 characters. If the integer has fewer than 2 digits, it will be padded with spaces on the left.
    - **`d`**: Stands for a decimal (base-10) integer.
    
    For example:
    
    - If the integer is `5`, it will be printed as `" 5"` (with a leading space).
    - If the integer is `42`, it will be printed as `"42"`.
    
    This formatting ensures that numbers align neatly in columns when printed in a grid or table.