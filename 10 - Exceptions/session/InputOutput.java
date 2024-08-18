package session;

import java.io.FileWriter;
import java.io.FileReader;

public class InputOutput {
    public static void writeString(String[] src, String fileName){
        try{
            FileWriter writer = new FileWriter(fileName);
            for(int i=0; i<src.length; i++){
                writer.write(src[i]);
            }
            writer.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
    public static String[] readString(String fileName){
        try{
            FileReader reader = new FileReader(fileName);
            char[] c = new char[15];
            reader.read(c);
            reader.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        } finally{
            String[] st = new String[3];
            return st;
        }
    }
    public static void main(String[] args){
        String[] src = new String[]{"static", " ", "void main"};
        writeString(src, "XOX.txt");
        readString("XOX.txt");
        /*String[] stt = readString("XOX.txt");
        for(String str : stt){
            System.out.println(str);
        }*/
    }
}
