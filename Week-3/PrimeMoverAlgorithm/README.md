# 🏗️ Prime Mover

> Return the *n* th prime number (1 ≤ n ≤ 10,000) using an efficient Sieve of Eratosthenes implementation in Java.

---

## 📖 Problem Statement

Write a function `primeMover(int num)` that returns the `num`th prime number.  

- **Input Range:** 1 ≤ num ≤ 10⁴  
- **Example:**  
  - Input: `9` → Output: `23`  
  - Input: `100` → Output: `541`  
  - Input: `16` → Output: `53`

---

## 🚀 Solution Overview

We use the **Sieve of Eratosthenes** to precompute all primes up to a safe upper bound (200,000) — since the 10,000th prime is known to be 104,729. After marking composites, we simply iterate through our boolean array to count primes until we reach the desired index.

---

## 📈 Complexity

| Metric | Complexity |
|--------|------------|
| Time | O(n log log n) (sieve) + O(n) (scan) |
| Space | O(n) |

---

## 📋 Usage

- Run with integer input:

    Enter a single integer (e.g., 100) and press Enter. The program prints the corresponding prime.


## 🔍 Explanation

- Boolean array size = limit+1
    Ensures indices `0…limit` map directly to integers.

- Start crossing out at `i * i`
    Smaller multiples already handled by previous primes.

- Increment by `i --> (j += i)`
    Visits each multiple exactly once.