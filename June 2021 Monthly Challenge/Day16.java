class Solution {
    List<String> soln = new ArrayList<String>();

    public List<String> generateParenthesis(int n) {
        populateList(n, n, "");
        return soln;
    }

    private void populateList(int openBr, int closeBr, String currStr) {
        if (openBr < 0 || closeBr < 0)
            return;
        if (openBr == 0 && closeBr == 0) {
            soln.add(currStr);
            return;
        }
        if (openBr > closeBr)
            return;
        // This is common for both conditions, i.e. (openBr <= closeBr).
		populateList(openBr-1, closeBr, currStr + "(");

        if (openBr < closeBr) {
            populateList(openBr, closeBr-1, currStr + ")");
        }
    }
}
