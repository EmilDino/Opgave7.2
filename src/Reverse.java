import java.util.*;

public class Reverse {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // laver et array med 15 integers
        int[] array = new int[15];

        // beder useren om at intaste femten integers
        for (int i =0; i < array.length ; i++) {
            System.out.print("Type an integer: ");
            int number = input.nextInt();
            array[i]=number;
        }


        System.out.println();
        System.out.println("Your numbers in backward order:");

        // printer tallende ud i omvendt rækkefølge af hvad de blev indtastet
        for (int i = array.length-1 ; i >= 0  ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
