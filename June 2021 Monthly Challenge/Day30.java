public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        
        // if root node matches with p or q, one match found and return root
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        
        // search for p,q in left sub tree
        TreeNode leftAns = lowestCommonAncestor(root.left, p, q);
        
        // search for p,q in right sub tree
        TreeNode rightAns = lowestCommonAncestor(root.right, p, q);
        
        // since all values in tree are unique, and if p,q exists in left, right sub trees
        // root will be the lowest common ancestor
        if(leftAns != null && rightAns != null){
            return root;
        }
        
        // if left sub tree is having both p,q, that will be the result
        if(leftAns != null){
            return leftAns;
        }
        
        // as right sub tree is not null, it is having both values
        return rightAns;
    }
