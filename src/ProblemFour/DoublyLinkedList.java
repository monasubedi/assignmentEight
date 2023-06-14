package ProblemFour;

public class DoublyLinkedList {

    Node header;
    DoublyLinkedList(){
        header = new Node();
    }
    //adds to the end of the list
    public void addLast(String item){
        //implement
        Node iter = header;
        while(iter.next != null){
            iter = iter.next;
        }
        Node toAdd = new Node();
        toAdd.value = item;
        toAdd.previous = iter;
        iter.next = toAdd;

    }
    public boolean remove(String item){
        Node nodeFound = find(item);
        if(nodeFound != null){
            Node pred = nodeFound.previous;
            Node succ = nodeFound.next;

            pred.next = succ;
            succ.previous = pred;
            return true;
        }

       return false;
    }

    public Node find(String item){
      for(Node iter = header; iter != null; iter = iter.next){
           if(iter.value != null && iter.value.equals(item)){
               return iter;
           }

       }
       return null;
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list.find("Harry"));
        list.remove("Steve");
       // System.out.println(list);
    }
}
