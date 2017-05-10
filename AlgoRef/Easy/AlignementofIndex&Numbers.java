//aligning the indexes with the numbers
Public class Solution {
    public void reorder(char [] A, int [] B){
        for (int i = 0 ; i < B.length ; ++i) {
            int tmp = i ;
            while (B[tmp] != tmp) {
                swap(A, B[tmp], tmp);
                swapIndex (B, B[tmp], tmp) ;
                tmp = B[tmp] ;
            }
        }
    }


    private void swap (char [] A, int i , int j){
        char tmp = A[i] ;
        A[i] = A[j] ;
        A[j] = tmp ;
    }

    private void swapIndex (int [] A, int i , int j){
        int tmp = A[i] ;
        A[i] = A[j] ;
        A[j] = tmp ;

        public static void main(String args[]){
        int A[] = {C,D,E,F,G}
                int B[] = {3,0,4,1,2}
    }
}