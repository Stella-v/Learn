package sort;

/**
 * @Description: 选择排序：循环遍历，找到最小值，每一轮找到最小值后与每一轮的第一个数值比较
 * @author： see
 * @date： 2021-05-10 5:03 PM
 * @Version:
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {99, 23, 56, 1, 47, 10, 67, 33, 9, 55, 0};
        int[] number = select(arr);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "、");
        }
    }

    public static int[] select(int[] arr){
        int len = arr.length;
        int[] nums = new int[arr.length];

        //外层循环
        for(int i = 0;i < len; i++){
            //最小值的下标，在第一层for循环中初始化，就不会漏掉arr[i]本身就是最小值的情况
            int index = i;
            int min = arr[i];

            //内层循环：找到最小值，并记录下最小值的下标
            for (int j = i + 1; j < len ; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }

            //将每轮找到的最小值和arr[i]交换
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;

        }
        nums = arr;
        return nums;
    }
}
