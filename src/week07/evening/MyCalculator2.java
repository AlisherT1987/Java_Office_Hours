package week07.evening;

public class MyCalculator2 {

    /*
    version 2: with instance variables and with a setInfo method that sets value to integers which will be used in instance methods of the class we create
for example:
MyCalculatorV2 myCal2 = new MyCalculatorV2();
myCal2.setInfo(1,1);
myCal.plus();
returns:2
myCal.minus();
returns:0
     */

    public int num1;
    public int num2;

    /*
    for mac: command +N
    for windows: Alt + insert
    right click ->> Generate
     */


    public void setInfo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;



    }
/*
    public void setInfo(int a, int b) {
        num1 = a;
        num2 = b;



    }

 */

    public int plus(){
        return num1+num2;
    }

    public int minus(){
        return num1-num2;
    }

    public int multiply(){
        return num2*num1;
    }

    public double divide(){
        return (double) num1/num2;
    }

















}
