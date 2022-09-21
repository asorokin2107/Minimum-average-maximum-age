import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min, max, average;
        int[] results = new int[3];
        System.out.println("Введите три возраста:");
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        int age3 = scanner.nextInt();

        results[0] = age1;
        results[1] = age2;
        results[2] = age3;
        Arrays.sort(results);
        min = results[0];
        average = results[1];
        max = results[2];

        System.out.println("Минимальный возраст - " + min);
        System.out.println("Максимальный возвраст - " + max);
        System.out.println("Средний возраст - " + average);

       /* System.out.println("Введите три возраста:");
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        int age3 = scanner.nextInt();

        if ( age1 < age2 && age1 < age3) {
            System.out.println("Минимальное возраст - " + age1);

        } else if( age1 > age2 && age1 > age3) {
            System.out.println("Максимальный возраст - " + age1);
        } else if( age1 > age2 && age1 < age3 || age1 < age2 && age1 > age3) {

            System.out.println("Средний возраст - " + age1);
        }

        if ( age2 < age1 && age2 < age3) {
            System.out.println("Минимальное возраст - " + age2);

        } else if( age2 > age1 && age2 > age1) {
            System.out.println("Максимальный возраст - " + age2);
        } else if( age2 > age1 && age2 < age3 || age2 < age1 && age2 > age3) {

            System.out.println("Средний возраст - " + age2);
        }

        if ( age3 < age2 && age3 < age1) {
            System.out.println("Минимальное возраст - " + age3);

        } else if( age3 > age2 && age3 > age1) {
            System.out.println("Максимальный возраст - " + age3);
        } else if( age3 > age2 && age3 < age1 || age3 < age2 && age3 > age1) {

            System.out.println("Средний возраст - " + age3);
        }*/
    }
}
