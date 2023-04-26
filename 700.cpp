#include<iostream>

using namespace std;

struct TreeNode{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode():val(0),left(nullptr),right(nullptr){}
    TreeNode(int x):val(x),left(nullptr),right(nullptr){}
    TreeNode(int x,TreeNode* left,TreeNode *right):val(x),left(left),right(right){}
};

class solution{
    public:
        TreeNode *searchBinaryTree(TreeNode* root,int val){
            if(!root || root-> val == val) return root;
            if(root -> val > val) return searchBinaryTree(root -> left,val);
            else return searchBinaryTree(root -> right,val);
        }
}
