/**
* You are given an n x n 2D matrix representing an image.
* Rotate the image by 90 degrees (clockwise).
*/

public class RotateImage {
    public void rotate(int[][] mat) {
        
        int size = mat.length;
		
		for(int level =0;level<size/2;level++) {
			for(int scan=level;scan<size-level-1;scan++) {
				int temp = mat[level][scan];                //top to temp
				mat[level][scan]=mat[size-1-scan][level];			// top = left
				mat[size-1-scan][level] =  mat[size-level-1][size-1-scan];   // left = bottom
				mat[size-level-1][size-1-scan] = mat[scan][size-level-1];	// bottom = right
				mat[scan][size-level-1] = temp;							//right = temp
				
			}
		}
    }
}
