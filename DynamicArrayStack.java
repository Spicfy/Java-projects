public class DynamicArrayStack<E> implements Stack<E> {
    private E[] elems;  // Used to store the elements of this ArrayStack
    private int top;    // Designates the first free cell
    private static final int DEFAULT_INC = 25;   //Used to store default increment / decrement

    @SuppressWarnings( "unchecked" )

    // Constructor
    public DynamicArrayStack( int capacity ) {
        if(capacity < DEFAULT_INC){
             elems = (E[])new Object[DEFAULT_INC];
        }
        else{
            elems = (E[]) new Object[capacity];
        }
        // Your code here.
        top = 0;
    }

    // Gets current capacity of the array
    public int getCapacity() {
        return elems.length;
    }

    // Returns true if this DynamicArrayStack is empty
    public boolean isEmpty() {
        return ( top == 0 );
    }

    // Returns the top element of this ArrayStack without removing it
    public E peek() {
        return elems[ top-1 ];
    }

    @SuppressWarnings( "unchecked" )

    // Removes and returns the top element of this stack
    public E pop() {
        if(top == elems.length - DEFAULT_INC){
            E[] newStack = (E[]) new Object[elems.length - DEFAULT_INC];
            for(int i = 0; i < newStack.length; i++){
                newStack[i] = elems[i];
            }
            elems = newStack;
        }
        E saved = elems[--top];
        elems[top] = null;
        return saved;


        // Your code here.
    }

    @SuppressWarnings( "unchecked" )

    // Puts the element onto the top of this stack.
    public void push( E element ) {
        if(top == elems.length - 1){
            E[] newStack = (E[]) new Object[elems.length + DEFAULT_INC];
            for(int i = 0; i < elems.length; i++){
                newStack[i] = elems[i];
            }
            elems = newStack;
        }
        elems[top++] = element;
        // Your code here.
    }

    @SuppressWarnings( "unchecked" )

    public void clear() {
        for(int i = 0; i < elems.length; i ++){
            elems[i] = null;
        }
        top = 0;
    }
}
