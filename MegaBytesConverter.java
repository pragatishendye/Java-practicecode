package codingexercises;

/**
 * This program converts the given kilobytes into
 * megabytes and kilobytes
 * Created by Pragathi Shendye
 */

public class MegaBytesConverter {

    // O/P format: XX KB = YY MB and ZZ KB

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int megaByte = 1024;     // 1 MB = 1024 KB
            int valueInMegaBytes = (kiloBytes / megaByte);
            int residualKiloBytes = (kiloBytes % megaByte);

            System.out.println(kiloBytes + " KB = " +
                    valueInMegaBytes + " MB and " +
                    residualKiloBytes + " KB");
        }
    }
}
