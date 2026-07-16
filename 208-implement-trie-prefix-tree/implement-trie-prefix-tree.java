class Trie {
    private Trie[] links;
    private final int R = 26;
    private boolean isEnd;
    
    public Trie() {
        links = new Trie[R];            
    }

    public boolean containsKey(char ch){
        return links[ch-'a'] != null;
    }

    public Trie get(char ch){
        return links[ch-'a'];
    }

    public void put(char ch, Trie node){
        links[ch -'a'] = node;
    }

    public void setEnd(){
        isEnd = true;
    }

    public boolean isEnd(){
        return isEnd;
    }
    
    public void insert(String word) {
        Trie node = this;
        for(int i=0; i<word.length(); i++){
            char currentChar = word.charAt(i);
            if(!node.containsKey(currentChar)){
                node.put(currentChar, new Trie());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }
    
    private Trie searchPrefix(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
           char curLetter = word.charAt(i);
           if (node.containsKey(curLetter)) {
               node = node.get(curLetter);
           } else {
               return null;
           }
        }
        return node;
    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        Trie node = searchPrefix(prefix);
        return node != null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */