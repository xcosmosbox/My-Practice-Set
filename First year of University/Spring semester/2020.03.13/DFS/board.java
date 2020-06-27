
public class board 
{
	//创建棋盘自身
	public int[][] boardCreat()
	{
		int[][] creatBoard = new int[3][3];
		creatBoard[0][0] = 1; creatBoard[0][1] = 0; creatBoard[0][2] = 0;
		creatBoard[1][0] = 0; creatBoard[1][1] = 1; creatBoard[1][2] = 0;
		creatBoard[2][0] = 0; creatBoard[2][1] = 0; creatBoard[2][2] = 1;
		
		return creatBoard;
	}
	
	//创建对照棋盘，用于确定每个位置是否进行过修改
	public int[][] boardContrast()
	{
		int[][] contrastBoard = new int[3][3];
		contrastBoard[0][0] = 0; contrastBoard[0][1] = 0; contrastBoard[0][2] = 0;
		contrastBoard[1][0] = 0; contrastBoard[1][1] = 0; contrastBoard[1][2] = 0;
		contrastBoard[2][0] = 0; contrastBoard[2][1] = 0; contrastBoard[2][2] = 0;
		
		return contrastBoard;
	}
}
