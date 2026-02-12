package com.scsvmv.javalab;

import com.scsvmv.javalab.hello.Hello;

/*
 *TestHello class
 *Demostrates passing command-line arguments
 */
public class TestHello {

  public static void main(String[] args){

    //Using Hello class from parent package
    Hello simpleHello = nem Hello();
    simpleHello.Wish();

    //Using Hello class from child package
    com.scsvmv.javalab.hello.Hello h =
        new com.scsvmv.javalab.hello.Hello();

   //Check for cmmand-line arguments
   if(args.length>0){
     h.wish(args[0]);    //pass CLI argument
     h.wishWithDate(args[0]);
   }else{
     System.out.println("Using");
     System.out.println("java com.scsvmv.javalab.TestHello<name>");
     System.ot.println("Example:");
     System.out.println("java com.scsvmv.javalab.TestHello Student");
   }
  }
}