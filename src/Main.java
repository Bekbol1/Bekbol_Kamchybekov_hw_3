public class Main {
    public static void main(String[] args) {

        double[] numbers = {-3.5, -2.25, 0.75, -1.2, 4.6, -2.8, 11.5, -0.25, 3.33, -4.75, 1.1, -0.5, 2.7, -6.1, 0.25};
        double sumNum = 0;
        boolean mean = false;
        int indexNum = 0;

        for (double num : numbers) {
            if (num < 0) {
                mean = true;
            } else if (mean) {
                sumNum += num;
                indexNum++;
            }
        }
        double arithmeticMean = sumNum / indexNum;

        System.out.println("Среднее арифметическое положительных чисел равна: " + arithmeticMean);

        System.out.println("---------------");


        int lengthIndexNums = numbers.length;

        for (int i = 0; i < lengthIndexNums - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < lengthIndexNums; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;

            System.out.print("Итерация " + (i + 1) + ": ");
            for (int k = 0; k < lengthIndexNums; k++) {
                System.out.print(numbers[k] + " ");
            }
            System.out.println();

        }
        System.out.print("Итог сортировки: ");
        for (int i = 0; i < lengthIndexNums; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}