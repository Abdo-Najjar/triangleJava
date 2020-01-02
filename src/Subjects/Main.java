/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subjects;

import java.util.Scanner;

/**
 *
 * @author abdo
 */
public class Main {

    public static void main(String args[]) {

        Scanner src = new Scanner(System.in);

        Point[] points = new Point[3];

        while (true) {

            System.out.println("Enter the points");

            for (int i = 0 ; i<3 ; i++) {
                System.out.println("------------------------------------------------");
                
                System.out.println("Enter point number"+(i+1)+" coordinates");
                
                points[i] =  new Point();
                
                System.out.print("Enter X value: ");
                long x = src.nextLong();

                points[i].setX(x);

                System.out.print("Enter Y value: ");
                long y = src.nextLong();

                points[i].setY(y);
            }
            
            Triangle triangle = new Triangle();
            try{
                
            triangle.setPoints(points);
                
            }catch(Exception ex){
                
                System.out.println(ex.getMessage());
                System.exit(0);
            }
            
            System.out.println("The Length of all sides are :");
            
            triangle.lengthAllSides();
            
            System.out.println("---------------------");

        }

    }

}
