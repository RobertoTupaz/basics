package decryptor;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Decrypt {
	private String decryptedText, inputtedText;
	
	//decrypted Text getter
	public String getDecryptedText() {
		return this.decryptedText;
	}
	
	//save data to decrypt
	public void insertText(String data) {
		
		//Decrypt data one by one and store to container variable
		String container = "";
		for(int i = 0; i < data.length(); i++) {
			char character = decrypt(data.charAt(i));
			container += String.valueOf(character);
		}
		
		inputtedText = data;
		decryptedText = container;
		
	}
	
	//Get data in file
	public String getData() {
		File file = new File("C:\\Users\\1\\Desktop\\Decrypt\\Data.txt");
		String dataStorage = "";
		
		try {
			FileReader reader = new FileReader(file);
			int i;
			while((i=reader.read()) != -1) {
				dataStorage += (char)i;
			}
			reader.close();
		} catch(IOException e) {
			System.out.println("Error!");
		}
		
		return dataStorage;
	}
	
	//write to file
	public void storeData() {
		try {
			File file = new File("C:\\Users\\1\\Desktop\\Decrypt\\Data.txt");
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write("\n(Inputted)    : " + inputtedText);
			fileWriter.write("\n(Decrypted) : " + decryptedText + "\n");
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Error!");
		}
	}
	
	//delete File
	public void deleteFile() {
		File file = new File("C:\\Users\\1\\Desktop\\Decrypt\\Data.txt");
		file.delete();
	}
	
	//decrypt data
	private char decrypt(char str) {
		switch(str) {
		case '1':
			str = 'q';
		break;
		case '2':
			str = 'w';
		break;
		case '4':
			str = 'r';
		break;
		case '5':
			str = 't';
		break;
		case '6':
			str = 'y';
		break;
		case '0':
			str = 'p';
		break;
		case 'w':
			str = 's';
		break;
		case 'e':
			str = 'd';
		break;
		case 'r':
			str = 'f';
		break;
		case 't':
			str = 'g';
		break;
		case 'y':
			str = 'h';
		break;
		case 'u':
			str = 'j';
		break;
		case 'i':
			str = 'k';
		break;
		case 'o':
			str = 'l';
		break;
		case 'p':
			str = 'z';
		break;
		case 'a':
			str = 'x';
		break;
		case '|':
			str = 'c';
		break;
		case 'd':
			str = 'v';
		break;
		case 'f':
			str = 'b';
		break;
		case 'g':
			str = 'n';
		break;
		case 'h':
			str = 'm';
		break;
		case 'j':
			str = '1';
		break;
		case 'k':
			str = '2';
		break;
		case 'l':
			str = '3';
		break;
		case 'z':
			str = '4';
		break;
		case 'x':
			str = '5';
		break;
		case 'c':
			str = '6';
		break;
		case 'v':
			str = '7';
		break;
		case 'b':
			str = '8';
		break;
		case 'n':
			str = '9';
		break;
		case 'm':
			str = '0';
		break;
		case 'M':
			str = 'Q';
		break;
		case 'N':
			str = 'W';
		break;
		case 'B':
			str = 'E';
		break;
		case 'V':
			str = 'R';
		break;
		case 'C':
			str = 'T';
		break;
		case 'X':
			str = 'Y';
		break;
		case 'Z':
			str = 'U';
		break;
		case 'L':
			str = 'I';
		break;
		case 'K':
			str = 'O';
		break;
		case 'J':
			str = 'P';
		break;
		case 'H':
			str = 'A';
		break;
		case 'G':
			str = 'S';
		break;
		case 'F':
			str = 'D';
		break;
		case 'D':
			str = 'F';
		break;
		case 'S':
			str = 'G';
		break;
		case 'A':
			str = 'H';
		break;
		case 'P':
			str = 'J';
		break;
		case 'O':
			str = 'K';
		break;
		case 'I':
			str = 'L';
		break;
		case 'U':
			str = 'Z';
		break;
		case 'Y':
			str = 'X';
		break;
		case 'T':
			str = 'C';
		break;
		case 'R':
			str = 'V';
		break;
		case 'E':
			str = 'B';
		break;
		case 'W':
			str = 'N';
		break;
		case 'Q':
			str = 'M';
		break;
		case 's':
			str = ' ';
		break;
		case ' ':
			str = 'S';
		break;
		case '!':
			str = '.';
		break;
		case '.':
			str = '!';
		break;
		case '@':
			str = ',';
		break;
		case ',':
			str = '@';
		break;
		case '#':
			str = '?';
		break;
		case '?':
			str = '#';
		break;
		case 'q':
			str = 'a';
		break;
		case '3':
			str = 'e';
		break;
		case '7':
			str = 'u';
		break;
		case '8':
			str = 'i';
		break;
		case '9':
			str = 'o';
		break;
	}
        
        return str;
	}
}
