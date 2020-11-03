package com.neri.tcca;
import java.util.Scanner;
public class ValueChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value = 0;
		System.out.println("Ingresa un numero:");
		value = in.nextInt();
		if( value == 7)
		System.out.println("Que suerte!");
		else if( value == 13)
		System.out.println("Que mala suerte!");
		else
		System.out.println("Esa no es ni suerte" +"mala suerte!");

	}

}
