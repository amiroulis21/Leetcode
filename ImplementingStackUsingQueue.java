class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    public MyStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();

    }
    
    public void push(int x) {
        queue1.add(x);
        
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        while(queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int n = queue1.poll();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return n;
    }
    
    public int top() {
        if(empty()) {
            return -1;
        }
        while(queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int n = queue1.peek();

        queue2.add(queue1.poll());
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return n;

    }    
    public boolean empty() {
        return queue1.isEmpty();
    }

}