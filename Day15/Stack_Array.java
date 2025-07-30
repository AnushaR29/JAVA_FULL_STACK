class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    Stack(int Size){
        maxSize = Size;
        stackArray = new int[maxSize];
        top = -1;

    }
    public void push(int Value){
        if(top == maxSize - 1){
            System.out.println("Stack is overflow");
        }else{
            stackArray[++top] = Value;
        }

    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return -1;
        }else{
            return stackArray[top--];
        }
    }
    public int peek (){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return stackArray[top];
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }else{
            for (int i=0; i>=0; i++){
                System.out.println(stackArray[i]);
            }
        }
    }
}




public class Stack_Array{
    public static void main (String[] args){
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.peek();
        s.display();
    }
}