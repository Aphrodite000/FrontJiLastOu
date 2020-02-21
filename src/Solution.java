public class Solution {
    public void reOrderArray(int [] array){
        //相对位置不变，稳定性
        //冒泡把排序的思想
        int m = array.length;
        int k = 0;//记录已经摆好位置的奇数的个数
        for (int i = 0; i < m; i++) {
            if (array[i] % 2 == 1) {
                int j = i;
                while (j > k) {//j >= k+1
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    j--;//类似冒泡
                }
                k++;//拍完一个k++
            }
        }
        //第二方法：数组转字符串，遍历是奇数存进另一个字符串，然后原来中删去，
    }
}
