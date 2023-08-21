import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneradorNumeros {
    
   static public void main(String[] args)
    {
        final String outFileName = "realesRandom.txt";
        final Random random = new Random();

        try {
            FileWriter fileWriter = new FileWriter(outFileName);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

            for(int i=0; i<10; i++) {
                for(int j=0; j<10; j++) {
                    bufferWriter.write(String.valueOf(random.nextFloat()*200 - 100));
                    bufferWriter.write("\t");
                }
                bufferWriter.newLine();
            }
            bufferWriter.close();
        }

        catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }
    }
}
