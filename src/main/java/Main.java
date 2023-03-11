import java.util.Scanner;

public class Main { // класс

    public static void main(String[] args) { //psvm  точка входа с кот начинается программа
        Sum s = new Sum();// экземпляр класса
        Scanner sc = new Scanner(System.in); // отвечает за ввод чтобы считывать с клавы
        Integer a = sc.nextInt(); //
        Integer b = sc.nextInt();
        System.out.println(s.sumOfTwoNumbers(a, b));
    }
}
