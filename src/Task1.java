import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите нужное количество элементов:");
        int numberOfElements = new Scanner(System.in).nextInt();
        System.out.println("Пожалуйста, введите длину массива:");
        int[] arrays = new int[new Scanner(System.in).nextInt()];
        int temp = 1;
        int firstNumber = temp;
        boolean flagStop = true;
        StringBuilder resault = new StringBuilder();

        while (flagStop) {

            for (int i = 0; i < arrays.length; i++) {

                arrays[i] = temp;
                ++temp;

                if (temp > numberOfElements) {
                    temp = 1;
                }
            }

            temp = arrays[arrays.length - 1];
            if (arrays[arrays.length - 1] == firstNumber) {
                flagStop = false;
            }
            resault.append(arrays[0]);
        }
        System.out.println(resault);


    }
}
