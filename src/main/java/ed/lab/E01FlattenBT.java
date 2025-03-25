package ed.lab;

import java.sql.Array;
import java.util.ArrayList;

public class E01FlattenBT {

    public void flatten(TreeNode<Integer> root) {
        if (root == null) return;

        TreeNode Lista = root;
        while (Lista != null) {
            if (Lista.left != null) {
                TreeNode Nodo = Lista.left;
                while (Nodo.right != null) {
                    Nodo = Nodo.right;
                }
                Nodo.right = Lista.right;
                Lista.right = Lista.left;
                Lista.left = null;
            }
            Lista = Lista.right;
        }
    }
    }
