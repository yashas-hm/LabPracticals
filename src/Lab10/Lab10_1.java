package Lab10;

import java.io.*;

public class Lab10_1 {
    public static void main(String[] args) {
        File inputFile = null;
        File outputFile = null;

        if(args.length<2){
            System.out.println("Parameters missing");
            System.exit(0);
        }
        else{
            System.out.println("Input file path  : "+args[0]);
            System.out.println("Output file path : "+args[1]);
            inputFile=new File(args[0]);
            outputFile=new File(args[1]);
        }
        try{
            fromFileStream(args, inputFile, outputFile);
            fromBufferStream(args, inputFile, outputFile);
            fromByteStream(args, inputFile, outputFile);
        }catch (Exception e){
            System.out.println("error: "+e);
        }
    }

    private static void fromFileStream(String[] args, File input, File output){
        try{
            FileInputStream inputStream=new FileInputStream(input);
            FileOutputStream outputStream=new FileOutputStream(output);
            int data=inputStream.read();
            while(data!=-1) {
                outputStream.write((char)data);
                data=inputStream.read();
            }
            System.out.println("File copied from "+args[0]+" to "+args[1]);
            inputStream.close();
            outputStream.close();
        }catch (IOException e){
            System.out.println("error: "+e);
        }
    }

    private static void fromBufferStream(String[] args, File input, File output){
        try{
            FileInputStream inputStream=new FileInputStream(input);
            FileOutputStream outputStream=new FileOutputStream(output);

            BufferedInputStream inputStream1=new BufferedInputStream(inputStream);
            BufferedOutputStream outputStream1=new BufferedOutputStream(outputStream);
            int data=inputStream1.read();
            while(data!=-1) {
                outputStream1.write((char)data);
                data=inputStream1.read();
            }
            System.out.println("File copied from "+args[0]+" to "+args[1]);
            inputStream1.close();
            outputStream1.close();
        }catch (IOException e){
            System.out.println("error : "+e);
        }
    }

    private static void fromByteStream(String[] args, File input, File output){
        try{
            FileInputStream inputStream=new FileInputStream(input);
            FileOutputStream outputStream=new FileOutputStream(output);
            int data=inputStream.read();
            while(data!=-1) {
                outputStream.write((byte)data);
                data=inputStream.read();
            }
            System.out.println("File copied from "+args[0]+" to "+args[1]);
            inputStream.close();
            outputStream.close();
        }catch (IOException e){
            System.out.println("error : "+e);
        }
    }
}
