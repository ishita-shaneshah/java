/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main {
            public static boolean convertBase (int m, int base)

                {

                        int rem = m % base;

                        m = m / base;

                        while (m >= base && (m % base == rem))

                            m = m / base;

                        if (m == rem)

                            return true;

                        return false;
                }

            public static void main (String[]args)

            {

                    Scanner sc = new Scanner (System.in);

                    int m = sc.nextInt ();

                    int base = 2;


                    while (convertBase (m, base) != true)

                        base++;

                    System.out.println (base);

            }
}