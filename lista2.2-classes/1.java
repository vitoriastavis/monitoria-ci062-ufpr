import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input;
        int soma = 0;
        input = new Scanner(System.in);

        int[] array;
        array = new int[10];
        
        for(int i = 0 ; i < 10 ; i++) {
            array[i] = input.nextInt();
        }
        
        for(int i = 0 ; i < 10 ; i++) {
            if (array[i] % 2 == 0) {
                System.out.printf("%d ", array[i]);    
                soma += array[i];
            }
        }

        System.out.printf("%d\n", soma);
        
        soma = 0;
        
        for(int i = 0 ; i < 10 ; i++) {
            if (array[i] % 2 != 0) {
                System.out.printf("%d ", array[i]);
                soma += array[i];
            }
        }

        System.out.printf("%d\n", soma);

        input.close();
    }

}