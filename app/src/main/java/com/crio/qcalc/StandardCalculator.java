package com.crio.qcalc;

public class StandardCalculator {
    private int result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }


    public void add(int num1, int num2){
        result = num1+num2;
        setResult(result);
    }



    public void subtract(int num1, int num2){
        result = num1-num2;
        setResult(result);
    }
    
    
    public void multiply(int num1, int num2){
        result = num1*num2;
        setResult(result);
    }
    
    
    public void divide(int num1, int num2){
        result = num1/num2;
        setResult(result);
    }
    
    public int getResult(){
        return result;
    }

    public void clearResult(){
        setResult(0);
    }

    public void printResult(){
        System.out.println("Standard Calculator Result:" +getResult());
    }

    private void setResult(int value){
        this.result = value;
    }
    }


