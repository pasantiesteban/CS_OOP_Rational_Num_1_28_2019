package cs243.Santiesteban;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rational myNum = new Rational(3,6);
        Rational myNum2 = new Rational(3,4);

        System.out.println(myNum.reduce());
        System.out.println(myNum.add(myNum2));
        System.out.println(myNum.multiply(myNum2));
    }
}
