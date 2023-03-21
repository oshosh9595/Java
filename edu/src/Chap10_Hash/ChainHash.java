package Chap10_Hash;
//체인법에 의한 해시

public class ChainHash<K,V> {

 //--- 해시를 구성하는 노드 ---//
 class Node<V> {
     private V data;                // 데이터
     private Node<V> next;        // 뒤쪽 포인터(뒤쪽 노드에 대한 참조)

     //--- 생성자(constructor) ---//
     Node(V data, Node<V> next) {
         this.data = data;
         this.next = next;
     }

     //--- 데이터를 반환 ---//
     V getValue() {
         return data;
     }

     //--- 키의 해시값을 반환 ---//
     public int hashCode() {
    	 SimpleObject so = this.getValue();
         int number = Integer.parseInt(sno);
    	 //return key.hashCode();
     }
 }

 private int    size;              // 해시 테이블의 크기
 private Node<V>[] table;        // 해시 테이블

 //--- 생성자(constructor) ---//
 public ChainHash(int capacity) {
     try {
         table = new Node[capacity];
         this.size = capacity;
     } catch (OutOfMemoryError e) {        // 테이블을 생성할 수 없음
         this.size = 0;
     }
 }

 //--- 해시값을 구함 ---//
 public int hashValue(Object key) {
     return key.hashCode() % size;
 }

 //--- 키값이 key인 요소를 검색(데이터를 반환) ---//
 public V search(SimpleObject so) {
	 
 }

 //--- 키값이 key인 데이터를 data의 요소로 추가 ---//
 public int add(V data) {
	 
	 Node<V> newNode = new Node<V>;
	 
 }

 //--- 키값이 key인 요소를 삭제 ---//
 public int remove(V data) {
 }

 //--- 해시 테이블을 덤프(dump) ---//
 public void dump() {
 }
}