import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> distinctNumbers = new HashSet<>();

        System.out.println("Введите последовательность чисел (введите 0 для завершения):");

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break; // Завершаем ввод при вводе 0
            }
            distinctNumbers.add(number); // Добавляем число в множество
        }

        scanner.close();

        // Выводим уникальные числа
        System.out.println("Несовпадающие числа в последовательности:");
        for (Integer num : distinctNumbers) {
            System.out.println(num);
        }
    }
}
