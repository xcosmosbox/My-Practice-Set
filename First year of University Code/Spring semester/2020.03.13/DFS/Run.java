
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
	
	//ͨ�����ϵ�ѭ���͵ݹ��ҵ����ܴ��ڵ���·
	public static void changeBoard(int[][] board, int[][] contrastBoard, int i, int j, String step)
	{
		//�޸�ָ���ġ�i��j��λ�ã������������̵�λ�ý����޸ģ����ⱻ�ظ��޸�
		board = ChangeBoard.changeNeighbor(board,ChangeBoard.judgePosition(i,j));
		contrastBoard[i][j] = 1;
		
		//�������ڵ�������������㴫����һ�����
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
		
		
		
		//ͨ���ݹ��ҵ����ܴ��ڵĲ���·��
		for(int m=0; m<3; m++)
		{
			for(int n=0; n<3; n++)
			{
				//����ҵ������ȫ���Ĳ�������
				if(judgeBoard.judgeBlack(board))
				{
					System.out.println(step);
					return;
				}
				//�����û���ҵ����ڵ�·�������̽�����жϽ�����Ҫ���е�һ���Ƿ��Ѿ���ִ�й�
				if(judgeBoard.judgeContrast(contrastBoard, m, n))
				{
					step = step + "["+m+"]"+"["+n+"]"+" / ";
					changeBoard(boardCopy,contrastBoardCopy,m,n,stepCopy);
				}
			}
		}
		
		
	}
	

}
