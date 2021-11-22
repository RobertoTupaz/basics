package encryptorDecryptor;

public class ListClass {
	Node first;
	Node last;
	
	//add at last
	public void storeLast(String data1, String data2) {
		Node newNode = new Node();
		newNode.data1 = data1;
		newNode.data2 = data2;
		
		if(first == null) {
			first = newNode;
		} else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
	}

	//insert to first
	public void storeFirst(String data1, String data2) {
		Node newNode = new Node();
		newNode.data1 = data1;
		newNode.data2 = data2;
		
		if(first == null) {
			last = newNode;
		} else {
			first.previous = newNode;
			newNode.next = first;
		}
		first = newNode;
	}
	
	//get all data 
	public String getAllData() {
		Node temp = first;
		String allData = "";
		
		while(temp != null) {
			allData += ((temp.getData1()+ "\n") + (temp.getData2() + "\n\n"));
			temp = temp.next;
		}
		
		return allData;
	}
	
	//get all data backward
	public String getAllData2() {
		Node temp = last;
		String allData = "";
		
		while(temp != null) {
			allData += ((temp.getData1()+ "\n") + (temp.getData2() + "\n\n"));
			temp = temp.previous;
		}
		
		return allData;
	}
	
	//delete all data
	public void deleteAllData() {
		Node temp = first;
		
		while(temp != null) {
			temp.data1 = null;
			temp.data2 = null;
			temp = temp.next;
		}
		
		first = null;
		last = null;
	}

}
