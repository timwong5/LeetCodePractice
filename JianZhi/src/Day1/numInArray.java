package Day1;

import java.util.HashMap;

public class numInArray {
//    ��Ŀ����һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ�
//    ������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�
//    Ҳ��֪��ÿ�������ظ��˼��Ρ����ҳ�����������һ���ظ������֡�
//    ���磬������볤��Ϊ7������{2, 3, 1, 0, 2, 5, 3}��
//    ��ô��Ӧ��������ظ�������2����3��



    /**solution1 ɵ���ӽⷨ
     * ��Ԫ�ذ��մ����������Ȼ���ж�����Ԫ���Ƿ���ȣ����������䷵��
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
     * ����Hashmap hashsetͬ��
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

    //Todo ���ַ�



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
