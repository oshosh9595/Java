package Chap5_recursive;
class Stack {
	
    private Point data[];           // 스택용 배열
	private int top; // 스택 포인터

	 public Stack() {
	        top = 0;
	        data = new Point[100];
	    }
//--- 스택에 x를 푸시 ---//
	public void push(Point p) {
		data[top++] = p;
	}
	
//--- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public Point pop(){
		return data[--top];
	}


//--- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return top <= 0;
	}

}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}


public class Queen {

//- 함수 호출로 구현 훈련
	static void SolveQueen(int [][]data) {
	    int count = 0; //point 스텍
	    int x = 0; //행
	    int y = 0; //열

	    Point p = new Point(x, y);
	    Stack s = new Stack();
	    s.push(p);
	    data[x][y] = 1;

	    while(count < data.length) {
	        x++;
	        y = 0;
	        while (y < data.length) {// y값을 증가하여 반복
	            y = NextMove(data, x, y);
	            if(y == -1) {
	                //pop 처리
	                s.pop();
	                if(s.isEmpty()) {
	                    return;
	                }
	                p = s.pop();
	                x = p.getX();
	                y = p.getY();
	                data[x][y] = 0;
	                y++;
	                continue;
	            }
	            data[x][y] = 1;
	            p = new Point(x,y);
	            s.push(p);
	            y = 0;
	            count++;
	            break;
	        }
	    }
	    
	}

	  private static int NextMove(int[][] data, int x, int y) {
		  while (y < data.length) {
		  if (CheckMove(data,x,y)) return y;
		  y++;
		  }
		  return -1;
	  }
	  public static boolean CheckMove(int [][]data, int row, int col) {
		  if(CheckRow(data, row) && CheckCol(data, col) &&
			 CheckDiagSW(data, row, col) && CheckDiagSE(data, row, col))
		  return true;
		  else return false;
	  }
	  public static boolean CheckRow(int [][]data, int row) {
		  for(int i = 0; i < data[row].length; i++) {
			  if(data[row][i]==1)
				  return false;
		  }
		  return true;
	  }
	  
	  public static boolean CheckCol(int [][]data, int col) {
		  for(int i = 0; i < data[col].length; i++) {
			  if(data[i][col]==1) return false;
		  }
		  return true;
	  }
	   
	  public static boolean CheckDiagSW(int [][]data, int row, int col) {
	        int dx = row;
	        int dy = col;
	        while (dx >= 0 && dx < row && dy >= 0 && dy < col) {
	            if (data[dx][dy] == 1)
	                return false;
	            dx++;
	            dy--;
	        }
	        dx = row;
	        dy = col;
	        while (dx >= 0 && dx < row && dy >= 0 && dy < col) {
	            if (data[dx][dy] == 1)
	                return false;
	            dx--;
	            dy++;
	        }
	        return true;
	    }

	    public static boolean CheckDiagSE(int [][]data,int row, int col) {
	        int dx = row;
	        int dy = col;
	        while (dx >= 0 && dx < row && dy >= 0 && dy < col) {
	            if (data[dx][dy] == 1)
	                return false;
	            dx++;
	            dy++;
	        }
	        dx = row;
	        dy = col;
	        while (dx >= 0 && dx < row && dy >= 0 && dy < col) {
	            if (data[dx][dy] == 1)
	                return false;
	            dx--;
	            dy--;
	        	}
	        return true;
	        }
	    static int num = 0;
	    public static void printBord(int[][] data, int row, int col){
	    	System.out.println(++num);

			for(int i=0; i < data.length; i++ ) {
				for(int j=0; j<data[0].length; j++) {
					System.out.print(data[i][j]);
				}
				System.out.println();
			}
		}

	public static void main(String[] args) {
		//입력 출력 호출
		int row = 8;
	 	int col = 8;
		int[][] data = new int[row][col];
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data.length; j++) {
				data[i][j] = 0;
			}
			System.out.println(data);
		}
	  
		//배열 초기화		
	 	SolveQueen(data);
	 	printBord(data, data.length, data.length);
	 	//배열열 출력: 8개의 queen 배치(여러가지 해를 구해 보여주기)
	 	
	}
}
