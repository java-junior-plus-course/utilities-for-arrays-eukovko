package edu.junior;

/**
 * Author: eukovko
 * Date: 12/3/2020
 */
public interface UtilArrays {

    /**
     * The method sorts an array in ascending order.
     * The initial array should not be modified.
     *
     * @param array is the array to be sorted
     * @return returns a new sorted array
     * @throws IllegalArgumentException if array is null
     */
    int[] sortAscending(int[] array);

    /**
     * The method sorts an array in descending order.
     * The initial array should not be modified.
     *
     * @param array is the array to be sorted
     * @return returns a new sorted array
     * @throws IllegalArgumentException if array is null
     */
    int[] sortDescending(int[] array);

    /**
     * The method creates a string, which contains
     * all the elements int the format [*,*,*,*...].
     * The initial array should not be modified.
     *
     * @param array is the array to be converted to a string
     * @return a string representation of the array
     * @throws IllegalArgumentException if array is null
     */
    String toString(int[] array);

    /**
     * The method sorts an array in ascending order.
     * The initial array should not be modified.
     *
     * @param array is the array to be sorted
     * @return returns a new sorted array
     * @throws IllegalArgumentException if array is null
     */
    double[] sortAscending(double[] array);

    /**
     * The method sorts an array in descending order.
     * The initial array should not be modified.
     *
     * @param array is the array to be sorted
     * @return returns a new sorted array
     * @throws IllegalArgumentException if array is null
     */
    double[] sortDescending(double[] array);

    /**
     * The method creates a string, which contains
     * all the elements int the format [*,*,*,*...].
     * The initial array should not be modified.
     *
     * @param array is the array to be converted to a string
     * @return a string representation of the array
     * @throws IllegalArgumentException if array is null
     */
    String toString(double[] array);

    /**
     * The method sorts an array in ascending order.
     * The initial array or objects inside it should not be modified.
     *
     * @param array is the array to be sorted
     * @return returns a new sorted array
     * @throws IllegalArgumentException if array or any object inside it is null
     */
    Person[] sortAscending(Person[] array);

    /**
     * The method sorts an array in descending order.
     * The initial array should not be modified.
     *
     * @param array is the array to be sorted
     * @return returns a new sorted array
     * @throws IllegalArgumentException if array or any object inside it is null
     */
    Person[] sortDescending(Person[] array);

    /**
     * The method creates a string, which contains
     * all the elements int the format [*,*,*,*...].
     * The initial array should not be modified
     *
     * @param array is the array to be converted to a string
     * @return a string representation of the array
     * @throws IllegalArgumentException if array or any object inside it is null
     */
    String toString(Person[] array);

}
