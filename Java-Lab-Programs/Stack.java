import java.util.Scanner;
/**
 * Lab2 - Stack implementation using array
 */
public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if(top==maxSize-1) {
            System.out.println("Stack Overflow!");
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed: "+value+" onto the stack");
        }
    }

    public int pop() {
        if(top==-1) {
            System.out.println("Stack Underflow!");
            return -1;
        }else {
            System.out.println("Popped "+stackArray[top]+" from the stack");
            return stackArray[top--];
        }
    }

    public void display() {
        if(top==-1) {
            System.out.println("Stack is empty!");
        }else {
            System.out.println("Stack elements are:");
            for(int i=top;i>=0;i--) {
                System.out.println(stackArray[i]);
            }
        }
    }

    public void pallindrome() {
        for(int i=0,j=top;i<=top/2;i++,j--) {
            if(stackArray[i]!=stackArray[j]) {
                System.out.println("Stack is not a pallindrome!");
            }
        }
        System.out.println("Stack is a pallindrome!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int size = sc.nextInt();
        int choice;
        Stack stack = new Stack(size);
        do {
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Pallindrome\n5. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter the element to push:");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    stack.pallindrome();
                    break;
                default:
                    System.out.println("Exiting...");
            }
        }while(choice>=1 && choice<=4);
        sc.close();
    }
}