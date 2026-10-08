class LinkedList{
    private Node start;

    public LinkedList(){
        start = new Node();
    }

    public int get(int index){
        Node current = start.getNext();

        for(int i = 0; i < index; i++){
            if(current == null) return -1;
            current = current.getNext();
        }

        if(current == null) return -1;

        return current.getValue();
    }

    public void insertHead(int val){
        Node newHead = new Node(val);
        newHead.setNext(start.getNext());
        start.setNext(newHead);
    }

    public void insertTail(int val){
        Node current = start;

        while(current.getNext() != null){
            current = current.getNext();
        }

        current.setNext(new Node(val));
    }

    public boolean remove(int index){
        Node current = start;

        for(int i = 0; i < index; i++){
            if(current.getNext() == null) return false;
            current = current.getNext();
        }

        if(current.getNext() == null) return false;

        current.setNext(current.getNext().getNext());
        return true;
    }

    public ArrayList<Integer> getValues(){
        ArrayList<Integer> values = new ArrayList<>();
        Node current = start.getNext();

        while(current != null){
            values.add(current.getValue());
            current = current.getNext();
        }

        return values;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(){
            this.next = null;
        }

        public Node(int value){
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        public Node getNext(){
            return next;
        }

        public int getValue(){
            return value;
        }

        public void setNext(Node next){
            this.next = next;
        }
    }
}