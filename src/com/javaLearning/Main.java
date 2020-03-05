package com.javaLearning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nPART-1");
        System.out.println("toMilesPerHour(1.5); -> should return value " + toMilesPerHour(1.5));
        System.out.println("toMilesPerHour(10.25); -> should return value " + toMilesPerHour(10.25));
        System.out.println("toMilesPerHour(-5.6); -> should return value " + toMilesPerHour(-5.6));
        System.out.println("toMilesPerHour(25.42); -> should return value " + toMilesPerHour(25.42));
        System.out.println("toMilesPerHour(75.114); -> should return value " + toMilesPerHour(75.114));
        System.out.println("\nPART-2");
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0)
            return -1;
        else{
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else
            System.out.println("printConversion(" + kilometersPerHour + ") : " + kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}