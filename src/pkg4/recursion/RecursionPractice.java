/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.recursion;

/**
 *
 * @author fadilafidina
 */

public class RecursionPractice {

    public static void main(String[] args) {

        ////////////////// Below is print out code for Exercise 2 ///////////////////

        System.out.println("2 to the power 5 is " + power(2, 5));
        System.out.println("4 to the power 0 is " + power(4, 0));
        System.out.println("0 to the power 6 is " + power(0, 6));
        System.out.println("7 to the power 3 is " + power(7, 3));
        System.out.println("3 to the power 2 is " + power(3, 2) + "\n");

        ////////////////// Below is print out code for Exercise 3 ///////////////////

        for (int i = 1; i <= 8; i++) {
            System.out.println("chessBoardSquares(i) for i=" + i
                    + " is " + chessBoardSquares(i));
        }
        System.out.println("\n");

        ////////////////// Below is print out code for Exercise 4 ///////////////////

        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 4, 8, 16};

        System.out.println("a: " + a[0] + "," + a[1] + "," + a[2] + "," + a[3] + "," + a[4] + "," + a[5]);
        System.out.println("b: " + b[0] + "," + b[1] + "," + b[2] + "," + b[3] + "," + b[4] + "\n");


        for (int i = 1; i <= 5; i++) {
            System.out.println("arrayMatch(i,a,b) for i=" + i
                    + " is " + arrayMatch(i, a, b));
        }
        System.out.println("\n");

        ////////////////// Below is print out code for Exercise 5 //////////////
        for (int i = 1; i <= 5; i++) {
            System.out.println("triangleNumber(" + i + ") is "
                    + triangleNumber(i));
        }

        ////////////////// Below is print out code for Exercise 6 //////////////
        String[] as = {"Red", "Yellow", "Pink", "Green", "Orange"};
        for (int i = 1; i < as.length; i++) {
            System.out.println("Printing first " + i + " places of the array");
            printFirstN(as, i);
        }
    }

    ////////////////// Below is code for Exercise 5 ///////////////////
    // YOU HAVE TO IMPLEMENT THIS METHOD!!
    public static int power(int y, int n) {
        if (n == 0) return 1;
        return y * power(y,n-1);

    }

    ////////////////// Below is code for Exercise 3 ///////////////////
    // YOU HAVE TO IMPLEMENT THIS METHOD!!
    public static int chessBoardSquares(int n) {
        //return 0;//dummy value
        if (n == 1) return 1;
        return n + (n-1) + chessBoardSquares(n-1);
        //chessBoardSquares(n-1);
        

    }

    ////////////////// Below is code for Exercise 4 ///////////////////
    // YOU HAVE TO IMPLEMENT THIS METHOD!!
    // pre:  0 <= n <= a.length and 0 <= n <= b.length
    // post: true is returned precisely when the values 
    //       a[0] ... a[n-1] are exactly the same as 
    //       the values b[0] ... b[n-1]
    public static boolean arrayMatch(int n, int[] a, int[] b) {
        if (n == 0) return true;
        if (a[n-1] == b[n-1]){
            arrayMatch(n-1,a,b);
            return true;
        }
        return false;
    }

    ////////////////// Below is code for Exercise 5 ///////////////////
    // YOU HAVE TO IMPLEMENT THIS METHOD!!
    public static int triangleNumber(int i) {
        if (i == 1) return 1;
        return i + triangleNumber(i-1);
    }

    ////////////////// Below is code for Exercise 6 ///////////////////
    // YOU HAVE TO IMPLEMENT THIS METHOD!!
    // pre: 0 <= n <= a.length
    // post: the values a[0] ... a[n-1] are printed on the screen
    public static void printFirstN(String[] a, int n) {
        
        
        if (n > 0) {
            printFirstN(a,n-1);
            System.out.println(a[n-1]);
        }

        
        //System.out.println(a[n-1]);
        
        //System.out.println(printFirstN(a,n-1));
        
        //if (n > 0) {
        //    printFirstN(a, n - 1); // print frot of list
        //    System.out.println(a[n - 1]);

    }
}
