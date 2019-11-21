# Binary Search Tree (BST)
There is a relatively efficient search list called binary search tree **O(log(N))**. This structure is stores data in nodes similar to tree leaves. Takes the initial value as root and places the next nodes based on their value. If the value is bigger then the current node goes to the right end of the tree if it gets smaller goes to the left side of the tree. This placing decision is being made on every node until the new value placed.  

This lists performance is based on how far the root node is from the farthest node. **O(h)** where its height. So based on the formation, its search runtime can differ from **O(log(N)) to O(N)**.

## How to find its height?

Finding the height of a tree is a little tricky considering just incrementing the hop counter with every node to right or left. Since every node can have a left or right children you are going to respect each node as root and recursively calculate each left and right subtree height.  

```java
public static int getHeight(Node root) {
        int left = 0, right = 0;
        if (root.left != null) {
            left += getHeight(root.left) + 1;
        }
        if (root.right != null) {
            right += getHeight(root.right) + 1;
        }
        return Math.max(left, right);
    }
```

---

## Input
7  
6 45 2 4 3 85 12 

## Output
3 

---

## Links
Practice -  https://www.hackerrank.com/challenges/30-binary-search-trees
More about trees - https://www.cs.cmu.edu/~adamchik/15-121/lectures/Trees/trees.html
