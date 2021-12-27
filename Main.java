package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i,n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        n = input.nextInt();

        System.out.println("4'ün kuvvetleri");
        //4 ün kuvvetleri
        for (i=1; i<n; i*=4){
                System.out.println(i);
        }
        System.out.println("5'in kuvvetleri");
        //5 in kuvvetleri
        for (i=1; i<n; i*=5){
            System.out.println(i);
        }
    }
}
