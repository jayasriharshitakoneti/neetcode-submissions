class Pair{
    int val=0, min=Integer.MAX_VALUE;
    public Pair(int val,int min){
        this.val=val;

        if(val>min)
        this.min=min;
        else
        this.min=val;
    }

    public int getVal(){
        return val;
    }

    public int getMin(){
        return min;
    }
}

class MinStack {

    List<Pair> stack = new ArrayList<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        Pair newPair=new Pair(val,(stack.isEmpty()==true)?Integer.MAX_VALUE:getMin());
        stack.add(newPair);
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1).getVal();
    }
    
    public int getMin() {
        return stack.get(stack.size()-1).getMin();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */