class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        
        List<String> strs = new ArrayList<>();

    int i = 0;

    while (i < str.length()) {

        StringBuilder lengthStr = new StringBuilder();

        while (str.charAt(i) != '#') {

            lengthStr.append(str.charAt(i));

            i++;

        }

        int strLength = Integer.parseInt(lengthStr.toString());

        i++; // Skip '#'

        String decoded = str.substring(i, i + strLength);

        strs.add(decoded);

        i += strLength;

    }

    return strs;

    }
}
