class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

            Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            if(stack.empty()){
                stack.push(i);
            }else{

                while(!stack.empty() && temperatures[stack.peek()] < temperatures[i]){
                    result[stack.peek()] = i-stack.peek();
                    stack.pop();

                }
                stack.push(i);
            }

        }
        while (!stack.empty()){
            result[stack.pop()] = 0;
        }
        return result;
        
    }
}
