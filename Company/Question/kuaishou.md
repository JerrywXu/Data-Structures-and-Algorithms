**Kwai推面经第 1 期**

## 实习 | 基础平台Java开发工程师

**第一轮**



\1. 项目

\2. Tcp的特性和状态，三次握手四次挥手



\3. Redis的结构，单线程为什么快



\4. Mysql引擎知道哪些，说下myisam和innodb的区别，mysql事务怎么做的



\5. Springboot怎么启动的，初始化的流程



\6. 假如让你用aop来做事务应该注意哪些点



\7. Java的锁了解哪些（ juc下的和偏向锁轻量级锁重量级锁）



\8. 两个单链表是否交叉及是否有环



**第二轮**



\1. 看你用的java，说下java的优点

\2. 面向对象的特性有哪些，介绍下，举个例子

\3. 说下java 异常，都有哪些，检查时异常和非检查异常区别

\4. 都知道哪些设计模式

\5. 单例，饿汉模式

\6. 给定参数的单例模式



## 实习 | 效率工程Java开发工程师第二轮

\1. 项目做了啥、难点。

\2. 输入一个url的过程。

\3. HTTPS怎么做的。

\4. 什么是SQL注入、mybatis怎么解决的。

\5. MySQL的事务、隔离级别介绍。

\6. String、StringBuilder、StringBuffer区别。

\7. 有自己写过SpringBoot的启动吗，给你你怎么写。

\8. SpringBoot的自动装配怎么做的。

\9. 讲一下动态代理怎么用的。

\10. 设计模式了解吗，说一下代理模式。

\11. 并发原理了解吗，说一下ConcurrentHashMap如何解决安全问题，以及扩容。

\12. 系统调用了解吗，举例。

\13. CPU缓存了解吗，各个之间速度差别具体是多少。

\14. 内存和磁盘速度具体差多少，为什么有这样的差距，物理构造了解吗。



**Kwai推面经第 2期**

## 实习 | 后端开发工程师

\1. string和stringbuffer和stringbuilder的区别

\2. concurrenthashmap了解多少，1.7和1.8区别

\3. 分段锁说一说

\4. CAS知道吗，介绍一下

\4. hashmap底层数据结构，jdk1.8之前和jdk1.8

\5. hashmap为什么链表超过8转化为红黑树？

\6. 介绍一下线程池，如果自己创建一个线程池，线程池包括哪些参数

\7. 多线程start和run方法的区别

\8. 抽象类和接口的区别，为什么要有抽象类？

\9. arraylist和linkedlist区别，是不是线程安全

\10. jvm了解多少，重要！！【垃圾回收机制】【类加载机制】

\11. mysql创建索引的注意事项

\12. redis怎么样、缓存类中间件用过哪些？kafka和rocketMQ了解多少

\13. 自动装箱 int和integer比较

\14. try catch执行顺序 中间插入return，执行顺序

\15. 多态的理解

\16. 手写单例模式

\17. arraylist和linkedlist区别

\18. 手写SQL 查找成绩总和top3的学生

\19. 创建线程的几种方法，都介绍一下

\20. 三层的B+树可以存多少信息，页表自己定义，节点大小自己估算

上亿级别，按页表16KB算，long占4个字节，16KB/4B = 4K

4K × 4K × 4K = 6.4×10^10

\21. B树和B+树介绍一下，说说区别

\22. 死锁四大条件

\23. 如何避免死锁

\24. 银行家算法（预防死锁的方法）

\25. linux会哪些命令，介绍10个

\26. socket编程了解多少

\27. 聚簇索引和非聚簇索引

\28. linux文件系统

\29. 你知道哪些文件系统，说说结构

\30. http是有状态还是无状态？是有连接还是无连接？





## 实习 | Java开发工程师

**第一轮**



\1. int与Integer的区别

\2. 接口与抽象类的区别，为什么会有接口

\3. hashmap的底层数据结构和扩容机制

\4. hashtable是怎么实现线程安全的，两个线程可以同时分别调用get和put方法吗

\5. concurrenthashmap是怎么实现线程安全的，怎么加锁，分段锁多了会怎么样，少了会怎么样，怎么保证适合的分段锁个数

\6. java里面怎么实现同步

\7. synchronized关键字和lock的区别

\8. synchronized在jvm里面是怎么实现的

\9. lock除了常用的Reetrantlock之外还了解什么实现类

\10. 了解锁升级吗

\11. 找出第k大个数

\12. 实现一个可以取到最大值的栈



**第二轮**



\1. 给定一个只有字母数字的字符串，找出连续数字的最大值

2.了解二叉树吗，写一个后序遍历，如果不用递归怎么实现

\3. 垃圾回收算法

\4. 新生代为什么要分三个区，为什么比例是8比1比1

\5. 说几个新生代垃圾回收器

\6. tcp为什么要三次握手，四次挥手

\7. 挥手为什么是4次，三次不可以吗

\8. MTU和分片了解吗



**第三轮**



\1. 实现一个求整数n的开平方数的函数

```java
import java.math.BigDecimal;
 
public class Sqrt {
	private static final double PRECISION = 6;
	
	public static double sqrt(double num) throws RuntimeException{
		if(num < 0){
			throw new RuntimeException("num should bigger than 0!");
		}
		if(num == 0 || num == 1){
			return num;
		}
		
		return sqrt0(0, num, num);
	}
	
	private static double sqrt0(double low, double high, double num){
		double mid = (low + high) / 2;
		
		BigDecimal bd = new BigDecimal(mid);
		if(bd.precision() >= PRECISION){
			return mid;
		}
		
		if((mid * mid) == num){
			return mid;
		}else if((mid * mid) < num){
			return sqrt0(mid, high, num);
		}else {
			return sqrt0(low, mid, num);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(sqrt(2));
	}
}
```



\2. 为什么来快手

\3. 对商业化怎么看

```
(先过)
实习 | Java开发工程师第一轮

\1. 实现数组的map方法.扩展运算符，ES6，遍历方法

\2. promise和async await，promise.all

\3. html5.css3

\4. 盒模型

\5. let const

\6. vuex，同步异步的差别

\7. vue生命周期

\8. webpack

\9. 一个嵌套的东西展开
```



