# COMP 2230-02: Data Structures, Algorithm Analysis, and Program Design

# Arrays

Arrays are fixed-size data structures that store multiple values of the same type.

## Array Declaration

```java
// Declare and initialize
int[] numbers = {1, 2, 3, 4, 5};

// Declare then initialize
int[] scores = new int[5];  // Creates array of size 5
scores[0] = 85;
scores[1] = 92;
// ...
```

## Key Concepts

- **Index**: Position of element (starts at 0)
- **Length**: Number of elements (accessed via `array.length`)
- **Bounds**: Valid indices are 0 to length-1
- **Fixed Size**: Cannot change size after creation

## Common Operations

- **Access**: `array[index]`
- **Modify**: `array[index] = value`
- **Iterate**: Use loops to process all elements

## Multi-dimensional Arrays

```java
int[][] matrix = new int[3][3];  // 3x3 array
```

## Example Program

See `Arrays.java` for examples of array operations.

---

**Author:** Shivani Tyagi (Professor, Computing Science)