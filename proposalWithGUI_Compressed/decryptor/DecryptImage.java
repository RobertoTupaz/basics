package decryptor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
 
public class DecryptImage {
		
		public DecryptImage() {
			
		}
		
		public DecryptImage(File file, String fileName) throws FileNotFoundException, IOException {
			
			File newFolder = new File("C:\\Users\\1\\Desktop\\Decrypt\\Image");
			newFolder.mkdir();
			
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
	              
	        //Setting the image file name
			String imageName = fileName + createRandomNum();
			//Creating File in Decrypt folder to save data
			File newFile = new File("C:\\Users\\1\\Desktop\\Decrypt\\Image\\" + imageName + ".jpeg");
			
	        // Opening a file for writing purpose
	        FileOutputStream toDecrypt = new FileOutputStream(newFile);
	                            
	        // Writing new byte array value to image which
	        // will Decrypt it        
	        toDecrypt.write(data);
	        
	        // Writing new byte array value to image which
	        // will Decrypt it     
	        FileOutputStream toDecrypt2 = new FileOutputStream(file);
	        toDecrypt2.write(data);
	                            
	        // Closing file
	        toDecrypt2.close();
	        toDecrypt.close();
	        imageAddress.close();
		}
		
		//Create random number
		private String createRandomNum() {
			Random rand = new Random();
			String fileName = "";
			int min = 1, max = 10, randomNum = 0;
			for(int i = 10; i >= 0; i--) {
				randomNum = rand.nextInt(min + max);
				fileName += "" + randomNum; 
			}
			return fileName;
		}
		
		public String deleteFolder() {
			File files = new File("C:\\Users\\1\\Desktop\\Decrypt\\Image");
			File[] allFile = files.listFiles();
			
			for(File file : allFile) {
				file.delete();
			}
			
			if(files.delete()) {
				return "All Data Deleted Sucessfully";
			} else {
				return "Error!";
			}
		}
}