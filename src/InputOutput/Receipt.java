
package InputOutput;

import chanomshope.Customer;
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
    
    public void writeReciept(Product pd, Customer ct,int change, Payment pm) throws IOException{
        try{
            FileInputStream file = new FileInputStream("file/" + ct.getFirstname() + ct.getLastname() + ct.getPhonenum()+"Receipt_log.txt" );
        }catch(FileNotFoundException ex){
            FileWriter fw = new FileWriter("file/" + ct.getFirstname() + ct.getLastname() + ct.getPhonenum()+ "Receipt_log.txt");
        }
        
        Path file = Paths.get("file/" + "Receipt_log"); 
        BufferedWriter writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8);
        StringBuilder result = new StringBuilder();
        LocalDateTime time = LocalDateTime.now();
        
        result.append("\t\t\t" + "Chanom Shope" + "\n");
        result.append("Date : " + time.toLocalDate() + "\t\t\t\t\t" + time.toLocalTime() + "\n");
        result.append("--------------------------------------------------------------------" + "\n");
        //---------------------------------------------------------------------------------//
        result.append("ITEM" + "\t\t\t\t\t");
        result.append("QTY" + "\t\t");
        result.append("Total" + "\n\n");
        //---------------------------------------------------------------------------------//
        result.append(pd.getNameSelectFlavour() +"\t\t\t\t");
        result.append(pd.getAmount() + "\t\t");
        result.append(pd.getTotal() + "\n");
        result.append(pd.getNameSelectTopping()+"\n");
        result.append("Size    : " + pd.getSize()+"\n");
        //---------------------------------------------------------------------------------//
        result.append("--------------------------------------------------------------------" + "\n");
        result.append("Cash" + "\t\t\t\t\t\t\t");
        result.append(pm.getTotal() + "\n");
        //---------------------------------------------------------------------------------//
        result.append("--------------------------------------------------------------------" + "\n");
        result.append("Change" + "\t\t\t\t\t\t\t");
        result.append(change + "\n");
        result.append("--------------------------------------------------------------------" + "\n");
        //---------------------------------------------------------------------------------//
        result.append("\t\t\t" + "Good Luck");
        
        writer.write(result.toString());
        writer.close();
    }  
}
