package pr4.interfaces.services;

public class CountingSort {
    /**
     * Алгоритм сортировки подсчетом для диапазона 0-10 [cite: 55]
     */
    public static void sort(int[] array) {
        if (array == null || array.length == 0) return;

        // Создаем массив частот (11 элементов для чисел от 0 до 10)
        int[] frequency = new int[11];

        // Подсчитываем количество каждого числа [cite: 56]
        for (int num : array) {
            if (num >= 0 && num <= 10) {
                frequency[num]++;
            }
        }

        // Заполняем исходный массив отсортированными числами
        int currentIndex = 0;
        for (int i = 0; i < frequency.length; i++) {
            while (frequency[i] > 0) {
                array[currentIndex++] = i;
                frequency[i]--;
            }
        }
    }
}
