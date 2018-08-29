class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int counter = 0;
        List<Integer> spiralList = new ArrayList<>();
        int row = matrix.length;
        if (row == 0)
            return spiralList;
        
        int col = matrix[0].length;
        
        if (col > 0) {
            int right = col - 1, bottom = row - 1, left = 0, top = 0, total = row * col;
            
            outer:
            for (int i = 0; i < row / 2 + row % 2; i++) {
                int k = top, m = left;
                for (; m <= right; m++) {
                    spiralList.add(matrix[k][m]);
                    counter++;
                    if (counter == total)
                        break outer;
                }
                for (k = top+1, m = right; k <= bottom; k++) {
                    spiralList.add(matrix[k][m]);
                    counter++;
                    if (counter == total)
                        break outer;
                }
                for (k = bottom, m = right - 1; m >= left; m--) {
                    spiralList.add(matrix[k][m]);
                    counter++;
                    if (counter == total)
                        break outer;
                }
                for (k = bottom-1, m = left; k > top; k--) {
                    spiralList.add(matrix[k][m]);
                    counter++;
                    if (counter == total)
                        break outer;
                }
                
                left++;
                right--;
                top++;
                bottom--;
            }
        }
        
        return spiralList;
    }
}
