public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }
    public static void task1 () {
        System.out.println("Задача 1");

        int age = 10;
        if (age >= 18) {
            System.out.println("Если возраст " + age + "то ты совершенолетний");
        } else {
            System.out.println("Если возраст " + age + " то совершеннолетие еще не наступил и нужно немного подождать");
        }
    }
        // task 2
        public static void task2 () {
            System.out.println("Задание 2");
            int temperature = 2;
            if (temperature < 5) {
                System.out.println("Если температура " + temperature + " то нужно надеть шапку");
            } else {
                System.out.println("Если температура " + temperature +" то можно идти без шапки");
            }
        }
        //task3
        public static void task3 () {
            System.out.println("Задание 3");
            int speed = 72;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + ", нужно заплатить штраф!");
            } else {
                System.out.println("Если скорость " + speed + " то можно ездить спокойно");
            }
        }

        // task4
            public static void task4 () {
            System.out.println("Задание 4");

            int age = 28;
            if (age >= 2 && age <= 6) {
                System.out.println("Если тврой возраст " + age + "тебе нужно в детский сад");
            }
            else if (age >= 7 && age <= 18) {
                System.out.println("Если тврой возраст " + age + " тебе нужно в школу");
            }
            else if (age >= 19 && age <= 24) {
                System.out.println("Если тврой возраст " + age + " твое место в универе");
            }
            else if (age>25) {
                System.out.println("Если тврой возраст " + age + " то пахать тебе до пенсии");
            }
        }
    public static void task5 () {
        System.out.println("Задание 5");
        int childsAge = 16;
        if (childsAge < 5) {
            System.out.println("Если возраст ребенка " + childsAge + " то он слишком мал что-бы кататься на атракционе");
        } else if (childsAge >= 5 && childsAge <= 14) {
            System.out.println("Если возраст ребенка " + childsAge + " то ребенок может кататься только в сопровождении взрослого.Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если возраст ребенка " + childsAge + " то ребенок может кататься без сопровождения взрослого.");
        }
    }
    public static void task6 () {
        System.out.println("Задание 6");
        int place = 102;
        int seat = 60;
        int standingPlace = place - seat;
        int busySeat = 20;
        int busyStandingPlace = 25;
        if (busySeat < seat) {
            System.out.println("В вагоне есть " + (seat - busySeat) +  " сидячиx мест");
        }
        else {
            System.out.println("Сидячих мест нет");
        }

        if (busyStandingPlace < standingPlace ) {
            System.out.println("В вагоне осталось " + (standingPlace - busyStandingPlace )+  " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }
    }
    public static void task7 () {
        System.out.println("Задание 7");
        int one = 125;
        int two = 5000;
        int three = 300;
        if (one > two && one > three){
            System.out.println("Число 1 больше всех");
        }
        else if (two > one && two >three){
            System.out.println("Число 2 больше всех");
        }
        else {
            System.out.println("Число 3 больше всех ");
        }

    }



}