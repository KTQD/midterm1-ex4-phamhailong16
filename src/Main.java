public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 2, 7, 8, 0, 4, 3, 9, 2, 8, 1, 0, 5, 7, 4, 6, 9, 3, 2, 1, 8, 4, 0, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0};
    
        Thread sumThread = new Thread(() -> {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Tổng của các phần tử trong mảng là: " + sum);
        });

        Thread maxThread = new Thread(() -> {
            int max = Integer.MIN_VALUE;
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Phần tử lớn nhất trong mảng là: " + max);
        });

        sumThread.start();
        maxThread.start();
    
    }
}
