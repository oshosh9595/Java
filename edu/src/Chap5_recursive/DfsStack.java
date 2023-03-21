package Chap5_recursive;
import java.util.Stack;

class Index {
	private int x;
	private int y;
	
	public Index() {
	}
	
	public Index(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

public class DfsStack {
	public static void main(String[] args) {
		//깊이 우선 탐색 실행
		dfs(0, 0);
	}
	
	// 지도
	public static int[][] map = 
			{{0,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
			{0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,0,1,0,0,0,0},
			{0,1,0,1,0,1,1,1,1,1,1,0,1,0,0,1,0,1,0,1,0,1,1,1},
			{0,1,0,1,0,1,0,0,0,0,1,0,1,1,0,1,0,1,0,1,0,0,0,0},
			{0,1,0,1,0,1,1,1,1,0,1,0,0,0,0,1,0,1,0,1,1,1,1,0},
			{0,0,0,1,0,0,0,0,0,0,1,1,1,1,0,1,0,1,0,0,0,0,0,0},
			{0,1,1,1,1,0,1,0,1,0,1,1,1,1,0,1,0,1,1,1,0,1,0,1},
			{0,0,0,0,1,1,1,0,1,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0},
			{1,0,1,0,1,0,0,0,1,0,1,0,1,1,0,1,1,1,1,1,1,1,1,1},
			{0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0},
			{0,1,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,0},
			{0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0},
			{1,0,1,0,0,0,1,1,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,0},
			{1,0,1,1,1,0,1,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,0},
			{1,0,0,0,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,1,0,0,0},
			{1,0,1,1,1,1,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,1,1,1},
			{1,0,0,0,0,0,0,0,1,0,1,1,0,1,1,1,1,0,0,0,0,1,0,1},
			{1,1,1,1,1,1,1,0,1,0,1,0,0,0,0,0,1,1,1,1,1,1,0,1},
			{0,0,0,0,0,0,0,0,1,0,1,1,1,1,0,0,0,1,0,0,0,0,0,1},
			{0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,1,0,1,1,1,1,1},
			{0,0,0,0,1,0,0,0,1,0,1,1,1,1,0,1,0,0,0,0,0,0,0,0},
			{1,0,1,0,0,0,1,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0}};
	
	//배열의 크기
	public static int size = map.length;

	// 인덱스를 저장하는 스택
	public static Stack<Index> ms = new Stack<>();

	// 깊이우선탐색
	public static void dfs(int x, int y) { // 시작 행, 열
		Index curr = new Index(x, y);
		map[x][y] = 1; // 첫 위치 visist설정

		while (true) {
			if (curr.getX() == size - 1 && curr.getY() == size - 1) { // 골인지점 설정
				System.out.println("미로탈출 완료!");
				break;
			} else {
				findWay(curr); // 현재 위치를 기준으로 길 탐색
				Index temp = ms.pop();
				System.out.println("" + temp.getX() + " " + temp.getY() + "로 이동");
				curr.setX(temp.getX()); // 현재 위치를 pop으로 변경
				curr.setY(temp.getY());
			}
		}
	}

	// 현재 위치의 상하좌우 탐색 메서드
	public static void findWay(Index curr) {
		int x = curr.getX();
		int y = curr.getY();

		// 위 탐색
		if (x > 0) {
			if (map[x - 1][y] != 1) { // 벽이 아니면 추가
				ms.push(new Index(x - 1, y));
				map[x - 1][y] = 1; // 추가하고 벽으로 만들어버림
			}
		}

		// 왼쪽 탐색
		if (y > 0) {
			if (map[x][y - 1] != 1) {
				ms.push(new Index(x, y - 1));
				map[x][y - 1] = 1;
			}
		}

		// 오른쪽 탐색
		if (y < size - 1) {
			if (map[x][y + 1] != 1) {
				ms.push(new Index(x, y + 1));
				map[x][y + 1] = 1;
			}
		}

		// 아래 탐색
		if (x < size - 1) {
			if (map[x + 1][y] != 1) {
				ms.push(new Index(x + 1, y));
				map[x + 1][y] = 1;
			}
		}
	}
}