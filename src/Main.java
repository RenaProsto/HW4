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
            System.out.println("Ты совершенолетний");
        } else {
            System.out.println("возраст совершеннолетия еще не наступил и нужно немного подождать");
        }
    }
        // task 2
        public static void task2 () {
            System.out.println("Задание 2");
            int temperature = 2;
            if (temperature < 5) {
                System.out.println("Нужно надеть шапку");
            } else {
                System.out.println("Можно идти без шапки");
            }
        }
        //task3
        public static void task3 () {
            System.out.println("Задание 3");
            int speed = 72;
            if (speed > 60) {
                System.out.println("Скорость превышена, нужно заплатить штраф!");
            } else {
                System.out.println("Можно ездить спокойно");
            }
        }

        // task4
            public static void task4 () {
            System.out.println("Задание 4");

            int age = 28;
            if (age >= 2 && age <= 6) {
                System.out.println("Тебе нужно в детский сад");
            }
            else if (age >= 7 && age <= 18) {
                System.out.println("Тебе нужно в школу");
            }
            else if (age >= 19 && age <= 24) {
                System.out.println("Твое место в универе");
            }
            else if (age>25) {
                System.out.println("Пахать тебе до пенсии");
            }
        }
    public static void task5 () {
        System.out.println("Задание 5");
        int childsAge = 16;
        if (childsAge < 5) {
            System.out.println("Ребенок слишком мал что-бы кататься на атракционе");
        } else if (childsAge >= 5 && childsAge <= 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого.Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого.");
        }
    }
    public static void task6 () {
        System.out.println("Задание 6");
        int place = 102;
        if (place >= 1 && place <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (place >= 61 && place <= 102) {
            System.out.println("В вагоне остались стоячие места");
        } else {
            System.out.println("Нет мест в вагоне");
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