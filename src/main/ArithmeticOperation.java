package main;

    public class ArithmeticOperation{
        private long firstNumber;
        private long secondNumber;

        public ArithmeticOperation(){

        }
        public ArithmeticOperation(long firstNumber, long secondNumber) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }
        public void setFirstNumber(long firstNumber){
            this.firstNumber = firstNumber;
        }

        public long getFirstNumber(){
            return firstNumber;
        }

        public void setSecondNumber(long secondNumber){
            this.secondNumber = secondNumber;
        }

        public long getSecondNumber(){
            return secondNumber;
        }

        public long addition(){

            return firstNumber + secondNumber;
        }

        public long subtraction(){
            return firstNumber - secondNumber;
        }

        public long mutliplication(){
           return firstNumber * secondNumber;
        }

        public double division(){
            if(secondNumber==0){
                throw new ArithmeticException("Division by zero not accepted");
            }
            return (Double.valueOf(firstNumber) / Double.valueOf(secondNumber));
        } 
    }

