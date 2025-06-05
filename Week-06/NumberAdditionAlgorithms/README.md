# Number Addition Algorithm

## Overview

This repository provides three different Java solutions for the "Number Addition" algorithm challenge. Each approach solves the task of scanning an input string, extracting numbers, and summing them up, handling multi-digit numbers correctly.

---

## Problem Description

Have the function `numberAddition(str)` take the `str` parameter, search for all the numbers in the string, add them together, then return the final sum.

**Example:**

- Input: `"88Hello 3World!"`

  - Output: `91`

- Input: `"75Number9"`

  - Output: `84`

- Input: `"10 2One Number*1*"`

  - Output: `13`

Each string will contain at least one letter or symbol.

---

## Approaches

### 1. Simple Parsing Approach

- **Methodology:** Iteratively scans characters, collecting contiguous digit sequences.
- **Key Steps:**
  - Uses a `StringBuilder` to accumulate digits.
  - Converts accumulated digits into integers upon encountering non-digit characters.

### 2. Manual Parsing Approach (Character Iteration)

- **Methodology:** Similar to the first, but explicitly iterates over each character, checking digit status.
- **Key Steps:**
  - Checks digit characters individually.
  - Accumulates numbers into a `StringBuilder`.
  - Parses numbers upon reaching non-digit characters or the string's end.

### 3. Regex (Regular Expression) Approach

- **Methodology:** Uses a regex pattern (`\d+`) to locate numeric sequences.
- **Key Steps:**
  - Utilizes `java.util.regex.Pattern` and `Matcher`.
  - Matches numeric patterns and parses matched numbers.

---

## Usage

1. **Clone Repository:**

```bash
git clone <repository-url>
cd NumberAdditionAlgorithms
```

2. **Compile & Run:**

- **FirstApproach:**

```bash
cd NumberAdditionAlgorithms/FirstApproach
javac -d out src/main/java/org/velihangozek/Main.java
java -cp out org.velihangozek.Main
```

- **ManualParsingApproach:**

```bash
cd NumberAdditionAlgorithms/ManualParsingApproach
javac -d out src/main/java/org/velihangozek/Main.java
java -cp out org.velihangozek.Main
```

- **RegexApproach:**

```bash
cd NumberAdditionAlgorithms/RegexApproach
javac -d out src/main/java/org/velihangozek/Main.java
java -cp out org.velihangozek.Main
```

When running, type your string input into the console, then press **Enter**.

---

## Project Structure

```
├── NumberAdditionAlgorithms
│   ├── FirstApproach
│   │   └── src/main/java/org/velihangozek
│   │       └── Main.java
│   ├── ManualParsingApproach
│   │   └── src/main/java/org/velihangozek
│   │       └── Main.java
│   └── RegexApproach
│       └── src/main/java/org/velihangozek
│           └── Main.java
│
└── README.md
```

---

## Examples

| Input                 | Output |
| --------------------- | ------ |
| `"88Hello 3World!"`   | `91`   |
| `"75Number9"`         | `84`   |
| `"10 2One Number*1*"` | `13`   |
| `"55Hello"`           | `55`   |
| `"5Hello5"`           | `10`   |

---

## Best Practices Implemented

- **Readable & Maintainable Code**: Clear, concise comments, method names, and structure.
- **Resource Management**: Properly closes scanners after use.
- **Robustness**: Carefully handles edge cases like strings ending with numbers and empty sequences.
- **Efficiency**: Uses efficient patterns (StringBuilder & Regex) for optimal performance.

---

## Author

- [Velihan Gözek](https://github.com/velihangozek)