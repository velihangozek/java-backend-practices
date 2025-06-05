# firstFactorial

    A simple Java algorithm to compute the factorial of a number using recursion.

## Overview

    **firstFactorial** is a Java solution that calculates the factorial of a given integer through a recursive approach. This project is ideal for understanding recursion and fundamental algorithm design in Java.

## Problem Statement

    Write a function `firstFactorial(num)` that takes an integer `num` as input and returns its factorial. The factorial of a number is defined as:

        n! = n * (n - 1) * ... * 1

    For example:

- **Input:** `4`  
  **Output:** `24`

- **Input:** `8`  
  **Output:** `40320`

> **Note:** The input range is between 1 and 18, and the input will always be an integer.

## How It Works

- The solution uses recursion to compute the factorial.
- If `num` is `1`, the function returns `1` (base case).
- Otherwise, it recursively multiplies `num` by `firstFactorial(num - 1)`.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 21 or above

### Code Explanation & Usage

- **Provide Input:**

    - When prompted, enter an integer (e.g., 4) to compute its factorial.