import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("Strong.txt");
        fileWriter.write("SUN" +
                "\nprekrasnoe utro" +
                "\n yarkoe solnse" +
                "\ngoluboe nebo" +
                "\nkrasubyya zakat");
        fileWriter.close();


        try{
        FileReader fileReader = new FileReader("Strong.txt");
        Scanner scanner = new Scanner(fileReader);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }



    }}


