package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class Array {
    public static void main(String[] args) {

        List<Integer> numbers1 = new ArrayList<>(List.of(1, 2, 3));
        processListWithListIterator(numbers1);
        System.out.println("Завдання 1: " + numbers1);


        List<Integer> numbers2 = new ArrayList<>(List.of(4, 5, 6));
        processListWithIterator(numbers2);
        System.out.println("\nЗавдання 2: " + numbers2);
    }

    private static void processListWithListIterator(List<Integer> numbers) {
        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            int currentValue = iterator.next();
            iterator.set(currentValue + 1);
        }
    }

    private static void processListWithIterator(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print((number + 1) + " ");
        }
    }
}

