public class Main {
    public static void main(String[] args) {
    Task1();


    }

    public static void Task1(){
    int a = 0; //задаем переменную "а" со стартовым значением 0
    while (a <= 9){ //продолжать действие, пока "а" не станет 9 (т.к. а++)
    a++; //увеличиваем а на единицу с каждым шагом
    System.out.print(" " +a);
    }
    System.out.println(" ");
    for (int b = 10; b >= 1; b--) // Уменьшаем значение "b" для следующего шага на 1
    System.out.print(" " + b);
    }
}