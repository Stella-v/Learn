package sort;

/**
 * @Description: 冒泡排序
 * @author： see
 * @date： 2021-05-10 4:25 PM
 * @Version:
 */
public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {99,23,56,1,47,10,67,33,9,55,0};
//        int[] number = bubble(arr);
//        for (int i = 0; i < number.length; i++) {
//            System.out.print(number[i] + "、");
//        }
        String str = "，，，，，，挨点博客，，，，， ";
        System.out.println("改变后：" + str.replaceAll("，","a"));
    }
    public static int[] bubble(int[] arr){
        int len = arr.length;
        int[] nums = new int[len];
        //外层循环
        for(int i = 0 ; i < len ; i++){
            //循环把最大的值放到最后面，每循环一轮，循环总数就少一轮
            for(int j = 0;j < len - (i+1) ; j++){
                //交换
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        nums = arr;
        return nums;
    }
}
