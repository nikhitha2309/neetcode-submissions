class TrieNode{
    private TrieNode[] links;
    private final int len = 26;
    private boolean isEnd;
    
    public TrieNode(){
        links = new TrieNode[len];
    }

    public boolean containsKey(char ch){
        return links[ch-'a'] != null;
    }

    public TrieNode get(char ch){
        return links[ch-'a'];
    } 

    public void put(char ch , TrieNode node){
        links[ch-'a'] = node;
    }
    public boolean isEnd(){
        return isEnd;
    }

    public void setEnd(){
        isEnd = true;
    }
}
class PrefixTree {


    TrieNode root ;
    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
            for(int i =0 ; i< word.length() ; i++){
                char ch = word.charAt(i);
                if(node.containsKey(ch)){
                    node = node.get(ch);
                }else{
                    TrieNode tempNode  = new TrieNode();
                    node.put(ch,tempNode);
                    node = tempNode;
                }
            }
            node.setEnd();
    }

    public boolean search(String word) {
        TrieNode node = root;
            for (int i = 0; i < word.length() ; i++) {
                if(node.containsKey(word.charAt(i))){
                    node = node.get(word.charAt(i));
                }else{
                    return false;
                }
            }
            return node.isEnd();

    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
            for (int i = 0; i < prefix.length() ; i++) {
                if(node.containsKey(prefix.charAt(i))){
                    node = node.get(prefix.charAt(i));
                }else{
                    return false;
                }
            }
            return true;


    }
}
