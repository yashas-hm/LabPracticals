package Lab10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Lab10_2 {
    public static void main(String[] args){
        FileWriter output;
        FileReader input;
        Random random = new Random();
        String fileName = "rand.dat";
        try{
            output = new FileWriter(fileName);

            for(int i=0;i<random.nextInt(100-9);i++){
                output.write(random.nextInt(100));
            }

            output.close();

            input = new FileReader(fileName);

            while(input.read()!=-1){
                System.out.print(input.read()+" ");
            }

            input.close();

        }catch (IOException e){
            System.out.println(e+"");
        }finally {
            File file = new File(fileName);
            file.delete();
        }
    }
}
