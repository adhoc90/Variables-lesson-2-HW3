import java.awt.*;
import java.util.logging.SocketHandler;

import static java.awt.Color.white;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 113;
        short b = 31_000;
        int c = 2130333000;
        long d = 12345678900L;
        float e = 3.254f;
        double f = 2.54875;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12F;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper = 480;
        byte allStudent = (byte) (lp + as + ea);
        short sheetsForEachStudent = (short)(paper / allStudent);
        System.out.println("На каждого ученика рассчитано " + sheetsForEachStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte time = 2;
        byte bottleForOneMinute = (byte)(bottle / time);
        short bottleForTwentyMinutes = (short)(bottleForOneMinute * 20);
        int bottleForOneDay = bottleForOneMinute * 1440;
        int bottleForThreeDays = bottleForOneDay * 3;
        int bottleForOneMouth = bottleForOneDay * 31;
        System.out.println("За двадцать минут машина произвела " + bottleForTwentyMinutes + " штук бутылок");
        System.out.println("За один день машина произвела " + bottleForOneDay + " штук бутылок");
        System.out.println("За за три дня машина произвела " + bottleForThreeDays + " штук бутылок");
        System.out.println("За за один месяц машина произвела " + bottleForOneMouth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte white = 2;
        byte brown = 4;
        short cansOfPaint = 120;
        short cansOneClass = (short) (white + brown);
        System.out.println("Банок на один класс " + cansOneClass + " штук");
        int classes = (int) cansOfPaint / cansOneClass;
        System.out.println("Классов в школе " + classes);
        int whitePaint = (int) (classes * white);
        System.out.println("банок белой краски " + whitePaint + " штук");
        int brownPaint = (int) (classes * brown);
        System.out.println("Банок коричневый краски " + brownPaint + " штук");
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte egg = 4;
        short bananaWaight = (short) (banana * 80);
        short milkWaight = (short) (milk * 105);
        short iceCreamWeight = (short) (iceCream * 100);
        short eggWeight = (short) (egg * 70);
        System.out.println("Вес бананов " + bananaWaight + " грамм");
        System.out.println("Вес молока " + milkWaight + " грамм");
        System.out.println("Вес мороженного " + iceCreamWeight + " грамм");
        System.out.println("Вес сырых яиц " + eggWeight + " грамм");
        int allWeightG = (int) bananaWaight + milkWaight + eggWeight + iceCreamWeight;
        System.out.println("Вес спортзавтрака " + allWeightG + " грамм");
        float allWeightKg = (float) allWeightG / 1000;
        System.out.println("Вес спортзавтрака " + allWeightKg + " кг.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int One = 250;
        int Two = 500;
        int allDropWeight = 7000;
        int howManyDaysOne = allDropWeight / One;
        System.out.println(howManyDaysOne + " дней на похудение надо, если терять по " + One + " грамм");
        int howManyDaysTwo = allDropWeight / Two;
        System.out.println(howManyDaysTwo + " дней на похудение надо, если терять по " + Two + " грамм");
        int daysOnAverange = (howManyDaysOne + howManyDaysTwo) / 2;
        System.out.println("В среднем для похудения нужно " + daysOnAverange + " день");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int Masha = 67_760;
        int Denis = 83_690;
        int Christina =76_230;
        int promotionSalariesMasha = 67_760 / 10;
        int promotionSalariesDenis = 83_690 / 10;
        int promotionSalariesChristina = 76_230 / 10;
        System.out.println("Ежегодное увеличение зарплаты Маши на " + promotionSalariesMasha + " рублей");
        System.out.println("Ежегодное увеличение зарплаты Дениса на " + promotionSalariesDenis + " рублей");
        System.out.println("Ежегодное увеличение зарплаты Кристины на " + promotionSalariesChristina + " рублей");
        int year = 12;
        int annualIncomMasha = 67_760 * year;
        int annualIncomeDenis = 83_690 * year;
        int annualIncomeChristina = 76_230 * year;
        System.out.println("Годовой доход Маши " + annualIncomMasha + " рублей");
        System.out.println("Годовой доход Дениса " + annualIncomeDenis + " рублей");
        System.out.println("Годовой доход Кристины " + annualIncomeChristina + " рублей");
        int newYearSalariesMasha = (promotionSalariesMasha * year) + annualIncomMasha;
        int newYearSalariesDenis = (promotionSalariesDenis * year) + annualIncomeDenis;
        int newYearSalariesChristina = (promotionSalariesChristina * year) + annualIncomeChristina;
        System.out.println("Маша теперь получает " + newYearSalariesMasha + " рублей в год");
        System.out.println("Денис теперь получает " + newYearSalariesDenis + " рублей в год");
        System.out.println("Кристина теперь получает " + newYearSalariesChristina + " рублей в год");
        int differenceBetweenAnnualIncomeMasha = newYearSalariesMasha - annualIncomMasha;
        int differenceBetweenAnnualIncomeDenis = newYearSalariesDenis - annualIncomeDenis;
        int differenceBetweenAnnualIncomeChristina = newYearSalariesChristina - annualIncomeChristina;
        System.out.println("Разница годового дохода Маши после повышения " + differenceBetweenAnnualIncomeMasha + " рублей");
        System.out.println("Разница годового дохода Дениса после повышения " + differenceBetweenAnnualIncomeDenis + " рублей");
        System.out.println("Разница годового дохода Кристины после повышения " + differenceBetweenAnnualIncomeChristina + " рублей");


    }
}