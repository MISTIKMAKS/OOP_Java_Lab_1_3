package Lab1_3;

import java.lang.Math;
import java.util.Scanner;

public class Dispatcher {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        int N, i;
        double S;
        System.out.print("N = ");
        N = scan.nextInt();
        S = 0;
        i = N;
        while (i <= 22)
        {
            S += Math.sqrt(Math.pow(i, 2) + Math.pow(N, 2)) / i;
            i++;
        }
        System.out.println("" + String.format("%.2f", S));
        S = 0;
        i = N;
        do
        {
            S += Math.sqrt(Math.pow(i, 2) + Math.pow(N, 2)) / i;
            i++;
        } while (i <= 22);
        System.out.println("" + String.format("%.2f", S));
        S = 0;
        for (i = N; i <= 22; i++)
{
            S += Math.sqrt(Math.pow(i, 2) + Math.pow(N, 2)) / i;
        }
        System.out.println("" + String.format("%.2f", S));
        S = 0;
        for (i = 22; i >= N; i--)

{
            S += Math.sqrt(Math.pow(i, 2) + Math.pow(N, 2)) / i;
        }
        System.out.println("" + String.format("%.2f", S));
	}

}