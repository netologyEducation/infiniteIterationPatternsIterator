public class Main {
    public static void main(String[] args) {
        int min = 10;
        int max = 15;
        int count = 0;

        for (int r : new Randoms(min, max)) {
            System.out.println("Случайное число: " + r);
            count++;
            if (r == max) {
                System.out.println("Выпало число " + max + ", давайте на этом закончим");
                break;
            }
        }
        System.out.println("Всего итераций: " + count);
    }
}
