package Chap5_recursive;

import java.util.Stack;

public class MazeMap {
	static class items {
		int x;
		int y;
		int dir;
	}
	
	static class offsets {
		int a, b;
	}
	
	//enum directions { N, NE, E, SE, S, SW, W, NW };
	static class directions {
		int N = 0;
		int NE = 1;
		int E = 2;
		int SE = 3;
		int S = 4;
		int SW = 5;
		int W = 6;
		int NW = 7;
	}
	static offsets[] moves = new offsets[8];
	static int[][] maze = new int[100][100];
	static int[][] mark = new int[100][100];
	public static void path(int m, int p) {
			//start at (1,1)
			mark[1][1] = 1;
			Stack<items> stack = new Stack<>();
			items temp = new items();
			temp.x = 1; temp.y = 1; temp.dir = 2;//E
			stack.push(temp);

			while (!stack.isEmpty()) // stack not empty
			{
				temp = stack.pop(); // unstack
				int i = temp.x; int j = temp.y; int d = temp.dir;
				while (d < 8) // moves forward
				{
					//outFile << i << " " << j << " " << d << endl;
					int g = i + moves[d].a;
					int h = j + moves[d].b;
					if ((g == m) && (h == p
							
							)) { // reached exit
												// output path
						//cout << stack;
						System.out.println(stack);
						//cout << "the term near the exit: " << i << " " << j << endl;
						System.out.println("the term near the exit: " + i + " " + j);
						//cout << "exit: " << m << " " << p << endl;
						System.out.println("exit :" + m + " " + p );
						return;
					}
					if ((maze[g][h]==0) && (mark[g][h])==0) { // new position
						mark[g][h] = 1;
						//push the old temp to the stack, but the direction changes.
						//Because the neighbor in the direction of d has been checked.
						temp.x = i;  temp.y = j; temp.dir = d + 1;
						stack.push(temp); // stack it
						i = g; j = h; d = 0; // moves to (g,h)
					}
					else d++; // try next direction
				}
			}
			System.out.println("no path in maze");
			//cout << "no path in maze " << endl;
	}
	
	
	public static void main(String[] args) {
		int[][] input = {
				{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
				{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
				{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 },
				};
		

			for (int i = 0 ; i < 8; i++) 
				moves[i] = new offsets();
				
				moves[0].a = -1; moves[0].b = 0;
				moves[1].a = -1; moves[1].b = 1;
				moves[2].a = 0; moves[2].b = 1;
				moves[3].a = 1; moves[3].b = 1;
				moves[4].a = 1; moves[4].b = 0;
				moves[5].a = 1; moves[5].b = -1;
				moves[6].a = 0; moves[6].b = -1;
				moves[7].a = -1; moves[7].b = -1;
			

				for (int i = 0; i < 14; i++) {
					for (int j = 0; j < 17; j++)
					{
						if ((i == 0) || (j == 0) || (i == 13) || (j == 16))
							maze[i][j] = 1;
						else {
							maze[i][j] = input[i - 1][j - 1];
						};
						mark[i][j] = 0;

					}
				}
				for (int i = 0; i <= 13; i++)
				{
					for (int j = 0; j <= 16; j++)
						System.out.print(maze[i][j] + " ");
						//cout << maze[i][j] << " ";
					System.out.println();
					//cout << endl;
				}
				path(12, 15);

//				int end;

			//	cin >> end;
				
			}
}
