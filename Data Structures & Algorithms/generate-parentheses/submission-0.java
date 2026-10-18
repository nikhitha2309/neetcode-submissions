class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrackHelper(n,new String(),0,0,'(',list);
        System.out.println(Arrays.toString(list.stream().toArray()));
        return list;
        
    }
    public static String backtrackHelper(int n , String str , int open , int close , char curr , List<String> list){

        if(curr == '('){
           if(open<n){
               str+=curr;
               open+=1;

           }else{
               return null;
           }
        }else{
            if(open>close){
                str+=curr;
                close+=1;
                if(open == close && open == n){
                    return str;

                }

            }else{
                return null;
            }

        }
        String ans1 = backtrackHelper(n,str,open,close,'(',list);
        if(ans1 != null){
            list.add(ans1);
        }
        ans1 = backtrackHelper(n,str,open,close,')',list);
        if(ans1 != null){
            list.add(ans1);
        }
        return null;





    }
}
