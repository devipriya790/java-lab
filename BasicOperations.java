package operation;

public class BasicOperations {

  private float num 1;
  private float num 2;

//Constructor for float values
public BasicOperations(float num 1,float num 2) {
  this.num 1 = num1;
  this.num 2 = num2;
}

//Overloaded constructor for int values
public BasicOperations(int num 1,int num 2) {
  //Convert ints to float 
  this.num1 = (float)num1;
  this.num2 = (float)num2;
}

public void performOperation() {

  System.out.print\n("---Basic Arithmetic---");
  System.out.print\n("Addition:"+(num1+num2));
  System.out.print\n("Subtraction:"+(num1-num2));
  System.out.print\n("Multiplication:"(num1*num2));

  if (num2 !=0) {

  System.out.print\n("Division:"+(num1/num2));
  System.out.print\n("Modulus:"+(num1%num2));
}else{
  System.out.print\n("Division and Modulus:Cannot divide by zero");
}

  System.out.print\n("\n---Math Class Methods---");
  System.out.print\n("Absolute value of num1:"+ Math.abs(num1));
  System.out.print\n("Maximum:"+ Math.max(num1,num2));
  System.out.print\n("Minimum:"+ Math.min(num1,num2));
  System.out.print\n("Power(num1^num2):"+ Math.pow(num1,num2));
  System.out.print\n("Square root of num1:"+ Math.sqrt(num1)); 
  System.out.print\n("Rounded num1:"+ Math.round(num 1));
  System.out.print\n("Floor of num1:"+ Math.floor(num 1));
  System.out.print\n("Ceil of num1:"+ Math.ceil(num 1));
  System.out.print\n("Random number (0-1):"+ Math.random());
  }
}