class Solution {

    public String encode(List<String> strs) {

        StringBuilder res = new StringBuilder();

        for (String s : strs) {
            res.append(s.length());
            res.append("#");
            res.append(s);
        }

        return res.toString();
    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Find the '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Get the length of the word
            int length = Integer.parseInt(str.substring(i, j));

            // Start of the actual word
            int start = j + 1;

            // Extract exactly 'length' characters
            String word = str.substring(start, start + length);

            res.add(word);

            // Move to the next encoded word
            i = start + length;
        }

        return res;
    }
}
