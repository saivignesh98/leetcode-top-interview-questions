/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> m=new HashMap<Character,Integer>();
        int i,j;
        for(i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        for(i=0;i<t.length();i++){
            if(m.get(t.charAt(i))==null||m.get(t.charAt(i))==0)
                return false;
            m.put(t.charAt(i),m.get(t.charAt(i))-1);
        }
        for(Integer x:m.values()){
            if(x>0)
                return false;
        }
        return true;
    }
}