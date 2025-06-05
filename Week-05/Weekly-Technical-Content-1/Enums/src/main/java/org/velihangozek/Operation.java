package org.velihangozek;

public enum Operation {
    ADD {
        @Override
        public int apply(int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }
    },
    SUBTRACT {
        @Override
        public int apply(int firstNumber, int secondNumber) {
            return firstNumber - secondNumber;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int firstNumber, int secondNumber) {
            return firstNumber * secondNumber;
        }
    },
    DIVIDE {
        @Override
        public int apply(int firstNumber, int secondNumber) {
            boolean divisionByZero = false;
            if (secondNumber == 0) {
                divisionByZero = true;
                System.out.print("Division by ZERO! => ");
                return 0;
            }
            return firstNumber / secondNumber;
        }
    };

    public abstract int apply(int firstNumber, int secondNumber);
}
