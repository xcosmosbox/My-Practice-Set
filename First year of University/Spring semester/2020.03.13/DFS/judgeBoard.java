
public class judgeBoard 
{
	//�ж����������Ƿ�ȫ����ɺ�ɫ
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
	
	//�жϽ�������Ҫ�޸ĵġ�i��j��λ���Ƿ��������޸Ĺ�
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
