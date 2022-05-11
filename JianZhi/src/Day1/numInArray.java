package Day1;

import java.util.HashMap;

public class numInArray {
//    题目：在一个长度为n的数组里的所有数字都在0到n-1的范围内。
//    数组中某些数字是重复的，但不知道有几个数字重复了，
//    也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
//    例如，如果输入长度为7的数组{2, 3, 1, 0, 2, 5, 3}，
//    那么对应的输出是重复的数字2或者3。



    /**solution1 傻篮子解法
     * 将元素按照次序进行排序，然后判断相邻元素是否相等，如果相等则将其返回
     */


    private static void BubbleSort(int[] arr, int length){
        for (int i = 0; i < length; i++){
            for (int j = 0; j< length-1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    private static void solution1(int[] array){
        for (int i = 0;i< array.length -1 ;i++){
            if (array[i] == array[i+1]){
                System.out.println(array[i]);
            }
        }

    }

    /**
     * 利用Hashmap hashset同理
     * @param array
     * @return
     */
    private static int solution2(int[] array){
        HashMap<Integer, Integer> map = new HashMap();

        for(int num:array){
            if(map.containsKey(num)){
                System.out.println(num);
            }else{
                map.put(num,1);
            }
        }
        return -1;
    }


    private static int solution3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            while (array[i] != i) {

                if (array[array[i]] == array[i]) {
                    return array[i];
                }


            int temp = array[i];
            array[i] = array[array[i]];
            array[temp] = temp;
            }

        }
        return -1;
    }

    //Todo 二分法



    public static void main(String[] args) {
        int[] array = {2, 3, 1, 0, 2, 5, 3};
//        BubbleSort(array,array.length);
//        System.out.println(Arrays.toString(array));
//        solution1(array);
//
//        solution2(array);

        solution3(array);


    }



}
