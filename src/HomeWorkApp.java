/*
Задание №1
Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp,
прописать в нем метод main().
 */
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    /*
    Задание №2
    Создайте метод printThreeWords(),
    который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
     */
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /*
        Задание №3
       Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
       и инициализируйте их любыми значениями, которыми захотите.
       Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
       то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
         */
    public static void checkSumSign() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("c = " + c);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    /*
        Задание №4
       Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
       Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
       если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
       то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
         */
    public static void printColor() {

        int value = 99;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else if (100 < value) {
            System.out.println("Зеленый");

        }
    }
    /*
        Задание №5
       Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
       и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
       то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
         */
    public static void compareNumbers() {
        int a = 1000;
        int b = 2000;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else if (a < b) {
            System.out.println("a < b");
        }
    }
     /*
        Задание №6
       Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают
         */
    // Методы работают корректно
}