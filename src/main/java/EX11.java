/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */

import java.util.Scanner;

public class EX11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        int euros = input.nextInt();

        System.out.println("What is the exchange rate?");
        double rate = input.nextDouble();

        double ttl = rate*euros;
        double x = Math.round(ttl * 100.0) / 100.0;

        System.out.println("" + euros + " euros at an exchange rate of " + rate+ " is");
        System.out.println("" + x + " U.S. dollars.");




    }

    }
