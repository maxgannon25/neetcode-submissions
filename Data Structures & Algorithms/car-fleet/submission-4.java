public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int l = position.length;
        int pairs[][] = new int[l][2];

        for (int i=0; i<position.length; i++){
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        Comparator<int[]> c = (a, b) -> (b[0] - a[0]);
        Arrays.sort(pairs, c);
        Stack<Double> stack = new Stack<>();

        for (int j=0; j < pairs.length; j++){
            Double time = (double) (target - pairs[j][0]) / pairs[j][1];
            stack.push(time);
            if (stack.size() >= 2 &&
                stack.peek() <= stack.get(stack.size()-2)) {
                stack.pop();
            }
        }
        return stack.size();

    }
}