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
    public static void task1() {
        System.out.println("Задача 1");
        int i = 2147483647;
        byte b = 127;
        short s = 32767;
        long l = 98763827983102L;
        float f = 3.1234567f;
        double d = 3.123456781234567;
        System.out.println("Значение переменной i c типом int равно " + i);
        System.out.println("Значение переменной b c типом byte равно " + b);
        System.out.println("Значение переменной s c типом short равно " + s);
        System.out.println("Значение переменной l c типом long равно " + l);
        System.out.println("Значение переменной f c типом float равно " + f);
        System.out.println("Значение переменной d c типом double равно " + d);
    }
    public static void task2() {
        System.out.println("Задача 2");
        double d = 27.12;
        long l = 987678965549L;
        float f = 2.786f;
        short s = 569;
        short sh = -159;
        short sh2 = 27897;
        byte b = 67;
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte pupilsLP = 23;
        byte pupilsAS = 27;
        byte pupilsEA = 30;
        short totalNumberSheets = 480;
        byte totalPupils = (byte) (pupilsLP + pupilsAS + pupilsEA);
        byte numberSheetsOnePupil = (byte) (totalNumberSheets / totalPupils);
        System.out.println("На каждого ученика рассчитано " + numberSheetsOnePupil + " листов бумаги.");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte numberBottles = 16;
        byte time = 2;
        byte productivity1Minute = (byte) (numberBottles / time);
        short productivity20Minutes = (short) (productivity1Minute * 20);
        System.out.println("За 20 минут машина произвела " + productivity20Minutes + " штук бутылок");
        short productivity24Hours = (short) (productivity1Minute * 60 * 24);
        System.out.println("За 1 день машина произвела " + productivity24Hours + " штук бутылок");
        int productivity3Days = productivity24Hours * 3;
        System.out.println("За 3 дня машина произвела " + productivity3Days + " штук бутылок");
        int productivity1Month = productivity24Hours * 31;
        System.out.println("За 1 месяц машина произвела " + productivity1Month + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalNumberCansPaint = 120;
        byte numberCansWhitePaintOneClass = 2;
        byte numberCansBrownPaintOneClass = 4;
        byte totalNumberClasses = (byte) (totalNumberCansPaint / (numberCansWhitePaintOneClass + numberCansBrownPaintOneClass));
        byte totalNumberCansWhitePaint = (byte) (totalNumberClasses * numberCansWhitePaintOneClass);
        byte totalNumberCansBrownPaint = (byte) (totalNumberClasses * numberCansBrownPaintOneClass);
        System.out.println("В школе, где " + totalNumberClasses + " классов, нужно " + totalNumberCansWhitePaint + " банок белой краски и " + totalNumberCansBrownPaint + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte numberBananas = 5;
        byte weightBanana = 80;
        short amountMilkML = 200;
        byte weight100MLMilk = 105;
        byte numberIceCreamBlocks = 2;
        byte weightIceCreamBlock = 100;
        byte numberEggs = 4;
        byte weightEgg = 70;
        short weightSportBreakfastGrams = (short) (numberBananas * weightBanana + amountMilkML / 100 * weight100MLMilk + numberIceCreamBlocks * weightIceCreamBlock + numberEggs * weightEgg);
        float weightSportBreakfastKg = weightSportBreakfastGrams / 1000f;
        System.out.println("Вес спортзавтрака " + weightSportBreakfastGrams + " грамм или " + weightSportBreakfastKg + " килограмм");
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte excessWeightKG = 7;
        short minWeightLossGr = 250;
        short maxWeightLossGr = 500;
        short averageWeightLossGr = (short) ((minWeightLossGr + maxWeightLossGr) / 2);
        byte maxNumberDays = (byte) (excessWeightKG * 1000 / minWeightLossGr);
        byte minNumberDays = (byte) (excessWeightKG * 1000 / maxWeightLossGr);
        int averageNumberDays = excessWeightKG * 1000 / averageWeightLossGr;
        System.out.println("На похудение уйдет " + maxNumberDays + " дней, если худеть на " + minWeightLossGr + " грамм в день");
        System.out.println("На похудение уйдет " + minNumberDays + " дней, если худеть на " + maxWeightLossGr + " грамм в день");
        System.out.println("В среднем на похудение уйдет " + averageNumberDays + " дней");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int salaryMonthMasha = 67760;
        int salaryMonthDenis = 83690;
        int salaryMonthKristina = 76230;
        float newSalaryMonthMasha = salaryMonthMasha * 1.1f;
        float newSalaryMonthDenis = salaryMonthDenis * 1.1f;
        float newSalaryMonthKristina = salaryMonthKristina * 1.1f;
        float differenceYearSalaryMasha = (newSalaryMonthMasha - salaryMonthMasha) * 12;
        float differenceYearSalaryDenis = (newSalaryMonthDenis - salaryMonthDenis) * 12;
        float differenceYearSalaryKristina = (newSalaryMonthKristina - salaryMonthKristina) * 12;
        System.out.println("Маша теперь получает " + newSalaryMonthMasha + " рублей. Годовой доход вырос на " + differenceYearSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryMonthDenis + " рублей. Годовой доход вырос на " + differenceYearSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryMonthKristina + " рублей. Годовой доход вырос на " + differenceYearSalaryKristina + " рублей");

    }
}