package Day07;

import java.util.Arrays;

public class Solution {


    public int minArray(int[] numbers) {

        if (numbers == null || numbers.length <=0){
            return 0;
        }

        int left = 0;
        //最右边的元素
        int right = numbers.length - 1;
        int mid = left;

        while (numbers[left] >= numbers[right]){
            if (right - left == 1){
                mid = right;
                break;
            }

            mid = (left + right) / 2;

            //三个下标指的数字相等 顺序查找
            if (numbers[left] == numbers[right] && numbers[mid] == numbers[right]){
                return orderSearch(numbers, left, right);
            }

            if (numbers[mid] >= numbers[left]){
                left = mid;

            }
            if (numbers[mid] <= numbers[right]){
                right = mid;
            }

        }

        return numbers[mid];

    }

    private int orderSearch(int[] numbers, int left ,int right) {
        int result = numbers[left];
        for (int i = left + 1; i <= right; i++) {
            if (result > numbers[i]){
                result = numbers[i];
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        int[] a = {2,2,2,0,1};
        Solution solution = new Solution();
        System.out.println(solution.minArray(a));
    }


}
