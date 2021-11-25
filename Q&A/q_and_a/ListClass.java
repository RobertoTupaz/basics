package q_and_a;

public class ListClass {
	Node first;
	Node last;
	
	public void storeLast(String name, int score) {
		Node newNode = new Node();
		newNode.user = name;
		newNode.score = score;
		
		if (first == null) {
			first = newNode;
		} else {
			last.next = newNode;
			newNode.privious = last;
		}
		last = newNode;
	}
	
	
	public String getData(int i) {
		Node temp = first;
		while(i != 1) {
			temp = temp.next;
			i--;
		}
		return ("            Score : " + temp.score + "                                                                           Name : " + temp.user);
	}
	
	

	
	public void deleteAllData() {
		Node temp = first;
		
		while (temp != null) {
			temp.score = 0;
			temp.user = null;
			temp = temp.next;
		}
		
		first = null;
		last = null;
	}
	
	
	public void sortData() {
		
		Node current = first, index = null;

		int score;
		String name;

		if (first == null) {
			return;
		}
		else {
			while (current != null) {

				index = current.next;

				while (index != null) {

					if (current.score < index.score) {
						score = current.score;
						name = current.user;
						
						current.score = index.score;
						current.user = index.user;
						
						index.score = score;
						index.user = name;
					}

					index = index.next;
				}
				current = current.next;
			}
		}
	}
		
}
	
