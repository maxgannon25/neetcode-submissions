class Solution {

    public boolean meetsCondition(String word){
        int last = word.length()-1;

        if (word.charAt(0) == 'a' | word.charAt(0) == 'e' | word.charAt(0) == 'i' | word.charAt(0) == 'o' | word.charAt(0) == 'u'){
            if (word.charAt(last) == 'a' | word.charAt(last) == 'e' | word.charAt(last) == 'i' | word.charAt(last) == 'o' | word.charAt(last) == 'u'){
                return true;
            }
        }
        return false;
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        
        List<Integer> res = new ArrayList<>();
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i=0; i<words.length; i++){
            map.put(i, meetsCondition(words[i]));
        }

        for (int[] query: queries){
            int total = 0;
            int st = query[0];
            int nd = query[1];

            for (int i=st; i<=nd; i++){
                if (map.get(i) == true){
                    total++;
                }
            }
            res.add(total);
        }

        int[] result = new int[res.size()];

        for (int i =0; i < res.size(); i++){
            result[i] = res.get(i);
        }

        return result;
    }
}