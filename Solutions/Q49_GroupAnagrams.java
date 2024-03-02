package Solutions;

import java.util.*;

public class Q49_GroupAnagrams {
    public static void main(String[] args) {

        Solution49 s = new Solution49();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(s.groupAnagrams(strs));
        
    }
}

class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new AbstractList<List<String>>() {
            List<List<String>> result = null;

            public List<String> get(int index) {
                if (result == null) {
                    init();
                }

                return result.get(index);
            }

            public int size() {
                if (result == null) {
                    init();
                }

                return result.size();
            }

            private void init() {
                Map<String, List<String>> anaMap = new HashMap<>();

                for (String str : strs) {
                    char[] arr = new char[26];
                    char[] strArr = str.toCharArray();
                    for (int i = 0; i < strArr.length; i++) {
                        arr[strArr[i] - 'a']++;
                    }

                    String strKey = String.valueOf(arr);
                    anaMap.computeIfAbsent(strKey, k -> new ArrayList<>());
                    anaMap.get(strKey).add(str);
                }

                result = new ArrayList<>(anaMap.values().size());

                for (Map.Entry<String, List<String>> anaToList : anaMap.entrySet()) {
                    result.add(anaToList.getValue());
                }
            }
        };

        return res;
    }
}