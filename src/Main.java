public class Main {
    public static void main(String[] args) {
        {
            //Задача 1
            System.out.println("Задача 1:\n");
            int money = 15000;
            int total = 0;
            int i = 0;
            while (total <= 2_459_000) {
                total = total + total/100;
                total += money;
                i++;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
        {
            //Задача 2
            System.out.println();
            System.out.println("Задача 2:\n");
            {
                int i = 1;
                while (i <= 10) {
                    System.out.print(i + " ");
                    i++;
                }
            }
            System.out.println();
            {
                for (int i = 10;i > 0;i--){
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n");
        }
        {
            //Задача 3
            System.out.println("Задача 3:\n");
            int population = 12_000_000;
            int birthRate = 17;
            int mortality = 8;
            int populationGrowth = (population / 1000) * (birthRate - mortality);
            for (int y = 1; y <= 10; y++) {
            population += populationGrowth;
            System.out.println("Год " + y + ", численность населения составляет " + population);
            }
        }
        {
            //Задача 4
            System.out.println();
            System.out.println("Задача 4:\n");
            int money = 15000;
            int total = 0;
            int i = 0;
            while (total <= 12_000_000) {
                total = total + (total/100)*7;
                total += money;
                i++;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
        {
            //Задача 5
            System.out.println();
            System.out.println("Задача 5:\n");
            int money = 15000;
            int total = 0;
            int i = 1;
            for (; total <= 12_000_000; i++) {
                total = total + (total / 100) * 7;
                total += money;
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
                }
            }
        }
        {
            //Задача 6
            System.out.println();
            System.out.println("Задача 6:\n");
            int money = 15000;
            int total = 0;
            int i = 1;
            int years = 9;
            for (; i <= years * 12; i++) {
                total = money + total + (total / 100) * 7;
                money = 0;
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
                }
            }
        }
        {
            //Задача 7
            System.out.println();
            System.out.println("Задача 7:\n");
            int firstFriday = 4;
            int day = firstFriday;
            int monthDays = 31;
            for (; day <= monthDays; day += 7) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет!");
            }
        }
        {
            //Задача 8
            System.out.println();
            System.out.println("Задача 8:\n");
            int currentYear = 2023;
            int yearsBefore = 200;
            int yearsAfter = 100;
            int yearComet = 79;
            int year = 0;
            for (; year <= currentYear + yearsAfter; year++) {
                if (year % yearComet == 0 && year > currentYear - yearsBefore) {
                    System.out.println(year);
                }
            }
        }
    }
}