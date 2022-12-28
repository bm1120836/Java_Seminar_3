import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/*
 * При входном массиве, вернуть массив массивов со всеми перестановками его элементов. (со звездочкой)
 * 
 */


public class Task4 {
    public static void main(String[] args) {
        int[] number = new int[] { 1, 2, 3 };
        System.out.println(Arrays.deepToString(task4(number)));
    }
    static int[][] task4(int[] numbers) {
        int result = 1;

        for (int i = 1; i <= numbers.length; i++) {
            result = result * i;
        }

        int[][] listCombinations = new int [result][1];
        listCombinations[0] = numbers;

        for (int i = 1; i < listCombinations.length; i++) {
            listCombinations[i] = uniqueСombination(numbers, listCombinations, i);
        }    
        return listCombinations;
    }    

    // метод для подбора уникальной комбинации
    static int[] uniqueСombination(int [] numbers, int[][] listCombinations, int i) {
        while (true) { 
            int[] combination = formCombination(numbers);
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (Arrays.equals(listCombinations[j], combination)) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                return combination;
            }
        }
    }

    static int[] formCombination(int[] numbers) {
        Random random = new SecureRandom();
        int[] combination = new int[numbers.length];
        for (int j = 0; j < combination.length; j++) {
            while (true) {
                int elementRandom = numbers[random.nextInt(numbers.length)];
                if (Arrays.stream(combination).anyMatch(x -> x == elementRandom) == false) {
                    combination[j] = elementRandom;
                    break;
                }
            }
        } 
        return combination;
    }




}