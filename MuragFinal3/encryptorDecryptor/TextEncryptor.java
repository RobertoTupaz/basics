package encryptorDecryptor;

public class TextEncryptor {

	private String encrypted, inputted;
	
	ListClass list1 = new ListClass();
	
	//encrypted text getter
	public String getEncrypted() {
		return this.encrypted;
	}
	
	
	//Save data to Node 
	public void insertText(String data) {
		
		//Encrypt data one by one and store it to String variable
		String container = "";
		for(int i = 0; i < data.length(); i++) {
			char character = incrypt(data.charAt(i));
			container += String.valueOf(character);
		}
		
		this.encrypted = container;
		this.inputted = data;
	}
	
	//write to file
	public void storeData() {
		list1.storeFirst(this.inputted, this.encrypted);
	}
	
	
	//Get data in file
	public String getData() {
		return list1.getAllData();
	}

	
	//Get data in file
	public String getData2() {
		return list1.getAllData2();
	}
	
	
	//delete the file that contains data
	public void deleteFile() {
		list1.deleteAllData();
	}
	
	//encrypt data
	private char incrypt(char str) {
		switch(str) {
			case 'q':
				str = '1';
			break;
			case 'w':
				str = '2';
			break;
			case 'r':
				str = '4';
			break;
			case 't':
				str = '5';
			break;
			case 'y':
				str = '6';
			break;
			case 'p':
				str = '0';
			break;
			case 's':
				str = 'w';
			break;
			case 'd':
				str = 'e';
			break;
			case 'f':
				str = 'r';
			break;
			case 'g':
				str = 't';
			break;
			case 'h':
				str = 'y';
			break;
			case 'j':
				str = 'u';
			break;
			case 'k':
				str = 'i';
			break;
			case 'l':
				str = 'o';
			break;
			case 'z':
				str = 'p';
			break;
			case 'x':
				str = 'a';
			break;
			case 'c':
				str = '|';
			break;
			case 'v':
				str = 'd';
			break;
			case 'b':
				str = 'f';
			break;
			case 'n':
				str = 'g';
			break;
			case 'm':
				str = 'h';
			break;
			case '1':
				str = 'j';
			break;
			case '2':
				str = 'k';
			break;
			case '3':
				str = 'l';
			break;
			case '4':
				str = 'z';
			break;
			case '5':
				str = 'x';
			break;
			case '6':
				str = 'c';
			break;
			case '7':
				str = 'v';
			break;
			case '8':
				str = 'b';
			break;
			case '9':
				str = 'n';
			break;
			case '0':
				str = 'm';
			break;
			case 'Q':
				str = 'M';
			break;
			case 'W':
				str = 'N';
			break;
			case 'E':
				str = 'B';
			break;
			case 'R':
				str = 'V';
			break;
			case 'T':
				str = 'C';
			break;
			case 'Y':
				str = 'X';
			break;
			case 'U':
				str = 'Z';
			break;
			case 'I':
				str = 'L';
			break;
			case 'O':
				str = 'K';
			break;
			case 'P':
				str = 'J';
			break;
			case 'A':
				str = 'H';
			break;
			case 'S':
				str = 'G';
			break;
			case 'D':
				str = 'F';
			break;
			case 'F':
				str = 'D';
			break;
			case 'G':
				str = 'S';
			break;
			case 'H':
				str = 'A';
			break;
			case 'J':
				str = 'P';
			break;
			case 'K':
				str = 'O';
			break;
			case 'L':
				str = 'I';
			break;
			case 'Z':
				str = 'U';
			break;
			case 'X':
				str = 'Y';
			break;
			case 'C':
				str = 'T';
			break;
			case 'V':
				str = 'R';
			break;
			case 'B':
				str = 'E';
			break;
			case 'N':
				str = 'W';
			break;
			case 'M':
				str = 'Q';
			break;
			case ' ':
				str = 's';
			break;
			case '.':
				str = '!';
			break;
			case '!':
				str = '.';
			break;
			case ',':
				str = '@';
			break;
			case '@':
				str = ',';
			break;
			case '?':
				str = '#';
			break;
			case '#':
				str = '?';
			break;
			case 'a':
				str = 'q';
			break;
			case 'e':
				str = '3';
			break;
			case 'u':
				str = '7';
			break;
			case 'i':
				str = '8';
			break;
			case 'o':
				str = '9';
			break;
		}
        
        return str;
	}
}
