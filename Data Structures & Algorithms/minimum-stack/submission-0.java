class MinStack {
    List<Integer> stack;
    List<Integer> minStack;
    int min ;
    int top;

    public MinStack() {
        stack = new ArrayList<>();
        min = Integer.MAX_VALUE;
        minStack = new ArrayList<>();
        top = -1;

        
    }
    
    public void push(int val) {
        stack.add(val);
        
        if(minStack.size() == 0){
            minStack.add(val);
        }else{
            if(minStack.get(top) > val){
                minStack.add(val);
            }else{
                minStack.add(minStack.get(top));
            }
        }
        top++;
        
        
    }
    
    public void pop() {
        stack.remove(top);
        minStack.remove(top);
        top--;
        
        
    }
    
    public int top() {
        return stack.get(top);
        
    }
    
    public int getMin() {
        return minStack.get(top);
    }
}
