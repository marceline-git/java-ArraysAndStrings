public class LinkedList {
    Node head;

    public void append(String key, String value) {
        if (head == null) {
            head = new Node(key, value);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(key, value);
    }

    public String valueLookUp(String key) {
        Node current = head;
        while (current.next != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return current.value;
    }

    /*
    public void printNodes(){
        if (head == null) return;
        Node current = head;
        int i = 0;
        while (current.next != null) {
            System.out.println("Number " + i + " Node");
            System.out.println("data: " + current.data);
            current = current.next;
            i++;
        }
        System.out.println("Number " + i + " Node");
        System.out.println("data: " + current.data);
        return;
    }*/
}