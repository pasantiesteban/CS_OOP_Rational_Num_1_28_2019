package cs243.Santiesteban;

public class RationalTest {
    public static void main(String[] args) {
        // write your code here
        Rational myNum = new Rational(3,6);
        Rational myNum2 = new Rational(3,4);

        System.out.println("This is 3/6 reduced: " + myNum.reduce());
        System.out.println("This is 3/6 + 3/4: " + myNum.add(myNum2));
        System.out.println("This is 3/6 * 3/4: " + myNum.multiply(myNum2));

        Rational maxNum = new Rational(1000000000,400000000);
        Rational maxNum2 = new Rational(34554393,7483949);
        System.out.println("This is maxNum reduced: " + maxNum.reduce());
        System.out.println("This is maxNum + maxNum: " + maxNum.add(maxNum2));
        System.out.println("This is maxNum * maxNum: " + maxNum.multiply(maxNum2));

        //Shows an Exception Error of negative Number
        System.out.println("The Following is a Negative number error");
        Rational badNum = new Rational(-2,3);
    }
}
