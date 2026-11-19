class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList word1 = new ArrayList<>(List.of(s.split("")));

        ArrayList word2 = new ArrayList<>(List.of(t.split("")));

        Collections.sort(word1);

        Collections.sort(word2);

        if (word1.equals(word2)) {
            return true;
        } else {
            return false;
        }
    }
}
