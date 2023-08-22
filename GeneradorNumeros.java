import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneradorNumeros {
    
    static private final Random random = new Random();

    /* genera "size" numeros enteros entre "floor" y "ceil" */
    static public Integer[] generarNumeros(int floor, int ceil, int size)
    {
        Integer[] array = new Integer[size];
        for(int i=0; i<size; i++)
            array[i] = random.nextInt(ceil - floor) + floor;
        return array;
    }

    /* genera "size" numeros flotantes entre "floor" y "ceil" */
    static public float[] generarNumeros(float floor, float ceil, int size)
    {
        float[] array = new float[size];
        for(int i=0; i<size; i++)
            array[i] = random.nextFloat()*(ceil - floor) + floor;
        return array;
    }

   static public void main(String[] args)
    {
        final String outFileName = "realesRandom.txt";

        try {
            FileWriter fileWriter = new FileWriter(outFileName);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

            float[] numeros = generarNumeros(-100.f, 100.f, 100);

            for(int i=0; i<10; i++) {
                for(int j=0; j<10; j++) {
                    bufferWriter.write(String.valueOf(numeros[i*10+j]));
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
