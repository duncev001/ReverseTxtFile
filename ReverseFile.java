import java.util.*;
import java.io.*;
public class ReverseFile
{
    public static void main(String[] args){
        Scanner fileScanner;
        ArrayList<String> Lines = new ArrayList();
        try
        {
            fileScanner = new Scanner (new File ("C:/Users/Evan/Downloads/Loyola/Comp170/Comp271/alcott-little-261.txt"));
            ArrayList<String> Words = new ArrayList();
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                int start = 0;
                for(int i=1; i<line.length(); i++){
                    if(line.substring(i-1,i).equals(" ")){
                        if(!Words.contains(line.substring(start,i))){
                            Words.add(0, line.substring(start,i));
                        }
                        start = i;
                    }
                    if(i==(line.length()-1)){
                        if(!Words.contains(line.substring(start,i))){
                            Words.add(0, (line.substring(start,line.length())) + " ");
                        }
                    }
                }
                String dummy = "";
                for(int i=0; i<Words.size(); i++){
                    dummy = dummy + Words.get(i);
                }
                Lines.add(0, dummy);
            }
            int smallest = Words.get(0).length();
            for (int i = 0; i < Words.size(); i++) {
                for (int j = i + 1; j < Words.length(); j++) {
                    if (a[j] < a[smallest]) {
                        smallest = j;
                    }
                }

                swap(a, i, smallest);  // swap smallest to front
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
