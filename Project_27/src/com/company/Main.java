package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Шифр Гронсфельда (на русском)

        System.out.println("----------------------------------Шифровка---------------------------------- ");
        int key  ,j = 0;
        String vale  , S = "";
        char h;


        Scanner in = new Scanner(System.in);
        System.out.println("Шифр Гронсфельда\nВедите текст для шифровки ");
        vale = in.nextLine();
        System.out.println("Ведите ключ");
        key = in.nextInt();

        // Преобразуем string в масив
        Character[] charObjectArray = vale.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        // Преобразуем int в массив
        int[]digits = Integer.toString(key).chars().map(c -> c-'0').toArray();
        for (int i = 0;i< charObjectArray.length;i++){
            j++;
            h = charObjectArray[i] ;
            h += digits[j] ;
            if (j == digits.length-1){
                j = 0;
            }
            S += h ;
        }
        System.out.println(S);
        charObjectArray = S.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        System.out.println("----------------------------------Расшифровка---------------------------------- ");
        S = "" ;
        for (int i = 0;i< charObjectArray.length;i++){
            j++;
            h = charObjectArray[i] ;
            h -= digits[j] ;
            if (j == digits.length-1){
                j = 0;
            }
            S += h ;
        }
        System.out.println(S);
    }
}