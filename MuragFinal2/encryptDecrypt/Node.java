package encryptorDecryptor;

public class Node {
	Node next;
	Node previous;
	
	String data1;
	String data2;
	
	public String getData1() {
		return ("inputed    : " + data1);
	}
	
	public String getData2() {
		return ("encrypted : " + data2);
	}
}
