import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFilter {
	
	private Map<String, Integer> words;

	public WordFilter(String[] words) {
		this.words = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
        	String currWord = words[i];
        	List<String> prefixList = new ArrayList<String>();
        	List<String> suffixList = new ArrayList<String>();
			for (int j = 0; j < currWord.length(); j++) {
				prefixList.add(currWord.substring(0, currWord.length() - j));
				suffixList.add(currWord.substring(currWord.length() - j));
			}
			// Adding the whole word as it can act as suffix as well
			suffixList.add(currWord);
			for (int j = 0; j < prefixList.size(); j++) {
				String prefix = prefixList.get(j);
				for (int j2 = 0; j2 < suffixList.size(); j2++) {
					String suffix = suffixList.get(j2);
					this.words.put(prefix + '#' + suffix, i);
				}
			}
		}
    }
    
    public int f(String prefix, String suffix) {
    	String findWord = prefix + "#" + suffix;    	
        return this.words.containsKey(findWord) ? this.words.get(findWord) : -1;
    }
}
