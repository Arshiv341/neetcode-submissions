class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> smap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(smap.containsKey(s.charAt(i))){
                smap.put(s.charAt(i),smap.get(s.charAt(i))+1);
            }
            else{
                smap.put(s.charAt(i),1);
            }
        }
        HashMap<Character,Integer> tmap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(tmap.containsKey(t.charAt(i))){
                tmap.put(t.charAt(i),tmap.get(t.charAt(i))+1);
            }
            else{
                tmap.put(t.charAt(i),1);
            }
        }
        if(smap.equals(tmap)) return true;
        return false;
    }
}
