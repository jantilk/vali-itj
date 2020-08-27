import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the total number of nodes in the level, including the gateways
        int L = in.nextInt(); // the number of links
        int E = in.nextInt(); // the number of exit gateways
        // jada kuhu salvestatakse lingid
        int[][] links = new int[L][2];
        int[] gateway = new int[E];
        int a = 0;
        int b = 0;

        for (int i = 0; i < L; i++) {
            int N1 = in.nextInt(); // N1 and N2 defines a link between these nodes
            int N2 = in.nextInt();
            links[i][0] = N1;
            links[i][1] = N2;
        }
        for (int i = 0; i < E; i++) {
            int EI = in.nextInt(); // the index of a gateway node
            gateway[i] = EI;
        }

        // game loop
        while (true) {
            int SI = in.nextInt(); // The index of the node on which the Skynet agent is positioned this turn

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            for (int i = 0; i < L; i++) {
                if (links[i][0] == gateway[0] || links[i][1] == gateway[0]) {
                    a = links[i][0];
                    b = links[i][1];
                }
                //System.out.println(a + " " + b);
            }

            // Example: 0 1 are the indices of the nodes you wish to sever the link between
            System.out.println(a + " " + b);
        }
    }
}