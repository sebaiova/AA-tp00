import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneradorPalabras {

    static private final Random random = new Random();
    static private final String Z = "0123456789abcdefghijklmnopqrstvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /* retorna un caracter alfanumerico */
    static private char nextChar()
    {
        return Z.charAt(random.nextInt(Z.length()));
    }

    /* Retorna un string de caracteres alfanumericos de tamaño size */
    static public String nextWord(int size)
    {
        char[] buffer = new char[size];
        for(int i=0; i<size; i++)
            buffer[i] = nextChar();
        return new String(buffer);
    }

   static public void main(String[] args)
    {
        final String outFileName = "palabrasRandom.txt";

        try {
            FileWriter fileWriter = new FileWriter(outFileName);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

            for(int i=0; i<10; i++) {
                bufferWriter.write(nextWord(10));
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
