import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        while(true) {
            System.out.print("Введите число: ");
            String s = scanner.nextLine();
            if (s.isEmpty()) {
                numbers.add(s.hashCode());
            } else {
                numbers.add(parseInt(s));
            }
            for(int i = 0; i < numbers.size(); i++){
                if (numbers.get(i) == "".hashCode()) {
                    numbers.remove(numbers.get(i));
                    System.out.printf(""" 
                                      Ваш список чисел: %s
                                      Количество чисел: %d
                                      Наибольшее число: %d
                                      Наименшее число: %d
                                      Среднее число: %d
                                      """,
                            numbers, numbers.size(), getMaxValue(numbers), getMinValue(numbers), getAverageValue(numbers));
                    return;
                }
            }
        }
    }
    public static int getMaxValue(ArrayList<Integer> arrayList){
        int max = MIN_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            int value = arrayList.get(i);
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    public static int getMinValue(ArrayList<Integer> arrayList){
        int min = MAX_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            int value = arrayList.get(i);
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int getAverageValue(ArrayList<Integer> arrayList){
        int average = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int value = arrayList.get(i);
            average += value;
        }
        return average / arrayList.size();
    }
}