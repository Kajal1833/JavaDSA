package NeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagramgroup {
    public static void main(String[] args) {
     String[]   strs = {"eat","tea","tan","ate","nat","bat"};
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        System.out.println(Arrays.toString(new List[]{groupAnagrams(strs)}));


    }
        public  static List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String,List<String>> map=new HashMap<>();
            List<List<String>> result= new ArrayList<>();

            for (String word : strs){
                char[] charArray = word.toCharArray();
                Arrays.sort(charArray);
                String sword = String.valueOf(charArray);
                if(!map.containsKey(sword)){
                    map.put(sword, new ArrayList<>());
                }

                map.get(sword).add(word);

            }

            result.addAll(map.values());
            return result;

        }
    }

