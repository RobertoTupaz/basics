package decryptor;

public class Node2 {
	Node2 next;
	Node2 privious;
	String decrypted;
	
	public void displayData(int num) {
		System.out.println("Decrypted text(" + num + ") : " + decrypted);
	}
}
