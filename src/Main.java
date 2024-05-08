public class Main {
    public static void main(String[] args) {

        System.out.println("Тема ДЗ команда цикла - While");

        byte dZ = 0;
        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        int targetedAccumulation = 2_459_000;
        int creditWorthiness = 15_000;
        int accumulation = 0;
        int month = 0;
        while (accumulation <= targetedAccumulation) {
            System.out.println("Месяц " +month+ ", сумма накоплений равна " +accumulation+ " рублей.");
            month += 1;
            accumulation += creditWorthiness;
            if (accumulation > targetedAccumulation) {
                System.out.println("Кульминационный месяц " +month+ ", итоговая сумма " +accumulation);
            }
        }

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        int i = 1;
        while (i <= 10) {
        //for (i = 1; i <= 10; i++) {
            System.out.print(i);
            i += 1;
        }
        System.out.println();
        for (i = 10;i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();
        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int time = 10;
        int partPopulation = 1000;
do {
  population += population / partPopulation * (birthRate - mortalityRate);
  time--;
    System.out.println("Год " +(10 - time)+ ", численность населения составляет " +population);
}while (time > 0);

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        float interestRate = 7;
        float initialDeposit = 15000;
        int targetedAccumulation1 = 12_000_000;
        int month1 = 0;
        float accumulation1 = 0;
        while (accumulation1 <= targetedAccumulation1) {
            accumulation1 = accumulation1 * (1 + interestRate / 100) + initialDeposit;
            System.out.println(accumulation1+ " рублей накопленно за " +month1+ " месяц");
            month1 += 1;
        }

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        interestRate = 7;
        initialDeposit = 15000;
        targetedAccumulation1 = 12_000_000;
        month1 = 0;
        accumulation1 = 0;
        while (accumulation1 <= targetedAccumulation1) {
            accumulation1 = accumulation1 * (1 + interestRate / 100) + initialDeposit;
            if (month1 % 6 == 0) {
                System.out.println(accumulation1+ " рублей накопленно за " +month1+ " месяц");
            }
            month1 += 1;
        }

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        interestRate = 7;
        initialDeposit = 15000;
        int targetedTime = 9;
        float month2 = 0;
        accumulation1 = 0;
        while (month2 / 12 <= targetedTime) {
            accumulation1 = accumulation1 * (1 + interestRate / 100) + initialDeposit;
            if (month2 % 6 == 0) {
                System.out.println(accumulation1 + " рублей накопленно за " +(int) month2 + " месяц");
            }
            month2 += 1;
        }

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        int friday = 3;
        int daysPerMonth = 31;
        do {
            System.out.println("Сегодня пятница, " +friday+ "-е число. Необходимо подготовить отчет");
            friday += 7;
        } while (friday <= daysPerMonth);

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        int yearZero = 2003;
        int period = 79;
        int observationInterval = 200;
        int nextAppearance = yearZero + period;;
        for (int year = yearZero; yearZero - year <= observationInterval; year -= period ) {
            System.out.println(year + " год появления кометы за последние двести лет");
        }
            while (nextAppearance - yearZero <= 100) {
                System.out.println(nextAppearance+ " год следующего появления кометы");
                nextAppearance += period;
        }
    }
}