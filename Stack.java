import java.util.Scanner;
public class Stack {
    private int maxsize;
    private int[] stack;
    private int top;
    public Stack(int size) {
        maxsize=size;
        stack=new int[maxsize];
        top=-1;
    }
    public void push(int value) {
        if(top==(maxsize-1)) {
            System.out.println("Stack Overflow");
        }else {
            top++;
            stack[top]=value;
        }
    }
    public void pop() {
        if(top==-1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped element is "+stack[top]);
            top--;
        }
    }
    public void display() {
        if(top==-1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("The stack elements are:");
            for(int i=top;i>=0;i--) {
                System.out.println(stack[top]+"\t");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        int choice;
        Stack stack = new Stack(size);
        do {
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
            System.out.print("Enter the choice: ");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter the element to be inserted: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }while(choice>=1 && choice<=3);
        scanner.close();
    }
}
