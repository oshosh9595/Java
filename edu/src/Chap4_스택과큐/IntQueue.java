package Chap4_스택과큐;
//https://leejinseop.tistory.com/37 이거 확인해보고 합시다
//int형 고정 길이 큐

public class IntQueue {
 private Object[] que;            // 큐용 배열
 private int front;            // 맨 처음 요소 커서
 private int rear;             // 맨 끝 요소 커서
 private int maxlen;
 static boolean isEmpty; 
 
 //--- 실행시 예외: 큐가 비어있음 ---//
 public class EmptyIntQueueException extends RuntimeException {
     public EmptyIntQueueException() { }
 }

 //--- 실행시 예외: 큐가 가득 찼음 ---//
 public class OverflowIntQueueException extends RuntimeException {
     public OverflowIntQueueException() { }
 }
 
 //--- 생성자(constructor) ---//
 public IntQueue(int maxlen) {
     this.front = 0;
     this.rear = -1;
     
     //실제 크키보다 하나더 크게 지정한다
     this.maxlen = maxlen + 1;
     this.que = new Object[this.maxlen];
 }
 
////--- 큐의 크기를 반환 ---//0
//    return isEmpty;
//}
//
////--- 큐에 쌓여 있는 데이터 개수를 반환 ---//
//public boolean size() {
//    return isEmpty;
//}

//--- 큐가 비어있는가? ---//
public boolean isEmpty() {
    return (front == rear +1) || (front + maxlen-1 == rear);
}

//--- 큐가 가득 찼는가? ---//
public boolean isFull() {
    return (rear == maxlen -1) || (front + maxlen-2 == rear);
}

  
 //--- 큐에 데이터를 인큐 ---//
 public Object enque(Object x) {
     if(isFull()) throw new OverflowIntQueueException();
     //rear 가 배열의 마지막이면 앞으로 돌린다.
     if(rear == maxlen-1) {
    	 rear = -1;
     }
     return que[++rear] = x;
 }
 
//--- 큐에서 데이터를 피크(프런트 데이터를 들여다봄) ---// 조회
public Object peek() throws EmptyIntQueueException {
    if (isEmpty()) throw new EmptyIntQueueException();  // 큐가 비어있음
    return que[front];
}

 //--- 큐에서 데이터를 디큐 ---//
 public Object deque(){
     Object x = peek();
     front++;
     
     //fornt의 다음 index가 배열크기 +1 이면 처음으로 돌아간다
     if(front == maxlen) {
    	 front = 0;
     }
     return x;
 }
 public void dump() {
     if (maxlen <= 0)
         System.out.println("큐가 비어있습니다.");
     else {
         for (int i = 0; i < maxlen; i++)
             System.out.print(que[(i + front) % maxlen] + " ");
         System.out.println();
     }
 }



// //--- 큐를 비움 ---//
// public void clear() {
//     num = front = rear = 0;
// }

 //--- 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환 ---//
 public Object indexOf(Object x) {
     for (int i = 0; i < maxlen; i++) {
         int idx = (i + front) % maxlen;
         if (que[idx] == x)                // 검색 성공
             return idx;
     }
     return -1;                            // 검색 실패
 }

 //--- 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력 ---//
 
}