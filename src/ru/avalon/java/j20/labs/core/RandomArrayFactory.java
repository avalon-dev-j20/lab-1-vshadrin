package ru.avalon.java.j20.labs.core;

import java.util.Random;

/**
 * Фабрика, создающая массивы целых чисел, наполненные
 * случайными значениями.
 */
public class RandomArrayFactory implements Factory<Integer[], Integer> {

    /**
     * Генератор псевдо-случайных чисел.
     */
    private final Random random = new Random();

    /**
     * Возвращает новый массив заданной длины. Массив
     * содержит случайные значения в диапазоне от 1 до 100.
     *
     * @param length длина массива
     * @return новый массив случайных чисел, заданной длины.
     */
    @Override
    public Integer [] getInstance(Integer length) {
        Integer [] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }
}
