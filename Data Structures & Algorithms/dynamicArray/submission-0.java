class DynamicArray {
    private int[] array;
    private int size;

    public DynamicArray(int capacity){
        array = new int[capacity];
        size = 0;
    }

    public int get(int i){
        return array[i];
    }

    public void set(int i, int n){
        array[i] = n;
    }

    public void pushback(int n){
        if(size == array.length){
            resize();
        }

        array[size] = n;
        size++;
    }

    public int popback(){
        size--;
        return array[size];
    }

    private void resize(){
        int capacity = array.length;
        int[] newArray = new int[capacity * 2];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return array.length;
    }
}