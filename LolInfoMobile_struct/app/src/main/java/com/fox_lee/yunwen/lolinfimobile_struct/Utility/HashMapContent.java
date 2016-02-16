package com.fox_lee.yunwen.lolinfimobile_struct.Utility;

/**
 * Created by Yunwen on 2/15/2016.
 */
import java.util.*;

public class HashMapContent {

        private static HashMap map = new HashMap();

        public HashMapContent(){
            //this.map = map;
            this.map.put("Basics", "第一节主要总结一些算法要数据结构方面的基础知识，如基本的数据结构和基础算法。\n" +
                    "\n" +
                    "本节主要由以下章节构成。");
                this.map.put("Reference", "VisuAlgo - visualising data structures and algorithms through animation - 相当碉堡的数据结构和算法可视化。 * Data Structure Visualization - 相当碉堡的动画演示！！涵盖了常用的各种数据结构/排序/算法。");
                this.map.put("Linked List", "链表是线性表的一种。线性表是最基本、最简单、也是最常用的一种数据结构。线性表中数据元素之间的关系是一对一的关系，即除了第一个和最后一个数据元素之外，其它数据 元素都是首尾相接的。线性表有两种存储方式，一种是顺序存储结构，另一种是链式存储结构。我们常用的数组就是一种典型的顺序存储结构。\n" +
                    "\n" +
                    "相反，链式存储结构就是两个相邻的元素在内存中可能不是相邻的，每一个元素都有一个指针域，指针域一般是存储着到下一个元素的指针。这种存储方式的优点是插入 和删除的时间复杂度为 O(1)，不会浪费太多内存，添加元素的时候才会申请内存，删除元素会释放内存。缺点是访问的时间复杂度最坏为 O(n)。\n" +
                    "\n" +
                    "顺序表的特性是随机读取，也就是访问一个元素的时间复杂度是O(1)，链式表的特性是插入和删除的时间复杂度为O(1)。\n" +
                    "\n" +
                    "链表就是链式存储的线性表。根据指针域的不同，链表分为单向链表、双向链表、循环链表等等。链表的基本操作\n" +
                    "\n" +
                    "反转链表\n" +
                    "\n" +
                    "链表的基本形式是：1 -> 2 -> 3 -> null，反转需要变为 3 -> 2 -> 1 -> null。这里要注意：\n" +
                    "\n" +
                    "访问某个节点 curt.next 时，要检验 curt 是否为 null。\n" +
                    "要把反转后的最后一个节点（即反转前的第一个节点）指向 null。\n" +
                    "public ListNode reverse(ListNode head) {\n" +
                    "    ListNode prev = null;\n" +
                    "    while (head != null) {\n" +
                    "        ListNode next = head.next;\n" +
                    "        head.next = prev;\n" +
                    "        prev = head;\n" +
                    "        head = next;\n" +
                    "    }\n" +
                    "    return prev;\n" +
                    "}\n" +
                    "删除链表中的某个节点\n" +
                    "\n" +
                    "删除链表中的某个节点一定需要知道这个点的前继节点，所以需要一直有指针指向前继节点。\n" +
                    "\n" +
                    "然后只需要把 prev -> next = prev -> next -> next 即可。但是由于链表表头可能在这个过程中产生变化，导致我们需要一些特别的技巧去处理这种情况。就是下面提到的 Dummy Node。\n" +
                    "\n" +
                    "链表指针的鲁棒性\n" +
                    "\n" +
                    "综合上面讨论的两种基本操作，链表操作时的鲁棒性问题主要包含两个情况：\n" +
                    "\n" +
                    "当访问链表中某个节点 curt.next 时，一定要先判断 curt 是否为 null。\n" +
                    "全部操作结束后，判断是否有环；若有环，则置其中一端为 null。\n" +
                    "Dummy Node\n" +
                    "\n" +
                    "Dummy node 是链表问题中一个重要的技巧，中文翻译叫“哑节点”或者“假人头结点”。\n" +
                    "\n" +
                    "Dummy node 是一个虚拟节点，也可以认为是标杆节点。Dummy node 就是在链表表头 head 前加一个节点指向 head，即 dummy -> head。Dummy node 的使用多针对单链表没有前向指针的问题，保证链表的 head 不会在删除操作中丢失。除此之外，还有一种用法比较少见，就是使用 dummy node 来进行head的删除操作，比如 Remove Duplicates From Sorted List II，一般的方法current = current.next 是无法删除 head 元素的，所以这个时候如果有一个dummy node在head的前面。\n" +
                    "\n" +
                    "所以，当链表的 head 有可能变化（被修改或者被删除）时，使用 dummy node 可以很好的简化代码，最终返回 dummy.next 即新的链表。\n" +
                    "\n" +
                    "快慢指针\n" +
                    "\n" +
                    "快慢指针也是一个可以用于很多问题的技巧。所谓快慢指针中的快慢指的是指针向前移动的步长，每次移动的步长较大即为快，步长较小即为慢，常用的快慢指针一般是在单链表 中让快指针每次向前移动2，慢指针则每次向前移动1。快慢两个指针都从链表头开始遍历，于是快指针到达链表末尾的时候慢指针刚好到达中间位置，于是可以得到中间元素的 值。快慢指针在链表相关问题中主要有两个应用：\n" +
                    "\n" +
                    "快速找出未知长度单链表的中间节点 设置两个指针 *fast、*slow 都指向单链表的头节点，其中*fast的移动速度是*slow的2倍，当*fast指向末尾节点的时候，slow正好就在中间了。\n" +
                    "判断单链表是否有环 利用快慢指针的原理，同样设置两个指针 *fast、*slow 都指向单链表的头节点，其中 *fast的移动速度是*slow的2倍。如果 *fast = NULL，说明该单链表 以 NULL结尾，不是循环链表；如果 *fast = *slow，则快指针追上慢指针，说明该链表是循环链表。");
                this.map.put("Binary Tree", "二叉树是每个节点最多有两个子树的树结构，子树有左右之分，二叉树常被用于实现二叉查找树和二叉堆。\n" +
                    "\n" +
                    "二叉树的第i层至多有 2\u200Bi−1\u200B\u200B 个结点；深度为k的二叉树至多有 2\u200Bk\u200B\u200B−1 个结点；对任何一棵二叉树T，如果其终端结点数为 n\u200B0\u200B\u200B, 度为2的结点数为 n\u200B2\u200B\u200B, 则 n\u200B0\u200B\u200B=n\u200B2\u200B\u200B+1。\n" +
                    "\n" +
                    "一棵深度为 k, 且有 2\u200Bk\u200B\u200B−1 个节点称之为满二叉树；深度为 k，有 n 个节点的二叉树，当且仅当其每一个节点都与深度为 k 的满二叉树中，序号为 1 至 n 的节点对应时，称之为完全二叉树。完全二叉树中重在节点标号对应。\n" +
                    "\n" +
                    "树的遍历\n" +
                    "\n" +
                    "从二叉树的根节点出发，节点的遍历分为三个主要步骤：对当前节点进行操作（称为“访问”节点，或者根节点）、遍历左边子节点、遍历右边子节点。访问节点顺序的不同也就 形成了不同的遍历方式。需要注意的是树的遍历通常使用递归的方法进行理解和实现，在访问元素时也需要使用递归的思想去理解。\n" +
                    "\n" +
                    "按照访问根元素(当前元素)的前后顺序，遍历方式可划分为如下几种：\n" +
                    "\n" +
                    "深度优先：先访问子节点，再访问父节点，最后访问第二个子节点。根据根节点相对于左右子节点的访问先后顺序又可细分为以下三种方式。\n" +
                    "前序(pre-order)：先根后左再右\n" +
                    "中序(in-order)：先左后根再右\n" +
                    "后序(post-order)：先左后右再根\n" +
                    "广度优先：先访问根节点，沿着树的宽度遍历子节点，直到所有节点均被访问为止。\n" +
                    "如下图所示，遍历顺序在右侧框中，红色A为根节点。使用递归和整体的思想去分析遍历顺序较为清晰。\n" +
                    "\n" +
                    "二叉树的广度优先遍历和树的前序/中序/后序遍历不太一样，前/中/后序遍历使用递归，也就是栈的思想对二叉树进行遍历，广度优先一般使用队列的思想对二叉树进行遍历 。相关算法——递归法遍历\n" +
                    "\n" +
                    "相关算法——分治法（Divide & Conquer)\n" +
                    "\n" +
                    "在计算机科学中，分治法是一种很重要的算法。分治法即“分而治之”，把一个复杂的问题分成两个或更多的相同或相似的子问题，再把子问题分成更小的子问题……直到最后子 问题可以简单的直接求解，原问题的解即子问题的解的合并。这个思想是很多高效算法的基础，如排序算法（快速排序，归并排序）等。\n" +
                    "\n" +
                    "分治法思想\n" +
                    "\n" +
                    "分治法所能解决的问题一般具有以下几个特征：\n" +
                    "\n" +
                    "问题的规模缩小到一定的程度就可以容易地解决。\n" +
                    "问题可以分解为若干个规模较小的相同问题，即该问题具有最优子结构性质。\n" +
                    "利用该问题分解出的子问题的解可以合并为该问题的解。\n" +
                    "该问题所分解出的各个子问题是相互独立的，即子问题之间不包含公共的子问题。\n" +
                    "分治法的三个步骤是：\n" +
                    "\n" +
                    "分解（Divide）：将原问题分解为若干子问题，这些子问题都是原问题规模较小的实例。\n" +
                    "解决（Conquer）：递归地求解各子问题。如果子问题规模足够小，则直接求解。\n" +
                    "合并（Combine）：将所有子问题的解合并为原问题的解。\n" +
                    "分治法的经典题目：\n" +
                    "\n" +
                    "二分搜索\n" +
                    "大整数乘法\n" +
                    "Strassen矩阵乘法\n" +
                    "棋盘覆盖\n" +
                    "归并排序\n" +
                    "快速排序\n" +
                    "循环赛日程表\n" +
                    "汉诺塔\n" +
                    "树类题的复杂度分析\n" +
                    "\n" +
                    "对树相关的题进行复杂度分析时可统计对每个节点被访问的次数，进而求得总的时间复杂度。");
                this.map.put("Binary Search Tree", "定义：\n" +
                    "\n" +
                    "一颗二叉查找树(BST)是一颗二叉树，其中每个节点都含有一个可进行比较的键及相应的值，且每个节点的键都大于等于左子树中的任意节点的键，而 小于右子树中的任意节点的键。\n" +
                    "\n" +
                    "使用中序遍历可得到有序数组，这是二叉查找树的又一个重要特征。\n" +
                    "\n" +
                    "二叉查找树使用的每个节点含有两个链接，它是将链表插入的灵活性和有序数组查找的高效性结合起来的高效符号表实现。\n" +
                    "\n" +
                    "二叉树中每个节点只能有一个父节点(根节点无父节点)，只有左右两个链接，分别为左子节点和右子节点。\n" +
                    "\n" +
                    "基本实现\n" +
                    "\n" +
                    "节点包含\n" +
                    "\n" +
                    "一个键\n" +
                    "一个值\n" +
                    "一条左链接\n" +
                    "一条右链接");
                this.map.put("Huffman Compression", "主要思想：放弃文本文件的普通保存方式：不再使用7位或8位二进制数表示每一个字符，而是用较少的比特表示出现频率最高的字符，用较多的比特表示出现频率低的字符 。\n" +
                    "\n" +
                    "使用变长编码来表示字符串，势必会导致编解码时码字的唯一性问题，因此需要一种编解码方式唯一的前缀码，而表示前缀码的一种简单方式就是使用单词查找树，其中最优前缀 码即为Huffman首创。\n" +
                    "\n" +
                    "以符号F, O, R, G, E, T为例，其出现的频次如以下表格所示。\n" +
                    "\n" +
                    "Symbol\tF\tO\tR\tG\tE\tT\n" +
                    "Frequence\t2\t3\t4\t4\t5\t7\n" +
                    "Code\t000\t001\t100\t101\t01\t10\n" +
                    "则对各符号进行霍夫曼编码的动态演示如下图所示。基本步骤是将出现频率由小到大排列，组成子树后频率相加作为整体再和其他未加入二叉树中的节点频率比较。加权路径长为 节点的频率乘以树的深度。有关霍夫曼编码的具体步骤可参考 Huffman 编码压缩算法 | 酷 壳 - CoolShell.cn 和 [霍夫曼编码 - 维基百科，自由的百科全书] (http://zh.wikipedia.org/wiki/%E9%9C%8D%E5%A4%AB%E6%9B%BC%E7%BC%96%E7%A0%81)，清 晰易懂。");
                this.map.put("Priority Queue", "应用程序常常需要处理带有优先级的业务，优先级最高的业务首先得到服务。因此优先队列这种数据结构应运而生。优先队列中的每个元素都有各自的优先级，优先级最高的元素 最先得到服务；优先级相同的元素按照其在优先队列中的顺序得到服务。\n" +
                    "\n" +
                    "优先队列可以使用数组或链表实现，从时间和空间复杂度来说，往往用堆来实现。\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "優先佇列 - 维基百科，自由的百科全书");
                this.map.put("Bubble Sort", "核心：冒泡，持续比较相邻元素，大的挪到后面，因此大的会逐步往后挪，故称之为冒泡。以上排序过程使用 Python 实现如下所示：\n" +
                    "\n" +
                    "#!/usr/bin/env python\n" +
                    "\n" +
                    "\n" +
                    "def bubbleSort(alist):\n" +
                    "    for i in xrange(len(alist)):\n" +
                    "        print(alist)\n" +
                    "        for j in xrange(1, len(alist) - i):\n" +
                    "            if alist[j - 1] > alist[j]:\n" +
                    "                alist[j - 1], alist[j] = alist[j], alist[j - 1]\n" +
                    "\n" +
                    "    return alist\n" +
                    "\n" +
                    "unsorted_list = [6, 5, 3, 1, 8, 7, 2, 4]\n" +
                    "print(bubbleSort(unsorted_list))\n" +
                    "Reference\n" +
                    "\n" +
                    "冒泡排序 - 维基百科，自由的百科全书");
                this.map.put("Selection Sort", "核心：不断地选择剩余元素中的最小者。\n" +
                    "\n" +
                    "找到数组中最小元素并将其和数组第一个元素交换位置。\n" +
                    "在剩下的元素中找到最小元素并将其与数组第二个元素交换，直至整个数组排序。\n" +
                    "下图来源为 File:Selection-Sort-Animation.gif - IB Computer Science以上排序过程使用 Python 实现如下所示：\n" +
                    "\n" +
                    "#!/usr/bin/env python\n" +
                    "\n" +
                    "\n" +
                    "def selectionSort(alist):\n" +
                    "    for i in xrange(len(alist)):\n" +
                    "        print(alist)\n" +
                    "        min_index = i\n" +
                    "        for j in xrange(i + 1, len(alist)):\n" +
                    "            if alist[j] < alist[min_index]:\n" +
                    "                min_index = j\n" +
                    "        alist[min_index], alist[i] = alist[i], alist[min_index]\n" +
                    "    return alist\n" +
                    "\n" +
                    "unsorted_list = [8, 5, 2, 6, 9, 3, 1, 4, 0, 7]\n" +
                    "print(selectionSort(unsorted_list))\n" +
                    "性质：\n" +
                    "\n" +
                    "比较次数=(N-1)+(N-2)+(N-3)+...+2+1~N^2/2\n" +
                    "交换次数=N\n" +
                    "运行时间与输入无关\n" +
                    "数据移动最少\n" +
                    "Reference\n" +
                    "\n" +
                    "选择排序 - 维基百科，自由的百科全书 * The Selection Sort — Problem Solving with Algorithms and Data Structures");
                this.map.put("Insertion Sort", "核心：通过构建有序序列，对于未排序序列，从后向前扫描，找到相应位置并插入。实现上通常使用in-place排序(需用到O(1)的额外空间)\n" +
                    "\n" +
                    "从第一个元素开始，该元素可认为已排序\n" +
                    "取下一个元素，对已排序数组从后往前扫描\n" +
                    "若从排序数组中取出的元素大于新元素，则移至下一位置\n" +
                    "重复步骤3，直至找到已排序元素小于或等于新元素的位置\n" +
                    "插入新元素至该位置\n" +
                    "重复2~5以上排序过程使用 Python 实现如下所示：\n" +
                    "\n" +
                    "#!/usr/bin/env python\n" +
                    "\n" +
                    "\n" +
                    "def insertionSort(alist):\n" +
                    "    for i, item_i in enumerate(alist):\n" +
                    "        print alist\n" +
                    "        index = i\n" +
                    "        while index > 0 and alist[index - 1] > item_i:\n" +
                    "            alist[index] = alist[index - 1]\n" +
                    "            index -= 1\n" +
                    "\n" +
                    "        alist[index] = item_i\n" +
                    "\n" +
                    "    return alist\n" +
                    "\n" +
                    "unsorted_list = [6, 5, 3, 1, 8, 7, 2, 4]\n" +
                    "print(insertionSort(unsorted_list))\n" +
                    "实现(C++)：\n" +
                    "\n" +
                    "template\n" +
                    "void insertion_sort(T arr[], int len) {\n" +
                    "    int i, j;\n" +
                    "    T temp;\n" +
                    "    for (int i = 1; i < len; i++) {\n" +
                    "        temp = arr[i];\n" +
                    "        for (int j = i - 1; j >= 0 && arr[j] > temp; j--) {\n" +
                    "            a[j + 1] = a[j];\n" +
                    "        }\n" +
                    "        arr[j + 1] = temp;\n" +
                    "    }\n" +
                    "}\n" +
                    "性质：\n" +
                    "\n" +
                    "交换操作和数组中导致的数量相同\n" +
                    "比较次数>=倒置数量，<=倒置的数量加上数组的大小减一\n" +
                    "每次交换都改变了两个顺序颠倒的元素的位置，即减少了一对倒置，倒置数量为0时即完成排序。\n" +
                    "每次交换对应着一次比较，且1到N-1之间的每个i都可能需要一次额外的记录(a[i]未到达数组左端时)\n" +
                    "最坏情况下需要~N^2/2次比较和~N^2/2次交换，最好情况下需要N-1次比较和0次交换。\n" +
                    "平均情况下需要~N^2/4次比较和~N^2/4次交换\n" +
                    "希尔排序\n" +
                    "\n" +
                    "核心：基于插入排序，使数组中任意间隔为h的元素都是有序的，即将全部元素分为h个区域使用插入排序。其实现可类似于插入排序但使用不同增量。更高效的原因是它权衡了 子数组的规模和有序性。\n" +
                    "\n" +
                    "实现(C++):\n" +
                    "\n" +
                    "template\n" +
                    "void shell_sort(T arr[], int len) {\n" +
                    "    int gap, i, j;\n" +
                    "    T temp;\n" +
                    "    for (gap = len >> 1; gap > 0; gap >>= 1)\n" +
                    "        for (i = gap; i < len; i++) {\n" +
                    "            temp = arr[i];\n" +
                    "            for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap)\n" +
                    "                arr[j + gap] = arr[j];\n" +
                    "            arr[j + gap] = temp;\n" +
                    "        }\n" +
                    "}\n" +
                    "Reference\n" +
                    "\n" +
                    "插入排序 - 维基百科，自由的百科全书 * 希尔排序 - 维基百科，自由的百科全书\n" +
                    "The Insertion Sort — Problem Solving with Algorithms and Data Structures");
                this.map.put("Merge Sort", "核心：将两个有序对数组归并成一个更大的有序数组。通常做法为递归排序，并将两个不同的有序数组归并到第三个数组中。\n" +
                    "\n" +
                    "先来看看动图，归并排序是一种典型的分治应用。#!/usr/bin/env python\n" +
                    "\n" +
                    "\n" +
                    "class Sort:\n" +
                    "    def mergeSort(self, alist):\n" +
                    "        if len(alist) <= 1:\n" +
                    "            return alist\n" +
                    "\n" +
                    "        mid = len(alist) / 2\n" +
                    "        left = self.mergeSort(alist[:mid])\n" +
                    "        print(\"left = \" + str(left))\n" +
                    "        right = self.mergeSort(alist[mid:])\n" +
                    "        print(\"right = \" + str(right))\n" +
                    "        return self.mergeSortedArray(left, right)\n" +
                    "\n" +
                    "    #@param A and B: sorted integer array A and B.\n" +
                    "    #@return: A new sorted integer array\n" +
                    "    def mergeSortedArray(self, A, B):\n" +
                    "        sortedArray = []\n" +
                    "        l = 0\n" +
                    "        r = 0\n" +
                    "        while l < len(A) and r < len(B):\n" +
                    "            if A[l] < B[r]:\n" +
                    "                sortedArray.append(A[l])\n" +
                    "                l += 1\n" +
                    "            else:\n" +
                    "                sortedArray.append(B[r])\n" +
                    "                r += 1\n" +
                    "        sortedArray += A[l:]\n" +
                    "        sortedArray += B[r:]\n" +
                    "\n" +
                    "        return sortedArray\n" +
                    "\n" +
                    "unsortedArray = [6, 5, 3, 1, 8, 7, 2, 4]\n" +
                    "merge_sort = Sort()\n" +
                    "print(merge_sort.mergeSort(unsortedArray))\n" +
                    "原地归并\n" +
                    "\n" +
                    "辅助函数：用于将已排序好的两个数组归并。\n" +
                    "\n" +
                    "merge(Comaprable[] a, int lo, int mid, int hi)\n" +
                    "{   //将a[lo..mid] 和 a[mid+1..hi] 归并\n" +
                    "    int i = lo, j = mid + 1;\n" +
                    "\n" +
                    "    // 拷贝a[lo..hi]原数组至aux中\n" +
                    "    for (int k = lo; k <= hi; k++) {\n" +
                    "        aux[k] = a[k];\n" +
                    "    }\n" +
                    "\n" +
                    "    for (int k = lo; k <= hi; k++) {\n" +
                    "        if (i > mid) { //左半边用尽，取右半边元素\n" +
                    "            a[k] = aux[j++];\n" +
                    "        } else if (j > hi) { //右半边用尽，取左半边元素\n" +
                    "            a[k] = aux[i++];\n" +
                    "        } else if (less(aux[j], aux[i])) { //右半边的当前元素小于左半边的当前元素，取右半边的元素\n" +
                    "            a[k] = aux[j++];\n" +
                    "        } else { //右半边的当前元素大于等于左半边的当前元素，取左半边的元素\n" +
                    "            a[k] = aux[i++];\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "时间复杂度为NlogN，但是空间复杂度为N。\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "Mergesort - Robert Sedgewick 的大作，非常清晰。");

                this.map.put("Quick Sort", "核心：快排是一种采用分治思想的排序算法，大致分为三个步骤。\n" +
                    "\n" +
                    "定基准——首先随机选择一个元素最为基准\n" +
                    "划分区——所有比基准小的元素置于基准左侧，比基准大的元素置于右侧，\n" +
                    "递归调用——递归地调用此切分过程。\n" +
                    "递归实现\n" +
                    "\n" +
                    "容易实现和理解的一个方法是采用递归，Python 的实现如下所示：\n" +
                    "\n" +
                    "#!/usr/bin/env python\n" +
                    "\n" +
                    "\n" +
                    "def qsort(alist):\n" +
                    "    print(alist)\n" +
                    "    if len(alist) <= 1:\n" +
                    "        return alist\n" +
                    "    else:\n" +
                    "        pivot = alist[0]\n" +
                    "        return qsort([x for x in alist[1:] if x < pivot]) + \\\n" +
                    "               [pivot] + \\\n" +
                    "               qsort([x for x in alist[1:] if x >= pivot])\n" +
                    "\n" +
                    "unsortedArray = [6, 5, 3, 1, 8, 7, 2, 4]\n" +
                    "print(qsort(unsortedArray))\n" +
                    "输出如下所示：\n" +
                    "\n" +
                    "[6, 5, 3, 1, 8, 7, 2, 4]\n" +
                    "[5, 3, 1, 2, 4]\n" +
                    "[3, 1, 2, 4]\n" +
                    "[1, 2]\n" +
                    "[]\n" +
                    "[2]\n" +
                    "[4]\n" +
                    "[]\n" +
                    "[8, 7]\n" +
                    "[7]\n" +
                    "[]\n" +
                    "[1, 2, 3, 4, 5, 6, 7, 8]\n" +
                    "递归 + not-in-place 的实现虽然简单易懂，但是如此一来『快速排序』便不再是『最快』的排序算法了，因为递归调用过程中空间复杂度颇高。\n" +
                    "\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "在最好情况下，快速排序的基准元素正好是整个数组的中位数，可以近似为二分，那么最好情况下递归的层数为 logn, 咋看一下每一层的元素个数都是 n, 那么空间复杂度为 O(n) 无疑了，不过这只答对了一半，从结论上来看是对的，但分析方法是错的。\n" +
                    "\n" +
                    "首先来看看什么叫空间复杂度——简单来讲可以认为是程序在运行过程中所占用的存储空间大小。那么对于递归的 out-in-place 调用而言，排除函数调用等栈空 间，最好情况下，每往下递归调用一层，所需要的存储空间是上一层中的一半。完成最底层的调用后即向上返回执行出栈操作，故并不需要保存每层所有元素的值。所以 需要的总的存储空间就是 ∑\u200Bi=0\u200B\u200B\u200B\u200B2\u200Bi\u200B\u200B\u200B\u200Bn\u200B\u200B=2n\n" +
                    "\n" +
                    "不是特别理解的可以结合下图的非严格分析和上面 Python 的代码，递归调用的第一层保存8个元素的值，那么第二层调用时实际需要保存的其实仅为4个元素，逐层往下递归，而不是自左向右保存每一层的所有元素。\n" +
                    "\n" +
                    "那么在最坏情况下 out-in-place 需要耗费多少额外空间呢？最坏情况下第 i 层需要 i−1 次交换，故总的空间复杂度：\n" +
                    "\n" +
                    "∑\u200Bi=0\u200Bn\u200B\u200B(n−i+1)=O(n\u200B2\u200B\u200B)in-place - 原地快排\n" +
                    "\n" +
                    "先来一张动图看看快速排序的过程。选中3作为基准\n" +
                    "lo指针指向元素6, hi指针指向4, 移动lo直至其指向的元素大于等于3, 移动hi直至其指向的元素小于3。找到后交换lo和hi指向的元素——交换元素6和2。\n" +
                    "lo递增，hi递减，重复步骤2，此时lo指向元素为5, hi指向元素为1. 交换元素。\n" +
                    "lo递增，hi递减，发现其指向元素相同，此轮划分结束。递归排序元素3左右两边的元素。\n" +
                    "与归并排序的区别：\n" +
                    "\n" +
                    "归并排序将数组分成两个子数组分别排序，并将有序的子数组归并以将整个数组排序。递归调用发生在处理整个数组之前。\n" +
                    "快速排序将一个数组分成两个子数组并对这两个子数组独立地排序，两个子数组有序时整个数组也就有序了。递归调用发生在处理整个数组之后。\n" +
                    "Robert Sedgewick 在其网站上对 Quicksort 做了较为完整的介绍，建议去围观下。\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "快速排序 - 维基百科，自由的百科全书 * Quicksort | Robert Sedgewick");
                this.map.put("Heap Sort", "特点：唯一能够同时最优地利用空间和时间的方法——最坏情况下也能保证使用2NlogN次比较和恒定的额外空间。\n" +
                    "\n" +
                    "在空间比较小(嵌入式设备和手机)时特别有用，但是因为现代系统往往有较多的缓存，堆排序无法有效利用缓存，数组元素很少和相邻的其他元素比较，故缓存未命中的概率远 大于其他在相邻元素间比较的算法。\n" +
                    "\n" +
                    "但是在海量数据的排序下又重新发挥了重要作用，因为它在插入操作和删除最大元素的混合动态场景中能保证对数级别的运行时间。TopM\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "堆排序 - 维基百科，自由的百科全书 * Priority Queues - Robert Sedgewick 的大作，详解了关于堆的操作。\n" +
                    "经典排序算法总结与实现 | Jark's Blog - 堆排序讲的很好。");
                this.map.put("Bucket Sort", "Bucket Sort\n" +
                    "桶排序和归并排序有那么点点类似，也使用了归并的思想。大致步骤如下：\n" +
                    "\n" +
                    "设置一个定量的数组当作空桶。\n" +
                    "Divide - 从待排序数组中取出元素，将元素按照一定的规则塞进对应的桶子去。\n" +
                    "对每个非空桶进行排序，通常可在塞元素入桶时进行插入排序。\n" +
                    "Conquer - 从非空桶把元素再放回原来的数组中。\n" +
                    "Reference\n" +
                    "\n" +
                    "Bucket Sort Visualization - 动态演示。 * 桶排序 - 维基百科，自由的百科全书");
                this.map.put("Counting Sort", "Counting Sort\n" +
                    "计数排序，顾名思义，就是对待排序数组按元素进行计数。使用前提是需要先知道待排序数组的元素范围，将这些一定范围的元素置于新数组中，新数组的大小为待排序数组中最 大元素与最小元素的差值。\n" +
                    "\n" +
                    "维基上总结的四个步骤如下：\n" +
                    "\n" +
                    "定新数组大小——找出待排序的数组中最大和最小的元素\n" +
                    "统计次数——统计数组中每个值为i的元素出现的次数，存入新数组C的第i项\n" +
                    "对统计次数逐个累加——对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）\n" +
                    "反向填充目标数组——将每个元素i放在新数组的第C(i)项，每放一个元素就将C(i)减去1\n" +
                    "其中反向填充主要是为了避免重复元素落入新数组的同一索引处。\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "计数排序 - 维基百科，自由的百科全书 - 中文版的维基感觉比英文版的好理解些。 * Counting Sort Visualization - 动画真心不错~ 结合着看一遍就理解了。");
//                this.map.put("Bit Manipulation", "");
//                this.map.put("Part II - Coding", "");
//                this.map.put("strStr", "");
//                this.map.put("Two Strings Are Anagrams", "");
//                this.map.put("Compare Strings", "");
//                this.map.put("Anagrams", "");
//
//                this.map.put("Longest Common Substring", "");
//                this.map.put("Remove Element", "");
//            map.put("Zero Sum Subarray", "");
//            map.put("Subarray Sum K", "");
//            map.put("Subarray Sum Closest", "");
//            map.put("Product of Array Exclude Itself", "");
//            map.put("Partition Array", "");
//            map.put("First Missing Positive", "");
//            map.put("2 Sum", "");
//            map.put("3 Sum", "");
//
//            map.put("3 Sum Closest", "");
//            map.put("Remove Duplicates from Sorted Array", "");
//            map.put("Remove Duplicates from Sorted Array II", "");
//            map.put("Merge Sorted Array", "");
//            map.put("Merge Sorted Array II", "");
//            map.put("Binary Search", "");
//            map.put("Search Insert Position", "");
//            map.put("Search for a Range", "");
//            map.put("First Bad Version", "");
//            map.put("Search a 2D Matrix", "");
//
//            map.put("Find Peak Element", "");
//            map.put("Search in Rotated Sorted Array", "");
//            map.put("Find Minimum in Rotated Sorted Array", "");
//            map.put("Search a 2D Matrix II", "");
//            map.put("Median of two Sorted Arrays", "");
//            map.put("Sqrt x", "");
//            map.put("Wood Cut", "");
//            map.put("Single Number", "");
//            map.put("Single Number II", "");
//            map.put("Single Number III", "");
//
//            map.put("O(1) Check Power of 2", "");
//            map.put("Convert Integer A to Integer B", "");
//            map.put("Factorial Trailing Zeroes", "");
//            map.put("Remove Duplicates from Sorted List", "");
//            map.put("Remove Duplicates from Sorted List II", "");
//            map.put("Partition List", "");
//            map.put("Two Lists Sum", "");
//            map.put("Two Lists Sum Advanced", "");
//            map.put("Remove Nth Node From End of List", "");
//            map.put("Linked List Cycle", "");
//
//            map.put("Linked List Cycle II", "");
//            map.put("Reverse Linked List", "");
//            map.put("Reverse Linked List II", "");
//            map.put("Merge Two Sorted Lists", "");
//            map.put("Merge k Sorted Lists", "");
//            map.put("Sort List", "");
//            map.put("Reorder List", "");
//            map.put("Recover Rotated Sorted Array", "");
//            map.put("Rotate String", "");
//            map.put("Reverse Words in a String", "");
//
//            map.put("Binary Tree Preorder Traversal", "");
//            map.put("Binary Tree Inorder Traversal", "");
//            map.put("Binary Tree Postorder Traversal", "");
//            map.put("Binary Tree Level Order Traversal", "");
//            map.put("Maximum Depth of Binary Tree", "");
//            map.put("Balanced Binary Tree", "");
//            map.put("Binary Tree Maximum Path Sum", "");
//            map.put("Lowest Common Ancestor", "");
//            map.put("Insert Node in a Binary Search Tree", "");
//            map.put("Validate Binary Search Tree", "");
//
//            map.put("Search Range in Binary Search Tree", "");
//            map.put("Convert Sorted Array to Binary Search Tree", "");
//            map.put("Convert Sorted List to Binary Search Tree", "");
//            map.put("Binary Search Tree Iterator", "");
//            map.put("Subsets", "");
//            map.put("Permutation", "");
//            map.put("Triangle", "");
//            map.put("Knapsack", "");
//            map.put("Backpack", "");
//            map.put("Matrix", "");
//
//            map.put("Minimum Path Sum", "");
//            map.put("Unique Paths", "");
//            map.put("Sequence", "");
//            map.put("Climbing Stairs", "");
//            map.put("Jump Game", "");
//            map.put("", "");
//            map.put("", "");
//            map.put("", "");
//            map.put("", "");
//            map.put("", "");
//
//            map.put("", "");
//            map.put("", "");
//            map.put("", "");
//            map.put("", "");
        }

        public HashMap getAir() {
            return this.map;
        }

        public void setAir(HashMap map) {
            this.map = map;
        }
}
