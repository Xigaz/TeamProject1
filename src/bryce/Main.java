package bryce;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String[] color = new String[20];
        int[] x = new int[20];
        boolean[] b = new boolean[20];


        int counter = 0;
        System.out.print("Give me a color: ");
        color[counter] = input.nextLine();


        while(!color[counter].equalsIgnoreCase("Done"))
        {
            counter++;
            System.out.print("Give me a color: ");
            color[counter] = input.nextLine();

        }

        printMe(color, counter);


    }

    public static void printMe(String[] a1, int count)
    {
        // print out all of the colors entered in.
        for(String c: a1)
        {
            if(c.equalsIgnoreCase("done"))
                break;
            System.out.println(c);
        }
        System.out.println();
        a1 = Arrays.copyOf(a1, count);
        System.out.println(Arrays.toString(a1));
//        System.out.println(a1);

    }
}
