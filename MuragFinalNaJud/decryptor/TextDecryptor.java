package decryptor;

import linkedList.*;

public class TextDecryptor {
	private String decrypted, Dinputted;
	ListClass2 list2 = new ListClass2();
	
	//decrypted text getter
	public String Dgetdecrypted() {
		return this.decrypted;
	}
	
	
	//Save data to Node 
	public void DinsertText(String data) {
		
		//Encrypt data one by one and store it to String variable
		String container = "";
		for(int i = 0; i < data.length(); i++) {
			char character = decrypt(data.charAt(i));
			container += String.valueOf(character);
		}
		
		this.decrypted = container;
		this.Dinputted = data;
	}
	
	//write to file
	public void storeDataD() {
		list2.storeFirst(this.Dinputted, this.decrypted);
	}
	
	
	//Get data in file
	public String getDataD() {
		return list2.getAllData();
	}

	
	//Get data in file
	public String getData2D() {
		return list2.getAllData2();
	}
	
	
	//delete the file that contains data
	public void deleteFileD() {
		list2.deleteAllData();
	}
	
	//encrypt data
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
