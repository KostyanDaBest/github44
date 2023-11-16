import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
            if (i == 0) x++;
        }
            if (x == 0) {
                System.out.println(" нет нулевых значений ");
            }
            else {
                System.out.print(" нулевые значения : " + x );
            }
            }
        }
