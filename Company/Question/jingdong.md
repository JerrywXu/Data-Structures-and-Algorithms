###### 1.什么是聚簇索引，聚簇索引和非聚簇索引的数据存储在哪个地方(B+树)，聚簇索引为什么比非聚簇索引快（减少磁盘IO）？

聚簇索引是顺序结构与数据存储物理结构一致的一种索引，并且一个表的聚簇索引只能有唯一的一条；

非聚簇索引记录的物理顺序与逻辑顺序没有必然的联系，与数据的存储物理结构没有关系；一个表对应的非聚簇索引可以有多条，根据不同列的约束可以建立不同要求的非聚簇索引；

###### 2.@Component注解的用法

有一个接口，在这个接口的实现类里，需要用到@Autowired注解，一时大意，没有在实现类上加上@Component注解，导致了Spring报错，找不到这个类

一旦使用关于Spring的注解出现在类里，例如我在实现类中用到了@Autowired注解，被注解的这个类是从Spring容器中取出来的，那调用的实现类也需要被Spring容器管理，加上@Component

@Controller 控制器（注入服务）
 用于标注控制层，相当于struts中的action层

@Service 服务（注入dao）
 用于标注服务层，主要用来进行业务的逻辑处理

@Repository（实现dao访问）
 用于标注数据访问层，也可以说用于标注数据访问组件，即DAO组件

@Component （把普通pojo实例化到spring容器中，相当于配置文件中的 ）

泛指各种组件，就是说当我们的类不属于各种归类的时候（不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类。

###### 3.给你一个联合索引ABC，查询条件为A=1,B>2,C=3，问你这个索引有没有被用到？

最左侧a=某某，后面列大于小于无所谓，都使用索引（但后面必须 and and ）

```sql
a = 1 AND b < 2 AND c = 3 使用索引
a = 1 AND c = 2 AND b < 3 使用索引
a = 1 AND b < 2 使用索引
a = 1 AND b <> 2 AND c = 3 使用索引
// 可以说 OR一出现就不使用
a = 1 AND b < 2 OR c = 2 未使用索引
```



###### 4.mysql是如何实现事务的（redo log，undo log和锁）

1.redo log通常是物理日志，记录的是数据页的物理修改，而不是某一行或某几行修改成怎样怎样，它用来恢复提交后的物理数据页(恢复数据页，且只能恢复到最后一次提交的位置)。

2.undo用来回滚行记录到某个版本。undo log一般是逻辑日志，根据每行记录进行记录。

undo log有两个作用：提供回滚和多个行版本控制(MVCC)。

###### 5.手写生产者、消费者模型

```java
public class ProducerAndConsumerByLock {
    private static int count = 0;
    private int maxNum = 3;
    ReentrantLock lock = new ReentrantLock();
    Condition producerCondition = lock.newCondition();
    Condition consumerCondition = lock.newCondition();

    public static void main(String[] args) {
        ProducerAndConsumerByLock test = new ProducerAndConsumerByLock();

        new Thread(test.new Producer()).start();
        new Thread(test.new Producer()).start();

        new Thread(test.new Consumer()).start();
        new Thread(test.new Consumer()).start();
    }

    class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //获取锁
                lock.lock();
                try {
//                    while (getCount() == maxNum) {
//                        producerCondition.await();
//                        System.out.println("生产能力达到上限，进入等待状态");
//                    }
                    count++;
                    System.out.println(Thread.currentThread().getName()
                            + "生产者生产，目前总共有" + count);
                    //唤醒消费者
                    consumerCondition.signal();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    //获取锁
                    lock.unlock();
                }
            }
        }
    }

    class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.lock();
                try {
//                    while (count == 0) {
//                        consumerCondition.await();
//                    }

                    count--;
                    System.out.println(Thread.currentThread().getName()
                            + "消费者消费，目前总共有" + count);
                    //唤醒生产者
                    producerCondition.signal();

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
```