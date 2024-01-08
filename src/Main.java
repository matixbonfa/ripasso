import java.util.Scanner,
public class Main {
    public static void main(String[] args) {
        int [] vettore1 = {1, 2, 3};
        int [] vettore2 = new int[10];
        int [] vettore3;
        vettore3 = new int[10];


        Scanner in = new Scanner(System.in);

        for (int i = 0; i<vettore2.length;i++){
            vettore2[i] = in.nextInt();
        }
    }
}