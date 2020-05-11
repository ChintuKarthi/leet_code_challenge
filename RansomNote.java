class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m = magazine.length();
        int n = ransomNote.length();
        int count = 0;
        Map<Character, Integer> hashMap1 = new HashMap<Character, Integer>();
        Map<Character, Integer> hashMap2 = new HashMap<Character, Integer>();
        for(int i=0; i<m; i++){
            char ch = magazine.charAt(i);
            Integer j = hashMap1.get(ch);
            hashMap1.put(ch, (j == null) ? 1 : j+1);
        }
        for(int j=0; j<n; j++){
            char ch = ransomNote.charAt(j);
            Integer k = hashMap2.get(ch);
            hashMap2.put(ch, (k == null) ? 1 : k+1);
        }
        for(Map.Entry mapped : hashMap2.entrySet()){
            Integer i = hashMap1.get(mapped.getKey());
            Integer j = Integer.parseInt(mapped.getValue().toString());
            System.out.println(i);
            System.out.println(j);
            if(hashMap1.get(mapped.getKey()) != null && mapped.getValue() != null){
                if(i >= j){
                    count= count+1;
                }
            }
        }
        if(count >= hashMap2.size()){
            return true;
        }
        else {
            return false;
        }
    }
}
