package questionTwo;

public class Stacks {
    int[] numArray;
    int top;
    int size;

    Stacks(int capacity) {
        numArray = new int[capacity];
        top = -1;
        size = 0;
    }

    public int size() {
        return size();
    }

    public void push(int data) {
        if (top < numArray.length - 1) {
            numArray[++top] = data;
            size++;
        } else {
            System.out.println("Full");
        }
    }

    public int pop() {
        if (top >= 0) {
            int datas = numArray[top--];
            size--;
            return datas;
        }
        return -1;
    }

    public static void main(String[] args) {
        Stacks numStack = new Stacks(5);
        numStack.push(1);
        numStack.push(2);
        numStack.push(6);
        numStack.push(7);
        numStack.push(8);
        numStack.pop();
        for (int i = 0; i < numStack.size; i++) {
            System.out.println(numStack.numArray[i]);
        }
    }
}

