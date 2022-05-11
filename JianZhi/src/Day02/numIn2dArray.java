package Day02;

public class numIn2dArray {
    //��һ�� n * m �Ķ�ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
    // �����һ����Ч�ĺ���������������һ����ά�����һ���������ж��������Ƿ��и�������
    //
    //ʾ��:
    //���о��� matrix ���£�
    //[
    //  [1,   4,  7, 11, 15],
    //  [2,   5,  8, 12, 19],
    //  [3,   6,  9, 16, 22],
    //  [10, 13, 14, 17, 24],
    //  [18, 21, 23, 26, 30]
    //]
    //���� target=5������true
    //����target=20������false



    //�������̼� ���ҳ����� ָ�Ҷ�ά�����е��ĸ��ǵ�һ��ֵ �������Ͻ� Ȼ������Ϊ��׼�Ƚ�Ҫ�ҵ�����
    //����ֵ�ȱ�׼ֵС�Ļ�ֱ���ų���׼ֵ�����У��϶�����ߣ� ����ֵ�ȱ�׼ֵ��ֱ���ų���׼ֵ���ڵ��У��϶����±ߣ�
        public boolean findNumberIn2DArray(int[][] matrix, int target){
            //matrix.length��ʾ����
            //matrix[0].length��ʾ����
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
