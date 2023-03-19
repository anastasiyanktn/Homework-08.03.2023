public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }

        System.out.println("Максимальная сумма затрат за день составила " + max);
        System.out.println("Минимальная сумма затрат за день составила " + min);

    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        double medium = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        medium = sum / arr.length;
        System.out.println(medium);
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }

    }
}
