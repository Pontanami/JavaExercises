package datastructures;

import java.util.Iterator;
import java.util.Spliterator;

public class AVL_tree<Key extends Comparable<Key>, Value> implements Iterable<Key> {


    private class Node {
        private final Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int size;          // number of nodes in subtree
        private int height;        // height of subtree

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
            this.left = null;
            this.right = null;
            this.size = 1;
            this.height = 1;
        }
    }
    @Override
    public Iterator<Key> iterator() {
        return null;
    }

    @Override
    public Spliterator<Key> spliterator() {
        return Iterable.super.spliterator();
    }
}
