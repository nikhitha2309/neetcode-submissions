class Solution {
    public int evalRPN(String[] tokens) {
        HashSet<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if(!set.contains(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                int item1 = stack.pop();
                int item2 = stack.pop();
                if(tokens[i].equals("+")){
                    stack.push(item2+item1);

                }else if(tokens[i].equals("-")){
                    stack.push(item2-item1);

                }else if(tokens[i].equals("*")){
                    stack.push(item2*item1);

                }else{
                    stack.push(item2/item1);

                }
            }

        }
        return stack.pop();
        
    }
}
