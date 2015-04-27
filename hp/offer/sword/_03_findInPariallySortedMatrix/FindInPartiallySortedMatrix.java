package hp.offer.sword._03_findInPariallySortedMatrix;

public class FindInPartiallySortedMatrix {
	public boolean find(int[][] matrix, int rows, int columns, int target) {
		boolean found = false;
		
		// 注意验证函数输入值是否合法
		if(null != matrix && rows > 0 && columns > 0) {
			int row = 0;
			int column = columns - 1;
			while(row < rows && column >= 0) {
				if(target == matrix[row][column]) {
					found = true;
					break;
				} else if(target < matrix[row][column]) {
					column--;
				} else {
					row++;
				}
			}
		}
		
		return found;
	}
}
