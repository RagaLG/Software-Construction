package session;
import java.io.File;

public class Files {
    public static void main(String[] args){
        createFile("XOX");
    }
    public static void createFile(String name){
        File file = new File(name + ".txt");
        try{
            file.createNewFile();
        } catch(Exception e){

        }
        System.out.println("File Path: "+ file.getAbsolutePath());
        System.out.println("File already exists: " + file.exists());
        System.out.println("Number of bytes in the file: " + file.length());
    }
}
