
package InputOutput;

import chanomshope.Machine;
import chanomshope.Payment;
import chanomshope.Product;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;


public class Receipt {
    
    private void writeReciept(Machine m) throws IOException{
        try{
            FileInputStream file = new FileInputStream("file/" + "Receipt_log.txt" );
        }catch(FileNotFoundException ex){
            FileWriter fw = new FileWriter("file/" + "Receipt_log.txt");
        }
        
        Path file = Paths.get("file/" + "Receipt_log"); 
        BufferedWriter writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8);
        StringBuilder result = new StringBuilder();
        LocalDateTime time = LocalDateTime.now();
        
        result.append("Chanom Chanom" + "\n");
        result.append("Date : " + time.toLocalDate() + time.toLocalTime() + "\n");
        result.append("------------------------------" + "\n");
        //---------------------------------------------------------------------------------//
        result.append("QTY");
        result.append("ITEM" + "\t");
        result.append("Total");
        //---------------------------------------------------------------------------------//
        //result.append()
    }  
}
