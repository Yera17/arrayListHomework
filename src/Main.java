import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> numbers = new ArrayList<>();
        while(true) {
            System.out.print("Введите число: ");
            numbers.add(scanner.nextLine());
                for(String number : numbers){
                    if (number.equals("")) {
                        numbers.remove("");
                        System.out.printf(""" 
                                        Ваш список чисел: %s
                                        Количество чисел: %d
                                        Наибольшее число: %d
                                        Наименшее число: %d
                                        Среднее число: %d
                                        """, numbers, numbers.size(), getMaxValue(numbers), getMinValue(numbers), getAverageValue(numbers));

                        return;
                    }
                }
        }
    }
    public static int getMaxValue(ArrayList<String> arrayList){
        int max = MIN_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            int value = parseInt(arrayList.get(i));
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    public static int getMinValue(ArrayList<String> arrayList){
        int min = MAX_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            int value = parseInt(arrayList.get(i));
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int getAverageValue(ArrayList<String> arrayList){
        int average = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int value = parseInt(arrayList.get(i));
            average += value;
        }
        return average / arrayList.size();
    }
}