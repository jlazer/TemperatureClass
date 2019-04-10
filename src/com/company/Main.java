/*
Justin Lazarski
Jonathan La Rosa
Team Project 1: Question 4 TemperatureTest
CIS 3090.04
4/5/19
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(25);
        Temperature t3 = new Temperature(78.6, 'f');
        Temperature t4 = new Temperature('f');

        System.out.print("t1 Data: " + t1.getDegreesCelsius() + "\t");
		System.out.println(t1.getDegreesFahrenheit());

		System.out.print("\nt2 Data: " + t2.getDegreesCelsius() + "\t");
		System.out.println(t2.getDegreesFahrenheit());

		System.out.print("\nt3 Data: " + t3.getDegreesCelsius() + "\t");
		System.out.println(t3.getDegreesFahrenheit());

		System.out.print("\nt4 Data: " + t4.getDegreesCelsius() + "\t");
		System.out.println(t4.getDegreesFahrenheit());

		System.out.println("\n\n\n");

		System.out.println("If t2 equals t3: "+t2.equal(t3));
		System.out.println("If t2 greater t1: "+t2.greater(t1));
		System.out.println("If t2 smaller t4: "+t2.smaller(t4));

    }
}
