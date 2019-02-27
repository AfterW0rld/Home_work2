package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new
                Scanner(System.in);
        int a, b, c;
        System.out.print("Введите первое число: ");
        a = in.nextInt();
        System.out.print("введите второе число: ");
        b = in.nextInt();
        if (b == 0)
        {
            System.out.println("Делитель равен 0!");
        } else
        {
            c = a / b ;
            System.out.println("Частное от деления " + a + " на " +b+ " = " +c);

        }

//______________________________________________
        System.out.println("В каком году была основана Одесса?");
        int a = in.nextInt();
        if (a == 1794)
        {
            System.out.println("Верно!");
        } else
        {
            System.out.println("Вы ошиблись, Одесса была основана в 1794 году.");
        }
//______________________________________________
        int a;
        double  b;
        System.out.print("Введите сумму: ");
       a = in.nextInt();
       if (a > 1000) {
           b = a * 0.95;
           System.out.println("Вам предоставляется скидка 5%");
           System.out.println("Сумма с учетом скидки: " + b + " руб.");

       } else
       {
           if (a > 500)
           {
               b = a * 0.97;
               System.out.println("Вам предоставляется скидка 3%");
               System.out.println("Сумма с учетом скидки: " + b + " руб.");
           } else
           {
               if (a > 0)
               {
                   System.out.println("Скидка не предоставляется!");
                   System.out.println("Сумма: " + a);
               } else
               {
                   System.out.println("Ошибка!");
               }
           }
       }

//______________________________________________
        int a;
        System.out.print("Введите целое число: ");
        a = in.nextInt();

        if (a % 2 == 0)
        {
            System.out.println("Число " +a+ " - чётное.");
        } else
        {
            System.out.println("Число " +a+ " - нечётное.");
        }


//______________________________________________
        int a;
        System.out.print("Введите целое число: ");
        a = in.nextInt();
        if (a % 3 == 0)
        {
            System.out.println("Число " +a+ " нацело делится на 3.");
        } else
        {
            System.out.println("Число " +a+ " нацело на 3 не делится.");
        }

//_______________________________________________
        System.out.println("Стоимость одной минуты: 5 руб.");
        String d;
        double m, z;
        System.out.print("Введите длительность разговора: ");
        m = in.nextDouble();
        System.out.print("Введите день недели: ");
        d = in.next().toLowerCase();
        switch (d)
        {
            case "понедельник":
            case "вторник":
            case "среда":
            case "четверг":
            case "пятница":
                z = m * 5;
                System.out.println("Стоимость разговора: " +z+ " руб.");
                break;
            case "суббота":
            case "воскресенье":
                System.out.println("Вам предоставляется скидка 20%!");
                z = m * 5 * 0.8;
                System.out.println("Стоимость разговора: " +z+ " руб.");
                break;
                default:
                    System.out.println("Ошибка!");
        }


//______________________________________________

        System.out.print("Введите трёхзначное число: ");
        int number = in.nextInt();
        int  hundreds = 0, decimals = 0, ones = 0;
        ones            = number / 1 % 10;
        decimals        = number / 10 % 10;
        hundreds        = number / 100 % 10;
        System.out.println("Определить, какая из его цифр больше:\n" +
                "1 - первая или последняя;\n" +
                "2 - первая или вторая;\n" +
                "3 - вторая или последняя.");
        int a = in.nextInt();
        switch (a)
        {
            case 1:
                if (hundreds > ones)
                {
                    System.out.println("Первая цифра больше последней.");
                break;
                } else
                {
                    if (hundreds < ones)
                    {
                        System.out.println("Первая цифра меньше последней.");
                        break;
                    } else
                    {
                        System.out.println("Первая и последняя цифры равны.");
                        break;
                    }
                }
            case 2:
                if (hundreds > decimals)
                {
                    System.out.println("Первая цифра больше второй.");
                    break;
                } else
                {
                    if (hundreds < decimals)
                    {
                        System.out.println("Первая цифра меньше второй.");
                        break;
                    } else
                    {
                        System.out.println("Первая и вторая цифры равны.");
                        break;
                    }
                }
            case 3:
                if (decimals > ones)
                {
                    System.out.println("Вторая цифра больше последней.");
                    break;
                } else
                {
                    if (decimals < ones)
                    {
                        System.out.println("Вторая цифра меньше последней.");
                        break;
                    } else
                    {
                        System.out.println("Вторая и последняя цифры равны.");
                        break;
                    }
                }

        }
    }
}
