import java.util.*;
import java.io.*;



public class LinkerTester {

    public static void main(String[] args) {
        Linker comm = null;
        Msg m;
        try {
            String baseName = args[0];
            int myId = Integer.parseInt(args[1]);
            int numProc = Integer.parseInt(args[2]);
			System.out.println("LinkerTester started:");
			System.out.println(" base name: " + baseName + ", id: " + myId + ", number of processes: " + numProc);
			System.out.println("--------------------------------------------------------");
            comm = new Linker(baseName, myId, numProc);
            for (int i = 0; i < numProc; i++)
                if (i != myId){
                    comm.sendMsg(i, "my_tag", "Uspješno ste se povezali procese na vise racunala");
                    //comm.sendMsg(i, "my_tag", "poruka_od_" + myId);
					System.out.println(" >  Sent message: ");
					System.out.println(" >> To: " + i + ", from: " + myId);
					System.out.println(" >> Tag: " + "my_tag");
					System.out.println(" >> Content: " + "Uspješno ste se povezali procese na vise racunala");

                }
            for (int i = 0; i < numProc; i++)
                if (i != myId)
                    m = comm.receiveMsg(i);
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}  
