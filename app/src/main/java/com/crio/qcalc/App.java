/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crio.qcalc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
         System.out.println(new App().getGreeting());

          ScientificCalculator calc = new ScientificCalculator();

    int result= calc.modulo(5, 2);

    System.out.println("modulo =" + result);

   

}

    }


