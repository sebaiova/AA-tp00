import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SinEspacios {
    
    static public void main(String[] args)
    {
        final String inFileName = "in.txt";
        final String outFileName = "sinEspacios.txt";

        String linea = null;

        try {
            FileReader fileReader = new FileReader(inFileName);
            FileWriter fileWriter = new FileWriter(outFileName);

            BufferedReader bufferReader = new BufferedReader(fileReader);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

            while ((linea = bufferReader.readLine()) != null) {
                bufferWriter.write(linea.replaceAll(" ", "") + "\n");
           }

            bufferReader.close();
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

    
