import java.io.FileWriter;  
import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.IOException; 
class FileReader
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("*Options*\n1:Create a new File\n2:To Write Data into File\n3:To Read Data from file\n4:To Delete File\n5: Exit");
        int key=in.nextInt();
        in.nextLine();
        switch (key) {
            case 1:
                System.out.println("Name for file to create:");
                
                String name=in.nextLine();
                String txt = name + ".txt";
                System.out.println(txt);
                System.out.println(name);
                try {
                    File myObj = new File(txt);
                    if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                    } else {
                    System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                    
                break;
        case 2:
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\Ayesha Khan\\Desktop\\jAva\\output.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
                break;
        case 3:
        try {
            File myObj = new File("output.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
                break;

        case 4:
        System.out.println("Name for file to delete:");
        String name1=in.nextLine();
        File myObj = new File(name1); 
        if (myObj.delete()) { 
          System.out.println("Deleted the file: " + myObj.getName());
        } else {
          System.out.println("Failed to delete the file.");
        } 
        case 5:
            System.exit(1);
            default:
            System.out.println("Invalid Input");
                break;
        }


    }
}