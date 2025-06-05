# letterCount

A Java project that contains multiple solution approaches to the "Letter Count" problem. This project identifies the first word in a sentence with the greatest number of repeated letters.

## Overview

The **Letter Count** problem requires you to write a function `letterCount(str)` that takes a string as input and returns the first word that has the greatest number of repeated letters. If no word contains repeated letters, the function should return **-1**.

### Example Inputs & Outputs

- **Input:** `"Hello apple pie"`
  **Output:** `Hello`

- **Input:** `"No words"`
  **Output:** `-1`

## Approaches

This repository includes three distinct solution approaches:

- **First Approach:** Uses an array to count letter frequencies after cleaning punctuation and normalizing case.
- **Second Approach:** Uses a helper method with an ASCII frequency array to calculate repeated letters.
- **Third Approach:** Implements a frequency map using a `HashMap` to determine the repeat count per word.

## Project Structure

```
LetterCount/
├── README.md 
├── FirstApproach/ 
    └── Main.java 
├── SecondApproach/
    └── Main.java 
└── ThirdApproach/
    └── Main.java
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 21 or later

### Usage

- When prompted, enter the input string, and the program will output the first word with the highest number of repeated letters.