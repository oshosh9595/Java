package Chap8_List_Object;

import java.util.Comparator;
import java.util.Scanner;
//import Chap8_Test_SimpleList.Menu;

class SimpleObject {
	private String no; // 회원번호
	private String name; // 이름
	
	public SimpleObject (String sno, String sname) {
		this.no = sno;
		this.name = sname;
	}
	// --- 문자열 표현을 반환 ---//
	public String toString() {
		return "(" + no + ") " + name;
	}

	// --- 회원번호로 순서를 매기는 comparator ---//
	public static final Comparator<SimpleObject> NO_ORDER = new NoOrderComparator();

	private static class NoOrderComparator implements Comparator<SimpleObject> {
		public int compare(SimpleObject d1, SimpleObject d2) {
			return d1.no.compareTo(d2.no);
		}
	}

	// --- 이름으로 순서를 매기는 comparator ---//
	public static final Comparator<SimpleObject> NAME_ORDER = new NameOrderComparator();

	private static class NameOrderComparator implements Comparator<SimpleObject> {
		public int compare(SimpleObject d1, SimpleObject d2) {
			return d1.name.compareTo(d2.name);
		}
	}
}
class Node {
	SimpleObject data;
	Node link;
	public Node(SimpleObject element) {
		this.link = null;
		this.data = element;
	}
}


class LinkedList {
	Node first;
	public LinkedList() {
		first = null;
	}
	
	public boolean Delete(SimpleObject element, Comparator<? super SimpleObject> c) //delete the element
	{
		Node p = first, q = null;
		while(p != null && c.compare(element, first.data) > 0) {
			if(element == p.data) {
				if(q == null) {
					first = p.link;
				}else {
					q.link = p.link;
				}
				return true;
			}
			q = p;
			p = p.link;
		}
		return false;
	}
	
	public void Show() { // 전체 리스트를 순서대로 출력한다.
		Node p = first;
		while(p != null) {
			System.out.println(p.data + " ");
			p = p.link;
		}
	}
	
	public void Add(SimpleObject element, Comparator<? super SimpleObject> c) //임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다 
	{
		Node newNode = new Node(element);
		Node p = first, q = null;
		while(p != null && c.compare(element, first.data) > 0) {
			q = p;
			p = p.link;
		} 
		if(q == null) {
			p = newNode;
		}else {
			p.link = newNode;
		}
		newNode.link = q;
	}
	
	public boolean Search(SimpleObject data, Comparator<? super SimpleObject> c ) { // 전체 리스트를 순서대로 출력한다.
		Node p = first;
		while(p != null) {
			if(c.compare(data, p.data) == 0)
				return true;
			else
				p = p.link;
		}
		return false;
	}
}

public class Test8_Test_SimpleObjectList {

	 enum Menu {
	        Add( "삽입"),
	        Delete( "삭제"),
	        Show( "인쇄"),
	        Search( "검색"),
	        Exit( "종료")
	        
	        ;

	        private final String message;                // 표시할 문자열

	        static Menu MenuAt(int idx) {                // 순서가 idx번째인 열거를 반환
	            for (Menu m : Menu.values())
	                if (m.ordinal() == idx)
	                    return m;
	            return null;
	        }

	        Menu(String string) {                        // 생성자(constructor)
	            message = string;
	        }

	        String getMessage() {                        // 표시할 문자열을 반환
	            return message;
	        }
	    }

	    //--- 메뉴 선택 ---//
	    static Menu SelectMenu() {
			Scanner sc = new Scanner(System.in);
	        int key;
	        do {
	            for (Menu m : Menu.values()) {
	                System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
	                if ((m.ordinal() % 3) == 2 &&
	                      m.ordinal() != Menu.Exit.ordinal())
	                    System.out.println();
	            }
	            System.out.print(" : ");
	            key = sc.nextInt();
	        } while (key < Menu.Add.ordinal() || 
	                                            key > Menu.Exit.ordinal());
	        return Menu.MenuAt(key);
	    }

	public static void main(String[] args) {
       Menu menu;                                // 메뉴 
		System.out.println("SimpleObject");
		LinkedList l = new LinkedList();
		Scanner sc = new Scanner(System.in);
		SimpleObject data = null;
		boolean result;
    System.out.println("inserted");
	     //l.Show();		
	        do {
	            switch (menu = SelectMenu()) {	             
	             case Add :                           // 머리노드 삽입
	            	 System.out.print("회원번호:: ");
	            	 String sno = sc.next();
	            	 System.out.print("이름:: ");
	            	 String sname = sc.next(); 
	            	 data = new SimpleObject(sno, sname);
	    	         l.Add(data, SimpleObject.NO_ORDER);            
	                     break;
	             case Delete :                          // 머리 노드 삭제
	               	 System.out.print("삭제 회원번호:: ");
	               	 String sno2 = sc.next();
	            	 System.out.print("삭제 이름:: ");
	            	 String sname2 = sc.next(); 
	            	 data = new SimpleObject(sno2, sname2);
	            	 result = l.Delete(data, SimpleObject.NO_ORDER );
	            	 System.out.println("삭제된 데이터는 " + data);
	                    break;
	             case Show :                           // 꼬리 노드 삭제
	                    l.Show();
	                    if (data == null)
	                        System.out.println("데이터가 비어있습니다.");
	                    else {
	                        System.out.println("데이터는 :" + data);
	                    }
	                    break;
	             case Search :                           // 회원 번호 검색
	            	 System.out.print("회원번호:: ");
	            	 String sno3 = sc.next();
	            	 System.out.print("이름:: ");
	            	 String sname3 = sc.next(); 
	            	 data = new SimpleObject(sno3, sname3);
	         
	                 boolean result2 = l.Search(data,SimpleObject.NO_ORDER );
	                    if (result2)
	                        System.out.println("검색 값 = " + data + "데이터가 없습니다.");
	                    else
	                        System.out.println("검색 값 = " + data + "데이터가 존재합니다.");
	                     break;
	             case Exit :                           // 꼬리 노드 삭제
	                    break;
	            }
	        } while (menu != Menu.Exit);
	    }
}


