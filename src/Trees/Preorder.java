//package Trees;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//class TreeNode{
//    int data;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int data){
//        this.data = data;
//    }
//
//    TreeNode(int data, TreeNode left, TreeNode right ){
//        this.data = data;
//        this.left = left;
//        this.right = right;
//    }
//}
//
//public class Preorder {
//    static int idx = -1;
//
//    private static TreeNode buildPreorderTree(ArrayList<Integer> preorder){
//
//        idx++;
//
//        if(preorder.get(idx) == -1){
//            return null;
//        }
//
//        TreeNode root = new TreeNode(preorder.get(idx));
//
//        root.left = buildPreorderTree(preorder);
//        root.right = buildPreorderTree(preorder);
//
//        return root;
//    }
//
//    private static void preorder_Traversal(TreeNode root) {
//        if(root == null){
//            return;
//        }
//
//        System.out.print(root.data + " ");
//
//        preorder_Traversal(root.left);
//        preorder_Traversal(root.right);
//    }
//
//
//
//
//    public static void main(String[] args) {
//        ArrayList<Integer> Preorder = new ArrayList<>(Arrays.asList(1,2,3,4,5,-1,8,-1,-1,6,7,9));
//        TreeNode root = buildPreorderTree(Preorder);
//        preorder_Traversal(root);
//
//    }
//
//
//
//
//}
