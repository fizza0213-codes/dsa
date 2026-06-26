
// Time: O(n*L) per search/startsWith Space: O(n*L)
public class ImplementTriePrefixTreeBrute {
  List<String> words = new ArrayList<>();
    public Trie() {}
    public void insert(String word) {
        words.add(word);
    }
    public boolean search(String word) {
        return words.contains(word);
    }
    public boolean startsWith(String prefix) {
        for (String w : words) if (w.startsWith(prefix)) return true;
        return false;
    }
public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // false
        System.out.println(trie.startsWith("app"));  // true
    }
}
