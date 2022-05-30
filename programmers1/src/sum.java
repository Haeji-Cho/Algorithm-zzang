public class sum {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [][] arr1 = new int[][] {{1, 2}, {2, 3}};
        int [][] arr2 = new int[][] {{3, 4}, {5, 6}};
        s.solution(arr1, arr2);

    }
}

class Solution{
    public int[][] solution(int[][] arr1, int[][] arr2){
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr1;
    }

}