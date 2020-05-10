class Solution {
    public int numJewelsInStones(String J, String S) {
        int m = S.length();
        int n = J.length(); 
        int count = 0;
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for(int i=0; i<m;i++) {
            char ch = S.charAt(i);
            Integer j = hashMap.get(ch);
            hashMap.put(ch, (j == null) ? 1 : j+1);
        }
        
        for(int j=0; j<n; j++){
            char ch = J.charAt(j);
            if(hashMap.get(ch) != null) {
                count += hashMap.get(ch);
            }
        }
        return count;
    }
}
