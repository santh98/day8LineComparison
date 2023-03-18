package com.bridgelabz;
import java.util.Scanner;
public class ComparisonLine {
    int x1,x2,y1,y2,x3,y3,x4,y4,x5,y5,x6,y6;
    int lengthofline1,lengthofline2;
    public void Lengthofline1() {
        //line1
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Line Comparison Program. ");
        System.out.println("Enter the value of X1: ");
        x1 = sc.nextInt();
        System.out.println("Enter the value of X2: ");
        x2 = sc.nextInt();
        System.out.println("Enter the value of X3: ");
        x3 = sc.nextInt();
        System.out.println("Enter the value of Y1: ");
        y1 = sc.nextInt();
        System.out.println("Enter the value of Y2: ");
        y2 = sc.nextInt();
        System.out.println("Enter the value of Y3: ");
        y3 = sc.nextInt();
        lengthofline1 =(int)Math.sqrt((x3 - x2 - x1) ^ 2 + (y3 - y2 - y1) ^ 2);
        System.out.println("Length of the line1 is:" + lengthofline1);
    }
    //line2
    public void Lengthofline2() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X4: ");
        x4 = sc.nextInt();
        System.out.println("Enter the value of X5: ");
        x5 = sc.nextInt();
        System.out.println("Enter the value of X6: ");
        x6 = sc.nextInt();
        System.out.println("Enter the value of Y4: ");
        y4 = sc.nextInt();
        System.out.println("Enter the value of Y5: ");
        y5 = sc.nextInt();
        System.out.println("Enter the value of Y6: ");
        y6 = sc.nextInt();
        lengthofline2 =(int) Math.sqrt((x6 - x5 - x4) ^ 2 + (y6 - y5 - y4) ^ 2);
        System.out.println("Length of the line2 is: " + lengthofline2);
    }
    public void Checkequal() {
        String str1 =Double.toString(lengthofline1);
        String str2 =Double.toString(lengthofline2);
        if (str1.equals(str2)==true)
            System.out.println("Both the lines are equal");
        else
            System.out.println("Lines are not equal");

        if (lengthofline1 < lengthofline2) {
            System.out.println("Line 2 is greater than Line1.");
        } else {
            System.out.println("Line1 is greater than Line2.");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        LineComparision lc=new LineComparision();
        lc.Lengthofline1();
        lc.Lengthofline2();
        lc.Checkequal();

    }
}

