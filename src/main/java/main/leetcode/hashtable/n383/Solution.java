package main.leetcode.hashtable.n383;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> mgMp = new HashMap<>();
    for (char c : magazine.toCharArray()) {
      if (mgMp.containsKey(c)) {
        int num = mgMp.get(c);
        mgMp.put(c, num + 1);
      } else {
        mgMp.put(c, 1);
      }
    }

    for(char rn : ransomNote.toCharArray()) {
      if (mgMp.containsKey(rn)) {
        int num = mgMp.get(rn);
        if (num == 1) {
          mgMp.remove(rn);
        } else {
         mgMp.put(rn, num - 1);
        }
      } else {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String ransomNote = "aa";
    String magazine = "aab";

    Solution s = new Solution();
    boolean resp = s.canConstruct(ransomNote, magazine);
    System.out.println(resp);
  }
}
