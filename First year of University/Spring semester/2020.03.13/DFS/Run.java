
public class Run 
{
	public static void main(String[] args)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				board realBoard = new board();
				int[][] boardReal = realBoard.boardCreat();
				int[][] contrastBoard = realBoard.boardContrast();
				String step = "["+i+"]"+"["+j+"]"+" / ";
				changeBoard(boardReal,contrastBoard,i,j,step);
			}
		}
				
	}
	
	//通过不断的循环和递归找到可能存在的线路
	public static void changeBoard(int[][] board, int[][] contrastBoard, int i, int j, String step)
	{
		//修改指定的【i，j】位置，并将对照棋盘的位置进行修改，避免被重复修改
		board = ChangeBoard.changeNeighbor(board,ChangeBoard.judgePosition(i,j));
		contrastBoard[i][j] = 1;
		
		//复制现在的这种情况，方便传给下一次情况
		int[][] boardCopy = new int[3][3];
		int[][] contrastBoardCopy = new int[3][3];
		String stepCopy = step;
		for(int m=0; m<3; m++)
		{
			for(int n=0; n<3; n++)
			{
				boardCopy[m][n] = board[m][n];
			}
		}
		for(int m=0; m<3; m++)
		{
			for(int n=0; n<3; n++)
			{
				contrastBoardCopy[m][n] = contrastBoard[m][n];
			}
		}
		
		
		
		//通过递归找到可能存在的操作路线
		for(int m=0; m<3; m++)
		{
			for(int n=0; n<3; n++)
			{
				//如果找到就输出全部的操作过程
				if(judgeBoard.judgeBlack(board))
				{
					System.out.println(step);
					return;
				}
				//如果还没有找到存在的路线则继续探索，判断接下来要进行的一步是否已经被执行过
				if(judgeBoard.judgeContrast(contrastBoard, m, n))
				{
					step = step + "["+m+"]"+"["+n+"]"+" / ";
					changeBoard(boardCopy,contrastBoardCopy,m,n,stepCopy);
				}
			}
		}
		
		
	}
	

}
