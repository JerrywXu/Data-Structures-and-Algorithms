###### 1.岛屿数量

```java
class Solution {
    void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;//获取数组的行数与列数
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';
        
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }
        return num_islands;
    }
}
```



###### 2.给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和

```java
 public String addStrings(String num1, String num2) {

        int i = num1.length()-1,j = num2.length()-1,add=0;
        StringBuilder sb = new StringBuilder();
        while (i >=0 || j >= 0 || add != 0){
            int x = (i >= 0)?num1.charAt(i)-'0':0;
            int y = (j >= 0)?num2.charAt(j)-'0':0;
            int result = x+y+add;
            sb.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }

        sb.reverse();
        return  sb.toString();
    }

```



###### 3.给出一个整数数组，请在数组中找出两个加起来等于目标值的数，

你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.。注意：下标是从1开始的

假设给出的数组中只存在唯一解

例如：

给出的数组为 {20, 70, 110, 150},目标值为90
输出 index1=1, index2=2

```java
import java.util.*;
public class Solution {
    /**
     * @param numbers int整型一维数组 
     * @param target int整型 
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        int len = numbers.length;
        int[] result = new int[2];
        //map里面放 键为target-每个数的结果 值为下标
        //每次放入的时候看是否包含 当前值
        //有的话说明当前值和已包含的值下标的那个元素为需要的结果
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < len ; i++){
            if(map.containsKey(numbers[i])){
                result[0] = map.get(numbers[i])+1;
                result[1] = i+1;
                break;
            }else{
                map.put(target-numbers[i],i);
            }
        }
        return result;
    }
}

```

###### [1. 两数之和（2.13）](https://leetcode-cn.com/problems/two-sum/)

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

示例:

``` java
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
```



``` java
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(nums[i])) {
            return new int[]{map.get(nums[i]), i};
        }
        map.put(target - nums[i], i);
    }
    return new int[]{-1, -1};
}
```



###### 4.判断链表是否有环

```java
 public static void main(String[] args) {
  Node A = new Node("A");
  Node B = new Node("B");
  Node C = new Node("C");
  Node D = new Node("D");
  Node E = new Node("E");
  Node F = new Node("F");
  A.next = B;
  B.next = C;
  C.next = D;
  D.next = E;
  E.next = F;
  print(A);
 }
class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    
    }
}
```



###### 5.大数加法

```java
import java.util.*;
import java.math.BigDecimal;

public class Sum {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		BigDecimal a1 = new BigDecimal(a);
		BigDecimal b1 = new BigDecimal(b);
		System.out.println(a1.add(b1));
		in.close();
	}
}

```



###### 6.合并两个有序链表

```java
class ListNode{
    int val;
    ListNode next;
 
    ListNode(int x){
        val = x;
    }
}
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
 
        ListNode head = null;
        if (l1.val <= l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
}
```



###### 7.反转链表

```java
public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;//改变指针的指向
            prev = curr; //把curr的值赋给prev
            curr = next;
        }
        return prev;
    }
```



###### 8.两个线程交替输出1-10

```java
public class MyTask {

    public synchronized void PrintNum(int i){
        this.notify();
        System.out.println(Thread.currentThread().getName()+":"+i);
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
//////////////////////////////////////////////
package com.thread;//package com.thread;

public class SwapPrint {
    static int r =0;
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    r++;
                    task.PrintNum(r);
                    if(r>=10){
                        System.exit(1);
                    }
                }
            }
        });
        thread1.setName("我是线程1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    r++;
                    task.PrintNum(r);
                    if(r>=10){
                        System.exit(1);
                    }
                }
            }
        });
        thread2.setName("我是线程2");
        thread2.start();


    }
}
```



###### 9.统计二级制数字1的个数

```java
int Count1(int n)
{
	int count = 0;   
	while (n != 0)
	{        
		count += n&1;    
		n >>= 1;    
	}   
	return count; 
}
```



###### 10.二分查找

```java
int binarySearch(int[] nums int target){
    int left = 0;
    int right= num.length-1;
    
    while(left<=right){
        int mid= (right+left)/2;
        if(nums[mids] == target)
            return mid;
        else if(nums[mid]<target)
            left=mid+1;
        else if(nums[mid]>target)
            right=mid-1;
    }
    return -1
}
```



###### 11.设计一个抽样方法，使得每个数被抽到的概率是和这个数本身的大小成正比的

```

```



###### 12.用两个栈，实现队列

```java
public class E07QueueWithTwoStacks {
	/**
	 * 用两个栈实现一个队列，完成两个函数appendTail和deletedHead,分别是在队列尾部插入节点
	 * 和在队列头部删除节点的功能 
	 */
	private Stack<String> stack1 = new Stack<String>();
	private Stack<String> stack2 = new Stack<String>();
	
	public void appendTail(String s){
		stack1.push(s);
	}
	public String deletedHead() throws Exception{
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()){
			throw new Exception("队列为空，不能删除");
		}
		return stack2.pop();
	}
	
	public static void main(String[] args) throws Exception{
		E07QueueWithTwoStacks test  = new E07QueueWithTwoStacks();
		test.appendTail("1");
		test.appendTail("2");
		test.deletedHead();
	}
}
```











