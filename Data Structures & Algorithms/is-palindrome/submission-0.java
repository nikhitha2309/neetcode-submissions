class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;       
        String replacedString= s.replaceAll("[^a-zA-z0-9]","");
        replacedString = replacedString.toLowerCase();
        int end = replacedString.length() - 1;
        while(start<=end){
            if(replacedString.charAt(start) != replacedString.charAt(end)){
                System.out.println(start);
                System.out.println(end);

                return false;
            }
            start +=1;
            end -=1;
        }
        return true;

        
    }
}
