package hp.offer.sword._18_binarytree;

public class SubTreeFinder {

  public static boolean hasSubTree(BinaryTreeNode tree1, BinaryTreeNode tree2) {

    boolean result = false;
    if (null != tree1 && null != tree2) {
      if (tree1.value == tree2.value) {
        result = isTree1HasTree2(tree1, tree2);
      } else {
        result = hasSubTree(tree1.leftChild, tree2) || hasSubTree(tree1.rightChild, tree2);
      }
    }
    return result;
  }

  public static boolean isTree1HasTree2(BinaryTreeNode tree1, BinaryTreeNode tree2) {

    boolean result = false;
    if (null == tree2) {
      result = true;
    } else if (null == tree1) {
      result = false;
    } else if(tree1.value != tree2.value) {
      result = false;
    } else {
      result = isTree1HasTree2(tree1.leftChild, tree2.leftChild) && isTree1HasTree2(tree1.rightChild, tree2.rightChild);
    }
    return result;
  }
}
