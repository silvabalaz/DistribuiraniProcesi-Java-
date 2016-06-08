import java.io.*;
import java.util.*;

public class Topology {

    public static void readNeighbors(int myId, int N, IntLinkedList neighbors) {
        //Util.println("Reading topology");
        try {
            BufferedReader dIn = new BufferedReader(new FileReader("topology" + myId));
            System.out.println("din: " + dIn + "\n");
            StringTokenizer st = new StringTokenizer(dIn.readLine());
            System.out.println("st: " + st + "\n");
            while (st.hasMoreTokens()) {
                int neighbor = Integer.parseInt(st.nextToken());
                System.out.println("neighbor add: " + neighbor);
                neighbors.add(neighbor);
            }
        } catch (FileNotFoundException e) {
            for (int j = 0; j < N; j++)
                if (j != myId) neighbors.add(j);
        } catch (IOException e) {
            System.err.println(e);
        }
        Util.println(" Neighbors: " + neighbors.toString());
    }
}
