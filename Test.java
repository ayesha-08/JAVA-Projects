import java.util.Scanner;
class Test{
     public static void main(String[] args) {
        
    Scanner in=new Scanner(System.in);
    System.out.println("press 1 to convert alphabet to Ascii\n Press 2 to convert vise versa\n press 3 to exit");
    int val=in.nextInt();
 switch (val) {

    case 1:
        //  print for input take input then     convert it type cast now to run the program we need terminal
        System.out.println("Enter ur alphabet");
        char val2=in.next().charAt(0);
        int charval;// casting me prob ?? no idea  wait i hv written  in no need of  kk a noten book ek number na topper chalo exit wala kk dehkte
        charval = (int)val2;
        System.out.println("ASCII Value of given Alphabet:" +charval);       
        break;
    case 2:
        System.out.println("Enter ur number");
        int val3=in.nextInt();
        char intval;
        intval = (char)val3;
        System.out.println("Alphabet:" +intval);//ok       
        break;

    case 3:
        System.exit(1); 
    default:
        System.out.println("Invalid input");
        break;
 }
       
    }
} 