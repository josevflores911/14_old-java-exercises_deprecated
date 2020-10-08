import java.io.File;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("/Users/sadda/OneDrive/Escritorio/perro.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}