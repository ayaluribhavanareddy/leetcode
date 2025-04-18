class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        // int sumo=0;
        int i=0,j=mat[0].length-1;
          while(i<mat.length){
            if(i==j-i){
                sum+=mat[i][i];
            }
            else{
            sum+=mat[i][i]+mat[i][j-i];
            }
            i++;
          }
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat.length;j++){
        //         if(i==j||i+j==mat.length-1){
        //             sum+=mat[i][j];
        //         }
        //         else
        //         {
        //             sumo+=mat[i][j];
        //         }
        //     }
        // }
        return sum;
    }
}