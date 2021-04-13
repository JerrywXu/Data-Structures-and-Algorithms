合并两个有序链表

```java
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }
}

```

合并两个有序数组

```java
//双指针从前往后
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    // Make a copy of nums1.
    int [] nums1_copy = new int[m];
    System.arraycopy(nums1, 0, nums1_copy, 0, m);

    // Two get pointers for nums1_copy and nums2.
    int p1 = 0;
    int p2 = 0;

    // Set pointer for nums1
    int p = 0;

    // Compare elements from nums1_copy and nums2
    // and add the smallest one into nums1.
    while ((p1 < m) && (p2 < n))
      nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];

    // if there are still elements to add
    if (p1 < m)
      System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
    if (p2 < n)
      System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
  }
}

//备用方法
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    System.arraycopy(nums2, 0, nums1, m, n);
    Arrays.sort(nums1);
  }
}
```



链表倒数第k个点

```java
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
        for(int i = 0; i < k; i++)
            former = former.next;
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
```



