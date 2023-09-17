
package internship;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class WordCounter
{
    public static void main(String[] args) throws  Exception
    {
        String lines;
        int count =0;
        
        FileReader f = new FileReader("D:/Intranship/File1.txt");
        BufferedReader bfr = new BufferedReader(f);
        
        while((lines=bfr.readLine()) != null)
        {
            String words[] = lines.split(" ");
            count = count+words.length;
        }
        JOptionPane.showMessageDialog(null,"Total number of words present in given file: " +count);
   }    
}
