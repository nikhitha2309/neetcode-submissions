class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrackHelper(n,new String(),0,0,'(',list);
        System.out.println(Arrays.toString(list.stream().toArray()));
        return list;
        
    }
    public static void backtrackHelper(int n , String str , int open , int close , char curr , List<String> list){

        if(curr == '('){
           if(open<n){
               str+=curr;
               open+=1;

           }else{
               return ;
           }
        }else{
            if(open>close){
                str+=curr;
                close+=1;
                if(open == close && open == n){
                   list.add(str);

                }

            }else{
                return ;
            }

        }
        backtrackHelper(n,str,open,close,'(',list);
        backtrackHelper(n,str,open,close,')',list);
        return;





    }
}
