package Day02;

public class numIn2dArray {
    //在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序
    // 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    //
    //示例:
    //现有矩阵 matrix 如下：
    //[
    //  [1,   4,  7, 11, 15],
    //  [2,   5,  8, 12, 19],
    //  [3,   6,  9, 16, 22],
    //  [10, 13, 14, 17, 24],
    //  [18, 21, 23, 26, 30]
    //]
    //给定 target=5，返回true
    //给定target=20，返回false



    //分析过程见 先找出规律 指找二维数组中的四个角的一个值 例如右上角 然后以它为标准比较要找的数字
    //需求值比标准值小的话直接排除标准值所在列（肯定在左边） 需求值比标准值大直接排除标准值所在的行（肯定在下边）
        public boolean findNumberIn2DArray(int[][] matrix, int target){
            //matrix.length表示行数
            //matrix[0].length表示列数
            int rows = matrix.length;
            int columns = matrix[0].length;


            if (matrix != null && rows >0 && columns >0){
                int i = 0;
                int j = columns-1;
                while(i < rows && j >0){
                    if (matrix[i][j] == target){
                        return true;
                    }
                    else if(matrix[i][j] > target){
                        j = j-1;
                    }
                    else if(matrix[i][j] < target){
                        i++;
                    }

                }
            }
            return false;
        }
}
