class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            map.putIfAbsent(String.valueOf(chars), new ArrayList<>());
            map.get(String.valueOf(chars)).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
