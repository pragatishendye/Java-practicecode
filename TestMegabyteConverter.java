package codingexercises;

/* This program tests the MegaBytesConverter program.
 * Created by Pragathi Shendye
*/
public class TestMegabyteConverter {

    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        MegaBytesConverter.printMegaBytesAndKiloBytes(0);
    }
}
