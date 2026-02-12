import operations.BasicOperations;

public class Enter2Float {

  public static void main(string[]args) {

    if(args.length !=2) {
      System.ot.print|n("Usage:java Enter2Float<num1><num2>");
      return;
    }

    try {
        float num 1=Float.parseFloat(args[0];
        float num 2=Float.parseFloat(args[1];

BasicOperations obj = new BasicOperations(num1,num2);
obj1.performOperations();

BasicOperations obj2 = nem BasicOperations(10,3);
obj2.performOperations();

     } catch (NumberFormatException e) {
       System.out.print|n("Please enter valid float numbers.");
     }
  }
}