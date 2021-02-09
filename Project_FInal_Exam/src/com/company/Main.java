package com.company;


import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("\n--------------------Задание 1. Работа с консолью--------------------\n");
        System.out.println("\n--------------------Часть 1--------------------");

        Date currentDate = new Date();
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEEEEEE");
        String day = dayFormat.format(currentDate);
        System.out.println(day);
        SimpleDateFormat mounthFormat = new SimpleDateFormat("MMMMMMM");
        String mounth = mounthFormat.format(currentDate);
        System.out.println(mounth);
        System.out.println("Павел");

        System.out.println("\n--------------------Часть 2--------------------");

        System.out.println("*     *      *");
        System.out.println(" *   * *    * ");
        System.out.println("  * *   * *  ");
        System.out.println("   *     *   ");


        System.out.println("\n--------------------Задание 2. Простейшая арифметика--------------------");
        System.out.println("\n--------------------Часть 1--------------------");
        System.out.print("Введите расстояние ->");
        Scanner rassto = new Scanner(System.in);
        float rasst = rassto.nextInt();

        System.out.print("Введите время ->");
        Scanner vrema = new Scanner(System.in);
        float vrem = vrema.nextInt();

        rasst = rasst / 100;
        vrem = vrem / 60;
        float v = rasst / vrem;
        System.out.println("Скорость м/с равна -> " + v);
        System.out.println("\n--------------------Часть 2--------------------");
        System.out.print("Введите a ->");
        Scanner alfa = new Scanner(System.in);
        float alf = alfa.nextInt();

        System.out.print("Введите b ->");
        Scanner beta = new Scanner(System.in);
        float bet = beta.nextInt();


        float temp;
        temp = alf;
        alf = bet;
        bet = temp;
        System.out.println("a=" + alf);
        System.out.println("b=" + bet);

        System.out.println("\n--------------------Задание 3.Условный оператор и арифметика--------------------");
        System.out.println("\n--------------------Часть 1--------------------");
        System.out.print("Введите число ->");
        Scanner nomer = new Scanner(System.in);
        float nom = nomer.nextInt();
        if (nom > -10 && nom < 10) {
            nom = nom + 5;
        } else {
            nom = nom - 10;
        }
        System.out.println("Число = " + nom);
        System.out.println("\n--------------------Часть 2--------------------");
        Mover();

        System.out.println("\n--------------------Задание 4.Циклы и арифметика--------------------");
        System.out.println("\n--------------------Часть 1--------------------");
        double kol = 1.2;
        while (kol < 2.8)
        {
            String formattedDouble = String.format("%.1f", kol);
            System.out.println(formattedDouble);
            kol+=0.2;

        }
        String formattedDouble = String.format("%.1f", kol);
        System.out.println(formattedDouble);
        System.out.println("\n--------------------Часть 2--------------------");
        int a,b,c,d,sum,g;
        g=0;
        for ( int i=1000;i<10000;i++)
        {
            a =i%10;
            b= (i/10)%10;
            c = (i/100)%10;
            d = i/1000;
            sum = a+b+c+d;
            if (sum==15)
            {
                System.out.print(i+ " ");
                g++;
                if (g==8)
                {
                    g=0;
                    System.out.println();
                }
            }
        }
        System.out.println("\n--------------------Задание 5.Работа с символами--------------------");
        System.out.println("\n--------------------Часть 1--------------------");
        System.out.print("Введите букву ->");
        InputStreamReader scanner = new InputStreamReader(System.in);
        char y = (char) scanner.read();
        nomer uuu = new nomer(y);
        System.out.println(uuu.getPeremennaia());
        System.out.println(uuu.getPeremennaia());
        System.out.println(uuu.getPeremennaia());


        System.out.println("\n--------------------Часть 2--------------------");

        System.out.print("Введите пароль для шифрования ->");
        Scanner in = new Scanner(System.in);
        int chislo = in.nextInt();
        String str = String.valueOf(chislo);
        char[] strToArray = str.toCharArray();
        // Вывод массива на экран
        for (int i = 0; i < strToArray.length; i++) {
            for (i = 0; i < strToArray.length; i++) {
                switch (strToArray[i]) {
                    case ('0'):
                        System.out.printf("AB ");
                        break;
                    case ('1'):
                        System.out.printf("BC ");
                        break;
                    case ('2'):
                        System.out.printf("CD ");
                        break;
                    case ('3'):
                        System.out.printf("DE ");
                        break;
                    case ('4'):
                        System.out.printf("EF ");
                        break;
                    case ('5'):
                        System.out.printf("FG ");
                        break;
                    case ('6'):
                        System.out.printf("GH ");
                        break;
                    case ('7'):
                        System.out.printf("HI ");
                        break;
                    case ('8'):
                        System.out.printf("IJ ");
                        break;
                    case ('9'):
                        System.out.printf("JK ");
                        break;
                }
            }

        }






        }
    private static void Mover() {
        int value = 1234;
        String[] array = String.valueOf(value).split("");
        IntSummaryStatistics statistics = Arrays.stream(array).mapToInt(Integer::valueOf).summaryStatistics();
        String max = String.valueOf(statistics.getMax());
        String min = String.valueOf(statistics.getMin());
        value = Integer.parseInt(Arrays.stream(array).map(n -> n.equals(max) ? min : n.equals(min) ? max : n).collect(Collectors.joining()));
        System.out.println(value);
    }

    }

