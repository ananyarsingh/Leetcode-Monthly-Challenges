class Solution {
    public TreeNode buildTree(int[] P, int[] I) {
        Map<Integer, Integer> M = new HashMap<>();
        for (int i = 0; i < I.length; i++)
            M.put(I[i], i);
        return splitTree(P, I, M, 0, 0, I.length-1);
    }
    
    private TreeNode splitTree(int[] P, int[] I, Map<Integer, Integer> M, int pix, int ileft, int iright) {
        int rval = P[pix], imid = M.get(rval);
        TreeNode root = new TreeNode(rval);            
        if (imid > ileft)
            root.left = splitTree(P, I, M, pix+1, ileft, imid-1);
        if (imid < iright)
            root.right = splitTree(P, I, M, pix+imid-ileft+1, imid+1, iright);
        return root;
    }
}
