
public class ChangeBoard 
{
	//判断数组对应的位置是图片中位置的标号
	public static int judgePosition(int i, int j)
	{
		int number = 0;
		if(i==0 && j==0) return 1; if(i==0 && j==1) return 2; if(i==0 && j==2) return 3;
		if(i==1 && j==0) return 4; if(i==1 && j==1) return 5; if(i==1 && j==2) return 6;
		if(i==2 && j==0) return 7; if(i==2 && j==1) return 8; if(i==2 && j==2) return 9;
		
		return number;
	}
	
	//根据位置编号，通过规则修改自身和周边位置
	public static int[][] changeNeighbor(int[][] board,int number)
	{	
		if(number == 1)
		{
			board[0][0] = changeNum(board[0][0]);
			board[0][1] = changeNum(board[0][1]);
			board[1][0] = changeNum(board[1][0]);
			board[1][1] = changeNum(board[1][1]);
		}
		
		if(number == 2)
		{
			board[0][0] = changeNum(board[0][0]);
			board[0][1] = changeNum(board[0][1]);
			board[0][2] = changeNum(board[0][2]);
		}
		
		if(number == 3)
		{
			board[0][1] = changeNum(board[0][1]);
			board[0][2] = changeNum(board[0][2]);
			board[1][1] = changeNum(board[1][1]);
			board[1][2] = changeNum(board[1][2]);
		}
		
		if(number == 4)
		{
			board[0][0] = changeNum(board[0][0]);
			board[1][0] = changeNum(board[1][0]);
			board[2][0] = changeNum(board[2][0]);
		}
		
		if(number == 5)
		{
			board[0][1] = changeNum(board[0][1]);
			board[1][1] = changeNum(board[1][1]);
			board[1][0] = changeNum(board[1][0]);
			board[1][2] = changeNum(board[1][2]);
			board[2][0] = changeNum(board[2][0]);
		}
		
		if(number == 6)
		{
			board[0][2] = changeNum(board[0][2]);
			board[1][2] = changeNum(board[1][2]);
			board[2][2] = changeNum(board[2][2]);
		}
		
		if(number == 7)
		{
			board[1][0] = changeNum(board[1][0]);
			board[1][1] = changeNum(board[1][1]);
			board[2][0] = changeNum(board[2][0]);
			board[2][1] = changeNum(board[2][1]);
		}
		
		if(number == 8)
		{
			board[2][0] = changeNum(board[2][0]);
			board[2][1] = changeNum(board[2][1]);
			board[2][2] = changeNum(board[2][2]);
		}
		
		if(number == 9)
		{
			board[1][1] = changeNum(board[1][1]);
			board[1][2] = changeNum(board[1][2]);
			board[2][1] = changeNum(board[2][1]);
			board[2][2] = changeNum(board[2][2]);
		}
		
		return board;
	}
	
	//判断是0还是1，进行更改
	public static int changeNum(int number)
	{
		if(number == 1) return 0;
		else return 1;
		
	}
}
