class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        //stores student preference
        Queue<Integer> studentQ = new ArrayDeque<>();

        for (int n: students){
            studentQ.offer(n);
        }

        Queue<Integer> swQ = new ArrayDeque<>();
        for (int i: sandwiches){
            swQ.offer(i);
        }

        int time = 0;
        int refused = 0;

        while (!studentQ.isEmpty()) {

            if (studentQ.peek() == swQ.peek()) {
                studentQ.poll();
                swQ.poll();

                refused = 0;
            }
            else {
                int studentPref = studentQ.poll();
                studentQ.offer(studentPref);

                refused++;
            }

            if (refused == studentQ.size()) {
                break;
            }
        }

        return studentQ.size();
    }
}