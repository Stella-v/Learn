package sort;

/**
 * @Description: 插入排序：把后面的数字跟前面的数字做比较，较小的数字往前移动
 * @author： see
 * @date： 2021-05-10 6:28 PM
 * @Version:
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {99, 23, 56, 1, 47, 10, 67, 33, 9, 55, 0};
        int[] number = insert(arr);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "、");
        }
    }

    public static int[] insert(int[] arr) {
        int len = arr.length;
        //保存排序后的数组
        int[] nums = new int[len];

        //外层循环：从第二个数字开始
        for (int i = 1; i < len; i++) {
            //内存循环：如果第二个数字小于第一个数字，把第一个数字和第二个数字交换。如果循环限制条件未达到，但不满足if
            //条件，说明前面没有更小的数字了，就break
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    //交换
                    int temp = arr[j - 1];
                    arr[j-1]=arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }

        nums = arr;
        return nums;
    }
}
