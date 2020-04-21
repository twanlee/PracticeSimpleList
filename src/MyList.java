import java.util.Arrays;

public class MyList<T> {
    private final static int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(String e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public T get(int i){
        if(i>=size || i<0){
            throw new IndexOutOfBoundsException("Index " + i + " Size "+ i);
        }
        return (T) elements[i];
    }


}
