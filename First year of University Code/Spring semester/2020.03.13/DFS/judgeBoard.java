
public class judgeBoard 
{
	//判断整个棋盘是否全部变成黑色
	public static boolean judgeBlack(int[][] board)
	{
		if( board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1 &&
			board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1 &&
			board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//判断接下来想要修改的【i，j】位置是否曾经被修改过
	public static boolean judgeContrast(int[][] contrastBoard, int i, int j)
	{
		if(contrastBoard[i][j] == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
