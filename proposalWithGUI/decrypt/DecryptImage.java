package decryptor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class DecryptImage {
		
		public DecryptImage(File file) throws FileNotFoundException, IOException {
			int key = 8; //password
            
	        // Selecting a Image for operation
	        FileInputStream imageAddress = new FileInputStream(file);
	                            
	        // Converting Image into byte array, create a
	        // array of same size as Image size     
	        byte data[] = new byte[imageAddress.available()];
	                            
	        // Read the array
	        imageAddress.read(data);
	                            
	        // less key to the value of byte Array 
	        // byte array due to which every value of Image
	        // will change.
	        
	        for(int i = 0; i < data.length; i++) {
	            data[i] += key; 
	            i++;
	        }
	                            
	        // Opening a file for writing purpose
	        FileOutputStream toDecrypt = new FileOutputStream(file);
	                            
	        // Writing new byte array value to image which
	        // will Decrypt it
	                            
	        toDecrypt.write(data);
	                            
	        // Closing file
	        toDecrypt.close();
	        imageAddress.close();
		}
}