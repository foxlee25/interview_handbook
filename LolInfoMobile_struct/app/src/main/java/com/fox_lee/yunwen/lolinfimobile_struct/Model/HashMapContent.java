package com.fox_lee.yunwen.lolinfimobile_struct.Model;

/**
 * Created by Yunwen on 2/15/2016.
 */
import java.util.*;

public class HashMapContent {

        private static HashMap map = new HashMap();

        public HashMapContent(){

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
                this.map.put("Bit Manipulation", "位操作有按位与、或、非、左移n位和右移n位等操作。\n" +
                        "\n" +
                        "XOR - 异或\n" +
                        "\n" +
                        "异或：相同为0，不同为1。也可用「不进位加法」来理解。\n" +
                        "异或操作的一些特点：\n" +
                        "\n" +
                        "x ^ 0 = x\n" +
                        "x ^ 1s = ~x // 1s = ~0\n" +
                        "x ^ (~x) = 1s\n" +
                        "x ^ x = 0 // interesting and important!\n" +
                        "a ^ b = c => a ^ c = b, b ^ c = a // swap\n" +
                        "a ^ b ^ c = a ^ (b ^ c) = (a ^ b) ^ c // associative\n" +
                        "移位操作\n" +
                        "\n" +
                        "移位操作可近似为乘以/除以2的幂。0b0010 * 0b0110等价于0b0110 << 2. 下面是一些常见的移位组合操作。\n" +
                        "\n" +
                        "将x最右边的n位清零 - x & (~0 << n)\n" +
                        "获取x的第n位值(0或者1) - x & (1 << n)\n" +
                        "获取x的第n位的幂值 - (x >> n) & 1\n" +
                        "仅将第n位置为1 - x | (1 << n)\n" +
                        "仅将第n位置为0 - x & (~(1 << n))\n" +
                        "将x最高位至第n位(含)清零 - x & ((1 << n) - 1)\n" +
                        "将第n位至第0位(含)清零 - x & (~((1 << (n + 1)) - 1))\n" +
                        "仅更新第n位，写入值为v; v为1则更新为1，否则为0 - mask = ~(1 << n); x = (x & mask) | (v << i)\n" +
                        "Reference\n" +
                        "\n" +
                        "位运算简介及实用技巧（一）：基础篇 | Matrix67: The Aha Moments\n" +
                        "cc150 chapter 8.5 and chapter 9.5");
                this.map.put("Part II - Coding", "本节主要总结一些leetcode等题目的实战经验。\n" +
                        "\n" +
                        "主要有以下章节构成。");
                this.map.put("strStr", "leetcode: Implement strStr() | LeetCode OJ * lintcode: lintcode - (13) strstr\n" +
                        "strstr (a.k.a find sub string), is a useful function in string operation.\n" +
                        "You task is to implement this function.\n" +
                        "\n" +
                        "For a given source string and a target string,\n" +
                        "you should output the \"first\" index(from 0) of target string in source string.\n" +
                        "\n" +
                        "If target is not exist in source, just return -1.\n" +
                        "\n" +
                        "Example\n" +
                        "If source=\"source\" and target=\"target\", return -1.\n" +
                        "\n" +
                        "If source=\"abcdabcdefg\" and target=\"bcd\", return 1.\n" +
                        "\n" +
                        "Challenge\n" +
                        "O(n) time.\n" +
                        "\n" +
                        "Clarification\n" +
                        "Do I need to implement KMP Algorithm in an interview?\n" +
                        "\n" +
                        "    - Not necessary. When this problem occurs in an interview,\n" +
                        "    the interviewer just want to test your basic implementation ability.\n" +
                        "题解\n" +
                        "\n" +
                        "对于字符串查找问题，可使用双重for循环解决，效率更高的则为KMP算法。\n" +
                        "\n" +
                        "Java\n" +
                        "\n" +
                        "/**\n" +
                        " * http://www.jiuzhang.com//solutions/implement-strstr\n" +
                        " */\n" +
                        "class Solution {\n" +
                        "    /**\n" +
                        "     * Returns a index to the first occurrence of target in source,\n" +
                        "     * or -1  if target is not part of source.\n" +
                        "     * @param source string to be scanned.\n" +
                        "     * @param target string containing the sequence of characters to match.\n" +
                        "     */\n" +
                        "    public int strStr(String source, String target) {\n" +
                        "        if (source == null || target == null) {\n" +
                        "            return -1;\n" +
                        "        }\n" +
                        "\n" +
                        "        int i, j;\n" +
                        "        for (i = 0; i < source.length() - target.length() + 1; i++) {\n" +
                        "            for (j = 0; j < target.length(); j++) {\n" +
                        "                if (source.charAt(i + j) != target.charAt(j)) {\n" +
                        "                    break;\n" +
                        "                } //if\n" +
                        "            } //for j\n" +
                        "            if (j == target.length()) {\n" +
                        "                return i;\n" +
                        "            }\n" +
                        "        } //for i\n" +
                        "\n" +
                        "        // did not find the target\n" +
                        "        return -1;\n" +
                        "    }\n" +
                        "}\n" +
                        "源码分析\n" +
                        "\n" +
                        "边界检查：source和target有可能是空串。\n" +
                        "边界检查之下标溢出：注意变量i的循环判断条件，如果是单纯的i < source.length()则在后面的source.charAt(i + j)时有可能溢出。\n" +
                        "代码风格：（1）运算符==两边应加空格；（2）变量名不要起s1``s2这类，要有意义，如target``source；（3）即使if语句中只有一句话也要加大括号，即{return -1;}；（4）Java 代码的大括号一般在同一行右边，C++ 代码的大括号一般另起一行；（5）int i, j;声明前有一行空格，是好的代码风格。\n" +
                        "不要在for的条件中声明i,j，容易在循环外再使用时造成编译错误，错误代码示例：\n" +
                        "Another Similar Question\n" +
                        "\n" +
                        "/**\n" +
                        " * http://www.jiuzhang.com//solutions/implement-strstr\n" +
                        " */\n" +
                        "public class Solution {\n" +
                        "    public String strStr(String haystack, String needle) {\n" +
                        "        if(haystack == null || needle == null) {\n" +
                        "            return null;\n" +
                        "        }\n" +
                        "        int i, j;\n" +
                        "        for(i = 0; i < haystack.length() - needle.length() + 1; i++) {\n" +
                        "            for(j = 0; j < needle.length(); j++) {\n" +
                        "                if(haystack.charAt(i + j) != needle.charAt(j)) {\n" +
                        "                    break;\n" +
                        "                }\n" +
                        "            }\n" +
                        "            if(j == needle.length()) {\n" +
                        "                return haystack.substring(i);\n" +
                        "            }\n" +
                        "        }\n" +
                        "        return null;\n" +
                        "    }\n" +
                        "}");
                this.map.put("Two Strings Are Anagrams", "Source\n" +
                        "\n" +
                        "CC150: (158) Two Strings Are Anagrams\n" +
                        "Write a method anagram(s,t) to decide if two strings are anagrams or not.\n" +
                        "\n" +
                        "Example\n" +
                        "Given s=\"abcd\", t=\"dcab\", return true.\n" +
                        "\n" +
                        "Challenge\n" +
                        "O(n) time, O(1) extra space\n" +
                        "题解1 - hashmap 统计字频\n" +
                        "\n" +
                        "判断两个字符串是否互为变位词，若区分大小写，考虑空白字符时，直接来理解可以认为两个字符串的拥有各不同字符的数量相同。对于比较字符数量的问题常用的方法为遍历两 个字符串，统计其中各字符出现的频次，若不等则返回false. 有很多简单字符串类面试题都是此题的变形题。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param s: The first string\n" +
                        "     * @param b: The second string\n" +
                        "     * @return true or false\n" +
                        "     */\n" +
                        "    bool anagram(string s, string t) {\n" +
                        "        if (s.empty() || t.empty()) {\n" +
                        "            return false;\n" +
                        "        }\n" +
                        "        if (s.size() != t.size()) {\n" +
                        "            return false;\n" +
                        "        }\n" +
                        "\n" +
                        "        int letterCount[256] = {0};\n" +
                        "\n" +
                        "        for (int i = 0; i != s.size(); ++i) {\n" +
                        "            ++letterCount[s[i]];\n" +
                        "            --letterCount[t[i]];\n" +
                        "        }\n" +
                        "        for (int i = 0; i != t.size(); ++i) {\n" +
                        "            if (letterCount[t[i]] < 0) {\n" +
                        "                return false;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return true;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "两个字符串长度不等时必不可能为变位词(需要注意题目条件灵活处理)。\n" +
                        "初始化含有256个字符的计数器数组。\n" +
                        "对字符串 s 自增，字符串 t 递减，再次遍历判断letterCount数组的值，小于0时返回false.\n" +
                        "在字符串长度较长(大于所有可能的字符数)时，还可对第二个for循环做进一步优化，即t.size() > 256时，使用256替代t.size(), 使用i替代t[i].\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "两次遍历字符串，时间复杂度最坏情况下为 O(2n), 使用了额外的数组，空间复杂度 O(256).\n" +
                        "\n" +
                        "题解2 - 排序字符串\n" +
                        "\n" +
                        "另一直接的解法是对字符串先排序，若排序后的字符串内容相同，则其互为变位词。题解1中使用 hashmap 的方法对于比较两个字符串是否互为变位词十分有效，但是在比较多个字符串时，使用 hashmap 的方法复杂度则较高。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param s: The first string\n" +
                        "     * @param b: The second string\n" +
                        "     * @return true or false\n" +
                        "     */\n" +
                        "    bool anagram(string s, string t) {\n" +
                        "        if (s.empty() || t.empty()) {\n" +
                        "            return false;\n" +
                        "        }\n" +
                        "        if (s.size() != t.size()) {\n" +
                        "            return false;\n" +
                        "        }\n" +
                        "\n" +
                        "        sort(s.begin(), s.end());\n" +
                        "        sort(t.begin(), t.end());\n" +
                        "\n" +
                        "        if (s == t) {\n" +
                        "            return true;\n" +
                        "        } else {\n" +
                        "            return false;\n" +
                        "        }\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "对字符串 s 和 t 分别排序，而后比较是否含相同内容。对字符串排序时可以采用先统计字频再组装成排序后的字符串，效率更高一点。\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "C++的 STL 中 sort 的时间复杂度介于 O(n) 和 O(n\u200B2\u200B\u200B)之间，判断s == t时间复杂度最坏为 O(n).\n" +
                        "\n" +
                        "Reference\n" +
                        "\n" +
                        "CC150 Chapter 9.1 中文版 p109");
                this.map.put("Compare Strings", "Source\n" +
                        "\n" +
                        "lintcode: (55) Compare Strings\n" +
                        "Compare two strings A and B, determine whether A contains all of the characters in B.\n" +
                        "\n" +
                        "The characters in string A and B are all Upper Case letters.\n" +
                        "\n" +
                        "Example\n" +
                        "For A = \"ABCD\", B = \"ABC\", return true.\n" +
                        "\n" +
                        "For A = \"ABCD\" B = \"AABC\", return false.\n" +
                        "题解\n" +
                        "\n" +
                        "题 Two Strings Are Anagrams | Data Structure and Algorithm 的变形题。题目意思是问B中的所有字符是否都在A中，而不是单个字符。比如B=\"AABC\"包含两个「A」，而A=\"ABCD\"只包含一个「A」，故返回false. 做题时注意题意，必要时可向面试官确认。\n" +
                        "\n" +
                        "既然不是类似 strstr 那样的匹配，直接使用两重循环就不太合适了。题目中另外给的条件则是A和B都是全大写单词，理解题意后容易想到的方案就是先遍历 A 和 B 统计各字符出现的频次，然后比较频次大小即可。嗯，祭出万能的哈希表。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param A: A string includes Upper Case letters\n" +
                        "     * @param B: A string includes Upper Case letter\n" +
                        "     * @return:  if string A contains all of the characters in B return true\n" +
                        "     *           else return false\n" +
                        "     */\n" +
                        "    bool compareStrings(string A, string B) {\n" +
                        "        if (A.size() < B.size()) {\n" +
                        "            return false;\n" +
                        "        }\n" +
                        "\n" +
                        "        const int AlphabetNum = 26;\n" +
                        "        int letterCount[AlphabetNum] = {0};\n" +
                        "        for (int i = 0; i != A.size(); ++i) {\n" +
                        "            ++letterCount[A[i] - 'A'];\n" +
                        "        }\n" +
                        "        for (int i = 0; i != B.size(); ++i) {\n" +
                        "            --letterCount[B[i] - 'A'];\n" +
                        "            if (letterCount[B[i] - 'A'] < 0) {\n" +
                        "                return false;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return true;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码解析\n" +
                        "\n" +
                        "异常处理，B 的长度大于 A 时必定返回false, 包含了空串的特殊情况。\n" +
                        "使用额外的辅助空间，统计各字符的频次。\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "遍历一次 A 字符串，遍历一次 B 字符串，时间复杂度最坏 O(2n), 空间复杂度为 O(26).");
                this.map.put("Anagrams", "Source\n" +
                        "\n" +
                        "leetcode: Anagrams | LeetCode OJ * lintcode: (171) Anagrams\n" +
                        "Given an array of strings, return all groups of strings that are anagrams.\n" +
                        "\n" +
                        "Example\n" +
                        "Given [\"lint\", \"intl\", \"inlt\", \"code\"], return [\"lint\", \"inlt\", \"intl\"].\n" +
                        "\n" +
                        "Given [\"ab\", \"ba\", \"cd\", \"dc\", \"e\"], return [\"ab\", \"ba\", \"cd\", \"dc\"].\n" +
                        "Note\n" +
                        "All inputs will be in lower-case\n" +
                        "题解1 - 双重for循环(TLE) __\n" +
                        "\n" +
                        "题 Two Strings Are Anagrams | Data Structure and Algorithm 的升级版，容易想到的方法为使用双重for循环两两判断字符串数组是否互为变位字符串。但显然此法的时间复杂度较高。还需要 O(n) 的数组来记录字符串是否被加入到最终结果中。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param strs: A list of strings\n" +
                        "     * @return: A list of strings\n" +
                        "     */\n" +
                        "    vector anagrams(vector &strs) {\n" +
                        "        if (strs.size() < 2) {\n" +
                        "            return strs;\n" +
                        "        }\n" +
                        "\n" +
                        "        vector result;\n" +
                        "        vector visited(strs.size(), false);\n" +
                        "        for (int s1 = 0; s1 != strs.size(); ++s1) {\n" +
                        "            bool has_anagrams = false;\n" +
                        "            for (int s2 = s1 + 1; s2 < strs.size(); ++s2) {\n" +
                        "                if ((!visited[s2]) && isAnagrams(strs[s1], strs[s2])) {\n" +
                        "                    result.push_back(strs[s2]);\n" +
                        "                    visited[s2] = true;\n" +
                        "                    has_anagrams = true;\n" +
                        "                }\n" +
                        "            }\n" +
                        "            if ((!visited[s1]) && has_anagrams) result.push_back(strs[s1]);\n" +
                        "        }\n" +
                        "\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "\n" +
                        "private:\n" +
                        "    bool isAnagrams(string &s, string &t) {\n" +
                        "        if (s.size() != t.size()) {\n" +
                        "            return false;\n" +
                        "        }\n" +
                        "\n" +
                        "        const int AlphabetNum = 26;\n" +
                        "        int letterCount[AlphabetNum] = {0};\n" +
                        "        for (int i = 0; i != s.size(); ++i) {\n" +
                        "            ++letterCount[s[i] - 'a'];\n" +
                        "            --letterCount[t[i] - 'a'];\n" +
                        "        }\n" +
                        "        for (int i = 0; i != t.size(); ++i) {\n" +
                        "            if (letterCount[t[i] - 'a'] < 0) {\n" +
                        "                return false;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return true;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "strs 长度小于等于1时直接返回。\n" +
                        "使用与 strs 等长的布尔数组表示其中的字符串是否被添加到最终的返回结果中。\n" +
                        "双重循环遍历字符串数组，注意去重即可。\n" +
                        "私有方法isAnagrams用于判断两个字符串是否互为变位词。\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "私有方法isAnagrams最坏的时间复杂度为 O(2L), 其中 L 为字符串长度。双重for循环时间复杂度近似为 \u200B2\u200B\u200B1\u200B\u200BO(n\u200B2\u200B\u200B), n 为给定字符串数组数目。总的时间复杂度近似为 O(n\u200B2\u200B\u200BL).\n" +
                        "\n" +
                        "题解2 - 排序 + hashmap\n" +
                        "\n" +
                        "在题 Two Strings Are Anagrams | Data Structure and Algorithm 中曾介绍过使用排序和 hashmap 两种方法判断变位词。这里我们将这两种方法同时引入！只不过此时的 hashmap 的 key 为字符串，value 为该字符串在 vector 中出现的次数。两次遍历字符串数组，第一次遍历求得排序后的字符串数量，第二次遍历将排序后相同的字符串取出放入最终结果中。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param strs: A list of strings\n" +
                        "     * @return: A list of strings\n" +
                        "     */\n" +
                        "    vector anagrams(vector &strs) {\n" +
                        "        unordered_map hash;\n" +
                        "\n" +
                        "        for (int i = 0; i < strs.size(); i++) {\n" +
                        "            string str = strs[i];\n" +
                        "            sort(str.begin(), str.end());\n" +
                        "            ++hash[str];\n" +
                        "        }\n" +
                        "\n" +
                        "        vector result;\n" +
                        "        for (int i = 0; i < strs.size(); i++) {\n" +
                        "            string str = strs[i];\n" +
                        "            sort(str.begin(), str.end());\n" +
                        "            if (hash[str] > 1) {\n" +
                        "                result.push_back(strs[i]);\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "建立 key 为字符串，value 为相应计数器的hashmap, unordered_map为 C++ 11中引入的哈希表数据结构unordered_map, 这种新的数据结构和之前的 map 有所区别，详见map-unordered_map。\n" +
                        "\n" +
                        "第一次遍历字符串数组获得排序后的字符串计数器信息，第二次遍历字符串数组将哈希表中计数器值大于1的字符串取出。\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "遍历一次字符串数组，复杂度为 O(n), 对单个字符串排序复杂度近似为 O(LlogL). 两次遍历字符串数组，故总的时间复杂度近似为 O(nLlogL). 使用了哈希表，空间复杂度为 O(K), 其中 K 为排序后不同的字符串个数。\n" +
                        "\n" +
                        "Reference\n" +
                        "\n" +
                        "unordered_map. unordered_map - C++ Reference ↩\n" +
                        "map-unordered_map. c++ - Choosing between std::map and std::unordered_map - Stack Overflow ↩\n" +
                        "Anagrams | 九章算法");

                this.map.put("Longest Common Substring", "Source\n" +
                        "\n" +
                        "lintcode: (79) Longest Common Substring\n" +
                        "Given two strings, find the longest common substring.\n" +
                        "Return the length of it.\n" +
                        "\n" +
                        "Example\n" +
                        "Given A=\"ABCD\", B=\"CBCE\", return 2.\n" +
                        "Note\n" +
                        "The characters in substring should occur continuously in original string.\n" +
                        "This is different with subsequence.\n" +
                        "题解\n" +
                        "\n" +
                        "求最长公共子串，注意「子串」和「子序列」的区别！简单考虑可以使用两根指针索引分别指向两个字符串的当前遍历位置，若遇到相等的字符时则同时向后移动一位。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param A, B: Two string.\n" +
                        "     * @return: the length of the longest common substring.\n" +
                        "     */\n" +
                        "    int longestCommonSubstring(string &A, string &B) {\n" +
                        "        if (A.empty() || B.empty()) {\n" +
                        "            return 0;\n" +
                        "        }\n" +
                        "\n" +
                        "        int lcs = 0, lcs_temp = 0;\n" +
                        "        for (int i = 0; i < A.size(); ++i) {\n" +
                        "            for (int j = 0; j < B.size(); ++j) {\n" +
                        "                lcs_temp = 0;\n" +
                        "                while ((i + lcs_temp < A.size()) &&\\\n" +
                        "                       (j + lcs_temp < B.size()) &&\\\n" +
                        "                       (A[i + lcs_temp] == B[j + lcs_temp]))\n" +
                        "                {\n" +
                        "                    ++lcs_temp;\n" +
                        "                }\n" +
                        "\n" +
                        "                // update lcs\n" +
                        "                if (lcs_temp > lcs) {\n" +
                        "                    lcs = lcs_temp;\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return lcs;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "异常处理，空串时返回0.\n" +
                        "分别使用i和j表示当前遍历的索引处。若当前字符相同时则共同往后移动一位。\n" +
                        "没有相同字符时比较此次遍历的lcs_temp和lcs大小，更新lcs.\n" +
                        "返回lcs.\n" +
                        "注意在while循环中不可直接使用++i或者++j，因为有可能会漏解！\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "双重 for 循环，最坏时间复杂度约为 O(mn⋅lcs).\n" +
                        "\n" +
                        "Reference\n" +
                        "\n" +
                        "Longest Common Substring | 九章算法");
                this.map.put("Remove Element", "Source\n" +
                        "\n" +
                        "leetcode: Remove Element | LeetCode OJ * lintcode: (172) Remove Element\n" +
                        "Given an array and a value, remove all occurrences of that value in place and return the new length.\n" +
                        "\n" +
                        "The order of elements can be changed, and the elements after the new length don't matter.\n" +
                        "\n" +
                        "Example\n" +
                        "Given an array [0,4,4,0,0,2,4,4], value=4\n" +
                        "\n" +
                        "return 4 and front four elements of the array is [0,0,0,2]\n" +
                        "题解1 - 使用容器\n" +
                        "\n" +
                        "入门题，返回删除指定元素后的数组长度，使用容器操作非常简单。以 lintcode 上给出的参数为例，遍历容器内元素，若元素值与给定删除值相等，删除当前元素并往后继续遍历。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     *@param A: A list of integers\n" +
                        "     *@param elem: An integer\n" +
                        "     *@return: The new length after remove\n" +
                        "     */\n" +
                        "    int removeElement(vector &A, int elem) {\n" +
                        "        for (vector::iterator iter = A.begin(); iter < A.end(); ++iter) {\n" +
                        "            if (*iter == elem) {\n" +
                        "                iter = A.erase(iter);\n" +
                        "                --iter;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return A.size();\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "注意在遍历容器内元素和指定欲删除值相等时，需要先自减--iter, 因为for循环会对iter自增，A.erase()删除当前元素值并返回指 向下一个元素的指针，一增一减正好平衡。如果改用while循环，则需注意访问数组时是否越界。\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "没啥好分析的，遍历一次数组 O(n).\n" +
                        "\n" +
                        "题解2 - 两根指针\n" +
                        "\n" +
                        "由于题中明确暗示元素的顺序可变，且新长度后的元素不用理会。我们可以使用两根指针分别往前往后遍历，头指针用于指示当前遍历的元素位置，尾指针则用于在当前元素与欲 删除值相等时替换当前元素，两根指针相遇时返回尾指针索引——即删除元素后「新数组」的长度。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    int removeElement(int A[], int n, int elem) {\n" +
                        "        for (int i = 0; i < n; ++i) {\n" +
                        "            if (A[i] == elem) {\n" +
                        "                A[i] = A[n - 1];\n" +
                        "                --i;\n" +
                        "                --n;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return n;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "遍历当前数组，A[i] == elem时将数组「尾部(以 n 为长度时的尾部)」元素赋给当前遍历的元素。同时自减i和n，原因见题解1的分析。需要注意的是n在遍历过程中可能会变化。\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "同题解1，O(n).\n" +
                        "\n" +
                        "Reference\n" +
                        "\n" +
                        "Remove Element | 九章算法");
                this.map.put("Zero Sum Subarray", "Source\n" +
                        "\n" +
                        "lintcode: (138) Subarray Sum * GeeksforGeeks: Find if there is a subarray with 0 sum - GeeksforGeeks\n" +
                        "Given an integer array, find a subarray where the sum of numbers is zero.\n" +
                        "Your code should return the index of the first number and the index of the last number.\n" +
                        "\n" +
                        "Example\n" +
                        "Given [-3, 1, 2, -3, 4], return [0, 2] or [1, 3].\n" +
                        "\n" +
                        "Note\n" +
                        "There is at least one subarray that it's sum equals to zero.\n" +
                        "题解1 - 两重 for 循环\n" +
                        "\n" +
                        "题目中仅要求返回一个子串(连续)中和为0的索引，而不必返回所有可能满足题意的解。最简单的想法是遍历所有子串，判断其和是否为0，使用两重循环即可搞定，最坏情况 下时间复杂度为 O(n\u200B2\u200B\u200B), 这种方法显然是极其低效的，极有可能会出现 TLE. 下面就不浪费篇幅贴代码了。\n" +
                        "\n" +
                        "题解2 - 比较子串和(TLE)\n" +
                        "\n" +
                        "两重 for 循环显然是我们不希望看到的解法，那么我们再来分析下题意，题目中的对象是分析子串和，那么我们先从常见的对数组求和出发，f(i)=∑\u200B0\u200Bi\u200B\u200Bnums[i] 表示从数组下标 0 开始至下标 i 的和。子串和为0，也就意味着存在不同的 i\u200B1\u200B\u200B 和 i\u200B2\u200B\u200B 使得 f(i\u200B1\u200B\u200B)−f(i\u200B2\u200B\u200B)=0, 等价于 f(i\u200B1\u200B\u200B)=f(i\u200B2\u200B\u200B). 思路很快就明晰了，使用一 vector 保存数组中从 0 开始到索引i的和，在将值 push 进 vector 之前先检查 vector 中是否已经存在，若存在则将相应索引加入最终结果并返回。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param nums: A list of integers\n" +
                        "     * @return: A list of integers includes the index of the first number\n" +
                        "     *          and the index of the last number\n" +
                        "     */\n" +
                        "    vector subarraySum(vector nums){\n" +
                        "        vector result;\n" +
                        "\n" +
                        "        int curr_sum = 0;\n" +
                        "        vector sum_i;\n" +
                        "        for (int i = 0; i != nums.size(); ++i) {\n" +
                        "            curr_sum += nums[i];\n" +
                        "\n" +
                        "            if (0 == curr_sum) {\n" +
                        "                result.push_back(0);\n" +
                        "                result.push_back(i);\n" +
                        "                return result;\n" +
                        "            }\n" +
                        "\n" +
                        "            vector::iterator iter = find(sum_i.begin(), sum_i.end(), curr_sum);\n" +
                        "            if (iter != sum_i.end()) {\n" +
                        "                result.push_back(iter - sum_i.begin() + 1);\n" +
                        "                result.push_back(i);\n" +
                        "                return result;\n" +
                        "            }\n" +
                        "\n" +
                        "            sum_i.push_back(curr_sum);\n" +
                        "        }\n" +
                        "\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "使用curr_sum保存到索引i处的累加和，sum_i保存不同索引处的和。执行sum_i.push_back之前先检查curr_sum是 否为0，再检查curr_sum是否已经存在于sum_i中。是不是觉得这种方法会比题解1好？错！时间复杂度是一样一样的！根本原因在于find操作的 时间复杂度为线性。与这种方法类似的有哈希表实现，哈希表的查找在理想情况下可认为是 O(1).\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "最坏情况下 O(n\u200B2\u200B\u200B), 实测和题解1中的方法运行时间几乎一致。\n" +
                        "\n" +
                        "题解3 - 哈希表\n" +
                        "\n" +
                        "终于到了祭出万能方法时候了，题解2可以认为是哈希表的雏形，而哈希表利用空间换时间的思路争取到了宝贵的时间资源 :)\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param nums: A list of integers\n" +
                        "     * @return: A list of integers includes the index of the first number\n" +
                        "     *          and the index of the last number\n" +
                        "     */\n" +
                        "    vector subarraySum(vector nums){\n" +
                        "        vector result;\n" +
                        "        // curr_sum for the first item, index for the second item\n" +
                        "        map hash;\n" +
                        "        hash[0] = 0;\n" +
                        "\n" +
                        "        int curr_sum = 0;\n" +
                        "        for (int i = 0; i != nums.size(); ++i) {\n" +
                        "            curr_sum += nums[i];\n" +
                        "            if (hash.find(curr_sum) != hash.end()) {\n" +
                        "                result.push_back(hash[curr_sum]);\n" +
                        "                result.push_back(i);\n" +
                        "                return result;\n" +
                        "            } else {\n" +
                        "                hash[curr_sum] = i + 1;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "为了将curr_sum == 0的情况也考虑在内，初始化哈希表后即赋予 <0, 0>. 给 hash赋值时使用i + 1, push_back时则不必再加1.\n" +
                        "\n" +
                        "由于 C++ 中的map采用红黑树实现，故其并非真正的「哈希表」，C++ 11中引入的unordered_map用作哈希表效率更高，实测可由1300ms 降至1000ms.\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "遍历求和时间复杂度为 O(n), 哈希表检查键值时间复杂度为 O(logL), 其中 L 为哈希表长度。如果采用unordered_map实现，最坏情况下查找的时间复杂度为线性，最好为常数级别。\n" +
                        "\n" +
                        "题解4 - 排序\n" +
                        "\n" +
                        "除了使用哈希表，我们还可使用排序的方法找到两个子串和相等的情况。这种方法的时间复杂度主要集中在排序方法的实现。由于除了记录子串和之外还需记录索引，故引入p air记录索引，最后排序时先按照sum值来排序，然后再按照索引值排序。如果需要自定义排序规则可参考sort_pair_second.\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param nums: A list of integers\n" +
                        "     * @return: A list of integers includes the index of the first number\n" +
                        "     *          and the index of the last number\n" +
                        "     */\n" +
                        "    vector subarraySum(vector nums){\n" +
                        "        vector result;\n" +
                        "        if (nums.empty()) {\n" +
                        "            return result;\n" +
                        "        }\n" +
                        "\n" +
                        "        const int num_size = nums.size();\n" +
                        "        vector > sum_index(num_size + 1);\n" +
                        "        for (int i = 0; i != num_size; ++i) {\n" +
                        "            sum_index[i + 1].first = sum_index[i].first + nums[i];\n" +
                        "            sum_index[i + 1].second = i + 1;\n" +
                        "        }\n" +
                        "\n" +
                        "        sort(sum_index.begin(), sum_index.end());\n" +
                        "        for (int i = 1; i < num_size + 1; ++i) {\n" +
                        "            if (sum_index[i].first == sum_index[i - 1].first) {\n" +
                        "                result.push_back(sum_index[i - 1].second);\n" +
                        "                result.push_back(sum_index[i].second - 1);\n" +
                        "                return result;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "没啥好分析的，注意好边界条件即可。这里采用了链表中常用的「dummy」节点方法，pair排序后即为我们需要的排序结果。这种排序的方法需要先求得所有子串和 然后再排序，最后还需要遍历排序后的数组，效率自然是比不上哈希表。但是在某些情况下这种方法有一定优势。\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "遍历求子串和，时间复杂度为 O(n), 空间复杂度 O(n). 排序时间复杂度近似 O(nlogn), 遍历一次最坏情况下时间复杂度为 O(n). 总的时间复杂度可近似为 O(nlogn). 空间复杂度 O(n).\n" +
                        "\n" +
                        "扩展\n" +
                        "\n" +
                        "这道题的要求是找到一个即可，但是要找出所有满足要求的解呢？Stackoverflow 上有这道延伸题的讨论stackoverflow.\n" +
                        "\n" +
                        "另一道扩展题来自 Google 的面试题 - Find subarray with given sum - GeeksforGeeks.\n" +
                        "\n" +
                        "Reference\n" +
                        "\n" +
                        "stackoverflow. algorithm - Zero sum SubArray - Stack Overflow ↩\n" +
                        "sort_pair_second. c++ - How do I sort a vector of pairs based on the second element of the pair? - Stack Overflow ↩");
                this.map.put("Subarray Sum K", "Source\n" +
                        "\n" +
                        "GeeksforGeeks: Find subarray with given sum - GeeksforGeeks\n" +
                        "Given an nonnegative integer array, find a subarray where the sum of numbers is k.\n" +
                        "Your code should return the index of the first number and the index of the last number.\n" +
                        "\n" +
                        "Example\n" +
                        "Given [1, 4, 20, 3, 10, 5], sum k = 33, return [2, 4].\n" +
                        "题解1 - 哈希表\n" +
                        "\n" +
                        "题 Zero Sum Subarray | Data Structure and Algorithm 的升级版，这道题求子串和为 K 的索引。首先我们可以考虑使用时间复杂度相对较低的哈希表解决。前一道题的核心约束条件为 f(i\u200B1\u200B\u200B)−f(i\u200B2\u200B\u200B)=0，这道题则变为 f(i\u200B1\u200B\u200B)−f(i\u200B2\u200B\u200B)=k\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "#include \n" +
                        "#include \n" +
                        "#include \n" +
                        "\n" +
                        "using namespace std;\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param nums: A list of integers\n" +
                        "     * @return: A list of integers includes the index of the first number\n" +
                        "     *          and the index of the last number\n" +
                        "     */\n" +
                        "    vector subarraySum(vector nums, int k){\n" +
                        "        vector result;\n" +
                        "        // curr_sum for the first item, index for the second item\n" +
                        "        // unordered_map hash;\n" +
                        "        map hash;\n" +
                        "        hash[0] = 0;\n" +
                        "\n" +
                        "        int curr_sum = 0;\n" +
                        "        for (int i = 0; i != nums.size(); ++i) {\n" +
                        "            curr_sum += nums[i];\n" +
                        "            if (hash.find(curr_sum - k) != hash.end()) {\n" +
                        "                result.push_back(hash[curr_sum - k]);\n" +
                        "                result.push_back(i);\n" +
                        "                return result;\n" +
                        "            } else {\n" +
                        "                hash[curr_sum] = i + 1;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "};\n" +
                        "\n" +
                        "int main(int argc, char *argv[])\n" +
                        "{\n" +
                        "    int int_array1[] = {1, 4, 20, 3, 10, 5};\n" +
                        "    int int_array2[] = {1, 4, 0, 0, 3, 10, 5};\n" +
                        "    vector vec_array1;\n" +
                        "    vector vec_array2;\n" +
                        "    for (int i = 0; i != sizeof(int_array1) / sizeof(int); ++i) {\n" +
                        "        vec_array1.push_back(int_array1[i]);\n" +
                        "    }\n" +
                        "    for (int i = 0; i != sizeof(int_array2) / sizeof(int); ++i) {\n" +
                        "        vec_array2.push_back(int_array2[i]);\n" +
                        "    }\n" +
                        "\n" +
                        "    Solution solution;\n" +
                        "    vector result1 = solution.subarraySum(vec_array1, 33);\n" +
                        "    vector result2 = solution.subarraySum(vec_array2, 7);\n" +
                        "\n" +
                        "    cout << \"result1 = [\" << result1[0] << \" ,\" << result1[1] << \"]\" << endl;\n" +
                        "    cout << \"result2 = [\" << result2[0] << \" ,\" << result2[1] << \"]\" << endl;\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "源码分析\n" +
                        "\n" +
                        "与 Zero Sum Subarray 题的变化之处有两个地方，第一个是判断是否存在哈希表中时需要使用hash.find(curr_sum - k), 最终返回结果使用result.push_back(hash[curr_sum - k]);而不是result.push_back(hash[curr_sum]);\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "略，见 Zero Sum Subarray | Data Structure and Algorithm\n" +
                        "\n" +
                        "题解2 - 利用单调函数特性\n" +
                        "\n" +
                        "不知道细心的你是否发现这道题的隐含条件——nonnegative integer array, 这也就意味着子串和函数 f(i) 为「单调不减」函数。单调函数在数学中可是重点研究的对象，那么如何将这种单调性引入本题中呢？不妨设 i\u200B2\u200B\u200B>i\u200B1\u200B\u200B, 题中的解等价于寻找 f(i\u200B2\u200B\u200B)−f(i\u200B1\u200B\u200B)=k, 则必有 f(i\u200B2\u200B\u200B)≥k.\n" +
                        "\n" +
                        "我们首先来举个实际例子帮助分析，以整数数组 {1, 4, 20, 3, 10, 5} 为例，要求子串和为33的索引值。首先我们可以构建如下表所示的子串和 f(i).\n" +
                        "\n" +
                        "f(i)\t1\t5\t25\t28\t38\n" +
                        "i\t0\t1\t2\t3\t4\n" +
                        "要使部分子串和为33，则要求的第二个索引值必大于等于4，如果索引值再继续往后遍历，则所得的子串和必大于等于38，进而可以推断出索引0一定不是解。那现在怎么办 咧？当然是把它扔掉啊！第一个索引值往后递推，直至小于33时又往后递推第二个索引值，于是乎这种技巧又可以认为是「两根指针」。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "#include \n" +
                        "#include \n" +
                        "#include \n" +
                        "\n" +
                        "using namespace std;\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param nums: A list of integers\n" +
                        "     * @return: A list of integers includes the index of the first number\n" +
                        "     *          and the index of the last number\n" +
                        "     */\n" +
                        "    vector subarraySum2(vector nums, int k){\n" +
                        "        vector result;\n" +
                        "\n" +
                        "        int left_index = 0;\n" +
                        "        int curr_sum = 0;\n" +
                        "        for (int i = 0; i != nums.size(); ++i) {\n" +
                        "            curr_sum += nums[i];\n" +
                        "            if (curr_sum == k) {\n" +
                        "                result.push_back(left_index);\n" +
                        "                result.push_back(i);\n" +
                        "                return result;\n" +
                        "            }\n" +
                        "\n" +
                        "            while (curr_sum > k) {\n" +
                        "                curr_sum -= nums[left_index];\n" +
                        "                ++left_index;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "};\n" +
                        "\n" +
                        "int main(int argc, char *argv[])\n" +
                        "{\n" +
                        "    int int_array1[] = {1, 4, 20, 3, 10, 5};\n" +
                        "    int int_array2[] = {1, 4, 0, 0, 3, 10, 5};\n" +
                        "    vector vec_array1;\n" +
                        "    vector vec_array2;\n" +
                        "    for (int i = 0; i != sizeof(int_array1) / sizeof(int); ++i) {\n" +
                        "        vec_array1.push_back(int_array1[i]);\n" +
                        "    }\n" +
                        "    for (int i = 0; i != sizeof(int_array2) / sizeof(int); ++i) {\n" +
                        "        vec_array2.push_back(int_array2[i]);\n" +
                        "    }\n" +
                        "\n" +
                        "    Solution solution;\n" +
                        "    vector result1 = solution.subarraySum2(vec_array1, 33);\n" +
                        "    vector result2 = solution.subarraySum2(vec_array2, 7);\n" +
                        "\n" +
                        "    cout << \"result1 = [\" << result1[0] << \" ,\" << result1[1] << \"]\" << endl;\n" +
                        "    cout << \"result2 = [\" << result2[0] << \" ,\" << result2[1] << \"]\" << endl;\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "源码分析\n" +
                        "\n" +
                        "使用for循环累加curr_sum, 在curr_sum > k时再使用while递减curr_sum, 同时递增左边索引left_index.\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "看似有两重循环，由于仅遍历一次数组，且索引最多挪动和数组等长的次数。故最终时间复杂度近似为 O(2n), 空间复杂度为 O(1).\n" +
                        "\n" +
                        "Reference\n" +
                        "\n" +
                        "Find subarray with given sum - GeeksforGeeks");
                this.map.put("Subarray Sum Closest", "Source\n" +
                        "\n" +
                        "lintcode: (139) Subarray Sum Closest\n" +
                        "Given an integer array, find a subarray with sum closest to zero.\n" +
                        "Return the indexes of the first number and last number.\n" +
                        "\n" +
                        "Example\n" +
                        "Given [-3, 1, 1, -3, 5], return [0, 2], [1, 3], [1, 1], [2, 2] or [0, 4]\n" +
                        "\n" +
                        "Challenge\n" +
                        "O(nlogn) time\n" +
                        "题解\n" +
                        "\n" +
                        "题 Zero Sum Subarray | Data Structure and Algorithm 的变形题，由于要求的子串和不一定，故哈希表的方法不再适用，使用解法4 - 排序即可在 O(nlogn) 内解决。具体步骤如下：\n" +
                        "\n" +
                        "首先遍历一次数组求得子串和。\n" +
                        "对子串和排序。\n" +
                        "逐个比较相邻两项差值的绝对值，返回差值绝对值最小的两项。\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param nums: A list of integers\n" +
                        "     * @return: A list of integers includes the index of the first number\n" +
                        "     *          and the index of the last number\n" +
                        "     */\n" +
                        "    vector subarraySumClosest(vector nums){\n" +
                        "        vector result;\n" +
                        "        if (nums.empty()) {\n" +
                        "            return result;\n" +
                        "        }\n" +
                        "\n" +
                        "        const int num_size = nums.size();\n" +
                        "        vector > sum_index(num_size + 1);\n" +
                        "\n" +
                        "        for (int i = 0; i < num_size; ++i) {\n" +
                        "            sum_index[i + 1].first = sum_index[i].first + nums[i];\n" +
                        "            sum_index[i + 1].second = i + 1;\n" +
                        "        }\n" +
                        "\n" +
                        "        sort(sum_index.begin(), sum_index.end());\n" +
                        "\n" +
                        "        int min_diff = INT_MAX;\n" +
                        "        int closest_index = 1;\n" +
                        "        for (int i = 1; i < num_size + 1; ++i) {\n" +
                        "            int sum_diff = abs(sum_index[i].first - sum_index[i - 1].first);\n" +
                        "            if (min_diff > sum_diff) {\n" +
                        "                min_diff = sum_diff;\n" +
                        "                closest_index = i;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        int left_index = min(sum_index[closest_index - 1].second,\\\n" +
                        "                             sum_index[closest_index].second);\n" +
                        "        int right_index = -1 + max(sum_index[closest_index - 1].second,\\\n" +
                        "                                   sum_index[closest_index].second);\n" +
                        "        result.push_back(left_index);\n" +
                        "        result.push_back(right_index);\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "为避免对单个子串和是否为最小情形的单独考虑，我们可以采取类似链表 dummy 节点的方法规避，简化代码实现。故初始化sum_index时需要num_size + 1个。这里为避免 vector 反复扩充空间降低运行效率，使用resize一步到位。sum_index即最后结果中left_index和right_index等边界可以结合简单例子分析确定。\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "遍历一次求得子串和时间复杂度为 O(n), 空间复杂度为 O(n+1).\n" +
                        "对子串和排序，平均时间复杂度为 O(nlogn).\n" +
                        "遍历排序后的子串和数组，时间复杂度为 O(n).\n" +
                        "总的时间复杂度为 O(nlogn), 空间复杂度为 O(n).\n" +
                        "\n" +
                        "扩展\n" +
                        "\n" +
                        "algorithm - How to find the subarray that has sum closest to zero or a certain value t in O(nlogn) - Stack Overflow");
                this.map.put("Product of Array Exclude Itself", "Source\n" +
                        "\n" +
                        "lintcode: (50) Product of Array Exclude Itself * GeeksforGeeks: A Product Array Puzzle - GeeksforGeeks\n" +
                        "Given an integers array A.\n" +
                        "\n" +
                        "Define B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1], calculate B WITHOUT divide operation.\n" +
                        "\n" +
                        "Example\n" +
                        "For A=[1, 2, 3], return [6, 3, 2].\n" +
                        "题解1 - 左右分治\n" +
                        "\n" +
                        "根据题意，有 result[i]=left[i]⋅right[i], 其中 left[i]=∏\u200Bj=0\u200Bi−1\u200B\u200BA[j], right[i]=∏\u200Bj=i+1\u200Bn−1\u200B\u200BA[j]. 即将最后的乘积分为两部分求解，首先求得左半部分的值，然后求得右半部分的值。最后将左右两半部分乘起来即为解。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param A: Given an integers array A\n" +
                        "     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]\n" +
                        "     */\n" +
                        "    vector productExcludeItself(vector &nums) {\n" +
                        "        const int nums_size = nums.size();\n" +
                        "        vector result(nums_size, 1);\n" +
                        "        if (nums.empty() || nums_size == 1) {\n" +
                        "            return result;\n" +
                        "        }\n" +
                        "\n" +
                        "        vector left(nums_size, 1);\n" +
                        "        vector right(nums_size, 1);\n" +
                        "        for (int i = 1; i != nums_size; ++i) {\n" +
                        "            left[i] = left[i - 1] * nums[i - 1];\n" +
                        "            right[nums_size - i - 1] = right[nums_size - i] * nums[nums_size - i];\n" +
                        "        }\n" +
                        "        for (int i = 0; i != nums_size; ++i) {\n" +
                        "            result[i] = left[i] * right[i];\n" +
                        "        }\n" +
                        "\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "一次for循环求出左右部分的连乘积，下标的确定可使用简单例子辅助分析。\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "两次for循环，时间复杂度 O(n). 使用了左右两半部分辅助空间，空间复杂度 O(2n).\n" +
                        "\n" +
                        "题解2 - 原地求积\n" +
                        "\n" +
                        "题解1中使用了左右两个辅助数组，但是仔细瞅瞅其实可以发现完全可以在最终返回结果result基础上原地计算左右两半部分的积。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param A: Given an integers array A\n" +
                        "     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]\n" +
                        "     */\n" +
                        "    vector productExcludeItself(vector &nums) {\n" +
                        "        const int nums_size = nums.size();\n" +
                        "        vector result(nums_size, 1);\n" +
                        "\n" +
                        "        // solve the left part first\n" +
                        "        for (int i = 1; i < nums_size; ++i) {\n" +
                        "            result[i] = result[i - 1] * nums[i - 1];\n" +
                        "        }\n" +
                        "\n" +
                        "        // solve the right part\n" +
                        "        long long temp = 1;\n" +
                        "        for (int i = nums_size - 1; i >= 0; --i) {\n" +
                        "            result[i] *= temp;\n" +
                        "            temp *= nums[i];\n" +
                        "        }\n" +
                        "\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "计算左半部分的递推式不用改，计算右半部分的乘积时由于会有左半部分值的干扰，故使用temp保存连乘的值。注意temp需要使用long long, 否则会溢出。\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "时间复杂度同上，空间复杂度为 O(1).");
                this.map.put("Partition Array", "Source\n" +
                        "\n" +
                        "(31) Partition Array\n" +
                        "Given an array nums of integers and an int k, partition the array\n" +
                        "(i.e move the elements in \"nums\") such that:\n" +
                        "\n" +
                        "All elements < k are moved to the left\n" +
                        "All elements >= k are moved to the right\n" +
                        "Return the partitioning index, i.e the first index i nums[i] >= k.\n" +
                        "\n" +
                        "Example\n" +
                        "If nums=[3,2,2,1] and k=2, a valid answer is 1.\n" +
                        "\n" +
                        "Note\n" +
                        "You should do really partition in array nums instead of just\n" +
                        "counting the numbers of integers smaller than k.\n" +
                        "\n" +
                        "If all elements in nums are smaller than k, then return nums.length\n" +
                        "\n" +
                        "Challenge\n" +
                        "Can you partition the array in-place and in O(n)?\n" +
                        "题解1 - 自左向右\n" +
                        "\n" +
                        "容易想到的一个办法是自左向右遍历，使用right保存大于等于 k 的索引，i则为当前遍历元素的索引，总是保持i >= right, 那么最后返回的right即为所求。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    int partitionArray(vector &nums, int k) {\n" +
                        "        int right = 0;\n" +
                        "        const int size = nums.size();\n" +
                        "        for (int i = 0; i < size; ++i) {\n" +
                        "            if (nums[i] < k && i >= right) {\n" +
                        "                int temp = nums[i];\n" +
                        "                nums[i] = nums[right];\n" +
                        "                nums[right] = temp;\n" +
                        "                ++right;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return right;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "自左向右遍历，遇到小于 k 的元素时即和right索引处元素交换，并自增right指向下一个元素，这样就能保证right之前的元素一定小于 k. 注意if判断条件中i >= right不能是i > right, 否则需要对特殊情况如全小于 k 时的考虑，而且即使考虑了这一特殊情况也可能存在其他 bug. 具体是什么 bug 呢？欢迎提出你的分析意见~\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "遍历一次数组，时间复杂度最少为 O(n), 可能需要一定次数的交换。\n" +
                        "\n" +
                        "题解2 - 两根指针\n" +
                        "\n" +
                        "有了解过 Quick Sort 的做这道题自然是分分钟的事，使用左右两根指针 left,right 分别代表小于、大于等于 k 的索引，左右同时开工，直至 left>right.\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    int partitionArray(vector &nums, int k) {\n" +
                        "        int left = 0, right = nums.size() - 1;\n" +
                        "        while (left <= right) {\n" +
                        "            while (left <= right && nums[left] < k) ++left;\n" +
                        "            while (left <= right && nums[right] >= k) --right;\n" +
                        "            if (left <= right) {\n" +
                        "                int temp = nums[left];\n" +
                        "                nums[left] = nums[right];\n" +
                        "                nums[right] = temp;\n" +
                        "                ++left;\n" +
                        "                --right;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return left;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "大循环能正常进行的条件为 left<=right, 对于左边索引，向右搜索直到找到小于 k 的索引为止；对于右边索引，则向左搜索直到找到大于等于 k 的索引为止。注意在使用while循环时务必进行越界检查！\n" +
                        "\n" +
                        "找到不满足条件的索引时即交换其值，并递增left, 递减right. 紧接着进行下一次循环。最后返回left即可，当nums为空时包含在left = 0之中，不必单独特殊考虑，所以应返回left而不是right.\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "只需要对整个数组遍历一次，时间复杂度为 O(n), 相比题解1，题解2对全小于 k 的数组效率较高，元素交换次数较少。\n" +
                        "\n" +
                        "Reference\n" +
                        "\n" +
                        "Partition Array | 九章算法");
                this.map.put("First Missing Positive", "Source\n" +
                        "\n" +
                        "leetcode: First Missing Positive | LeetCode OJ * lintcode: (189) First Missing Positive\n" +
                        "Given an unsorted integer array, find the first missing positive integer.\n" +
                        "\n" +
                        "Example\n" +
                        "Given [1,2,0] return 3, and [3,4,-1,1] return 2.\n" +
                        "\n" +
                        "Challenge\n" +
                        "Your algorithm should run in O(n) time and uses constant space.\n" +
                        "题解\n" +
                        "\n" +
                        "容易想到的方案是先排序，然后遍历求得缺的最小整数。排序算法中常用的基于比较的方法时间复杂度的理论下界为 O(nlogn), 不符题目要求。常见的能达到线性时间复杂度的排序算法有 基数排序，计数排序 和 桶排序。\n" +
                        "\n" +
                        "基数排序显然不太适合这道题，计数排序对元素落在一定区间且重复值较多的情况十分有效，且需要额外的 O(n) 空间，对这道题不太合适。最后就只剩下桶排序了，桶排序通常需要按照一定规则将值放入桶中，一般需要额外的 O(n) 空间，咋看一下似乎不太适合在这道题中使用，但是若能设定一定的规则原地交换原数组的值呢？这道题的难点就在于这种规则的设定。\n" +
                        "\n" +
                        "设想我们对给定数组使用桶排序的思想排序，第一个桶放1，第二个桶放2，如果找不到相应的数，则相应的桶的值不变(可能为负值，也可能为其他值)。\n" +
                        "\n" +
                        "那么怎么才能做到原地排序呢？即若 A[i]=x, 则将 x 放到它该去的地方 - A[x−1]=x, 同时将原来 A[x−1] 地方的值交换给 A[i].\n" +
                        "\n" +
                        "排好序后遍历桶，如果不满足 f[i]=i+1, 那么警察叔叔就是它了！如果都满足条件怎么办？那就返回给定数组大小再加1呗。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param A: a vector of integers\n" +
                        "     * @return: an integer\n" +
                        "     */\n" +
                        "    int firstMissingPositive(vector A) {\n" +
                        "        const int size = A.size();\n" +
                        "\n" +
                        "        for (int i = 0; i < size; ++i) {\n" +
                        "            while (A[i] > 0 && A[i] <= size && \\\n" +
                        "                  (A[i] != i + 1) && (A[i] != A[A[i] - 1])) {\n" +
                        "                int temp = A[A[i] - 1];\n" +
                        "                A[A[i] - 1] = A[i];\n" +
                        "                A[i] = temp;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        for (int i = 0; i < size; ++i) {\n" +
                        "            if (A[i] != i + 1) {\n" +
                        "                return i + 1;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return size + 1;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "核心代码为那几行交换，但是要很好地处理各种边界条件则要下一番功夫了，要能正常的交换，需满足以下几个条件：\n" +
                        "\n" +
                        "A[i] 为正数，负数和零都无法在桶中找到生存空间...\n" +
                        "A[i] \\leq size 当前索引处的值不能比原数组容量大，大了的话也没用啊，肯定不是缺的第一个正数。\n" +
                        "A[i] != i + 1, 都满足条件了还交换个毛线，交换也是自身的值。\n" +
                        "A[i] != A[A[i] - 1], 避免欲交换的值和自身相同，否则有重复值时会产生死循环。\n" +
                        "如果满足以上四个条件就可以愉快地交换彼此了，使用while循环处理，此时i并不自增，直到将所有满足条件的索引处理完。\n" +
                        "\n" +
                        "注意交换的写法，若写成\n" +
                        "\n" +
                        "int temp = A[i];\n" +
                        "A[i] = A[A[i] - 1];\n" +
                        "A[A[i] - 1] = temp;\n" +
                        "这又是满满的 bug :( 因为在第三行中A[i]已不再是之前的值，第二行赋值时已经改变，故源码中的写法比较安全。\n" +
                        "\n" +
                        "最后遍历桶排序后的数组，若在数组大小范围内找到不满足条件的解，直接返回，否则就意味着原数组给的元素都是从1开始的连续正整数，返回数组大小加1即可。\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "「桶排序」需要遍历一次原数组，考虑到while循环也需要一定次数的遍历，故时间复杂度至少为 O(n). 最后求索引值最多遍历一次排序后数组，时间复杂度最高为 O(n), 用到了temp作为中间交换变量，空间复杂度为 O(1).\n" +
                        "\n" +
                        "Reference\n" +
                        "\n" +
                        "Find First Missing Positive | N00tc0d3r * LeetCode: First Missing Positive 解题报告 - Yu's Garden - 博客园\n" +
                        "First Missing Positive | 九章算法");
                this.map.put("2 Sum", "Source\n" +
                        "\n" +
                        "leetcode: Two Sum | LeetCode OJ * lintcode: (56) 2 Sum\n" +
                        "Given an array of integers, find two numbers such that they add up to a specific target number.\n" +
                        "\n" +
                        "The function twoSum should return indices of the two numbers\n" +
                        "such that they add up to the target, where index1 must be less than index2.\n" +
                        "Please note that your returned answers (both index1 and index2) are not zero-based.\n" +
                        "\n" +
                        "You may assume that each input would have exactly one solution.\n" +
                        "\n" +
                        "Input: numbers={2, 7, 11, 15}, target=9\n" +
                        "Output: index1=1, index2=2\n" +
                        "题解1 - 哈希表\n" +
                        "\n" +
                        "找两数之和是否为target, 如果是找数组中一个值为target该多好啊！遍历一次就知道了，我只想说，too naive... 难道要将数组中所有元素的两两组合都求出来与target比较吗？时间复杂度显然为 O(n\u200B2\u200B\u200B), 显然不符题目要求。找一个数时直接遍历即可，那么可不可以将两个数之和转换为找一个数呢？我们先来看看两数之和为target所对应的判断条件—— x\u200Bi\u200B\u200B+x\u200Bj\u200B\u200B=target, 可进一步转化为 x\u200Bi\u200B\u200B=target−x\u200Bj\u200B\u200B, 其中 i 和 j 为数组中的下标。一段神奇的数学推理就将找两数之和转化为了找一个数是否在数组中了！可见数学是多么的重要...\n" +
                        "\n" +
                        "基本思路有了，现在就来看看怎么实现，显然我们需要额外的空间(也就是哈希表)来保存已经处理过的 x\u200Bj\u200B\u200B, 如果不满足等式条件，那么我们就往后遍历，并把之前 的元素加入到哈希表中，如果target减去当前索引后的值在哈希表中找到了，那么就将哈希表中相应的索引返回，大功告成！\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /*\n" +
                        "     * @param numbers : An array of Integer\n" +
                        "     * @param target : target = numbers[index1] + numbers[index2]\n" +
                        "     * @return : [index1+1, index2+1] (index1 < index2)\n" +
                        "     */\n" +
                        "    vector twoSum(vector &nums, int target) {\n" +
                        "        vector result;\n" +
                        "        const int length = nums.size();\n" +
                        "        if (0 == length) {\n" +
                        "            return result;\n" +
                        "        }\n" +
                        "\n" +
                        "        // first value, second index\n" +
                        "        unordered_map hash(length);\n" +
                        "        for (int i = 0; i != length; ++i) {\n" +
                        "            if (hash.find(target - nums[i]) != hash.end()) {\n" +
                        "                result.push_back(hash[target - nums[i]]);\n" +
                        "                result.push_back(i + 1);\n" +
                        "                return result;\n" +
                        "            } else {\n" +
                        "                hash[nums[i]] = i + 1;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "异常处理。\n" +
                        "使用 C++ 11 中的哈希表实现unordered_map映射值和索引。\n" +
                        "找到满足条件的解就返回，找不到就加入哈希表中。注意题中要求返回索引值的含义。\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "哈希表用了和数组等长的空间，空间复杂度为 O(n), 遍历一次数组，时间复杂度为 O(n).\n" +
                        "\n" +
                        "Python\n" +
                        "\n" +
                        "class Solution:\n" +
                        "    \"\"\"\n" +
                        "    @param numbers : An array of Integer\n" +
                        "    @param target : target = numbers[index1] + numbers[index2]\n" +
                        "    @return : [index1 + 1, index2 + 1] (index1 < index2)\n" +
                        "    \"\"\"\n" +
                        "    def twoSum(self, numbers, target):\n" +
                        "        hashdict = {}\n" +
                        "        for i, item in enumerate(numbers):\n" +
                        "            if (target - item) in hashdict:\n" +
                        "                return (hashdict[target - item] + 1, i + 1)\n" +
                        "            hashdict[item] = i\n" +
                        "\n" +
                        "        return (-1, -1)\n" +
                        "源码分析\n" +
                        "\n" +
                        "Python 中的dict就是天然的哈希表，使用 enumerate 可以同时返回索引和值，甚为方便。按题意似乎是要返回 list, 但个人感觉返回 tuple 更为合理。最后如果未找到符合题意的索引，返回(-1, -1).\n" +
                        "\n" +
                        "题解2 - 排序后使用两根指针\n" +
                        "\n" +
                        "但凡可以用空间换时间的做法，往往也可以使用时间换空间。另外一个容易想到的思路就是先对数组排序，然后使用两根指针分别指向首尾元素，逐步向中间靠拢，直至找到满足 条件的索引为止。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /*\n" +
                        "     * @param numbers : An array of Integer\n" +
                        "     * @param target : target = numbers[index1] + numbers[index2]\n" +
                        "     * @return : [index1+1, index2+1] (index1 < index2)\n" +
                        "     */\n" +
                        "    vector twoSum(vector &nums, int target) {\n" +
                        "        vector result;\n" +
                        "        const int length = nums.size();\n" +
                        "        if (0 == length) {\n" +
                        "            return result;\n" +
                        "        }\n" +
                        "\n" +
                        "        // first num, second is index\n" +
                        "        vector > num_index(length);\n" +
                        "        // map num value and index\n" +
                        "        for (int i = 0; i != length; ++i) {\n" +
                        "            num_index[i].first = nums[i];\n" +
                        "            num_index[i].second = i + 1;\n" +
                        "        }\n" +
                        "\n" +
                        "        sort(num_index.begin(), num_index.end());\n" +
                        "        int start = 0, end = length - 1;\n" +
                        "        while (start < end) {\n" +
                        "            if (num_index[start].first + num_index[end].first > target) {\n" +
                        "                --end;\n" +
                        "            } else if(num_index[start].first + num_index[end].first == target) {\n" +
                        "                int min_index = min(num_index[start].second, num_index[end].second);\n" +
                        "                int max_index = max(num_index[start].second, num_index[end].second);\n" +
                        "                result.push_back(min_index);\n" +
                        "                result.push_back(max_index);\n" +
                        "                return result;\n" +
                        "            } else {\n" +
                        "                ++start;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "异常处理。\n" +
                        "使用length保存数组的长度，避免反复调用nums.size()造成性能损失。\n" +
                        "使用pair组合排序前的值和索引，避免排序后找不到原有索引信息。\n" +
                        "使用标准库函数排序。\n" +
                        "两根指针指头尾，逐步靠拢。\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "遍历一次原数组得到pair类型的新数组，时间复杂度为 O(n), 空间复杂度也为 O(n). 标准库中的排序方法时间复杂度近似为 O(nlogn), 两根指针遍历数组时间复杂度为 O(n).\n" +
                        "\n" +
                        ">\n" +
                        "\n" +
                        "lintcode 上的题要求时间复杂度在 O(nlogn) 时，空间复杂度为 O(1), 但问题是排序后索引会乱掉，如果要保存之前的索引，空间复杂度一定是 O(n)，所以个人认为不存在较为简洁的 O(1) 实现。如果一定要 O(n) 的空间复杂度，那么只能用暴搜了，此时的时间复杂度为 O(n\u200B2\u200B\u200B).");
                this.map.put("3 Sum", "Source\n" +
                        "\n" +
                        "leetcode: 3Sum | LeetCode OJ * lintcode: (57) 3 Sum\n" +
                        "Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?\n" +
                        "Find all unique triplets in the array which gives the sum of zero.\n" +
                        "\n" +
                        "Example\n" +
                        "For example, given array S = {-1 0 1 2 -1 -4}, A solution set is:\n" +
                        "\n" +
                        "(-1, 0, 1)\n" +
                        "(-1, -1, 2)\n" +
                        "Note\n" +
                        "Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)\n" +
                        "\n" +
                        "The solution set must not contain duplicate triplets.\n" +
                        "题解1 - 排序 + 哈希表 + 2 Sum\n" +
                        "\n" +
                        "相比之前的 2 Sum, 3 Sum 又多加了一个数，按照之前 2 Sum 的分解为『1 Sum + 1 Sum』的思路，我们同样可以将 3 Sum 分解为『1 Sum + 2 Sum』的问题，具体就是首先对原数组排序，排序后选出第一个元素，随后在剩下的元素中使用 2 Sum 的解法。\n" +
                        "\n" +
                        "Python\n" +
                        "\n" +
                        "class Solution:\n" +
                        "    \"\"\"\n" +
                        "    @param numbersbers : Give an array numbersbers of n integer\n" +
                        "    @return : Find all unique triplets in the array which gives the sum of zero.\n" +
                        "    \"\"\"\n" +
                        "    def threeSum(self, numbers):\n" +
                        "        triplets = []\n" +
                        "        length = len(numbers)\n" +
                        "        if length < 3:\n" +
                        "            return triplets\n" +
                        "\n" +
                        "        numbers.sort()\n" +
                        "        for i in xrange(length):\n" +
                        "            target = 0 - numbers[i]\n" +
                        "            # 2 Sum\n" +
                        "            hashmap = {}\n" +
                        "            for j in xrange(i + 1, length):\n" +
                        "                item_j = numbers[j]\n" +
                        "                if (target - item_j) in hashmap:\n" +
                        "                    triplet = [numbers[i], target - item_j, item_j]\n" +
                        "                    if triplet not in triplets:\n" +
                        "                        triplets.append(triplet)\n" +
                        "                else:\n" +
                        "                    hashmap[item_j] = j\n" +
                        "\n" +
                        "        return triplets\n" +
                        "源码分析\n" +
                        "\n" +
                        "异常处理，对长度小于3的直接返回。\n" +
                        "排序输入数组，有助于提高效率和返回有序列表。\n" +
                        "循环遍历排序后数组，先取出一个元素，随后求得 2 Sum 中需要的目标数。\n" +
                        "由于本题中最后返回结果不能重复，在加入到最终返回值之前查重。\n" +
                        "由于排序后的元素已经按照大小顺序排列，且在2 Sum 中先遍历的元素较小，所以无需对列表内元素再排序。\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "排序时间复杂度 O(nlogn), 两重for循环，时间复杂度近似为 O(n\u200B2\u200B\u200B)，使用哈希表(字典)实现，空间复杂度为 O(n).\n" +
                        "\n" +
                        "目前这段源码为比较简易的实现，leetcode 上的运行时间为500 + ms, 还有较大的优化空间，嗯，后续再进行优化。\n" +
                        "\n" +
                        "Reference\n" +
                        "\n" +
                        "3Sum | 九章算法 * A simply Python version based on 2sum - O(n^2) - Leetcode Discuss");
                this.map.put("3 Sum Closest", "Source\n" +
                        "\n" +
                        "leetcode: 3Sum Closest | LeetCode OJ * lintcode: (59) 3 Sum Closest\n" +
                        "题解1 - 排序 + 2 Sum + 两根指针 + 优化过滤\n" +
                        "\n" +
                        "和 3 Sum 的思路接近，首先对原数组排序，随后将3 Sum 的题拆解为『1 Sum + 2 Sum』的题，对于 Closest 的题使用两根指针而不是哈希表的方法较为方便。对于有序数组来说，在查找 Cloest 的值时其实是有较大的优化空间的。\n" +
                        "\n" +
                        "Python\n" +
                        "\n" +
                        "class Solution:\n" +
                        "    \"\"\"\n" +
                        "    @param numbers: Give an array numbers of n integer\n" +
                        "    @param target : An integer\n" +
                        "    @return : return the sum of the three integers, the sum closest target.\n" +
                        "    \"\"\"\n" +
                        "    def threeSumClosest(self, numbers, target):\n" +
                        "        result = 2**31 - 1\n" +
                        "        length = len(numbers)\n" +
                        "        if length < 3:\n" +
                        "            return result\n" +
                        "\n" +
                        "        numbers.sort()\n" +
                        "        larger_count = 0\n" +
                        "        for i, item_i in enumerate(numbers):\n" +
                        "            start = i + 1\n" +
                        "            end = length - 1\n" +
                        "            # optimization 1 - filter the smallest sum greater then target\n" +
                        "            if start < end:\n" +
                        "                sum3_smallest = numbers[start] + numbers[start + 1] + item_i\n" +
                        "                if sum3_smallest > target:\n" +
                        "                    larger_count += 1\n" +
                        "                    if larger_count > 1:\n" +
                        "                        return result\n" +
                        "\n" +
                        "            while (start < end):\n" +
                        "                sum3 = numbers[start] + numbers[end] + item_i\n" +
                        "                if abs(sum3 - target) < abs(result - target):\n" +
                        "                    result = sum3\n" +
                        "\n" +
                        "                # optimization 2 - filter the sum3 closest to target\n" +
                        "                sum_flag = 0\n" +
                        "                if sum3 > target:\n" +
                        "                    end -= 1\n" +
                        "                    if sum_flag == -1:\n" +
                        "                        break\n" +
                        "                    sum_flag = 1\n" +
                        "                elif sum3 < target:\n" +
                        "                    start += 1\n" +
                        "                    if sum_flag == 1:\n" +
                        "                        break\n" +
                        "                    sum_flag = -1\n" +
                        "                else:\n" +
                        "                    return result\n" +
                        "\n" +
                        "        return result\n" +
                        "源码分析\n" +
                        "\n" +
                        "leetcode 上不让自己导入sys包，保险起见就初始化了result为还算较大的数，作为异常的返回值。\n" +
                        "对数组进行排序。\n" +
                        "依次遍历排序后的数组，取出一个元素item_i后即转化为『2 Sum Cloest』问题。『2 Sum Cloest』的起始元素索引为i + 1，之前的元素不能参与其中。\n" +
                        "优化一——由于已经对原数组排序，故遍历原数组时比较最小的三个元素和target值，若第二次大于target果断就此罢休，后面的值肯定越来越大。\n" +
                        "两根指针求『2 Sum Cloest』，比较sum3和result与target的差值的绝对值，更新result为较小的绝对值。\n" +
                        "再度对『2 Sum Cloest』进行优化，仍然利用有序数组的特点，若处于『一大一小』的临界值时就可以马上退出了，后面的元素与target之差的绝对值只会越来越大。\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "对原数组排序，平均时间复杂度为 O(nlogn), 两重for循环，由于有两处优化，故最坏的时间复杂度才是 O(n\u200B2\u200B\u200B), 使用了result作为临时值保存最接近target的值，两处优化各使用了一个辅助变量，空间复杂度 O(1).\n" +
                        "\n" +
                        "Reference\n" +
                        "\n" +
                        "3Sum Closest | 九章算法");
                this.map.put("Remove Duplicates from Sorted Array", "Source\n" +
                        "\n" +
                        "lintcode: (100) Remove Duplicates from Sorted Array\n" +
                        "Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.\n" +
                        "\n" +
                        "Do not allocate extra space for another array, you must do this in place with constant memory.\n" +
                        "\n" +
                        "For example,\n" +
                        "Given input array A = [1,1,2],\n" +
                        "\n" +
                        "Your function should return length = 2, and A is now [1,2].\n" +
                        "\n" +
                        "Example\n" +
                        "题解\n" +
                        "\n" +
                        "使用双指针(下标)，一个指针(下标)遍历vector数组，另一个指针(下标)只取不重复的数置于原vector中。\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param A: a list of integers\n" +
                        "     * @return : return an integer\n" +
                        "     */\n" +
                        "    int removeDuplicates(vector &nums) {\n" +
                        "        if (nums.empty()) {\n" +
                        "            return 0;\n" +
                        "        }\n" +
                        "\n" +
                        "        int size = 0;\n" +
                        "        for (vector::size_type i = 0; i != nums.size(); ++i) {\n" +
                        "            if (nums[i] != nums[size]) {\n" +
                        "                nums[++size] = nums[i];\n" +
                        "            }\n" +
                        "        }\n" +
                        "        return ++size;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "注意最后需要返回的是++size或者size + 1");
                this.map.put("Remove Duplicates from Sorted Array II", "Source\n" +
                        "\n" +
                        "lintcode: (101) Remove Duplicates from Sorted Array II\n" +
                        "Follow up for \"Remove Duplicates\":\n" +
                        "What if duplicates are allowed at most twice?\n" +
                        "\n" +
                        "For example,\n" +
                        "Given sorted array A = [1,1,1,2,2,3],\n" +
                        "\n" +
                        "Your function should return length = 5, and A is now [1,1,2,2,3].\n" +
                        "Example\n" +
                        "题解\n" +
                        "\n" +
                        "在上题基础上加了限制条件元素最多可重复出现两次。因此可以在原题的基础上添加一变量跟踪元素重复出现的次数，小于指定值时执行赋值操作。但是需要注意的是重复出现次 数occurence的初始值(从1开始，而不是0)和reset的时机。\n" +
                        "\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param A: a list of integers\n" +
                        "     * @return : return an integer\n" +
                        "     */\n" +
                        "    int removeDuplicates(vector &nums) {\n" +
                        "        if (nums.size() < 3) {\n" +
                        "            return nums.size();\n" +
                        "        }\n" +
                        "\n" +
                        "        int size = 0;\n" +
                        "        int occurence = 1;\n" +
                        "        for (vector::size_type i = 1; i != nums.size(); ++i) {\n" +
                        "            if (nums[size] != nums[i]) {\n" +
                        "                nums[++size] = nums[i];\n" +
                        "                occurence = 1;\n" +
                        "            } else if (nums[size] == nums[i]) {\n" +
                        "                if (occurence++ < 2) {\n" +
                        "                    nums[++size] = nums[i];\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        return ++size;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "在数组元素小于3(即为2)时可直接返回vector数组大小。\n" +
                        "初始化occurence的值为1，而不是0. 理解起来也方便些。\n" +
                        "初始化下标值i从1开始\n" +
                        "nums[size] != nums[i]时递增size并赋值，同时重置occurence的值为1\n" +
                        "(nums[size] == nums[i])时，首先判断occurence的值是否小于2，小于2则先递增size，随后将nums[i]的值赋给nums[size]。这里由于小标i从1开始，免去了对i为0的特殊情况考虑。\n" +
                        "最后返回size + 1，即为++size");
                this.map.put("Merge Sorted Array", "Source\n" +
                        "\n" +
                        "leetcode: Merge Sorted Array | LeetCode OJ * lintcode: (6) Merge Sorted Array\n" +
                        "Merge two given sorted integer array A and B into a new sorted integer array.\n" +
                        "\n" +
                        "Example\n" +
                        "A=[1,2,3,4]\n" +
                        "\n" +
                        "B=[2,4,5,6]\n" +
                        "\n" +
                        "return [1,2,2,3,4,4,5,6]\n" +
                        "\n" +
                        "Challenge\n" +
                        "How can you optimize your algorithm if one array is very large and the other is very small?\n" +
                        "题解\n" +
                        "\n" +
                        "自尾部向首部逐个比较两个数组内的元素，取较大的置于新数组尾部元素中。\n" +
                        "\n" +
                        "Python\n" +
                        "\n" +
                        "class Solution:\n" +
                        "    # @param {integer[]} nums1\n" +
                        "    # @param {integer} m\n" +
                        "    # @param {integer[]} nums2\n" +
                        "    # @param {integer} n\n" +
                        "    # @return {void} Do not return anything, modify nums1 in-place instead.\n" +
                        "    def merge(self, nums1, m, nums2, n):\n" +
                        "        # resize nums1 to required size\n" +
                        "        nums1 += [0] * (n + m - len(nums1))\n" +
                        "        index = m + n\n" +
                        "        while m > 0 and n > 0:\n" +
                        "            if nums1[m - 1] > nums2[n - 1]:\n" +
                        "                index -= 1\n" +
                        "                m -= 1\n" +
                        "                nums1[index] = nums1[m]\n" +
                        "            else:\n" +
                        "                index -= 1\n" +
                        "                n -= 1\n" +
                        "                nums1[index] = nums2[n]\n" +
                        "\n" +
                        "        while n > 0:\n" +
                        "            index -= 1\n" +
                        "            n -= 1\n" +
                        "            nums1[index] = nums2[n]\n" +
                        "Java\n" +
                        "\n" +
                        "class Solution {\n" +
                        "    /**\n" +
                        "     * @param A and B: sorted integer array A and B.\n" +
                        "     * @return: A new sorted integer array\n" +
                        "     */\n" +
                        "    public ArrayList mergeSortedArray(ArrayList A, ArrayList B) {\n" +
                        "        // write your code here\n" +
                        "        int aLen = A.size();\n" +
                        "        int bLen = B.size();\n" +
                        "        ArrayList res = new ArrayList();\n" +
                        "\n" +
                        "        int i = 0, j = 0;\n" +
                        "        while (i < aLen || j < bLen) {\n" +
                        "            if (i == aLen) {\n" +
                        "                res.add(B.get(j++));\n" +
                        "                continue;\n" +
                        "            } else if (j == bLen) {\n" +
                        "                res.add(A.get(i++));\n" +
                        "                continue;\n" +
                        "            }\n" +
                        "\n" +
                        "            if (A.get(i) < B.get(j)) {\n" +
                        "                res.add(A.get(i++));\n" +
                        "            } else {\n" +
                        "                res.add(B.get(j++));\n" +
                        "            }\n" +
                        "        }\n" +
                        "        return res;\n" +
                        "    }\n" +
                        "}\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param A and B: sorted integer array A and B.\n" +
                        "     * @return: A new sorted integer array\n" +
                        "     */\n" +
                        "    vector mergeSortedArray(vector &A, vector &B) {\n" +
                        "        if (A.empty()) {\n" +
                        "            return B;\n" +
                        "        }\n" +
                        "        if (B.empty()) {\n" +
                        "            return A;\n" +
                        "        }\n" +
                        "\n" +
                        "        vector::size_type sizeA = A.size();\n" +
                        "        vector::size_type sizeB = B.size();\n" +
                        "        vector::size_type sizeC = sizeA + sizeB;\n" +
                        "        vector C(sizeC);\n" +
                        "\n" +
                        "        while (sizeA > 0 && sizeB > 0) {\n" +
                        "            if (A[sizeA - 1] > B[sizeB - 1]) {\n" +
                        "                C[--sizeC] = A[--sizeA];\n" +
                        "            } else {\n" +
                        "                C[--sizeC] = B[--sizeB];\n" +
                        "            }\n" +
                        "        }\n" +
                        "        while (sizeA > 0) {\n" +
                        "            C[--sizeC] = A[--sizeA];\n" +
                        "        }\n" +
                        "        while (sizeB > 0) {\n" +
                        "            C[--sizeC] = B[--sizeB];\n" +
                        "        }\n" +
                        "\n" +
                        "        return C;\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "分三种情况遍历比较。实际上在能确定最后返回的数组时，只需要分两次遍历即可。\n" +
                        "\n" +
                        "复杂度分析\n" +
                        "\n" +
                        "最坏情况下需要遍历两个数组中所有元素，时间复杂度为 O(n). 空间复杂度 O(1).\n" +
                        "\n" +
                        "Challenge\n" +
                        "\n" +
                        "两个倒排列表，一个特别大，一个特别小，如何 Merge？此时应该考虑用一个二分法插入小的，即内存拷贝。");
                this.map.put("Merge Sorted Array II", "Source\n" +
                        "\n" +
                        "lintcode: (64) Merge Sorted Array II\n" +
                        "Given two sorted integer arrays A and B, merge B into A as one sorted array.\n" +
                        "\n" +
                        "Note\n" +
                        "You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. The number of elements initialized in A and B are mand n respectively.\n" +
                        "\n" +
                        "Example\n" +
                        "A = [1, 2, 3, empty, empty] B = [4,5]\n" +
                        "\n" +
                        "After merge, A will be filled as [1,2,3,4,5]\n" +
                        "题解\n" +
                        "\n" +
                        "在上题的基础上加入了in-place的限制。将上题的新数组视为length相对较大的数组即可，仍然从数组末尾进行归并，取出较大的元素。\n" +
                        "\n" +
                        "Java\n" +
                        "\n" +
                        "class Solution {\n" +
                        "    /**\n" +
                        "     * @param A: sorted integer array A which has m elements,\n" +
                        "     *           but size of A is m+n\n" +
                        "     * @param B: sorted integer array B which has n elements\n" +
                        "     * @return: void\n" +
                        "     */\n" +
                        "    public void mergeSortedArray(int A[], int m, int B[], int n) {\n" +
                        "        int index = n + m;\n" +
                        "\n" +
                        "        while (m > 0 && n > 0) {\n" +
                        "            if (A[m - 1] > B[n - 1]) {\n" +
                        "                A[--index] = A[--m];\n" +
                        "            } else {\n" +
                        "                A[--index] = B[--n];\n" +
                        "            }\n" +
                        "        }\n" +
                        "        while (n > 0) {\n" +
                        "            A[--index] = B[--n];\n" +
                        "        }\n" +
                        "        while (m > 0) {\n" +
                        "            A[--index] = A[--m];\n" +
                        "        }\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "因为本题有了 in-place 的限制，则必须从数组末尾的两个元素开始比较；否则就会产生挪动，一旦挪动就会是 O(n\u200B2\u200B\u200B) 的。\n" +
                        "C++\n" +
                        "\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param A: sorted integer array A which has m elements,\n" +
                        "     *           but size of A is m+n\n" +
                        "     * @param B: sorted integer array B which has n elements\n" +
                        "     * @return: void\n" +
                        "     */\n" +
                        "    void mergeSortedArray(int A[], int m, int B[], int n) {\n" +
                        "        int index = n + m;\n" +
                        "\n" +
                        "        while (m > 0 && n > 0) {\n" +
                        "            if (A[m - 1] > B[n - 1]) {\n" +
                        "                A[--index] = A[--m];\n" +
                        "            } else {\n" +
                        "                A[--index] = B[--n];\n" +
                        "            }\n" +
                        "        }\n" +
                        "        while (n > 0) {\n" +
                        "            A[--index] = B[--n];\n" +
                        "        }\n" +
                        "        while (m > 0) {\n" +
                        "            A[--index] = A[--m];\n" +
                        "        }\n" +
                        "    }\n" +
                        "};");
                this.map.put("Binary Search", "Source\n" +
                        "\n" +
                        "lintcode: lintcode - (14) Binary Search\n" +
                        "Binary search is a famous question in algorithm.\n" +
                        "\n" +
                        "For a given sorted array (ascending order) and a target number, find the first index of this number in O(log n) time complexity.\n" +
                        "\n" +
                        "If the target number does not exist in the array, return -1.\n" +
                        "\n" +
                        "Example\n" +
                        "If the array is [1, 2, 3, 3, 4, 5, 10], for given target 3, return 2.\n" +
                        "\n" +
                        "Challenge\n" +
                        "If the count of numbers is bigger than MAXINT, can your code work properly?\n" +
                        "题解\n" +
                        "\n" +
                        "对于已排序升序数组，使用二分查找可满足复杂度要求，注意数组中可能有重复值。\n" +
                        "\n" +
                        "Java\n" +
                        "\n" +
                        "/**\n" +
                        " * 本代码fork自九章算法。没有版权欢迎转发。\n" +
                        " * http://www.jiuzhang.com//solutions/binary-search/\n" +
                        " */\n" +
                        "class Solution {\n" +
                        "    /**\n" +
                        "     * @param nums: The integer array.\n" +
                        "     * @param target: Target to find.\n" +
                        "     * @return: The first position of target. Position starts from 0.\n" +
                        "     */\n" +
                        "    public int binarySearch(int[] nums, int target) {\n" +
                        "        if (nums == null || nums.length == 0) {\n" +
                        "            return -1;\n" +
                        "        }\n" +
                        "\n" +
                        "        int start = 0;\n" +
                        "        int end = nums.length - 1;\n" +
                        "        int mid;\n" +
                        "        while (start + 1 < end) {\n" +
                        "            mid = start + (end - start) / 2; // avoid overflow when (end + start)\n" +
                        "            if (target < nums[mid]) {\n" +
                        "                end = mid;\n" +
                        "            } else if (target > nums[mid]) {\n" +
                        "                start = mid;\n" +
                        "            } else {\n" +
                        "                end = mid;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        if (nums[start] == target) {\n" +
                        "            return start;\n" +
                        "        }\n" +
                        "        if (nums[end] == target) {\n" +
                        "            return end;\n" +
                        "        }\n" +
                        "\n" +
                        "        return -1;\n" +
                        "    }\n" +
                        "}\n" +
                        "源码分析\n" +
                        "\n" +
                        "首先对输入做异常处理，数组为空或者长度为0。\n" +
                        "初始化 start, end, mid三个变量，注意mid的求值方法，可以防止两个整型值相加时溢出。\n" +
                        "使用迭代而不是递归进行二分查找，因为工程中递归写法存在潜在溢出的可能。\n" +
                        "while终止条件应为start + 1 < end而不是start <= end，start == end时可能出现死循环。即循环终止条件是相邻或相交元素时退出。\n" +
                        "迭代终止时target应为start或者end中的一个——由上述循环终止条件有两个，具体谁先谁后视题目是找 first position or last position 而定。\n" +
                        "赋值语句end = mid有两个条件是相同的，可以选择写到一块。\n" +
                        "配合while终止条件start + 1 < end（相邻即退出）的赋值语句mid永远没有+1或者-1，这样不会死循环。");
                this.map.put("Search Insert Position", "Source\n" +
                        "\n" +
                        "lintcode: (60) Search Insert Position\n" +
                        "Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.\n" +
                        "\n" +
                        "You may assume no duplicates in the array.\n" +
                        "\n" +
                        "Example\n" +
                        "[1,3,5,6], 5 → 2\n" +
                        "[1,3,5,6], 2 → 1\n" +
                        "[1,3,5,6], 7 → 4\n" +
                        "[1,3,5,6], 0 → 0\n" +
                        "题解\n" +
                        "\n" +
                        "应该把二分法的问题拆解为find the first/last position of...的问题。由最原始的二分查找可找到不小于目标整数的最小下标。返回此下标即可。\n" +
                        "\n" +
                        "Java\n" +
                        "\n" +
                        "public class Solution {\n" +
                        "    /**\n" +
                        "     * param A : an integer sorted array\n" +
                        "     * param target :  an integer to be inserted\n" +
                        "     * return : an integer\n" +
                        "     */\n" +
                        "    public int searchInsert(int[] A, int target) {\n" +
                        "        if (A == null) {\n" +
                        "            return -1;\n" +
                        "        }\n" +
                        "        if (A.length == 0) {\n" +
                        "            return 0;\n" +
                        "        }\n" +
                        "\n" +
                        "        int start = 0, end = A.length - 1;\n" +
                        "        int mid;\n" +
                        "\n" +
                        "        while (start + 1 < end) {\n" +
                        "            mid = start + (end - start) / 2;\n" +
                        "            if (A[mid] == target) {\n" +
                        "                return mid; // no duplicates, if not `end = target;`\n" +
                        "            } else if (A[mid] < target) {\n" +
                        "                start = mid;\n" +
                        "            } else {\n" +
                        "                end = mid;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        if (A[start] >= target) {\n" +
                        "            return start;\n" +
                        "        } else if (A[end] >= target) {\n" +
                        "            return end; // in most cases\n" +
                        "        } else {\n" +
                        "            return end + 1; // A[end] < target;\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n" +
                        "源码分析\n" +
                        "\n" +
                        "要注意例子中的第三个, [1,3,5,6], 7 → 4，即找不到要找的数字的情况，此时应返回数组长度，即代码中最后一个else的赋值语句return end + 1;");
                this.map.put("Search for a Range", "Source\n" +
                        "\n" +
                        "lintcode: (61) Search for a Range\n" +
                        "Given a sorted array of integers, find the starting and ending position of a given target value.\n" +
                        "\n" +
                        "Your algorithm's runtime complexity must be in the order of O(log n).\n" +
                        "\n" +
                        "If the target is not found in the array, return [-1, -1].\n" +
                        "\n" +
                        "Example\n" +
                        "Given [5, 7, 7, 8, 8, 10] and target value 8,\n" +
                        "return [3, 4].\n" +
                        "题解\n" +
                        "\n" +
                        "Search for a range 的题目可以拆解为找 first & last position 的题目，即要做两次二分。由上题二分查找可找到满足条件的左边界，因此只需要再将右边界找出即可。注意到在(target == nums[mid]时赋值语句为end = mid，将其改为start = mid即可找到右边界，解毕。\n" +
                        "\n" +
                        "Java\n" +
                        "\n" +
                        "/**\n" +
                        " * 本代码fork自九章算法。没有版权欢迎转发。\n" +
                        " * http://www.jiuzhang.com/solutions/search-for-a-range/\n" +
                        " */\n" +
                        "public class Solution {\n" +
                        "    /**\n" +
                        "     *@param A : an integer sorted array\n" +
                        "     *@param target :  an integer to be inserted\n" +
                        "     *return : a list of length 2, [index1, index2]\n" +
                        "     */\n" +
                        "    public ArrayList searchRange(ArrayList A, int target) {\n" +
                        "        ArrayList result = new ArrayList();\n" +
                        "        int start, end, mid;\n" +
                        "        result.add(-1);\n" +
                        "        result.add(-1);\n" +
                        "\n" +
                        "        if (A == null || A.size() == 0) {\n" +
                        "            return result;\n" +
                        "        }\n" +
                        "\n" +
                        "        // search for left bound\n" +
                        "        start = 0;\n" +
                        "        end = A.size() - 1;\n" +
                        "        while (start + 1 < end) {\n" +
                        "            mid = start + (end - start) / 2;\n" +
                        "            if (A.get(mid) == target) {\n" +
                        "                end = mid; // set end = mid to find the minimum mid\n" +
                        "            } else if (A.get(mid) > target) {\n" +
                        "                end = mid;\n" +
                        "            } else {\n" +
                        "                start = mid;\n" +
                        "            }\n" +
                        "        }\n" +
                        "        if (A.get(start) == target) {\n" +
                        "            result.set(0, start);\n" +
                        "        } else if (A.get(end) == target) {\n" +
                        "            result.set(0, end);\n" +
                        "        } else {\n" +
                        "            return result;\n" +
                        "        }\n" +
                        "\n" +
                        "        // search for right bound\n" +
                        "        start = 0;\n" +
                        "        end = A.size() - 1;\n" +
                        "        while (start + 1 < end) {\n" +
                        "            mid = start + (end - start) / 2;\n" +
                        "            if (A.get(mid) == target) {\n" +
                        "                start = mid; // set start = mid to find the maximum mid\n" +
                        "            } else if (A.get(mid) > target) {\n" +
                        "                end = mid;\n" +
                        "            } else {\n" +
                        "                start = mid;\n" +
                        "            }\n" +
                        "        }\n" +
                        "        if (A.get(end) == target) {\n" +
                        "            result.set(1, end);\n" +
                        "        } else if (A.get(start) == target) {\n" +
                        "            result.set(1, start);\n" +
                        "        } else {\n" +
                        "            return result;\n" +
                        "        }\n" +
                        "\n" +
                        "        return result;\n" +
                        "        // write your code here\n" +
                        "    }\n" +
                        "}\n" +
                        "源码分析\n" +
                        "\n" +
                        "首先对输入做异常处理，数组为空或者长度为0\n" +
                        "初始化 start, end, mid三个变量，注意mid的求值方法，可以防止两个整型值相加时溢出\n" +
                        "使用迭代而不是递归进行二分查找\n" +
                        "while终止条件应为start + 1 < end而不是start <= end，start == end时可能出现死循环\n" +
                        "先求左边界，迭代终止时先判断A.get(start) == target，再判断A.get(end) == target，因为迭代终止时target必取start或end中的一个，而end又大于start，取左边界即为start.\n" +
                        "再求右边界，迭代终止时先判断A.get(end) == target，再判断A.get(start) == target\n" +
                        "两次二分查找除了终止条件不同，中间逻辑也不同，即当A.get(mid) == target如果是左边界（first postion），中间逻辑是end = mid；若是右边界（last position），中间逻辑是start = mid\n" +
                        "两次二分查找中间勿忘记重置 start, end 的变量值。");
                this.map.put("First Bad Version", "Source\n" +
                        "\n" +
                        "lintcode: (74) First Bad Version\n" +
                        "The code base version is an integer and start from 1 to n. One day, someone commit a bad version in the code case, so it caused itself and the following versions are all failed in the unit tests.\n" +
                        "You can determine whether a version is bad by the following interface:\n" +
                        "\n" +
                        "Java:\n" +
                        "    public VersionControl {\n" +
                        "        boolean isBadVersion(int version);\n" +
                        "    }\n" +
                        "C++:\n" +
                        "    class VersionControl {\n" +
                        "    public:\n" +
                        "        bool isBadVersion(int version);\n" +
                        "    };\n" +
                        "Python:\n" +
                        "    class VersionControl:\n" +
                        "        def isBadVersion(version)\n" +
                        "\n" +
                        "Find the first bad version.\n" +
                        "Note\n" +
                        "You should call isBadVersion as few as possible.\n" +
                        "\n" +
                        "Please read the annotation in code area to get the correct way to call isBadVersion in different language. For example, Java is VersionControl.isBadVersion.\n" +
                        "\n" +
                        "Example\n" +
                        "Given n=5\n" +
                        "\n" +
                        "Call isBadVersion(3), get false\n" +
                        "\n" +
                        "Call isBadVersion(5), get true\n" +
                        "\n" +
                        "Call isBadVersion(4), get true\n" +
                        "\n" +
                        "return 4 is the first bad version\n" +
                        "\n" +
                        "Challenge\n" +
                        "Do not call isBadVersion exceed O(logn) times.\n" +
                        "题 Search for a Range 的变形，找出左边界即可。\n" +
                        "\n" +
                        "Java\n" +
                        "\n" +
                        "/**\n" +
                        " * public class VersionControl {\n" +
                        " *     public static boolean isBadVersion(int k);\n" +
                        " * }\n" +
                        " * you can use VersionControl.isBadVersion(k) to judge wether \n" +
                        " * the kth code version is bad or not.\n" +
                        "*/\n" +
                        "class Solution {\n" +
                        "    /**\n" +
                        "     * @param n: An integers.\n" +
                        "     * @return: An integer which is the first bad version.\n" +
                        "     */\n" +
                        "    public int findFirstBadVersion(int n) {\n" +
                        "        // write your code here\n" +
                        "        if (n == 0) {\n" +
                        "            return -1;\n" +
                        "        }\n" +
                        "\n" +
                        "        int start = 1, end = n, mid;\n" +
                        "        while (start + 1 < end) {\n" +
                        "            mid = start + (end - start)/2;\n" +
                        "            if (VersionControl.isBadVersion(mid) == false) {\n" +
                        "                start = mid;\n" +
                        "            } else {\n" +
                        "                end = mid;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        if (VersionControl.isBadVersion(start) == true) {\n" +
                        "            return start;\n" +
                        "        } else if (VersionControl.isBadVersion(end) == true) {\n" +
                        "            return end;\n" +
                        "        } else {\n" +
                        "            return -1; // not found\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n" +
                        "C++\n" +
                        "\n" +
                        "/**\n" +
                        " * class VersionControl {\n" +
                        " *     public:\n" +
                        " *     static bool isBadVersion(int k);\n" +
                        " * }\n" +
                        " * you can use VersionControl::isBadVersion(k) to judge wether\n" +
                        " * the kth code version is bad or not.\n" +
                        "*/\n" +
                        "class Solution {\n" +
                        "public:\n" +
                        "    /**\n" +
                        "     * @param n: An integers.\n" +
                        "     * @return: An integer which is the first bad version.\n" +
                        "     */\n" +
                        "    int findFirstBadVersion(int n) {\n" +
                        "        if (n < 1) {\n" +
                        "            return -1;\n" +
                        "        }\n" +
                        "\n" +
                        "        int start = 1;\n" +
                        "        int end = n;\n" +
                        "        int mid;\n" +
                        "        while (start + 1 < end) {\n" +
                        "            mid = start + (end - start) / 2;\n" +
                        "            if (VersionControl::isBadVersion(mid)) {\n" +
                        "                end = mid;\n" +
                        "            } else {\n" +
                        "                start = mid;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        if (VersionControl::isBadVersion(start)) {\n" +
                        "            return start;\n" +
                        "        } else if (VersionControl::isBadVersion(end)) {\n" +
                        "            return end;\n" +
                        "        }\n" +
                        "\n" +
                        "        return -1;  // find no bad version\n" +
                        "    }\n" +
                        "};\n" +
                        "源码分析\n" +
                        "\n" +
                        "找左边界和Search for a Range类似，但是最好要考虑到有可能end处也为good version，此部分异常也可放在开始的时候处理。\n" +
                        "\n" +
                        "Python\n" +
                        "\n" +
                        "#class VersionControl:\n" +
                        "#    @classmethod\n" +
                        "#    def isBadVersion(cls, id)\n" +
                        "#        # Run unit tests to check whether verison `id` is a bad version\n" +
                        "#        # return true if unit tests passed else false.\n" +
                        "# You can use VersionControl.isBadVersion(10) to check whether version 10 is a\n" +
                        "# bad version.\n" +
                        "class Solution:\n" +
                        "    \"\"\"\n" +
                        "    @param n: An integers.\n" +
                        "    @return: An integer which is the first bad version.\n" +
                        "    \"\"\"\n" +
                        "    def findFirstBadVersion(self, n):\n" +
                        "        if n < 1:\n" +
                        "            return -1\n" +
                        "\n" +
                        "        start, end = 1, n\n" +
                        "        while start + 1 < end:\n" +
                        "            mid = start + (end - start) / 2\n" +
                        "            if VersionControl.isBadVersion(mid):\n" +
                        "                end = mid\n" +
                        "            else:\n" +
                        "                start = mid\n" +
                        "\n" +
                        "        if VersionControl.isBadVersion(start):\n" +
                        "            return start\n" +
                        "        elif VersionControl.isBadVersion(end):\n" +
                        "            return end\n" +
                        "\n" +
                        "        return -1");
                this.map.put("Search a 2D Matrix", "Source\n" +
                        "\n" +
                        "lintcode: (28) Search a 2D Matrix\n" +
                        "Write an efficient algorithm that searches for a value in an m x n matrix.\n" +
                        "\n" +
                        "This matrix has the following properties:\n" +
                        "\n" +
                        "    * Integers in each row are sorted from left to right.\n" +
                        "\n" +
                        "    * The first integer of each row is greater than the last integer of the previous row.\n" +
                        "\n" +
                        "Example\n" +
                        "Consider the following matrix:\n" +
                        "\n" +
                        "[\n" +
                        "\n" +
                        "    [1, 3, 5, 7],\n" +
                        "\n" +
                        "    [10, 11, 16, 20],\n" +
                        "\n" +
                        "    [23, 30, 34, 50]\n" +
                        "\n" +
                        "]\n" +
                        "\n" +
                        "Given target = 3, return true.\n" +
                        "\n" +
                        "Challenge\n" +
                        "O(log(n) + log(m)) time\n" +
                        "题解 - 一次二分搜索 V.S. 两次二分搜索\n" +
                        "\n" +
                        "一次二分搜索\n" +
                        "\n" +
                        "由于矩阵按升序排列，因此可将二维矩阵转换为一维问题。对原始的二分搜索进行适当改变即可(求行和列)。时间复杂度为 O(log(mn))=O(log(m)+log(n))\n" +
                        "\n" +
                        "两次二分搜索\n" +
                        "\n" +
                        "先按行再按列进行搜索，即两次二分搜索。时间复杂度相同。\n" +
                        "\n" +
                        "以一次二分搜素的方法为例。\n" +
                        "\n" +
                        "Java\n" +
                        "\n" +
                        "/**\n" +
                        " * 本代码由九章算法编辑提供。没有版权欢迎转发。\n" +
                        " * http://www.jiuzhang.com/solutions/search-a-2d-matrix\n" +
                        " */\n" +
                        "// Binary Search Once\n" +
                        "public class Solution {\n" +
                        "    public boolean searchMatrix(int[][] matrix, int target) {\n" +
                        "        if (matrix == null || matrix.length == 0) {\n" +
                        "            return false;\n" +
                        "        }\n" +
                        "        if (matrix[0] == null || matrix[0].length == 0) {\n" +
                        "            return false;\n" +
                        "        }\n" +
                        "\n" +
                        "        int row = matrix.length, column = matrix[0].length;\n" +
                        "        int start = 0, end = row * column - 1;\n" +
                        "        int mid, number;\n" +
                        "\n" +
                        "        while (start + 1 < end) {\n" +
                        "            mid = start + (end - start) / 2;\n" +
                        "            number = matrix[mid / column][mid % column];\n" +
                        "            if (number == target) {\n" +
                        "                return true;\n" +
                        "            } else if (number < target) {\n" +
                        "                start = mid;\n" +
                        "            } else {\n" +
                        "                end = mid;\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        if (matrix[start / column][start % column] == target) {\n" +
                        "            return true;\n" +
                        "        } else if (matrix[end / column][end % column] == target) {\n" +
                        "            return true;\n" +
                        "        }\n" +
                        "\n" +
                        "        return false;\n" +
                        "    }\n" +
                        "}\n" +
                        "源码分析\n" +
                        "\n" +
                        "仍然可以使用经典的二分搜索模板，注意下标的赋值即可。\n" +
                        "\n" +
                        "首先对输入做异常处理，不仅要考虑到matrix为空串，还要考虑到matrix[0]也为空串。\n" +
                        "如果搜索结束时target与start或者end的值均不等时，则必在矩阵的值范围之外，避免了特殊情况的考虑。\n" +
                        "第一次A掉这个题用的是分行分列两次搜索，好蠢...");

            this.map.put("Find Peak Element", "Source\n" +
                    "\n" +
                    "leetcode: Find Peak Element | LeetCode OJ * lintcode: (75) Find Peak Element\n" +
                    "There is an integer array which has the following features:\n" +
                    "\n" +
                    "    * The numbers in adjacent positions are different.\n" +
                    "\n" +
                    "    * A[0] < A[1] && A[A.length - 2] > A[A.length - 1].\n" +
                    "\n" +
                    "We define a position P is a peek if A[P] > A[P-1] && A[P] > A[P+1].\n" +
                    "\n" +
                    "Find a peak element in this array. Return the index of the peak.\n" +
                    "\n" +
                    "Note\n" +
                    "The array may contains multiple peeks, find any of them.\n" +
                    "\n" +
                    "Example\n" +
                    "[1, 2, 1, 3, 4, 5, 7, 6]\n" +
                    "\n" +
                    "return index 1 (which is number 2)  or 6 (which is number 7)\n" +
                    "\n" +
                    "Challenge\n" +
                    "Time complexity O(logN)\n" +
                    "题解1 - lintcode\n" +
                    "\n" +
                    "由时间复杂度的暗示可知应使用二分搜索。首先分析若使用传统的二分搜索，若A[mid] > A[mid - 1] && A[mid] < A[mid + 1]，则找到一个peak为A[mid]；若A[mid - 1] > A[mid]，则A[mid]左侧必定存在一个peak，可用反证法证明：若左侧不存在peak，则A[mid]左侧元素必满足A[0] > A[1] > ... > A[mid -1] > A[mid]，与已知A[0] < A[1]矛盾，证毕。同理可得若A[mid + 1] > A[mid]，则A[mid]右侧必定存在一个peak。如此迭代即可得解。\n" +
                    "\n" +
                    "备注：如果本题是找 first/last peak，就不能用二分法了。\n" +
                    "\n" +
                    "Java\n" +
                    "\n" +
                    "class Solution {\n" +
                    "    /**\n" +
                    "     * @param A: An integers array.\n" +
                    "     * @return: return any of peek positions.\n" +
                    "     */\n" +
                    "    public int findPeak(int[] A) {\n" +
                    "        // write your code here\n" +
                    "        if (A == null) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "        if (A.length == 0) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        int start = 0, end = A.length - 1, mid = end / 2;\n" +
                    "        while (start + 1 < end) {\n" +
                    "            mid = start + (end - start)/2;\n" +
                    "            if (A[mid] < A[mid - 1]) {\n" +
                    "                end = mid;\n" +
                    "            } else if (A[mid] < A[mid + 1]) {\n" +
                    "                start = mid;\n" +
                    "            } else {\n" +
                    "                return mid;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        mid = (A[start] > A[end]) ? start : end;\n" +
                    "        return mid;\n" +
                    "    }\n" +
                    "}\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param A: An integers array.\n" +
                    "     * @return: return any of peek positions.\n" +
                    "     */\n" +
                    "    int findPeak(vector A) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector::size_type start = 0;\n" +
                    "        vector::size_type end = A.size() - 1;\n" +
                    "        vector::size_type mid = end / 2;\n" +
                    "\n" +
                    "        while (start + 1 < end) {\n" +
                    "            mid = start + (end - start) / 2;\n" +
                    "            if (A[mid] < A[mid - 1]) {\n" +
                    "                end = mid;\n" +
                    "            } else if (A[mid] < A[mid + 1]) {\n" +
                    "                start = mid;\n" +
                    "            } else {\n" +
                    "                return mid;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        mid = (A[start] > A[end]) ? start : end;\n" +
                    "        return mid;\n" +
                    "    }\n" +
                    "};\n" +
                    "题解2 - leetcode\n" +
                    "\n" +
                    "leetcode 上的题和 lintcode 上有细微的变化，题目如下：\n" +
                    "\n" +
                    "A peak element is an element that is greater than its neighbors.\n" +
                    "\n" +
                    "Given an input array where num[i] ≠ num[i+1],\n" +
                    "find a peak element and return its index.\n" +
                    "\n" +
                    "The array may contain multiple peaks,\n" +
                    "in that case return the index to any one of the peaks is fine.\n" +
                    "\n" +
                    "You may imagine that num[-1] = num[n] = -∞.\n" +
                    "\n" +
                    "For example, in array [1, 2, 3, 1], 3 is a peak element and\n" +
                    "your function should return the index number 2.\n" +
                    "\n" +
                    "click to show spoilers.\n" +
                    "\n" +
                    "Note:\n" +
                    "Your solution should be in logarithmic complexity.\n" +
                    "如果一开始做的是 leetcode 上的版本而不是 lintcode 上的话，这道题难度要大一些。有了以上的分析基础再来刷 leetcode 上的这道题就是小 case 了，注意题中的关键提示num[-1] = num[n] = -∞, 虽然不像 lintcode 上那么直接，但是稍微变通下也能想到。即num[-1] < num[0] && num[n-1] > num[n], 那么问题来了，这样一来就不能确定峰值 一定存在了，因为给定数组为单调序列的话就咩有峰值了，但是实际情况是——题中有负无穷的假设，也就是说在单调序列的情况下，峰值为数组首部或者尾部元素，谁大就是谁 了。\n" +
                    "\n" +
                    "Java1 - readily understood\n" +
                    "\n" +
                    "public class Solution {\n" +
                    "    public int findPeakElement(int[] nums) {\n" +
                    "        if (nums == null || nums.length == 0) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        int start = 0, end = nums.length - 1, mid = end / 2;\n" +
                    "        while (start + 1 < end) {\n" +
                    "            mid = start + (end - start) / 2;\n" +
                    "            if (nums[mid] < nums[mid - 1]) {\n" +
                    "                // 1 peak at least in the left side\n" +
                    "                end = mid;\n" +
                    "            } else if (nums[mid] < nums[mid + 1]) {\n" +
                    "                // 1 peak at least in the right side\n" +
                    "                start = mid;\n" +
                    "            } else {\n" +
                    "                return mid;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        mid = (nums[start] > nums[end]) ? start : end;\n" +
                    "        return mid;\n" +
                    "    }\n" +
                    "}\n" +
                    "源码分析\n" +
                    "\n" +
                    "典型的二分法模板应用，需要注意的是需要考虑单调序列的特殊情况。当然也可使用紧凑一点的实现如改写循环条件为start < end，这样就不用考虑单调序列了，见实现2.\n" +
                    "\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "二分法，时间复杂度 O(logn).\n" +
                    "\n" +
                    "Java2 - compact implementationleetcode_discussion\n" +
                    "\n" +
                    "public class Solution {\n" +
                    "    public int findPeakElement(int[] nums) {\n" +
                    "        if (nums == null || nums.length == 0) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        int start = 0, end = nums.length - 1, mid = end / 2;\n" +
                    "        while (start < end) {\n" +
                    "            if (nums[mid] < nums[mid + 1]) {\n" +
                    "                // 1 peak at least in the right side\n" +
                    "                start = mid + 1;\n" +
                    "            } else {\n" +
                    "                // 1 peak at least in the left side\n" +
                    "                end = mid;\n" +
                    "            }\n" +
                    "            mid = start + (end - start) / 2;\n" +
                    "        }\n" +
                    "\n" +
                    "        return start;\n" +
                    "    }\n" +
                    "}\n" +
                    ">\n" +
                    "\n" +
                    "leetcode 和 lintcode 上给的方法名不一样，leetcode 上的为findPeakElement而 lintcode 上为findPeak，弄混的话会编译错误。\n" +
                    "Reference\n" +
                    "\n" +
                    "leetcode_discussion. Java - Binary-Search Solution - Leetcode Discuss ↩");
            this.map.put("Search in Rotated Sorted Array", "对于旋转数组的分析可使用画图的方法，如下图所示，升序数组经旋转后可能为如下两种形式。Source\n" +
                    "\n" +
                    "lintcode: (62) Search in Rotated Sorted Array\n" +
                    "Suppose a sorted array is rotated at some pivot unknown to you beforehand.\n" +
                    "\n" +
                    "(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).\n" +
                    "\n" +
                    "You are given a target value to search. If found in the array return its index, otherwise return -1.\n" +
                    "\n" +
                    "You may assume no duplicate exists in the array.\n" +
                    "Example\n" +
                    "For [4, 5, 1, 2, 3] and target=1, return 2\n" +
                    "\n" +
                    "For [4, 5,1, 2, 3] and target=0, return -1\n" +
                    "题解\n" +
                    "\n" +
                    "对于有序数组，使用二分搜索比较方便。分析题中的数组特点，旋转后初看是乱序数组，但仔细一看其实里面是存在两段有序数组的。因此该题可转化为如何找出旋转数组中的局 部有序数组，并使用二分搜索解之。结合实际数组在纸上分析较为方便。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * 本代码fork自\n" +
                    " * http://www.jiuzhang.com/solutions/search-in-rotated-sorted-array/\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "    /**\n" +
                    "     * param A : an integer ratated sorted array\n" +
                    "     * param target :  an integer to be searched\n" +
                    "     * return : an integer\n" +
                    "     */\n" +
                    "public:\n" +
                    "    int search(vector &A, int target) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector::size_type start = 0;\n" +
                    "        vector::size_type end = A.size() - 1;\n" +
                    "        vector::size_type mid;\n" +
                    "\n" +
                    "        while (start + 1 < end) {\n" +
                    "            mid = start + (end - start) / 2;\n" +
                    "            if (target == A[mid]) {\n" +
                    "                return mid;\n" +
                    "            }\n" +
                    "            if (A[start] < A[mid]) {\n" +
                    "                // situation 1, numbers between start and mid are sorted\n" +
                    "                if (A[start] <= target && target < A[mid]) {\n" +
                    "                    end = mid;\n" +
                    "                } else {\n" +
                    "                    start = mid;\n" +
                    "                }\n" +
                    "            } else {\n" +
                    "                // situation 2, numbers between mid and end are sorted\n" +
                    "                if (A[mid] < target && target <= A[end]) {\n" +
                    "                    start = mid;\n" +
                    "                } else {\n" +
                    "                    end = mid;\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        if (A[start] == target) {\n" +
                    "            return start;\n" +
                    "        }\n" +
                    "        if (A[end] == target) {\n" +
                    "            return end;\n" +
                    "        }\n" +
                    "        return -1;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "若target == A[mid]，索引找到，直接返回\n" +
                    "寻找局部有序数组，分析A[mid]和两段有序的数组特点，由于旋转后前面有序数组最小值都比后面有序数组最大值大。故若A[start] < A[mid]成立，则start与mid间的元素必有序（要么是前一段有序数组，要么是后一段有序数组，还有可能是未旋转数组）。\n" +
                    "接着在有序数组A[start]~A[mid]间进行二分搜索，但能在A[start]~A[mid]间搜索的前提是A[start] <= target <= A[mid]。\n" +
                    "接着在有序数组A[mid]~A[end]间进行二分搜索，注意前提条件。\n" +
                    "搜索完毕时索引若不是mid或者未满足while循环条件，则测试A[start]或者A[end]是否满足条件。\n" +
                    "最后若未找到满足条件的索引，则返回-1.\n" +
                    "Java\n" +
                    "\n" +
                    "public class Solution {\n" +
                    "    /** \n" +
                    "     *@param A : an integer rotated sorted array\n" +
                    "     *@param target :  an integer to be searched\n" +
                    "     *return : an integer\n" +
                    "     */\n" +
                    "    public int search(int[] A, int target) {\n" +
                    "        // write your code here\n" +
                    "        if (A == null || A.length == 0) { \n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        int start = 0, end = A.length - 1, mid = 0;\n" +
                    "        while (start + 1 < end) {\n" +
                    "            mid = start + (end - start)/2;\n" +
                    "            if (A[mid] == target) {\n" +
                    "                return mid;\n" +
                    "            }\n" +
                    "            if (A[start] < A[mid]) {//part 1\n" +
                    "                if (A[start] <= target && target <= A[mid]) {\n" +
                    "                    end = mid;\n" +
                    "                } else {\n" +
                    "                    start = mid;\n" +
                    "                }\n" +
                    "            } else { //part 2\n" +
                    "                if (A[mid] <= target && target <= A[end]) {\n" +
                    "                    start = mid;\n" +
                    "                } else {\n" +
                    "                    end = mid;\n" +
                    "                }\n" +
                    "            }\n" +
                    "        } // end while\n" +
                    "\n" +
                    "        if (A[start] == target) {\n" +
                    "            return start;\n" +
                    "        } else if (A[end] == target) {\n" +
                    "            return end;\n" +
                    "        } else {\n" +
                    "            return -1; // not found\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "Search in Rotated Sorted Array II\n" +
                    "\n" +
                    "Source\n" +
                    "\n" +
                    "lintcode: (63) 搜索旋转排序数组 II\n" +
                    "跟进“搜索旋转排序数组”，假如有重复元素又将如何？\n" +
                    "\n" +
                    "是否会影响运行时间复杂度？\n" +
                    "\n" +
                    "如何影响？\n" +
                    "\n" +
                    "为何会影响？\n" +
                    "\n" +
                    "写出一个函数判断给定的目标值是否出现在数组中。\n" +
                    "\n" +
                    "样例\n" +
                    "给出[3,4,4,5,7,0,1,2]和target=4，返回 true\n" +
                    "题解\n" +
                    "\n" +
                    "仔细分析此题和之前一题的不同之处，前一题我们利用A[start] < A[mid]这一关键信息，而在此题中由于有重复元素的存在，在A[start] == A[mid]时无法确定有序数组，此时只能依次递增start/递减end以缩小搜索范围，时间复杂度最差变为O(n)。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "    /**\n" +
                    "     * param A : an integer ratated sorted array and duplicates are allowed\n" +
                    "     * param target :  an integer to be search\n" +
                    "     * return : a boolean\n" +
                    "     */\n" +
                    "public:\n" +
                    "    bool search(vector &A, int target) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return false;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector::size_type start = 0;\n" +
                    "        vector::size_type end = A.size() - 1;\n" +
                    "        vector::size_type mid;\n" +
                    "\n" +
                    "        while (start + 1 < end) {\n" +
                    "            mid = start + (end - start) / 2;\n" +
                    "            if (target == A[mid]) {\n" +
                    "                return true;\n" +
                    "            }\n" +
                    "            if (A[start] < A[mid]) {\n" +
                    "                // situation 1, numbers between start and mid are sorted\n" +
                    "                if (A[start] <= target && target < A[mid]) {\n" +
                    "                    end = mid;\n" +
                    "                } else {\n" +
                    "                    start = mid;\n" +
                    "                }\n" +
                    "            } else if (A[start] > A[mid]) {\n" +
                    "                // situation 2, numbers between mid and end are sorted\n" +
                    "                if (A[mid] < target && target <= A[end]) {\n" +
                    "                    start = mid;\n" +
                    "                } else {\n" +
                    "                    end = mid;\n" +
                    "                }\n" +
                    "            } else  {\n" +
                    "                // increment start\n" +
                    "                ++start;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        if (A[start] == target || A[end] == target) {\n" +
                    "            return true;\n" +
                    "        }\n" +
                    "        return false;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "在A[start] == A[mid]时递增start序号即可。");
            this.map.put("Find Minimum in Rotated Sorted Array", "Source\n" +
                    "\n" +
                    "lintcode: (159) Find Minimum in Rotated Sorted Array\n" +
                    "Suppose a sorted array is rotated at some pivot unknown to you beforehand.\n" +
                    "\n" +
                    "(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).\n" +
                    "\n" +
                    "Find the minimum element.\n" +
                    "\n" +
                    "You may assume no duplicate exists in the array.\n" +
                    "\n" +
                    "Example\n" +
                    "Given [4,5,6,7,0,1,2] return 0\n" +
                    "题解\n" +
                    "\n" +
                    "如前节所述，对于旋转数组的分析可使用画图的方法，如下图所示，升序数组经旋转后可能为如下两种形式。最小值可能在上图中的两种位置出现，如果仍然使用数组首部元素作为target去比较，则需要考虑图中右侧情况。使用逆向思维分析，如果使用数组尾部元素分析，则 无需图中右侧的特殊情况。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param num: a rotated sorted array\n" +
                    "     * @return: the minimum number in the array\n" +
                    "     */\n" +
                    "    int findMin(vector &num) {\n" +
                    "        if (num.empty()) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector::size_type start = 0;\n" +
                    "        vector::size_type end = num.size() - 1;\n" +
                    "        vector::size_type mid;\n" +
                    "        while (start + 1 < end) {\n" +
                    "            mid = start + (end - start) / 2;\n" +
                    "            if (num[mid] < num[end]) {\n" +
                    "                end = mid;\n" +
                    "            } else {\n" +
                    "                start = mid;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        if (num[start] < num[end]) {\n" +
                    "            return num[start];\n" +
                    "        } else {\n" +
                    "            return num[end];\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "仅需注意使用num[end]作为判断依据即可，由于题中已给无重复数组的条件，故无需处理num[mid] == num[end]特殊条件。\n" +
                    "\n" +
                    "Find Minimum in Rotated Sorted Array II\n" +
                    "\n" +
                    "Source\n" +
                    "\n" +
                    "lintcode: (160) Find Minimum in Rotated Sorted Array II\n" +
                    "题解\n" +
                    "\n" +
                    "由于此题输入可能有重复元素，因此在num[mid] == num[end]时无法使用二分的方法缩小start或者end的取值范围。此时只能使用递增start/递减end逐步缩小范围。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param num: a rotated sorted array\n" +
                    "     * @return: the minimum number in the array\n" +
                    "     */\n" +
                    "    int findMin(vector &num) {\n" +
                    "        if (num.empty()) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector::size_type start = 0;\n" +
                    "        vector::size_type end = num.size() - 1;\n" +
                    "        vector::size_type mid;\n" +
                    "        while (start + 1 < end) {\n" +
                    "            mid = start + (end - start) / 2;\n" +
                    "            if (num[mid] > num[end]) {\n" +
                    "                start = mid;\n" +
                    "            } else if (num[mid] < num[end]) {\n" +
                    "                end = mid;\n" +
                    "            } else {\n" +
                    "                --end;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        if (num[start] < num[end]) {\n" +
                    "            return num[start];\n" +
                    "        } else {\n" +
                    "            return num[end];\n" +
                    "        }\n" +
                    "    }\n" +
                    "};");
            this.map.put("Search a 2D Matrix II", "Source\n" +
                    "\n" +
                    "lintcode: (38) Search a 2D Matrix II\n" +
                    "Write an efficient algorithm that searches for a value in an m x n matrix, return the occurrence of it.\n" +
                    "\n" +
                    "This matrix has the following properties:\n" +
                    "\n" +
                    "    * Integers in each row are sorted from left to right.\n" +
                    "\n" +
                    "    * Integers in each column are sorted from up to bottom.\n" +
                    "\n" +
                    "    * No duplicate integers in each row or column.\n" +
                    "\n" +
                    "Example\n" +
                    "Consider the following matrix:\n" +
                    "\n" +
                    "[\n" +
                    "\n" +
                    "    [1, 3, 5, 7],\n" +
                    "\n" +
                    "    [2, 4, 7, 8],\n" +
                    "\n" +
                    "    [3, 5, 9, 10]\n" +
                    "\n" +
                    "]\n" +
                    "\n" +
                    "Given target = 3, return 2.\n" +
                    "\n" +
                    "Challenge\n" +
                    "O(m+n) time and O(1) extra space\n" +
                    "题解 - 自右上而左下\n" +
                    "\n" +
                    "复杂度要求——O(m+n) time and O(1) extra space，同时输入只满足自顶向下和自左向右的升序，行与行之间不再有递增关系，与上题有较大区别。时间复杂度为线性要求，因此可从元素排列特点出发，从一端走向另一端无论如何都需要m+n步，因此可分析对角线元素。\n" +
                    "首先分析如果从左上角开始搜索，由于元素升序为自左向右和自上而下，因此如果target大于当前搜索元素时还有两个方向需要搜索，不太合适。\n" +
                    "如果从右上角开始搜索，由于左边的元素一定不大于当前元素，而下面的元素一定不小于当前元素，因此每次比较时均可排除一列或者一行元素（大于当前元素则排除当前行，小于当前元素则排除当前列，由矩阵特点可知），可达到题目要求的复杂度。\n" +
                    "在遇到之前没有遇到过的复杂题目时，可先使用简单的数据进行测试去帮助发现规律。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param matrix: A list of lists of integers\n" +
                    "     * @param target: An integer you want to search in matrix\n" +
                    "     * @return: An integer indicate the total occurrence of target in the given matrix\n" +
                    "     */\n" +
                    "    int searchMatrix(vector > &matrix, int target) {\n" +
                    "        if (matrix.empty() || matrix[0].empty()) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int ROW = matrix.size();\n" +
                    "        const int COL = matrix[0].size();\n" +
                    "\n" +
                    "        int row = 0, col = COL - 1;\n" +
                    "        int occur = 0;\n" +
                    "        while (row < ROW && col >= 0) {\n" +
                    "            if (target == matrix[row][col]) {\n" +
                    "                ++occur;\n" +
                    "                --col;\n" +
                    "            } else if (target < matrix[row][col]){\n" +
                    "                --col;\n" +
                    "            } else {\n" +
                    "                ++row;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return occur;\n" +
                    "    }\n" +
                    "};\n" +
                    "Java\n" +
                    "\n" +
                    "public class Solution {\n" +
                    "    /**\n" +
                    "     * @param matrix: A list of lists of integers\n" +
                    "     * @param: A number you want to search in the matrix\n" +
                    "     * @return: An integer indicate the occurrence of target in the given matrix\n" +
                    "     */\n" +
                    "    public int searchMatrix(int[][] matrix, int target) {\n" +
                    "        int occurence = 0;\n" +
                    "\n" +
                    "        if (matrix == null || matrix.length == 0) {\n" +
                    "            return occurence;\n" +
                    "        }\n" +
                    "        if (matrix[0] == null || matrix[0].length == 0) {\n" +
                    "            return occurence;\n" +
                    "        }\n" +
                    "\n" +
                    "        int row = matrix.length - 1;\n" +
                    "        int column = matrix[0].length - 1;\n" +
                    "        int index_row = 0, index_column = column;\n" +
                    "        int number;\n" +
                    "\n" +
                    "        if (target < matrix[0][0] || target > matrix[row][column]) {\n" +
                    "            return occurence;\n" +
                    "        }\n" +
                    "\n" +
                    "        while (index_row < row + 1 && index_column + 1 > 0) {\n" +
                    "            number = matrix[index_row][index_column];\n" +
                    "            if (target == number) {\n" +
                    "                occurence++;\n" +
                    "                index_column--;\n" +
                    "            } else if (target < number) {\n" +
                    "                index_column--;\n" +
                    "            } else if (target > number) {\n" +
                    "                index_row++;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return occurence;\n" +
                    "    }\n" +
                    "}\n" +
                    "源码分析\n" +
                    "\n" +
                    "首先对输入做异常处理，不仅要考虑到matrix为空串，还要考虑到matrix[0]也为空串。\n" +
                    "注意循环终止条件。\n" +
                    "在找出target后应继续向左搜索其他可能相等的元素，下方比当前元素大，故排除此列。\n" +
                    "Reference\n" +
                    "\n" +
                    "Searching a 2D Sorted Matrix Part II | LeetCode");
            this.map.put("Median of two Sorted Arrays", "Source\n" +
                    "\n" +
                    "lintcode: (65) Median of two Sorted Arrays\n" +
                    "There are two sorted arrays A and B of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).\n" +
                    "\n" +
                    "Example\n" +
                    "For A = [1,2,3,4,5,6] B = [2,3,4,5], the median is 3.5\n" +
                    "\n" +
                    "For A = [1,2,3] B = [4,5], the median is 3\n" +
                    "\n" +
                    "Challenge\n" +
                    "Time Complexity O(logn)\n" +
                    "题解\n" +
                    "\n" +
                    "何谓\"Median\"? 由题目意思可得即为两个数组中一半数据比它大，另一半数据比它小的那个数。详见 中位数 - 维基百科，自由的百科全书，题中已有信息两个数组均为有序，题目要求时间复杂度为O( log)，因此应该往二分法上想。\n" +
                    "\n" +
                    "在两个数组中找第k大数->找中位数即为找第k大数的一个特殊情况——第(A.length + B.length) / 2 大数。因此首先需要解决找第k大数的问题。这个联想确实有点牵强...\n" +
                    "\n" +
                    "使用归并的思想逐个比较找出中位数的复杂度为O(n)，显然不符要求，接下来考虑使用二分法。由于是找第k大数，使用二分法则比较A[k/2 - 1]和B[k/2\n" +
                    "\n" +
                    "1]，并思考这两个元素和第k大元素的关系。\n" +
                    "\n" +
                    "A[k/2 - 1] <= B[k/2 - 1] => A和B合并后的第k大数中必包含A[0]~A[k/2 -1]，可使用归并的思想去理解。\n" +
                    "若k/2 - 1超出A的长度，则必取B[0]~B[k/2 - 1]\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param A: An integer array.\n" +
                    "     * @param B: An integer array.\n" +
                    "     * @return: a double whose format is *.5 or *.0\n" +
                    "     */\n" +
                    "    double findMedianSortedArrays(vector A, vector B) {\n" +
                    "        if (A.empty() && B.empty()) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector NonEmpty;\n" +
                    "        if (A.empty()) {\n" +
                    "            NonEmpty = B;\n" +
                    "        }\n" +
                    "        if (B.empty()) {\n" +
                    "            NonEmpty = A;\n" +
                    "        }\n" +
                    "        if (!NonEmpty.empty()) {\n" +
                    "            vector::size_type len_vec = NonEmpty.size();\n" +
                    "            return len_vec % 2 == 0 ?\n" +
                    "                    (NonEmpty[len_vec / 2 - 1] + NonEmpty[len_vec / 2]) / 2.0 :\n" +
                    "                    NonEmpty[len_vec / 2];\n" +
                    "        }\n" +
                    "\n" +
                    "        vector::size_type len = A.size() + B.size();\n" +
                    "        if (len % 2 == 0) {\n" +
                    "            return ((findKth(A, 0, B, 0, len / 2) + findKth(A, 0, B, 0, len / 2 + 1)) / 2.0);\n" +
                    "        } else {\n" +
                    "            return findKth(A, 0, B, 0, len / 2 + 1);\n" +
                    "        }\n" +
                    "        // write your code here\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    int findKth(vector &A, vector::size_type A_start, vector &B, vector::size_type B_start, int k) {\n" +
                    "        if (A_start > A.size() - 1) {\n" +
                    "            // all of the element of A are smaller than the kTh number\n" +
                    "            return B[B_start + k - 1];\n" +
                    "        }\n" +
                    "        if (B_start > B.size() - 1) {\n" +
                    "            // all of the element of B are smaller than the kTh number\n" +
                    "            return A[A_start + k - 1];\n" +
                    "        }\n" +
                    "\n" +
                    "        if (k == 1) {\n" +
                    "            return A[A_start] < B[B_start] ? A[A_start] : B[B_start];\n" +
                    "        }\n" +
                    "\n" +
                    "        int A_key = A_start + k / 2 - 1 < A.size() ?\n" +
                    "                    A[A_start + k / 2 - 1] : INT_MAX;\n" +
                    "        int B_key = B_start + k / 2 - 1 < B.size() ?\n" +
                    "                    B[B_start + k / 2 - 1] : INT_MAX;\n" +
                    "\n" +
                    "        if (A_key > B_key) {\n" +
                    "            return findKth(A, A_start, B, B_start + k / 2, k - k / 2);\n" +
                    "        } else {\n" +
                    "            return findKth(A, A_start + k / 2, B, B_start, k - k / 2);\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "此题的边界条件较多，不容易直接从代码看清思路。首先分析找k大的辅助程序。\n" +
                    "\n" +
                    "如果A_start > A.size() - 1，意味着A中无数提供，故仅能从B中取，所以只能是B从B_start开始的第k个数。下面的B...分析方法类似。\n" +
                    "k为1时，无需再递归调用，直接返回较小值。\n" +
                    "以A为例，取出自A_start开始的第k / 2个数，若下标A_start + k / 2 - 1 < A.size()，则可取此下标对应的元素，否则置为int的最大值，便于后面进行比较，免去了诸多边界条件的判断。\n" +
                    "比较A_key > B_key，取小的折半递归调用findKth。\n" +
                    "接下来分析findMedianSortedArrays：\n" +
                    "\n" +
                    "首先考虑异常情况，A, B都为空，A/B其中一个为空。\n" +
                    "A+B 的长度为偶数时返回len / 2和 len / 2 + 1的均值，为奇数时则返回len / 2 + 1\n" +
                    "Java\n" +
                    "\n" +
                    "class Solution {\n" +
                    "    /**\n" +
                    "     * @param A: An integer array.\n" +
                    "     * @param B: An integer array.\n" +
                    "     * @return: a double whose format is *.5 or *.0\n" +
                    "     */\n" +
                    "    public double findMedianSortedArrays(int[] A, int[] B) {\n" +
                    "        // write your code here\n" +
                    "        int len = A.length + B.length;\n" +
                    "        if (len % 2 == 0) {\n" +
                    "            return (findKth(A, 0, B, 0, len/2) + findKth(A, 0, B, 0, len/2+1)) / 2.0;\n" +
                    "        } else {\n" +
                    "            return findKth(A, 0, B, 0, len/2 + 1);\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    //find kth number of two sorted array\n" +
                    "    public static int findKth(int[] A, int A_start, int[] B, int B_start, int k) {\n" +
                    "        if (A_start >= A.length) {\n" +
                    "            return B[B_start + k - 1];\n" +
                    "        }\n" +
                    "        if (B_start >= B.length) {\n" +
                    "            return A[A_start + k - 1];\n" +
                    "        }\n" +
                    "        if (k == 1) {\n" +
                    "            return Math.min(A[A_start], B[B_start]);\n" +
                    "        }\n" +
                    "\n" +
                    "        int A_key = (A_start + k/2 - 1 < A.length) // if one array is too short\n" +
                    "                    ? A[A_start + k/2 - 1] : Integer.MAX_VALUE; // trick\n" +
                    "        int B_key = (B_start + k/2 - 1 < B.length) // if one array is too short\n" +
                    "                    ? B[B_start + k/2 - 1] : Integer.MAX_VALUE; // trick\n" +
                    "\n" +
                    "        if (A_key < B_key) {\n" +
                    "            return findKth(A, A_start + k/2, B, B_start, k - k/2);\n" +
                    "        } else {\n" +
                    "            return findKth(A, A_start, B, B_start + k/2, k - k/2);\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "源码分析\n" +
                    "\n" +
                    "本题用非递归的方法非常麻烦，递归的方法减少了很多边界的判断。\n" +
                    "递归的条件比较重要，可以用极端情况时参数的状况来入手，即看[]A, []B, k谁先达到极端情况。\n" +
                    "本解法中有一个小技巧，就是当[]A, []B中某一个数组太短了，无法取k/2，则返回无穷大，设置了Integer.MAX_VALUE。\n" +
                    "reference\n" +
                    "\n" +
                    "九章算法 | Median of Two Sorted Arrays * LeetCode: Median of Two Sorted Arrays 解题报告 - Yu's Garden - 博客园");
            this.map.put("Sqrt x", "Source\n" +
                    "\n" +
                    "leetcode: Sqrt(x) | LeetCode OJ * lintcode: (141) Sqrt(x)\n" +
                    "题解 - 二分搜索\n" +
                    "\n" +
                    "由于只需要求整数部分，故对于任意正整数 x, 设其整数部分为 k, 显然有 1≤k≤x, 求解 k 的值也就转化为了在有序数组中查找满足某种约束条件的元素，显然二分搜索是解决此类问题的良方。\n" +
                    "\n" +
                    "Python\n" +
                    "\n" +
                    "class Solution:\n" +
                    "    # @param {integer} x\n" +
                    "    # @return {integer}\n" +
                    "    def mySqrt(self, x):\n" +
                    "        if x < 0:\n" +
                    "            return -1\n" +
                    "        elif x == 0:\n" +
                    "            return 0\n" +
                    "\n" +
                    "        start, end = 1, x\n" +
                    "        while start + 1 < end:\n" +
                    "            mid = start + (end - start) / 2\n" +
                    "            if mid**2 == x:\n" +
                    "                return mid\n" +
                    "            elif mid**2 > x:\n" +
                    "                end = mid\n" +
                    "            else:\n" +
                    "                start = mid\n" +
                    "\n" +
                    "        return start\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常检测，先处理小于等于0的值。\n" +
                    "使用二分搜索的经典模板，注意不能使用start < end, 否则在给定值1时产生死循环。\n" +
                    "最后返回平方根的整数部分start.\n" +
                    "二分搜索过程很好理解，关键是最后的返回结果还需不需要判断？比如是取 start, end, 还是 mid? 我们首先来分析下二分搜索的循环条件，由while循环条件start + 1 < end可知，start和end只可能有两种关系，一个是end == 1 || end ==2这一特殊情况，返回值均为1，另一个就是循环终止时start恰好在end前一个元素。设值 x 的整数部分为 k, 那么在执行二分搜索的过程中 start≤k≤end 关系一直存在，也就是说在没有找到 mid\u200B2\u200B\u200B==x 时，循环退出时有 startstart了。\n" +
                    "\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "经典的二分搜索，时间复杂度为 O(logn), 使用了start, end, mid变量，空间复杂度为 O(1).\n" +
                    "\n" +
                    "除了使用二分法求平方根近似解之外，还可使用牛顿迭代法进一步提高运算效率，欲知后事如何，请猛戳 求平方根sqrt()函数的底层算法效率问题 -- 简明现代魔 法，不得 不感叹算法的魔力！");
            this.map.put("Wood Cut", "Source\n" +
                    "\n" +
                    "lintcode: (183) Wood Cut\n" +
                    "Given n pieces of wood with length L[i] (integer array).\n" +
                    "Cut them into small pieces to guarantee you could have equal or more than k pieces with the same length.\n" +
                    "What is the longest length you can get from the n pieces of wood?\n" +
                    "Given L & k, return the maximum length of the small pieces.\n" +
                    "\n" +
                    "Example\n" +
                    "For L=[232, 124, 456], k=7, return 114.\n" +
                    "\n" +
                    "Note\n" +
                    "You couldn't cut wood into float length.\n" +
                    "\n" +
                    "Challenge\n" +
                    "O(n log Len), where Len is the longest length of the wood.\n" +
                    "题解 - 二分搜索\n" +
                    "\n" +
                    "这道题要直接想到二分搜素其实不容易，但是看到题中 Challenge 的提示后你大概就能想到往二分搜索上靠了。首先来分析下题意，题目意思是说给出 n 段木材L[i], 将这 n 段木材切分为至少 k 段，这 k 段等长，求能从 n 段原材料中获得的最长单段木材长度。以 k=7 为例，要将 L 中的原材料分为7段，能得到的最大单段长度为114, 232/114 = 2, 124/114 = 1, 456/114 = 4, 2 + 1 + 4 = 7.\n" +
                    "\n" +
                    "理清题意后我们就来想想如何用算法的形式表示出来，显然在计算如2, 1, 4等分片数时我们进行了取整运算，在计算机中则可以使用下式表示： ∑\u200Bi=1\u200Bn\u200B\u200B\u200Bl\u200B\u200BL[i]\u200B\u200B≥k\n" +
                    "\n" +
                    "其中 l 为单段最大长度，显然有 1≤l≤max(L[i]). 单段长度最小为1，最大不可能超过给定原材料中的最大木材长度。\n" +
                    "\n" +
                    ">\n" +
                    "\n" +
                    "注意求和与取整的顺序，是先求 L[i]/l的单个值，而不是先对L[i]求和。\n" +
                    "分析到这里就和题 Sqrt x差不多一样了，要求的是 l 的最大可能取值，同时 l 可以看做是从有序序列[1, max(L[i])]的一个元素，典型的二分搜素！\n" +
                    "\n" +
                    "Python\n" +
                    "\n" +
                    "class Solution:\n" +
                    "    \"\"\"\n" +
                    "    @param L: Given n pieces of wood with length L[i]\n" +
                    "    @param k: An integer\n" +
                    "    return: The maximum length of the small pieces.\n" +
                    "    \"\"\"\n" +
                    "    def woodCut(self, L, k):\n" +
                    "        if sum(L) < k:\n" +
                    "            return 0\n" +
                    "\n" +
                    "        max_len = max(L)\n" +
                    "        start, end = 1, max_len\n" +
                    "        while start + 1 < end:\n" +
                    "            mid = start + (end - start) / 2\n" +
                    "            pieces_sum = sum([len_i / mid for len_i in L])\n" +
                    "            if pieces_sum < k:\n" +
                    "                end = mid\n" +
                    "            else:\n" +
                    "                start = mid\n" +
                    "\n" +
                    "        # corner case\n" +
                    "        if end == 2 and sum([len_i / 2 for len_i in L]) >= k:\n" +
                    "            return 2\n" +
                    "\n" +
                    "        return start\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理，若对 L 求和所得长度都小于 k，那么肯定无解。\n" +
                    "初始化start和end, 使用二分搜索。\n" +
                    "使用 list comprehension 求 ∑\u200Bi=1\u200Bn\u200B\u200B\u200Bl\u200B\u200BL[i]\u200B\u200B.\n" +
                    "若求得的pieces_sum小于 k，则说明mid偏大，下一次循环应缩小mid，对应为将当前mid赋给end.\n" +
                    "与一般的二分搜索不同，即使有pieces_sum == k也不应立即返回mid, 因为这里使用了取整运算，满足pieces_sum == k的值不止一个，应取其中最大的mid, 具体实现中可以将pieces_sum < k写在前面，大于等于的情况直接用start = end代替。\n" +
                    "排除end == 2之后返回start即可。\n" +
                    "简单对第6条做一些说明，首先需要进行二分搜索的前提是 sum(L) >= k且end不满足end == 1 || end == 2, end为2时单独考虑即可。\n" +
                    "\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "遍历求和时间复杂度为 O(n), 二分搜索时间复杂度为 O(logmax(L)). 故总的时间复杂度为 O(nlogmax(L)). 空间复杂度 O(1).\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "Wood Cut | 九章算法");
            this.map.put("Single Number", "找单数」系列题，技巧性较强，需要灵活运用位运算的特性。\n" +
                    "\n" +
                    "Source\n" +
                    "\n" +
                    "lintcode: (82) Single Number\n" +
                    "Given 2*n + 1 numbers, every numbers occurs twice except one, find it.\n" +
                    "\n" +
                    "Example\n" +
                    "Given [1,2,2,1,3,4,3], return 4\n" +
                    "\n" +
                    "Challenge\n" +
                    "One-pass, constant extra space\n" +
                    "题解\n" +
                    "\n" +
                    "根据题意，共有2*n + 1个数，且有且仅有一个数落单，要找出相应的「单数」。鉴于有空间复杂度的要求，不可能使用另外一个数组来保存每个数出现的次数，考虑到异或运算的特性，根据x ^ x = 0和x ^ 0 = x可将给定数组的所有数依次异或，最后保留的即为结果。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param A: Array of integers.\n" +
                    "     * return: The single number.\n" +
                    "     */\n" +
                    "    int singleNumber(vector &A) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "        int result = 0;\n" +
                    "\n" +
                    "        for (vector::iterator iter = A.begin(); iter != A.end(); ++iter) {\n" +
                    "            result = result ^ *iter;\n" +
                    "        }\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理(OJ上对于空vector的期望结果为0，但个人认为-1更为合理)\n" +
                    "初始化返回结果result为0，因为x ^ 0 = x");
            this.map.put("Single Number II", "Source\n" +
                    "\n" +
                    "lintcode: (83) Single Number II\n" +
                    "Given 3*n + 1 numbers, every numbers occurs triple times except one, find it.\n" +
                    "\n" +
                    "Example\n" +
                    "Given [1,1,2,3,3,3,2,2,4,1] return 4\n" +
                    "\n" +
                    "Challenge\n" +
                    "One-pass, constant exstra space\n" +
                    "题解 - 逐位处理\n" +
                    "\n" +
                    "上题 Single Number 用到了二进制中异或的运算特性，这题给出的元素数目为3*n + 1，因此我们很自然地想到如果有种运算能满足「三三运算」为 0该有多好！对于三个相同的数来说，其相加的和必然是3的倍数，仅仅使用这一个特性还不足以将单数找出来，我们再来挖掘隐含的信息。以3为例，若使用不进位加法，三个 3相加的结果为：\n" +
                    "\n" +
                    "0011\n" +
                    "0011\n" +
                    "0011\n" +
                    "----\n" +
                    "0033\n" +
                    "注意到其中的奥义了么？三个相同的数相加，不仅其和能被3整除，其二进制位上的每一位也能被3整除！因此我们只需要一个和int类型相同大小的数组记录每一位累加 的结果即可。时间复杂度约为 O((3n+1)⋅sizeof(int)⋅8)\n" +
                    "\n" +
                    "C++ bit by bit\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param A : An integer array\n" +
                    "     * @return : An integer\n" +
                    "     */\n" +
                    "    int singleNumberII(vector &A) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        int result = 0, bit_i_sum = 0;\n" +
                    "\n" +
                    "        for (int i = 0; i != 8 * sizeof(int); ++i) {\n" +
                    "            bit_i_sum = 0;\n" +
                    "            for (int j = 0; j != A.size(); ++j) {\n" +
                    "                // get the *i*th bit of A\n" +
                    "                bit_i_sum += ((A[j] >> i) & 1);\n" +
                    "            }\n" +
                    "            // set the *i*th bit of result\n" +
                    "            result |= ((bit_i_sum % 3) << i);\n" +
                    "        }\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码解析\n" +
                    "\n" +
                    "异常处理\n" +
                    "循环处理返回结果result的int类型的每一位，要么自增1，要么保持原值。注意i最大可取 8⋅sizeof(int)−1, 字节数=>位数的转换\n" +
                    "对第i位处理完的结果模3后更新result的第i位，由于result初始化为0，故使用或操作即可完成\n" +
                    "Reference\n" +
                    "\n" +
                    "Single Number II - Leetcode Discuss 中抛出了这么一道扩展题：\n" +
                    "\n" +
                    "Given an array of integers, every element appears k times except for one. Find that single one which appears l times.\n" +
                    "@ranmocy 给出了如下经典解：\n" +
                    "\n" +
                    "We need a array x[i] with size k for saving the bits appears i times. For every input number a, generate the new counter by x[j] = (x[j-1] & a) | (x[j] & ~a). Except x[0] = (x[k] & a) | (x[0] & ~a).\n" +
                    "\n" +
                    "In the equation, the first part indicates the the carries from previous one. The second part indicates the bits not carried to next one.\n" +
                    "\n" +
                    "Then the algorithms run in O(kn) and the extra space O(k).\n" +
                    "\n" +
                    "Java\n" +
                    "\n" +
                    "public class Solution {\n" +
                    "    public int singleNumber(int[] A, int k, int l) {\n" +
                    "        if (A == null) return 0;\n" +
                    "        int t;\n" +
                    "        int[] x = new int[k];\n" +
                    "        x[0] = ~0;\n" +
                    "        for (int i = 0; i < A.length; i++) {\n" +
                    "            t = x[k-1];\n" +
                    "            for (int j = k-1; j > 0; j--) {\n" +
                    "                x[j] = (x[j-1] & A[i]) | (x[j] & ~A[i]);\n" +
                    "            }\n" +
                    "            x[0] = (t & A[i]) | (x[0] & ~A[i]);\n" +
                    "        }\n" +
                    "        return x[l];\n" +
                    "    }\n" +
                    "}");
            this.map.put("Single Number III", "");

            this.map.put("O(1) Check Power of 2", "Source\n" +
                    "\n" +
                    "lintcode: (142) O(1) Check Power of 2\n" +
                    "Using O(1) time to check whether an integer n is a power of 2.\n" +
                    "\n" +
                    "Example\n" +
                    "For n=4, return true;\n" +
                    "\n" +
                    "For n=5, return false;\n" +
                    "\n" +
                    "Challenge\n" +
                    "O(1) time\n" +
                    "题解\n" +
                    "\n" +
                    "咋看起来挺简单的一道题目，可之前若是没有接触过神奇的位运算技巧遇到这种题就有点不知从哪入手了，咳咳，我第一次接触到这个题就是在七牛的笔试题中看到的，泪奔 :-(\n" +
                    "\n" +
                    "简单点来考虑可以连除2求余，看最后的余数是否为1，但是这种方法无法在 O(1) 的时间内解出，所以我们必须要想点别的办法了。2的整数幂若用二进制来表示，则其 中必只有一个1，其余全是0，那么怎么才能用一个式子把这种特殊的关系表示出来了？传统的位运算如按位与、按位或和按位异或等均无法直接求解，我就不卖关子了，比较下 x - 1和x的关系试试？以x=4为例。\n" +
                    "\n" +
                    "0100 ==> 4\n" +
                    "0011 ==> 3\n" +
                    "两个数进行按位与就为0了！如果不是2的整数幂则无上述关系，反证法可证之。\n" +
                    "\n" +
                    "Python\n" +
                    "\n" +
                    "class Solution:\n" +
                    "    \"\"\"\n" +
                    "    @param n: An integer\n" +
                    "    @return: True or false\n" +
                    "    \"\"\"\n" +
                    "    def checkPowerOf2(self, n):\n" +
                    "        if n < 1:\n" +
                    "            return False\n" +
                    "        else:\n" +
                    "            return (n & (n - 1)) == 0\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /*\n" +
                    "     * @param n: An integer\n" +
                    "     * @return: True or false\n" +
                    "     */\n" +
                    "    bool checkPowerOf2(int n) {\n" +
                    "        if (1 > n) {\n" +
                    "            return false;\n" +
                    "        } else {\n" +
                    "            return 0 == (n & (n - 1));\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "Java\n" +
                    "\n" +
                    "class Solution {\n" +
                    "    /*\n" +
                    "     * @param n: An integer\n" +
                    "     * @return: True or false\n" +
                    "     */\n" +
                    "    public boolean checkPowerOf2(int n) {\n" +
                    "        if (n < 1) {\n" +
                    "            return false;\n" +
                    "        } else {\n" +
                    "            return (n & (n - 1)) == 0;\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "除了考虑正整数之外，其他边界条件如小于等于0的整数也应考虑在内。在比较0和(n & (n - 1))的值时，需要用括号括起来避免优先级结合的问题。\n" +
                    "\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "O(1).\n" +
                    "\n" +
                    "扩展\n" +
                    "\n" +
                    "关于2的整数幂还有一道有意思的题，比如 Next Power of 2 - GeeksforGeeks，有兴趣的可以去围观下。");
            this.map.put("Convert Integer A to Integer B", "Source\n" +
                    "\n" +
                    "CC150, lintcode: (181) Convert Integer A to Integer B\n" +
                    "Determine the number of bits required to convert integer A to integer B\n" +
                    "\n" +
                    "Example\n" +
                    "Given n = 31, m = 14,return 2\n" +
                    "\n" +
                    "(31)10=(11111)2\n" +
                    "\n" +
                    "(14)10=(01110)2\n" +
                    "题解\n" +
                    "\n" +
                    "比较两个数不同的比特位个数，显然容易想到可以使用异或处理两个整数，相同的位上为0，不同的位上为1，故接下来只需将异或后1的个数求出即可。容易想到的方法是移位 后和1按位与得到最低位的结果，使用计数器记录这一结果，直至最后操作数为0时返回最终值。这种方法需要遍历元素的每一位，有咩有更为高效的做法呢？还记得之前做过的 O1 Check Power of 2 吗？x & (x - 1)既然可以检查2的整数次幂，那么如何才能进一步得到所有1的个数呢？——将异或得到的数分拆为若干个2的整数次幂，计算得到有多少个2的整数次幂即可。\n" +
                    "\n" +
                    "以上的分析过程对于正数来说是毫无问题的，但问题就在于如果出现了负数如何破？不确定的时候就来个实例测测看，以-2为例，(-2) & (-2 - 1)的计算如下所示(简单起见这里以8位为准)：\n" +
                    "\n" +
                    " 11111110 <==> -2   -2 <==> 11111110\n" +
                    "+                          &\n" +
                    " 11111111 <==> -1   -3 <==> 11111101\n" +
                    "=                          =\n" +
                    " 11111101                   11111100\n" +
                    "细心的你也许发现了对于负数来说，其表现也是我们需要的——x & (x - 1)的含义即为将二进制比特位的值为1的最低位置零。逐步迭代直至最终值为0时返回。\n" +
                    "\n" +
                    "C/C++ 和 Java 中左溢出时会直接将高位丢弃，正好方便了我们的计算，但是在 Python 中就没这么幸运了，因为溢出时会自动转换类型，Orz... 所以使用 Python 时需要对负数专门处理，转换为求其补数中0的个数。\n" +
                    "\n" +
                    "Python\n" +
                    "\n" +
                    "class Solution:\n" +
                    "    \"\"\"\n" +
                    "    @param a, b: Two integer\n" +
                    "    return: An integer\n" +
                    "    \"\"\"\n" +
                    "    def bitSwapRequired(self, a, b):\n" +
                    "        count = 0\n" +
                    "        a_xor_b = a ^ b\n" +
                    "        neg_flag = False\n" +
                    "        if a_xor_b < 0:\n" +
                    "            a_xor_b = abs(a_xor_b) - 1\n" +
                    "            neg_flag = True\n" +
                    "        while a_xor_b > 0:\n" +
                    "            count += 1\n" +
                    "            a_xor_b &= (a_xor_b - 1)\n" +
                    "\n" +
                    "        # bit_wise = 32\n" +
                    "        if neg_flag:\n" +
                    "            count = 32 - count\n" +
                    "        return count\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     *@param a, b: Two integer\n" +
                    "     *return: An integer\n" +
                    "     */\n" +
                    "    int bitSwapRequired(int a, int b) {\n" +
                    "        int count = 0;\n" +
                    "        int a_xor_b = a ^ b;\n" +
                    "        while (a_xor_b != 0) {\n" +
                    "            ++count;\n" +
                    "            a_xor_b &= (a_xor_b - 1);\n" +
                    "        }\n" +
                    "\n" +
                    "        return count;\n" +
                    "    }\n" +
                    "};\n" +
                    "Java\n" +
                    "\n" +
                    "class Solution {\n" +
                    "    /**\n" +
                    "     *@param a, b: Two integer\n" +
                    "     *return: An integer\n" +
                    "     */\n" +
                    "    public static int bitSwapRequired(int a, int b) {\n" +
                    "        int count = 0;\n" +
                    "        int a_xor_b = a ^ b;\n" +
                    "        while (a_xor_b != 0) {\n" +
                    "            ++count;\n" +
                    "            a_xor_b &= (a_xor_b - 1);\n" +
                    "        }\n" +
                    "\n" +
                    "        return count;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "Python 中 int 溢出时会自动变为 long 类型，故处理负数时需要求补数中0的个数，间接求得原异或得到的数中1的个数。\n" +
                    "\n" +
                    "考虑到负数的可能，C/C++, Java 中循环终止条件为a_xor_b != 0，而不是a_xor_b > 0.\n" +
                    "\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "取决于异或后数中1的个数，O(max(ones in a ^ b)).\n" +
                    "\n" +
                    "关于 Python 中位运算的一些坑总结在参考链接中。\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "BitManipulation - Python Wiki * 5. Expressions — Python 2.7.10rc0 documentation\n" +
                    "Python之位移操作符所带来的困惑 - 旁观者 - 博客园");
            this.map.put("Factorial Trailing Zeroes", "Source\n" +
                    "\n" +
                    "leetcode: Factorial Trailing Zeroes | LeetCode OJ * lintcode: (2) Trailing Zeros\n" +
                    "Write an algorithm which computes the number of trailing zeros in n factorial.\n" +
                    "\n" +
                    "Example\n" +
                    "11! = 39916800, so the out should be 2\n" +
                    "\n" +
                    "Challenge\n" +
                    "O(log N) time\n" +
                    "题解1 - Iterative\n" +
                    "\n" +
                    "找阶乘数中末尾的连零数量，容易想到的是找相乘能为10的整数倍的数，如 2×5, 1×10 等，遥想当初做阿里笔试题时遇到过类似的题，当时想着算算5和10的个数就好了，可万万没想到啊，25可以变为两个5相乘！真是蠢死了... 根据数论里面的知识，任 何正整数都可以表示为它的质因数的乘积wikipedia。所以比较准确的思路应该是计算质因数5和2的个数，取小的即可。质因数2的个数显然要大于5的个数，故只需 要计算给定阶乘数中质因数中5的个数即可。原题的问题即转化为求阶乘数中质因数5的个数，首先可以试着分析下100以内的数，再试试100以上的数，聪明的你一定想到 了可以使用求余求模等方法 :)\n" +
                    "\n" +
                    "Python\n" +
                    "\n" +
                    "class Solution:\n" +
                    "    # @param {integer} n\n" +
                    "    # @return {integer}\n" +
                    "    def trailingZeroes(self, n):\n" +
                    "        if n < 0:\n" +
                    "            return -1\n" +
                    "\n" +
                    "        count = 0\n" +
                    "        while n > 0:\n" +
                    "            n /= 5\n" +
                    "            count += n\n" +
                    "\n" +
                    "        return count\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    int trailingZeroes(int n) {\n" +
                    "        if (n < 0) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        int count = 0;\n" +
                    "        for (; n > 0; n /= 5) {\n" +
                    "            count += (n / 5);\n" +
                    "        }\n" +
                    "\n" +
                    "        return count;\n" +
                    "    }\n" +
                    "};\n" +
                    "Java\n" +
                    "\n" +
                    "public class Solution {\n" +
                    "    public int trailingZeroes(int n) {\n" +
                    "        if (n < 0) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        int count = 0;\n" +
                    "        for (; n > 0; n /= 5) {\n" +
                    "            count += (n / 5);\n" +
                    "        }\n" +
                    "\n" +
                    "        return count;\n" +
                    "    }\n" +
                    "}\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理，小于0的数返回-1.\n" +
                    "先计算5的正整数幂都有哪些，不断使用 n / 5 即可知质因数5的个数。\n" +
                    "在循环时使用 n /= 5 而不是 i *= 5, 可有效防止溢出。\n" +
                    ">\n" +
                    "\n" +
                    "lintcode 和 leetcode 上的方法名不一样，在两个 OJ 上分别提交的时候稍微注意下。\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "关键在于n /= 5执行的次数，时间复杂度 log\u200B5\u200B\u200Bn，使用了count作为返回值，空间复杂度 O(1).\n" +
                    "\n" +
                    "题解2 - Recursive\n" +
                    "\n" +
                    "可以使用迭代处理的程序往往用递归，而且往往更为优雅。递归的终止条件为n <= 0.\n" +
                    "\n" +
                    "Python\n" +
                    "\n" +
                    "class Solution:\n" +
                    "    # @param {integer} n\n" +
                    "    # @return {integer}\n" +
                    "    def trailingZeroes(self, n):\n" +
                    "        if n == 0:\n" +
                    "            return 0\n" +
                    "        elif n < 0:\n" +
                    "            return -1\n" +
                    "        else:\n" +
                    "            return n / 5 + self.trailingZeroes(n / 5)\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    int trailingZeroes(int n) {\n" +
                    "        if (n == 0) {\n" +
                    "            return 0;\n" +
                    "        } else if (n < 0) {\n" +
                    "            return -1;\n" +
                    "        } else {\n" +
                    "            return n / 5 + trailingZeroes(n / 5);\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "Java\n" +
                    "\n" +
                    "public class Solution {\n" +
                    "    public int trailingZeroes(int n) {\n" +
                    "        if (n == 0) {\n" +
                    "            return 0;\n" +
                    "        } else if (n < 0) {\n" +
                    "            return -1;\n" +
                    "        } else {\n" +
                    "            return n / 5 + trailingZeroes(n / 5);\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "源码分析\n" +
                    "\n" +
                    "这里将负数输入视为异常，返回-1而不是0. 注意使用递归时务必注意收敛和终止条件的返回值。这里递归层数最多不超过 log\u200B5\u200B\u200Bn, 因此效率还是比较高的。\n" +
                    "\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "递归层数最大为 log\u200B5\u200B\u200Bn, 返回值均在栈上，可以认为没有使用辅助的堆空间。\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "wikipedia. Prime factor - Wikipedia, the free encyclopedia ↩\n" +
                    "Count trailing zeroes in factorial of a number - GeeksforGeeks");
            this.map.put("Remove Duplicates from Sorted List", "Source\n" +
                    "\n" +
                    "lintcode: (112) Remove Duplicates from Sorted List\n" +
                    "Given a sorted linked list, delete all duplicates such that each element appear only once.\n" +
                    "\n" +
                    "Example\n" +
                    "Given 1->1->2, return 1->2.\n" +
                    "Given 1->1->2->3->3, return 1->2->3.\n" +
                    "题解\n" +
                    "\n" +
                    "遍历之，遇到当前节点和下一节点的值相同时，删除下一节点，改变当前节点next的指针值。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @return: head node\n" +
                    "     */\n" +
                    "    ListNode *deleteDuplicates(ListNode *head) {\n" +
                    "        if (head == NULL) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *node = head;\n" +
                    "        while (node->next) {\n" +
                    "            if (node->val == node->next->val) {\n" +
                    "                ListNode *temp = node->next;\n" +
                    "                node->next = node->next->next;\n" +
                    "                delete temp;\n" +
                    "            } else {\n" +
                    "                node = node->next;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return head;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "首先进行异常处理，判断head是否为NULL\n" +
                    "遍历链表，node->val == node->next->val时，保存node->next，便于后面进行delete\n" +
                    "不相等时往后指针往后遍历。\n" +
                    "Java\n" +
                    "\n" +
                    "/**\n" +
                    " * http://www.jiuzhang.com/solutions/remove-duplicates-from-sorted-list/\n" +
                    " */\n" +
                    "\n" +
                    "public class Solution {\n" +
                    "    public ListNode deleteDuplicates(ListNode head) {\n" +
                    "        if (head == null) {\n" +
                    "            return null;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode node = head;\n" +
                    "        while (node.next != null) {\n" +
                    "            if (node.val == node.next.val) {\n" +
                    "                node.next = node.next.next;\n" +
                    "            } else {\n" +
                    "                node = node.next;\n" +
                    "            }\n" +
                    "        }\n" +
                    "        return head;\n" +
                    "    }\n" +
                    "}\n" +
                    "Java版有个好处：不用自己管理内存，故不需要进行delete操作。");
            this.map.put("Remove Duplicates from Sorted List II", "Source\n" +
                    "\n" +
                    "lintcode: (113) Remove Duplicates from Sorted List II\n" +
                    "Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.\n" +
                    "\n" +
                    "Example\n" +
                    "Given 1->2->3->3->4->4->5, return 1->2->5.\n" +
                    "Given 1->1->1->2->3, return 2->3.\n" +
                    "题解\n" +
                    "\n" +
                    "上题为保留重复值节点的一个，这题删除全部重复节点，看似区别不大，但是考虑到链表头不确定(可能被删除，也可能保留)，因此若用传统方式需要较多的if条件语句。 这里介绍一个处理链表头不确定的方法——引入dummy node.**\n" +
                    "\n" +
                    "ListNode *dummy = new ListNode(0);\n" +
                    "dummy->next = head;\n" +
                    "ListNode *node = dummy;\n" +
                    "引入新的指针变量dummy，并将其next变量赋值为head，考虑到原来的链表头节点可能被删除，故应该从dummy处开始处理，这里复用了head变量。考 虑链表A->B->C，删除B时，需要处理和考虑的是A和C，将A的next指向C。如果从空间使用效率考虑，可以使用head代替以上的node，含义一样，n ode比较好理解点。\n" +
                    "\n" +
                    "与上题不同的是，由于此题引入了新的节点dummy，不可再使用node->val == node->next->val，因为dummy->val有 可能与第一个节点的值相等。故在判断val是否相等时需先确定node->next和node->next->next均不为空，否则不可对其进行取值。\n" +
                    "\n" +
                    "说多了都是泪，先看看我的错误实现：\n" +
                    "\n" +
                    "C++ Wrong\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution{\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @return: head node\n" +
                    "     */\n" +
                    "    ListNode * deleteDuplicates(ListNode *head) {\n" +
                    "        if (head == NULL || head->next == NULL) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *dummy;\n" +
                    "        dummy->next = head;\n" +
                    "        ListNode *node = dummy;\n" +
                    "\n" +
                    "        while (node->next != NULL && node->next->next != NULL) {\n" +
                    "            if (node->next->val == node->next->next->val) {\n" +
                    "                int val = node->next->val;\n" +
                    "                while (node->next != NULL && val == node->next->val) {\n" +
                    "                    ListNode *temp = node->next;\n" +
                    "                    node->next = node->next->next;\n" +
                    "                    delete temp;\n" +
                    "                }\n" +
                    "            } else {\n" +
                    "                node->next = node->next->next;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return dummy->next;\n" +
                    "    }\n" +
                    "};\n" +
                    "错在什么地方？\n" +
                    "\n" +
                    "节点dummy的初始化有问题，对类的初始化应该使用new\n" +
                    "在else语句中node->next = node->next->next;改写了dummy-next中的内容，返回的dummy-next不再是队首元素，而是队尾元素。原因很微妙，应该使用node = node->next;，node代表节点指针变量，而node->next代表当前节点所指向的下一节点地址。具体分析可自行在纸上画图分析，可对指针和链表的理解又加深不少。图中上半部分为ListNode的内存示意图，每个框底下为其内存地址。dummy指针变量本身的地址为ox7fff5d0d2500，其保存着指针变量值为0x 7fbe7bc04c50. head指针变量本身的地址为ox7fff5d0d2508，其保存着指针变量值为0x7fbe7bc04c00.\n" +
                    "\n" +
                    "好了，接下来看看正确实现及解析。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution{\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @return: head node\n" +
                    "     */\n" +
                    "    ListNode * deleteDuplicates(ListNode *head) {\n" +
                    "        if (head == NULL || head->next == NULL) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *dummy = new ListNode(0);\n" +
                    "        dummy->next = head;\n" +
                    "        ListNode *node = dummy;\n" +
                    "\n" +
                    "        while (node->next != NULL && node->next->next != NULL) {\n" +
                    "            if (node->next->val == node->next->next->val) {\n" +
                    "                int val = node->next->val;\n" +
                    "                while (node->next != NULL && val == node->next->val) {\n" +
                    "                    ListNode *temp = node->next;\n" +
                    "                    node->next = node->next->next;\n" +
                    "                    delete temp;\n" +
                    "                }\n" +
                    "            } else {\n" +
                    "                node = node->next;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return dummy->next;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "首先考虑异常情况，head和head->next均考虑可减少后面的麻烦。\n" +
                    "new一个dummy变量，指向原链表头。\n" +
                    "使用新变量node并设置其为dummy头节点，遍历用。\n" +
                    "当前节点和下一节点val相同时先保存当前值，便于while循环终止条件判断和删除节点。注意这一段代码也比较精炼。\n" +
                    "最后返回dummy->next，即题目所要求的头节点。");
            this.map.put("Partition List", "Source\n" +
                    "\n" +
                    "lintcode: (96) Partition List\n" +
                    "Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.\n" +
                    "\n" +
                    "You should preserve the original relative order of the nodes in each of the two partitions.\n" +
                    "\n" +
                    "For example,\n" +
                    "Given 1->4->3->2->5->2->null and x = 3,\n" +
                    "return 1->2->2->4->3->5->null.\n" +
                    "题解\n" +
                    "\n" +
                    "依据题意，是要根据值x对链表进行分割操作，具体是指将所有小于x的节点放到不小于x的节点之前，咋一看和快速排序的分割有些类似，但是这个题的不同之处在于只要求将 小于x的节点放到前面，而并不要求对元素进行排序。\n" +
                    "\n" +
                    "这种分割的题使用两路指针即可轻松解决。左边指针指向小于x的节点，右边指针指向不小于x的节点。由于头节点不确定，我们可以使用dummy节点这个大杀器。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @param x: an integer\n" +
                    "     * @return: a ListNode\n" +
                    "     */\n" +
                    "    ListNode *partition(ListNode *head, int x) {\n" +
                    "        if (NULL == head) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *leftDummy = new ListNode(0);\n" +
                    "        ListNode *rightDummy = new ListNode(0);\n" +
                    "        ListNode *left = leftDummy;\n" +
                    "        ListNode *right = rightDummy;\n" +
                    "\n" +
                    "        while (head != NULL) {\n" +
                    "            if (head->val < x) {\n" +
                    "                left->next = head;\n" +
                    "                left = head;\n" +
                    "            } else {\n" +
                    "                right->next = head;\n" +
                    "                right = head;\n" +
                    "            }\n" +
                    "            head = head->next;\n" +
                    "        }\n" +
                    "\n" +
                    "        right->next = NULL;\n" +
                    "        left->next = rightDummy->next;\n" +
                    "\n" +
                    "        return leftDummy->next;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理\n" +
                    "引入左右两个dummy节点及left和right左右尾指针\n" +
                    "遍历原链表\n" +
                    "处理右链表，置right->next为空，将右链表的头部链接到左链表尾指针的next，返回左链表的头部");
            this.map.put("Two Lists Sum", "Source\n" +
                    "\n" +
                    "CC150 - (167) Two Lists Sum\n" +
                    "You have two numbers represented by a linked list, where each node contains a single digit.\n" +
                    "The digits are stored in reverse order, such that the 1’s digit is at the head of the list.\n" +
                    "Write a function that adds the two numbers and returns the sum as a linked list.\n" +
                    "\n" +
                    "Example\n" +
                    "Given two lists, 3->1->5->null and 5->9->2->null, return 8->0->8->null\n" +
                    "题解\n" +
                    "\n" +
                    "一道看似简单的进位加法题，实则杀机重重，不信你不看答案自己先做做看。\n" +
                    "\n" +
                    "首先由十进制加法可知应该注意进位的处理，但是这道题仅注意到这点就够了吗？还不够！因为两个链表长度有可能不等长！因此这道题的亮点在于边界和异常条件的处理，来瞅 瞅我自认为相对优雅的实现。\n" +
                    "\n" +
                    "C++ - Iteration\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition for singly-linked list.\n" +
                    " * struct ListNode {\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int x) : val(x), next(NULL) {}\n" +
                    " * };\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param l1: the first list\n" +
                    "     * @param l2: the second list\n" +
                    "     * @return: the sum list of l1 and l2\n" +
                    "     */\n" +
                    "    ListNode *addLists(ListNode *l1, ListNode *l2) {\n" +
                    "        if (NULL == l1 && NULL == l2) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *sumlist = new ListNode(0);\n" +
                    "        ListNode *templist = sumlist;\n" +
                    "\n" +
                    "        int carry = 0;\n" +
                    "        while ((NULL != l1) || (NULL != l2) || (0 != carry)) {\n" +
                    "            // padding for NULL\n" +
                    "            int l1_val = (NULL == l1) ? 0 : l1->val;\n" +
                    "            int l2_val = (NULL == l2) ? 0 : l2->val;\n" +
                    "\n" +
                    "            templist->val = (carry + l1_val + l2_val) % 10;\n" +
                    "            carry = (carry + l1_val + l2_val) / 10;\n" +
                    "\n" +
                    "            if (NULL != l1) l1 = l1->next;\n" +
                    "            if (NULL != l2) l2 = l2->next;\n" +
                    "\n" +
                    "            // return sumlist before generating new ListNode\n" +
                    "            if ((NULL == l1) && (NULL == l2) && (0 == carry)) {\n" +
                    "                return sumlist;\n" +
                    "            }\n" +
                    "            templist->next = new ListNode(0);\n" +
                    "            templist = templist->next;\n" +
                    "        }\n" +
                    "\n" +
                    "        return sumlist;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "迭代能正常进行的条件为(NULL != l1) || (NULL != l2) || (0 != carry), 缺一不可。\n" +
                    "对于空指针节点的处理可以用相对优雅的方式处理 - int l1_val = (NULL == l1) ? 0 : l1->val;\n" +
                    "生成新节点时需要先判断迭代终止条件 - (NULL == l1) && (NULL == l2) && (0 == carry), 避免多生成一位数0。\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "没啥好分析的，时间和空间复杂度均为 O(max(L1,L2)).\n" +
                    "\n" +
                    "C++ - Recursion\n" +
                    "\n" +
                    "除了使用迭代，对于链表类问题也比较适合使用递归实现。\n" +
                    "\n" +
                    "To-be done.\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "CC150 Chapter 9.2 题2.5，中文版 p123\n" +
                    "Add two numbers represented by linked lists | Set 1 - GeeksforGeeks");
            this.map.put("Two Lists Sum Advanced", "Source\n" +
                    "\n" +
                    "CC150 - Add two numbers represented by linked lists | Set 2 - GeeksforGeeks\n" +
                    "Given two numbers represented by two linked lists, write a function that returns sum list.\n" +
                    "The sum list is linked list representation of addition of two input numbers.\n" +
                    "\n" +
                    "Example\n" +
                    "\n" +
                    "Input:\n" +
                    "  First  List: 5->6->3  // represents number 563\n" +
                    "  Second List: 8->4->2  // represents number 842\n" +
                    "Output\n" +
                    "  Resultant list: 1->4->0->5  // represents number 1405\n" +
                    "\n" +
                    "Challenge\n" +
                    "\n" +
                    "Not allowed to modify the lists.\n" +
                    "Not allowed to use explicit extra space.\n" +
                    "题解1 - 反转链表\n" +
                    "\n" +
                    "在题 Two Lists Sum | Data Structure and Algorithm 的基础上改了下数位的表示方式，前者低位在前，高位在后，这个题的高位在前，低位在后。很自然地可以联想到先将链表反转，而后再使用 Two Lists Sum 的解法。\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "Add two numbers represented by linked lists | Set 2 - GeeksforGeeks");
            this.map.put("Remove Nth Node From End of List", "Source\n" +
                    "\n" +
                    "lintcode: (174) Remove Nth Node From End of List\n" +
                    "Given a linked list, remove the nth node from the end of list and return its head.\n" +
                    "\n" +
                    "Note\n" +
                    "The minimum number of nodes in list is n.\n" +
                    "\n" +
                    "Example\n" +
                    "Given linked list: 1->2->3->4->5->null, and n = 2.\n" +
                    "\n" +
                    "After removing the second node from the end, the linked list becomes 1->2->3->5->null.\n" +
                    "\n" +
                    "Challenge\n" +
                    "O(n) time\n" +
                    "题解\n" +
                    "\n" +
                    "简单题， 使用快慢指针解决此题，需要注意最后删除的是否为头节点。让快指针先走n步，直至快指针走到终点，找到需要删除节点之前的一个节点，改变node-> next域即可。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @param n: An integer.\n" +
                    "     * @return: The head of linked list.\n" +
                    "     */\n" +
                    "    ListNode *removeNthFromEnd(ListNode *head, int n) {\n" +
                    "        if (NULL == head || n < 0) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *preN = head;\n" +
                    "        ListNode *tail = head;\n" +
                    "        // slow fast pointer\n" +
                    "        int index = 0;\n" +
                    "        while (index < n) {\n" +
                    "            if (NULL == tail) {\n" +
                    "                return NULL;\n" +
                    "            }\n" +
                    "            tail = tail->next;\n" +
                    "            ++index;\n" +
                    "        }\n" +
                    "\n" +
                    "        if (NULL == tail) {\n" +
                    "            return head->next;\n" +
                    "        }\n" +
                    "\n" +
                    "        while (tail->next) {\n" +
                    "            tail = tail->next;\n" +
                    "            preN = preN->next;\n" +
                    "        }\n" +
                    "        preN->next = preN->next->next;\n" +
                    "\n" +
                    "        return head;\n" +
                    "    }\n" +
                    "};\n" +
                    "以上代码单独判断了是否需要删除头节点的情况，在遇到头节点不确定的情况下，引入dummy节点将会使代码更加优雅，改进的代码如下。\n" +
                    "\n" +
                    "C++ dummy node\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @param n: An integer.\n" +
                    "     * @return: The head of linked list.\n" +
                    "     */\n" +
                    "    ListNode *removeNthFromEnd(ListNode *head, int n) {\n" +
                    "        if (NULL == head || n < 1) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *dummy = new ListNode(0);\n" +
                    "        dummy->next = head;\n" +
                    "        ListNode *preDel = dummy;\n" +
                    "\n" +
                    "        for (int i = 0; i != n; ++i) {\n" +
                    "            if (NULL == head) {\n" +
                    "                return NULL;\n" +
                    "            }\n" +
                    "            head = head->next;\n" +
                    "        }\n" +
                    "\n" +
                    "        while (head) {\n" +
                    "            head = head->next;\n" +
                    "            preDel = preDel->next;\n" +
                    "        }\n" +
                    "        preDel->next = preDel->next->next;\n" +
                    "\n" +
                    "        return dummy->next;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "引入dummy节点后画个图分析下就能确定head和preDel的转移关系了。");
            this.map.put("Linked List Cycle", "Source\n" +
                    "\n" +
                    "leetcode: Linked List Cycle | LeetCode OJ * lintcode: (102) Linked List Cycle\n" +
                    "Given a linked list, determine if it has a cycle in it.\n" +
                    "\n" +
                    "Example\n" +
                    "Given -21->10->4->5, tail connects to node index 1, return true\n" +
                    "\n" +
                    "Challenge\n" +
                    "Follow up:\n" +
                    "Can you solve it without using extra space?\n" +
                    "题解 - 快慢指针\n" +
                    "\n" +
                    "对于带环链表的检测，效率较高且易于实现的一种方式为使用快慢指针。快指针每次走两步，慢指针每次走一步，如果快慢指针相遇(快慢指针所指内存为同一区域)则有环，否 则快指针会一直走到NULL为止退出循环，返回false.\n" +
                    "\n" +
                    "快指针走到NULL退出循环即可确定此链表一定无环这个很好理解。那么带环的链表快慢指针一定会相遇吗？先来看看下图。\n" +
                    "\n在有环的情况下，最终快慢指针一定都走在环内，加入第i次遍历时快指针还需要k步才能追上慢指针，由于快指针比慢指针每次多走一步。那么每遍历一次快慢指针间 的间距都会减少1，直至最终相遇。故快慢指针相遇一定能确定该链表有环。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @return: True if it has a cycle, or false\n" +
                    "     */\n" +
                    "    bool hasCycle(ListNode *head) {\n" +
                    "        if (NULL == head || NULL == head->next) {\n" +
                    "            return false;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *slow = head, *fast = head->next;\n" +
                    "        while (NULL != fast && NULL != fast->next) {\n" +
                    "            fast = fast->next->next;\n" +
                    "            slow = slow->next;\n" +
                    "            if (slow == fast) return true;\n" +
                    "        }\n" +
                    "\n" +
                    "        return false;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理，将head->next也考虑在内有助于简化后面的代码。\n" +
                    "慢指针初始化为head, 快指针初始化为head的下一个节点，这是快慢指针初始化的一种方法，有时会简化边界处理，但有时会增加麻烦，比如该题的进阶版。\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "在无环时，快指针每次走两步走到尾部节点，遍历的时间复杂度为 O(n/2).\n" +
                    "有环时，最坏的时间复杂度近似为 O(n). 最坏情况下链表的头尾相接，此时快指针恰好在慢指针前一个节点，还需 n 次快慢指针相遇。最好情况和无环相同，尾节点出现环。\n" +
                    "故总的时间复杂度可近似为 O(n).\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "Linked List Cycle | 九章算法");

            this.map.put("Linked List Cycle II", "Source\n" +
                    "\n" +
                    "leetcode: Linked List Cycle II | LeetCode OJ * lintcode: (103) Linked List Cycle II\n" +
                    "Given a linked list, return the node where the cycle begins. If there is no cycle, return null.\n" +
                    "\n" +
                    "Example\n" +
                    "Given -21->10->4->5, tail connects to node index 1，return node 10\n" +
                    "\n" +
                    "Challenge\n" +
                    "Follow up:\n" +
                    "Can you solve it without using extra space?\n" +
                    "题解 - 快慢指针\n" +
                    "\n" +
                    "题 Linked List Cycle | Data Structure and Algorithm 的升级版，题目要求不适用额外空间，则必然还是使用快慢指针解决问题。首先设组成环的节点个数为 r, 链表中节点个数为 n. 首先我们来分析下在链表有环时都能推出哪些特性：\n" +
                    "\n" +
                    "快慢指针第一次相遇时快指针比慢指针多走整数个环, 这个容易理解，相遇问题。\n" +
                    "每次相遇都在同一个节点。第一次相遇至第二次相遇，快指针需要比慢指针多走一个环的节点个数，而快指针比慢指针多走的步数正好是慢指针自身移动的步数，故慢指针恰好走了一圈回到原点。\n" +
                    "从以上两个容易得到的特性可知，在仅仅知道第一次相遇时的节点还不够，相遇后如果不改变既有策略则必然找不到环的入口。接下来我们分析下如何从第一次相遇的节点走到环 的入口节点。还是让我们先从实际例子出发，以下图为例。\n" +
                    "\nslow和fast节点分别初始化为节点1和2，假设快慢指针第一次相遇的节点为0, 对应于环中的第i个节点 C\u200Bi\u200B\u200B, 那么此时慢指针正好走了 n−r−1+i 步，快指针则走了 2⋅(n−r−1+i) 步，且存在1: n−r−1+i+1=l⋅r. (之所以在i后面加1是因为快指针初始化时多走了一步) 快慢指针第一次相遇时慢指针肯定没有走完整个环，且慢指针走的步数即为整数个环节点个数，由性质1和性质2可联合推出。\n" +
                    "\n" +
                    "现在分析下相遇的节点和环的入口节点之间的关联，要从环中第i个节点走到环的入口节点，则按照顺时针方向移动2: (l⋅r−i+1) 个节点 (l 为某个非负整数) 即可到达。现在来看看式1和式2间的关系。由式1可以推知 n−r=l⋅r−i. 从头节点走到环的入口节点所走的步数可用 n−r 表示，故在快慢指针第一次相遇时让另一节点从头节点出发，慢指针仍从当前位置迭代，第二次相遇时的位置即为环的入口节点！\n" +
                    "\n" +
                    ">\n" +
                    "\n" +
                    "由于此题快指针初始化为头节点的下一个节点，故分析起来稍微麻烦些，且在第一次相遇后需要让慢指针先走一步，否则会出现死循环。\n" +
                    "对于该题来说，快慢指针都初始化为头节点会方便很多，故以下代码使用头节点对快慢指针进行初始化。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @return: The node where the cycle begins.\n" +
                    "     *           if there is no cycle, return null\n" +
                    "     */\n" +
                    "    ListNode *detectCycle(ListNode *head) {\n" +
                    "        if (NULL == head || NULL == head->next) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *slow = head, *fast = head;\n" +
                    "        while (NULL != fast && NULL != fast->next) {\n" +
                    "            fast = fast->next->next;\n" +
                    "            slow = slow->next;\n" +
                    "            if (slow == fast) {\n" +
                    "                fast = head;\n" +
                    "                while (slow != fast) {\n" +
                    "                    fast = fast->next;\n" +
                    "                    slow = slow->next;\n" +
                    "                }\n" +
                    "                return slow;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return NULL;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理。\n" +
                    "找第一次相遇的节点。\n" +
                    "将fast置为头节点，并只走一步，直至快慢指针第二次相遇，返回慢指针所指的节点。\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "第一次相遇的最坏时间复杂度为 O(n), 第二次相遇的最坏时间复杂度为 O(n). 故总的时间复杂度近似为 O(n), 空间复杂度 O(1).\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "Linked List Cycle II | 九章算法");
            this.map.put("Reverse Linked List", "Source\n" +
                    "\n" +
                    "lintcode: (35) Reverse Linked List\n" +
                    "Reverse a linked list.\n" +
                    "\n" +
                    "Example\n" +
                    "For linked list 1->2->3, the reversed linked list is 3->2->1\n" +
                    "\n" +
                    "Challenge\n" +
                    "Reverse it in-place and in one-pass\n" +
                    "题解\n" +
                    "\n" +
                    "联想到同样也可能需要翻转的数组，在数组中由于可以利用下标随机访问，翻转时使用下标即可完成。而在单向链表中，仅仅只知道头节点，而且只能单向往前走，故需另寻出路 。分析由1->2->3变为3->2->1的过程，由于是单向链表，故只能由1开始遍历，1和2最开始的位置是1->2，最后变为2->1，故从这里 开始寻找突破口，探讨如何交换1和2的节点。\n" +
                    "\n" +
                    "temp = head->next;\n" +
                    "head->next = prev;\n" +
                    "prev = head;\n" +
                    "head = temp;\n" +
                    "要点在于维护两个指针变量prev和head. 分析如下图所示：保存head下一节点\n" +
                    "将head所指向的下一节点改为prev\n" +
                    "将prev替换为head，波浪式前进\n" +
                    "将第一步保存的下一节点替换为head，用于下一次循环\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * http://www.jiuzhang.com/solutions/reverse-linked-list/\n" +
                    " * Definition of ListNode\n" +
                    " *\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @return: The new head of reversed linked list.\n" +
                    "     */\n" +
                    "    ListNode *reverse(ListNode *head) {\n" +
                    "        ListNode *prev = NULL;\n" +
                    "        while (head) {\n" +
                    "            ListNode *temp = head->next;\n" +
                    "            head->next = prev;\n" +
                    "            prev = head;\n" +
                    "            head = temp;\n" +
                    "        }\n" +
                    "\n" +
                    "        return prev;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "题解中基本分析完毕，代码中的prev赋值比较精炼，值得借鉴。\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "反转单向链表的四种实现（递归与非递归，C++） | 宁心勉学，慎思笃行");
            this.map.put("Reverse Linked List II", "Source\n" +
                    "\n" +
                    "lintcode: (36) Reverse Linked List II\n" +
                    "Reverse a linked list from position m to n.\n" +
                    "\n" +
                    "Note\n" +
                    "Given m, n satisfy the following condition: 1 ≤ m ≤ n ≤ length of list.\n" +
                    "\n" +
                    "Example\n" +
                    "Given 1->2->3->4->5->NULL, m = 2 and n = 4, return 1->4->3->2->5->NULL.\n" +
                    "\n" +
                    "Challenge\n" +
                    "Reverse it in-place and in one-pass\n" +
                    "题解\n" +
                    "\n" +
                    "此题在上题的基础上加了位置要求，只翻转指定区域的链表。由于链表头节点不确定，祭出我们的dummy杀器。此题边界条件处理特别tricky，需要特别注意。\n" +
                    "\n" +
                    "由于只翻转指定区域，分析受影响的区域为第m-1个和第n+1个节点\n" +
                    "找到第m个节点，使用for循环n-m次，使用上题中的链表翻转方法\n" +
                    "处理第m-1个和第n+1个节点\n" +
                    "返回dummy->next\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of singly-linked-list:\n" +
                    " *\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *        this->val = val;\n" +
                    " *        this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The head of linked list.\n" +
                    "     * @param m: The start position need to reverse.\n" +
                    "     * @param n: The end position need to reverse.\n" +
                    "     * @return: The new head of partial reversed linked list.\n" +
                    "     */\n" +
                    "    ListNode *reverseBetween(ListNode *head, int m, int n) {\n" +
                    "        if (head == NULL || m > n) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *dummy = new ListNode(0);\n" +
                    "        dummy->next = head;\n" +
                    "        ListNode *node = dummy;\n" +
                    "\n" +
                    "        for (int i = 1; i != m; ++i) {\n" +
                    "            if (node == NULL) {\n" +
                    "                return NULL;\n" +
                    "            } else {\n" +
                    "                node = node->next;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *premNode = node;\n" +
                    "        ListNode *mNode = node->next;\n" +
                    "        ListNode *nNode = mNode, *postnNode = nNode->next;\n" +
                    "        for (int i = m; i != n; ++i) {\n" +
                    "            if (postnNode == NULL) {\n" +
                    "                return NULL;\n" +
                    "            }\n" +
                    "\n" +
                    "            ListNode *temp = postnNode->next;\n" +
                    "            postnNode->next = nNode;\n" +
                    "            nNode = postnNode;\n" +
                    "            postnNode = temp;\n" +
                    "        }\n" +
                    "        premNode->next = nNode;\n" +
                    "        mNode->next = postnNode;\n" +
                    "\n" +
                    "        return dummy->next;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "处理异常\n" +
                    "使用dummy辅助节点\n" +
                    "找到premNode——m节点之前的一个节点\n" +
                    "以nNode和postnNode进行遍历翻转，注意考虑在遍历到n之前postnNode可能为空\n" +
                    "连接premNode和nNode，premNode->next = nNode;\n" +
                    "连接mNode和postnNode，mNode->next = postnNode;\n" +
                    "务必注意node 和node->next的区别！！，node指代节点，而node->next指代节点的下一连接。");
            this.map.put("Merge Two Sorted Lists", "Source\n" +
                    "\n" +
                    "lintcode: (165) Merge Two Sorted Lists * leetcode: Merge Two Sorted Lists | LeetCode OJ\n" +
                    "Merge two sorted linked lists and return it as a new list.\n" +
                    "The new list should be made by splicing together the nodes of the first two lists.\n" +
                    "\n" +
                    "Example\n" +
                    "Given 1->3->8->11->15->null, 2->null , return 1->2->3->8->11->15->null\n" +
                    "题解\n" +
                    "\n" +
                    "此题为两个链表的合并，合并后的表头节点不一定，故应联想到使用dummy节点。链表节点的插入主要涉及节点next指针值的改变，两个链表的合并操作则涉及 到两个节点的next值变化，若每次合并一个节点都要改变两个节点next的值且要对NULL指针做异常处理，势必会异常麻烦。嗯，第一次做这个题时我就 是这么想的... 下面看看相对较好的思路。\n" +
                    "\n" +
                    "首先dummy节点还是必须要用到，除了dummy节点外还引入一个lastNode节点充当下一次合并时的头节点。在l1或者l2的某一个节点 为空指针NULL时，退出while循环，并将非空链表的头部链接到lastNode->next中。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition for singly-linked list.\n" +
                    " * struct ListNode {\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int x) : val(x), next(NULL) {}\n" +
                    " * };\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {\n" +
                    "        ListNode *dummy = new ListNode(0);\n" +
                    "        ListNode *lastNode = dummy;\n" +
                    "        while ((NULL != l1) && (NULL != l2)) {\n" +
                    "            if (l1->val < l2->val) {\n" +
                    "                lastNode->next = l1;\n" +
                    "                l1 = l1->next;\n" +
                    "            } else {\n" +
                    "                lastNode->next = l2;\n" +
                    "                l2 = l2->next;\n" +
                    "            }\n" +
                    "\n" +
                    "            lastNode = lastNode->next;\n" +
                    "        }\n" +
                    "\n" +
                    "        // do not forget this line!\n" +
                    "        lastNode->next =  (NULL != l1) ? l1 : l2;\n" +
                    "\n" +
                    "        return dummy->next;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理，包含在dummy->next中。\n" +
                    "引入dummy和lastNode节点，此时lastNode指向的节点为dummy\n" +
                    "对非空l1,l2循环处理，将l1/l2的较小者链接到lastNode->next，往后递推lastNode\n" +
                    "最后处理l1/l2中某一链表为空退出while循环，将非空链表头链接到lastNode->next\n" +
                    "返回dummy->next，即最终的首指针\n" +
                    "注意lastNode的递推并不影响dummy->next的值，因为lastNode和dummy是两个不同的指针变量。\n" +
                    "\n" +
                    ">\n" +
                    "\n" +
                    "链表的合并为常用操作，务必非常熟练，以上的模板非常精炼，有两个地方需要记牢。1. 循环结束条件中为条件与操作；2. 最后处理lastNode->next指针的值。\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "最好情况下，一个链表为空，时间复杂度为 O(1). 最坏情况下，lastNode遍历两个链表中的每一个节点，时间复杂度为 O(l1+l2). 空间复杂度近似为 O(1).\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "Merge Two Sorted Lists | 九章算法");
            this.map.put("Merge k Sorted Lists", "Source\n" +
                    "\n" +
                    "leetcode: Merge k Sorted Lists | LeetCode OJ * lintcode: (104) Merge k Sorted Lists\n" +
                    "题解1 - 选择归并(TLE) __\n" +
                    "\n" +
                    "参考 Merge Two Sorted Lists | Data Structure and Algorithm 中对两个有序链表的合并方法，这里我们也可以采用从 k 个 链表中选择其中最小值的节点链接到lastNode->next(和选择排序思路有点类似)，同时该节点所在的链表表头节点往后递推一个。直至lastNode遍历完 k 个链表的所有节点，此时表头节点均为NULL, 返回dummy->next.\n" +
                    "\n" +
                    "这种方法非常简单直接，但是时间复杂度较高，容易出现 TLE.\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param lists: a list of ListNode\n" +
                    "     * @return: The head of one sorted list.\n" +
                    "     */\n" +
                    "    ListNode *mergeKLists(vector &lists) {\n" +
                    "        if (lists.empty()) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *dummy = new ListNode(INT_MAX);\n" +
                    "        ListNode *last = dummy;\n" +
                    "\n" +
                    "        while (true) {\n" +
                    "            int count = 0;\n" +
                    "            int index = -1, tempVal = INT_MAX;\n" +
                    "            for (int i = 0; i != lists.size(); ++i) {\n" +
                    "                if (NULL == lists[i]) {\n" +
                    "                    ++count;\n" +
                    "                    if (count == lists.size()) {\n" +
                    "                        last->next = NULL;\n" +
                    "                        return dummy->next;\n" +
                    "                    }\n" +
                    "                    continue;\n" +
                    "                }\n" +
                    "\n" +
                    "                // choose the min value in non-NULL ListNode\n" +
                    "                if (NULL != lists[i] && lists[i]->val <= tempVal) {\n" +
                    "                    tempVal = lists[i]->val;\n" +
                    "                    index = i;\n" +
                    "                }\n" +
                    "            }\n" +
                    "\n" +
                    "            last->next = lists[index];\n" +
                    "            last = last->next;\n" +
                    "            lists[index] = lists[index]->next;\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "由于头节点不定，我们使用dummy节点。\n" +
                    "使用last表示每次归并后的新链表末尾节点。\n" +
                    "count用于累计链表表头节点为NULL的个数，若与 vector 大小相同则代表所有节点均已遍历完。\n" +
                    "tempVal用于保存每次比较 vector 中各链表表头节点中的最小值，index保存本轮选择归并过程中最小值对应的链表索引，用于循环结束前递推该链表表头节点。\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "由于每次for循环只能选择出一个最小值，总的时间复杂度最坏情况下为 O(k⋅∑\u200Bi=1\u200Bk\u200B\u200Bl\u200Bi\u200B\u200B). 空间复杂度近似为 O(1).\n" +
                    "\n" +
                    "题解2 - 迭代调用Merge Two Sorted Lists(TLE) __\n" +
                    "\n" +
                    "鉴于题解1时间复杂度较高，题解2中我们可以反复利用时间复杂度相对较低的 Merge Two Sorted Lists | Data Structure and Algorithm. 即先合并链表1和2，接着将合并后的新链表再与链表3合并，如此反复直至 vector 内所有链表均已完全合并soulmachine。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param lists: a list of ListNode\n" +
                    "     * @return: The head of one sorted list.\n" +
                    "     */\n" +
                    "    ListNode *mergeKLists(vector &lists) {\n" +
                    "        if (lists.empty()) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *head = lists[0];\n" +
                    "        for (int i = 1; i != lists.size(); ++i) {\n" +
                    "            head = merge2Lists(head, lists[i]);\n" +
                    "        }\n" +
                    "\n" +
                    "        return head;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    ListNode *merge2Lists(ListNode *left, ListNode *right) {\n" +
                    "        ListNode *dummy = new ListNode(0);\n" +
                    "        ListNode *last = dummy;\n" +
                    "\n" +
                    "        while (NULL != left && NULL != right) {\n" +
                    "            if (left->val < right->val) {\n" +
                    "                last->next = left;\n" +
                    "                left = left->next;\n" +
                    "            } else {\n" +
                    "                last->next = right;\n" +
                    "                right = right->next;\n" +
                    "            }\n" +
                    "            last = last->next;\n" +
                    "        }\n" +
                    "\n" +
                    "        last->next = (NULL != left) ? left : right;\n" +
                    "\n" +
                    "        return dummy->next;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "实现合并两个链表的子方法后就没啥难度了，mergeKLists中左半部分链表初始化为lists[0], for循环后迭代归并head和lists[i].\n" +
                    "\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "合并两个链表时最差时间复杂度为 O(l\u200B1\u200B\u200B+l\u200B2\u200B\u200B), 那么在以上的实现中总的时间复杂度可近似认为是 l\u200B1\u200B\u200B+l\u200B1\u200B\u200B+l\u200B2\u200B\u200B+...+l\u200B1\u200B\u200B+l\u200B2\u200B\u200B+...+l\u200Bk\u200B\u200B=O(∑\u200Bi=1\u200Bk\u200B\u200B(k−i)⋅l\u200Bi\u200B\u200B). 比起题解1复杂度是 要小一点，但量级上仍然差不太多。实际运行时间也证明了这一点，题解2的运行时间差不多时题解1的一半。那么还有没有进一步降低时间复杂度的可能呢？当然是有的，且看 下题分解...\n" +
                    "\n" +
                    "题解3 - 二分调用Merge Two Sorted Lists\n" +
                    "\n" +
                    "题解2中merge2Lists优化空间不大，那咱们就来看看mergeKLists中的for循环，仔细观察可得知第i个链表 l\u200Bi\u200B\u200B 被遍历了 k−i 次，如果我们使用二分法对其进行归并呢？从中间索引处进行二分归并后，每个链表参与合并的次数变为 logk, 故总的时间复杂度可降至 logk⋅∑\u200Bi=1\u200Bk\u200B\u200Bl\u200Bi\u200B\u200B. 优化幅度较大。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param lists: a list of ListNode\n" +
                    "     * @return: The head of one sorted list.\n" +
                    "     */\n" +
                    "    ListNode *mergeKLists(vector &lists) {\n" +
                    "        if (lists.empty()) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        return helper(lists, 0, lists.size() - 1);\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    ListNode *helper(vector &lists, int start, int end) {\n" +
                    "        if (start == end) {\n" +
                    "            return lists[start];\n" +
                    "        } else if (start + 1 == end) {\n" +
                    "            return merge2Lists(lists[start], lists[end]);\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *left = helper(lists, start, start + (end - start) / 2);\n" +
                    "        ListNode *right = helper(lists, start + (end - start) / 2 + 1, end);\n" +
                    "\n" +
                    "        return merge2Lists(left, right);\n" +
                    "    }\n" +
                    "\n" +
                    "    ListNode *merge2Lists(ListNode *left, ListNode *right) {\n" +
                    "        ListNode *dummy = new ListNode(0);\n" +
                    "        ListNode *last = dummy;\n" +
                    "\n" +
                    "        while (NULL != left && NULL != right) {\n" +
                    "            if (left->val < right->val) {\n" +
                    "                last->next = left;\n" +
                    "                left = left->next;\n" +
                    "            } else {\n" +
                    "                last->next = right;\n" +
                    "                right = right->next;\n" +
                    "            }\n" +
                    "            last = last->next;\n" +
                    "        }\n" +
                    "        last->next = (NULL != left) ? left : right;\n" +
                    "\n" +
                    "        return dummy->next;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "由于需要建立二分递归模型，另建一私有方法helper引入起止位置较为方便。下面着重分析helper。\n" +
                    "\n" +
                    "分两种边界条件处理，分别是start == end和start + 1 == end. 虽然第二种边界条件可以略去，但是加上会节省递归调用的栈空间。\n" +
                    "使用分治思想理解helper, left和right的边界处理建议先分析几个简单例子，做到不重不漏。\n" +
                    "注意merge2Lists中传入的参数，为lists[start]而不是start...\n" +
                    "在mergeKLists中调用helper时传入的end参数为lists.size() - 1，而不是lists.size().\n" +
                    "\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "题解中已分析过，最坏的时间复杂度为 logk⋅∑\u200Bi=1\u200Bk\u200B\u200Bl\u200Bi\u200B\u200B, 空间复杂度近似为 O(1).\n" +
                    "\n" +
                    "优化后的运行时间显著减少！由题解2中的500+ms 减至40ms 以内。\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "soulmachine. soulmachine的LeetCode 题解 ↩");
            this.map.put("Sort List", "Source\n" +
                    "\n" +
                    "leetcode: Sort List | LeetCode OJ * lintcode: (98) Sort List\n" +
                    "Sort a linked list in O(n log n) time using constant space complexity.\n" +
                    "题解1 - 归并排序(链表长度求中间节点)\n" +
                    "\n" +
                    "链表的排序操作，对于常用的排序算法，能达到 O(nlogn)的复杂度有快速排序(平均情况)，归并排序，堆排序。快速排序不一定能保证其时间复杂度一定满足要求， 归并排序和堆排序都能满足复杂度的要求。在数组排序中，归并排序通常需要使用 O(n) 的额外空间，也有原地归并的实现，代码写起来略微麻烦一点。但是对于链表这种 非随机访问数据结构，所谓的「排序」不过是指针next值的变化而已，主要通过指针操作，故仅需要常数级别的额外空间，满足题意。堆排序通常需要构建二叉树，在这 道题中不太适合。\n" +
                    "\n" +
                    "既然确定使用归并排序，我们就来思考归并排序实现的几个要素。\n" +
                    "\n" +
                    "按长度等分链表，归并虽然不严格要求等分，但是等分能保证线性对数的时间复杂度。由于链表不能随机访问，故可以先对链表进行遍历求得其长度。\n" +
                    "合并链表，细节已在 Merge Two Sorted Lists | Data Structure and Algorithm 中详述。\n" +
                    "在按长度等分链表时进行「后序归并」——先求得左半部分链表的表头，再求得右半部分链表的表头，最后进行归并操作。\n" +
                    "\n" +
                    "由于递归等分链表的操作需要传入链表长度信息，故需要另建一辅助函数。新鲜出炉的源码如下。\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @return: You should return the head of the sorted linked list,\n" +
                    "                    using constant space complexity.\n" +
                    "     */\n" +
                    "    ListNode *sortList(ListNode *head) {\n" +
                    "        if (NULL == head) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        // get the length of List\n" +
                    "        int len = 0;\n" +
                    "        ListNode *node = head;\n" +
                    "        while (NULL != node) {\n" +
                    "            node = node->next;\n" +
                    "            ++len;\n" +
                    "        }\n" +
                    "\n" +
                    "        return sortListHelper(head, len);\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    ListNode *sortListHelper(ListNode *head, const int length) {\n" +
                    "        if ((NULL == head) || (0 >= length)) {\n" +
                    "            return head;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *midNode = head;\n" +
                    "\n" +
                    "        int count = 1;\n" +
                    "        while (count < length / 2) {\n" +
                    "            midNode = midNode->next;\n" +
                    "            ++count;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *rList = sortListHelper(midNode->next, length - length / 2);\n" +
                    "        midNode->next = NULL;\n" +
                    "        ListNode *lList = sortListHelper(head, length / 2);\n" +
                    "\n" +
                    "        return mergeList(lList, rList);\n" +
                    "    }\n" +
                    "\n" +
                    "    ListNode *mergeList(ListNode *l1, ListNode *l2) {\n" +
                    "        ListNode *dummy = new ListNode(0);\n" +
                    "        ListNode *lastNode = dummy;\n" +
                    "        while ((NULL != l1) && (NULL != l2)) {\n" +
                    "            if (l1->val < l2->val) {\n" +
                    "                lastNode->next = l1;\n" +
                    "                l1 = l1->next;\n" +
                    "            } else {\n" +
                    "                lastNode->next = l2;\n" +
                    "                l2 = l2->next;\n" +
                    "            }\n" +
                    "\n" +
                    "            lastNode = lastNode->next;\n" +
                    "        }\n" +
                    "\n" +
                    "        lastNode->next = (NULL != l1) ? l1 : l2;\n" +
                    "\n" +
                    "        return dummy->next;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "归并子程序没啥好说的了，见 Merge Two Sorted Lists | Data Structure and Algorithm. 2. 在递归处理链表长度时，分析方法和 Convert Sorted List to Binary Search Tree | Data Structure and Algorithm 一致，count表示遍历到链表中间时表头指针需要移动的节点数。在纸上分析几个简单例子后即可确定，由于这个题需要的是「左右」而不是二叉搜索树那道题需要三分——「左中右」，故将count初始化为1更为方便，左半部分链表长度为length / 2, 这两个值的确定最好是先用纸笔分析再视情况取初值，不可死记硬背。\n" +
                    "找到中间节点后首先将其作为右半部分链表处理，然后将其next值置为NULL, 否则归并子程序无法正确求解。这里需要注意的是midNode是左半部分的最后一个节点，midNode->next才是链表右半部分的起始节点。\n" +
                    "递归模型中左、右、合并三者的顺序可以根据分治思想确定，即先找出左右链表，最后进行归并(因为归并排序的前提是两个子链表各自有序)。\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "遍历求得链表长度，时间复杂度为 O(n), 「折半取中」过程中总共有 log(n) 层，每层找中点需遍历 n/2 个节点，故总的时间复杂度为 n/2⋅O(logn) (折半取中), 每一层归并排序的时间复杂度介于 O(n/2) 和 O(n)之间，故总的时间复杂度为 O(nlogn), 空间复杂度为常数级别，满足题意。\n" +
                    "\n" +
                    "题解2 - 归并排序(快慢指针求中间节点)\n" +
                    "\n" +
                    "除了遍历链表求得总长外，还可使用看起来较为巧妙的技巧如「快慢指针」，快指针每次走两步，慢指针每次走一步，最后慢指针所指的节点即为中间节点。使用这种特技的关键 之处在于如何正确确定快慢指针的起始位置。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @return: You should return the head of the sorted linked list,\n" +
                    "                    using constant space complexity.\n" +
                    "     */\n" +
                    "    ListNode *sortList(ListNode *head) {\n" +
                    "        if (NULL == head || NULL == head->next) {\n" +
                    "            return head;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *midNode = findMiddle(head);\n" +
                    "        ListNode *rList = sortList(midNode->next);\n" +
                    "        midNode->next = NULL;\n" +
                    "        ListNode *lList = sortList(head);\n" +
                    "\n" +
                    "        return mergeList(lList, rList);\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    ListNode *findMiddle(ListNode *head) {\n" +
                    "        if (NULL == head || NULL == head->next) {\n" +
                    "            return head;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *slow = head, *fast = head->next;\n" +
                    "        while(NULL != fast && NULL != fast->next) {\n" +
                    "            fast = fast->next->next;\n" +
                    "            slow = slow->next;\n" +
                    "        }\n" +
                    "\n" +
                    "        return slow;\n" +
                    "    }\n" +
                    "\n" +
                    "    ListNode *mergeList(ListNode *l1, ListNode *l2) {\n" +
                    "        ListNode *dummy = new ListNode(0);\n" +
                    "        ListNode *lastNode = dummy;\n" +
                    "        while ((NULL != l1) && (NULL != l2)) {\n" +
                    "            if (l1->val < l2->val) {\n" +
                    "                lastNode->next = l1;\n" +
                    "                l1 = l1->next;\n" +
                    "            } else {\n" +
                    "                lastNode->next = l2;\n" +
                    "                l2 = l2->next;\n" +
                    "            }\n" +
                    "\n" +
                    "            lastNode = lastNode->next;\n" +
                    "        }\n" +
                    "\n" +
                    "        lastNode->next = (NULL != l1) ? l1 : l2;\n" +
                    "\n" +
                    "        return dummy->next;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理不仅考虑了head, 还考虑了head->next, 可减少辅助程序中的异常处理。\n" +
                    "使用快慢指针求中间节点时，将fast初始化为head->next可有效避免无法分割两个节点如1->2->nullfast_slow_pointer。\n" +
                    "求中点的子程序也可不做异常处理，但前提是主程序sortList中对head->next做了检测。\n" +
                    "最后进行merge归并排序。\n" +
                    ">\n" +
                    "\n" +
                    "在递归和迭代程序中，需要尤其注意终止条件的确定，以及循环语句中变量的自增，以防出现死循环或访问空指针。\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "同上。\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "Sort List | 九章算法 * > fast_slow_pointer. LeetCode: Sort List 解题报告 - Yu's Garden - 博客园 ↩");
            this.map.put("Reorder List", "Source\n" +
                    "\n" +
                    "leetcode: Reorder List | LeetCode OJ * lintcode: (99) Reorder List\n" +
                    "Given a singly linked list L: L0→L1→…→Ln-1→Ln,\n" +
                    "reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…\n" +
                    "\n" +
                    "You must do this in-place without altering the nodes' values.\n" +
                    "\n" +
                    "\n" +
                    "Example\n" +
                    "For example,\n" +
                    "Given 1->2->3->4->null, reorder it to 1->4->2->3->null.\n" +
                    "题解1 - 链表长度(TLE) __\n" +
                    "\n" +
                    "直观角度来考虑，如果把链表视为数组来处理，那么我们要做的就是依次将下标之和为n的两个节点链接到一块儿，使用两个索引即可解决问题，一个索引指向i, 另一个索引则指向其之后的第n - 2*i个节点(对于链表来说实际上需要获取的是其前一个节点), 直至第一个索引大于第二个索引为止即处理完毕。\n" +
                    "\n" +
                    "既然依赖链表长度信息，那么要做的第一件事就是遍历当前链表获得其长度喽。获得长度后即对链表进行遍历，小心处理链表节点的断开及链接。用这种方法会提示 TLE，也就是说还存在较大的优化空间！\n" +
                    "\n" +
                    "C++ - TLE\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @return: void\n" +
                    "     */\n" +
                    "    void reorderList(ListNode *head) {\n" +
                    "        if (NULL == head || NULL == head->next || NULL == head->next->next) {\n" +
                    "            return;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *last = head;\n" +
                    "        int length = 0;\n" +
                    "        while (NULL != last) {\n" +
                    "            last = last->next;\n" +
                    "            ++length;\n" +
                    "        }\n" +
                    "\n" +
                    "        last = head;\n" +
                    "        for (int i = 1; i < length - i; ++i) {\n" +
                    "            ListNode *beforeTail = last;\n" +
                    "            for (int j = i; j < length - i; ++j) {\n" +
                    "                beforeTail = beforeTail->next;\n" +
                    "            }\n" +
                    "\n" +
                    "            ListNode *temp = last->next;\n" +
                    "            last->next = beforeTail->next;\n" +
                    "            last->next->next = temp;\n" +
                    "            beforeTail->next = NULL;\n" +
                    "            last = temp;\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理，对于节点数目在两个以内的无需处理。\n" +
                    "遍历求得链表长度。\n" +
                    "遍历链表，第一个索引处的节点使用last表示，第二个索引处的节点的前一个节点使用beforeTail表示。\n" +
                    "处理链表的链接与断开，迭代处理下一个last。\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "遍历整个链表获得其长度，时间复杂度为 O(n).\n" +
                    "双重for循环的时间复杂度为 (n−2)+(n−4)+...+2=O(\u200B2\u200B\u200B1\u200B\u200B⋅n\u200B2\u200B\u200B).\n" +
                    "总的时间复杂度可近似认为是 O(n\u200B2\u200B\u200B), 空间复杂度为常数。\n" +
                    ">\n" +
                    "\n" +
                    "使用这种方法务必注意i和j的终止条件，若取i < length + 1 - i, 则在处理最后两个节点时会出现环，且尾节点会被删掉。在对节点进行遍历时务必注意保留头节点的信息！\n" +
                    "题解2 - 反转链表后归并\n" +
                    "\n" +
                    "既然题解1存在较大的优化空间，那我们该从哪一点出发进行优化呢？擒贼先擒王，题解1中时间复杂度最高的地方在于双重for循环，在对第二个索引进行遍历时，j每次都从i处开始遍历，要是j能从链表尾部往前遍历该有多好啊！这样就能大大降低时间复杂度了，可惜本题的链表只是单向链表... 有什么特技可以在单向链表中进行反向遍历吗？还真有——反转链表！一语惊醒梦中人。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @return: void\n" +
                    "     */\n" +
                    "    void reorderList(ListNode *head) {\n" +
                    "        if (NULL == head || NULL == head->next || NULL == head->next->next) {\n" +
                    "            return;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *middle = findMiddle(head);\n" +
                    "        ListNode *right = reverse(middle->next);\n" +
                    "        middle->next = NULL;\n" +
                    "\n" +
                    "        merge(head, right);\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    void merge(ListNode *left, ListNode *right) {\n" +
                    "        ListNode *dummy = new ListNode(0);\n" +
                    "        while (NULL != left && NULL != right) {\n" +
                    "            dummy->next = left;\n" +
                    "            left = left->next;\n" +
                    "            dummy = dummy->next;\n" +
                    "            dummy->next = right;\n" +
                    "            right = right->next;\n" +
                    "            dummy = dummy->next;\n" +
                    "        }\n" +
                    "\n" +
                    "        dummy->next = (NULL != left) ? left : right;\n" +
                    "        //delete dummy; /* bug, delete the tail node */\n" +
                    "    }\n" +
                    "\n" +
                    "    ListNode *reverse(ListNode *head) {\n" +
                    "        ListNode *newHead = NULL;\n" +
                    "        while (NULL != head) {\n" +
                    "            ListNode *temp = head->next;\n" +
                    "            head->next = newHead;\n" +
                    "            newHead = head;\n" +
                    "            head = temp;\n" +
                    "        }\n" +
                    "\n" +
                    "        return newHead;\n" +
                    "    }\n" +
                    "\n" +
                    "    ListNode *findMiddle(ListNode *head) {\n" +
                    "        if (NULL == head || NULL == head->next) {\n" +
                    "            return head;\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode *slow = head, *fast = head->next;\n" +
                    "        while (NULL != fast && NULL != fast->next) {\n" +
                    "            fast = fast->next->next;\n" +
                    "            slow = slow->next;\n" +
                    "        }\n" +
                    "\n" +
                    "        return slow;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "相对于题解1，题解2更多地利用了链表的常用操作如反转、找中点、合并。\n" +
                    "\n" +
                    "找中点：我在九章算法模板的基础上增加了对head->next的异常检测，增强了鲁棒性。\n" +
                    "反转：非常精炼的模板，记牢！\n" +
                    "合并：也可使用九章提供的模板，思想是一样的，需要注意left, right和dummy三者的赋值顺序，不能更改任何一步。\n" +
                    "对于new出的内存如何释放？代码中注释掉的为错误方法，你知道为什么吗？\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "找中点一次，时间复杂度近似为 O(n). 反转链表一次，时间复杂度近似为 O(n/2). 合并左右链表一次，时间复杂度近似为 O(n/2). 故总的时间复杂度为 O(n).\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "Reorder List | 九章算法");
            this.map.put("Recover Rotated Sorted Array", "Source\n" +
                    "\n" +
                    "lintcode: (39) Recover Rotated Sorted Array\n" +
                    "Given a rotated sorted array, recover it to sorted array in-place.\n" +
                    "\n" +
                    "Example\n" +
                    "[4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]\n" +
                    "\n" +
                    "Challenge\n" +
                    "In-place, O(1) extra space and O(n) time.\n" +
                    "\n" +
                    "Clarification\n" +
                    "What is rotated array:\n" +
                    "\n" +
                    "    - For example, the orginal array is [1,2,3,4], The rotated array of it can be [1,2,3,4], [2,3,4,1], [3,4,1,2], [4,1,2,3]\n" +
                    "首先可以想到逐步移位，但是这种方法显然太浪费时间，不可取。下面介绍利器『三步翻转法』，以[4, 5, 1, 2, 3]为例。\n" +
                    "\n" +
                    "首先找到分割点5和1\n" +
                    "翻转前半部分4, 5为5, 4，后半部分1, 2, 3翻转为3, 2, 1。整个数组目前变为[5, 4, 3, 2, 1]\n" +
                    "最后整体翻转即可得[1, 2, 3, 4, 5]\n" +
                    "由以上3个步骤可知其核心为『翻转』的in-place实现。使用两个指针，一个指头，一个指尾，使用for循环移位交换即可。\n" +
                    "\n" +
                    "Java\n" +
                    "\n" +
                    "public class Solution {\n" +
                    "    /**\n" +
                    "     * @param nums: The rotated sorted array\n" +
                    "     * @return: The recovered sorted array\n" +
                    "     */\n" +
                    "    public void recoverRotatedSortedArray(ArrayList nums) {\n" +
                    "        if (nums == null || nums.size() <= 1) {\n" +
                    "            return;\n" +
                    "        }\n" +
                    "\n" +
                    "        int pos = 1;\n" +
                    "        while (pos < nums.size()) { // find the break point\n" +
                    "            if (nums.get(pos - 1) > nums.get(pos)) {\n" +
                    "                break;\n" +
                    "            }\n" +
                    "            pos++;\n" +
                    "        }\n" +
                    "        myRotate(nums, 0, pos - 1);\n" +
                    "        myRotate(nums, pos, nums.size() - 1);\n" +
                    "        myRotate(nums, 0, nums.size() - 1);\n" +
                    "    }\n" +
                    "\n" +
                    "    private void myRotate(ArrayList nums, int left, int right) { // in-place rotate\n" +
                    "        while (left < right) {\n" +
                    "            int temp = nums.get(left);\n" +
                    "            nums.set(left, nums.get(right));\n" +
                    "            nums.set(right, temp);\n" +
                    "            left++;\n" +
                    "            right--;\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * forked from\n" +
                    " * http://www.jiuzhang.com/solutions/recover-rotated-sorted-array/\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "private:\n" +
                    "    void reverse(vector &nums, vector::size_type start, vector::size_type end) {\n" +
                    "        for (vector::size_type i = start, j = end; i < j; ++i, --j) {\n" +
                    "            int temp = nums[i];\n" +
                    "            nums[i] = nums[j];\n" +
                    "            nums[j] = temp;\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "public:\n" +
                    "    void recoverRotatedSortedArray(vector &nums) {\n" +
                    "        for (vector::size_type index = 0; index != nums.size() - 1; ++index) {\n" +
                    "            if (nums[index] > nums[index + 1]) {\n" +
                    "                reverse(nums, 0, index);\n" +
                    "                reverse(nums, index + 1, nums.size() - 1);\n" +
                    "                reverse(nums, 0, nums.size() - 1);\n" +
                    "\n" +
                    "                return;\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "首先找到分割点，随后分三步调用翻转函数。简单起见可将vector::size_type替换为int");
            this.map.put("Rotate String", "Source\n" +
                    "\n" +
                    "lintcode: (8) Rotate String\n" +
                    "Given a string and an offset, rotate string by offset. (rotate from left to right)\n" +
                    "\n" +
                    "Example\n" +
                    "Given \"abcdefg\"\n" +
                    "\n" +
                    "for offset=0, return \"abcdefg\"\n" +
                    "\n" +
                    "for offset=1, return \"gabcdef\"\n" +
                    "\n" +
                    "for offset=2, return \"fgabcde\"\n" +
                    "\n" +
                    "for offset=3, return \"efgabcd\"\n" +
                    "\n" +
                    "...\n" +
                    "题解\n" +
                    "\n" +
                    "常见的翻转法应用题，仔细观察规律可知翻转的分割点在从数组末尾数起的offset位置。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "  /**\n" +
                    "     * param A: A string\n" +
                    "     * param offset: Rotate string with offset.\n" +
                    "     * return: Rotated string.\n" +
                    "     */\n" +
                    "    string rotateString(string A, int offset) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return A;\n" +
                    "        }\n" +
                    "\n" +
                    "        string::size_type sizeA = A.size();\n" +
                    "        offset %= sizeA;\n" +
                    "        if (offset == 0) {\n" +
                    "            return A;\n" +
                    "        }\n" +
                    "\n" +
                    "        reverse(A, 0, sizeA - offset - 1);\n" +
                    "        reverse(A, sizeA - offset, sizeA - 1);\n" +
                    "        reverse(A, 0, sizeA - 1);\n" +
                    "\n" +
                    "        return A;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    void reverse(string &str, string::size_type start, string::size_type end) {\n" +
                    "        for (string::size_type i = start, j = end; i < j; ++i, --j) {\n" +
                    "            char temp = str[i];\n" +
                    "            str[i] = str[j];\n" +
                    "            str[j] = temp;\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理，A为空或者offset模sizeA后为0\n" +
                    "offset可能超出A的大小，应模sizeA后再用\n" +
                    "三步翻转法");
            this.map.put("Reverse Words in a String", "Source\n" +
                    "\n" +
                    "lintcode: (53) Reverse Words in a String\n" +
                    "Given an input string, reverse the string word by word.\n" +
                    "\n" +
                    "For example,\n" +
                    "Given s = \"the sky is blue\",\n" +
                    "return \"blue is sky the\".\n" +
                    "\n" +
                    "Example\n" +
                    "Clarification\n" +
                    "\n" +
                    "- What constitutes a word?\n" +
                    "A sequence of non-space characters constitutes a word.\n" +
                    "\n" +
                    "- Could the input string contain leading or trailing spaces?\n" +
                    "Yes. However, your reversed string should not contain leading or trailing spaces.\n" +
                    "\n" +
                    "- How about multiple spaces between two words?\n" +
                    "Reduce them to a single space in the reversed string.\n" +
                    "题解\n" +
                    "\n" +
                    "由第一个提问可知：题中只有空格字符和非空格字符之分，因此空格字符应为其一关键突破口。\n" +
                    "由第二个提问可知：输入的前导空格或者尾随空格在反转后应去掉。\n" +
                    "由第三个提问可知：两个单词间的多个空格字符应合并为一个或删除掉。\n" +
                    "首先找到各个单词(以空格隔开)，根据题目要求，单词应从后往前依次放入。正向取出比较麻烦，因此可尝试采用逆向思维——先将输入字符串数组中的单词从后往前逆序取出 ，取出单词后即翻转并append至新字符串数组。在append之前加入空格即可。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param s : A string\n" +
                    "     * @return : A string\n" +
                    "     */\n" +
                    "    string reverseWords(string s) {\n" +
                    "        if (s.empty()) {\n" +
                    "            return s;\n" +
                    "        }\n" +
                    "\n" +
                    "        string s_ret, s_temp;\n" +
                    "        string::size_type ix = s.size();\n" +
                    "        while (ix != 0) {\n" +
                    "            s_temp.clear();\n" +
                    "            while (!isspace(s[--ix])) {\n" +
                    "                s_temp.push_back(s[ix]);\n" +
                    "                if (ix == 0) {\n" +
                    "                    break;\n" +
                    "                }\n" +
                    "            }\n" +
                    "            if (!s_temp.empty()) {\n" +
                    "                if (!s_ret.empty()) {\n" +
                    "                    s_ret.push_back(' ');\n" +
                    "                }\n" +
                    "                std::reverse(s_temp.begin(), s_temp.end());\n" +
                    "                s_ret.append(s_temp);\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return s_ret;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "首先处理异常，s为空时直接返回空。\n" +
                    "索引初始值ix = s.size()，而不是ix = s.size() - 1，便于处理ix == 0时的特殊情况。\n" +
                    "使用额外空间s_ret, s_temp，空间复杂度为O(n)，s_temp用于缓存临时的单词以append入s_ret。\n" +
                    "最后返回s_ret。\n" +
                    "空间复杂度为O(1)的解法？\n" +
                    "\n" +
                    "处理异常及特殊情况\n" +
                    "处理多个空格及首尾空格\n" +
                    "记住单词的头尾指针，翻转之\n" +
                    "整体翻转");

            this.map.put("Binary Tree Preorder Traversal", "Source\n" +
                    "\n" +
                    "lintcode: (66) Binary Tree Preorder Traversal\n" +
                    "Given a binary tree, return the preorder traversal of its nodes' values.\n" +
                    "\n" +
                    "Note\n" +
                    "Given binary tree {1,#,2,3},\n" +
                    "\n" +
                    "   1\n" +
                    "    \\\n" +
                    "     2\n" +
                    "    /\n" +
                    "   3\n" +
                    "\n" +
                    "return [1,2,3].\n" +
                    "\n" +
                    "Example\n" +
                    "Challenge\n" +
                    "Can you do it without recursion?\n" +
                    "题解 - 递归\n" +
                    "\n" +
                    "面试时不推荐递归这种做法。\n" +
                    "\n" +
                    "递归版很好理解，首先判断当前节点(根节点)是否为null，是则返回空vector，否则先返回当前节点的值，然后对当前节点的左节点递归，最后对当前节点的右 节点递归。递归时对结果的处理方式不同可进一步细分为遍历和分治两种方法。\n" +
                    "\n" +
                    "Python\n" +
                    "\n" +
                    "\"\"\"\n" +
                    "Definition of TreeNode:\n" +
                    "class TreeNode:\n" +
                    "    def __init__(self, val):\n" +
                    "        this.val = val\n" +
                    "        this.left, this.right = None, None\n" +
                    "\"\"\"\n" +
                    "\n" +
                    "\n" +
                    "class Solution:\n" +
                    "    \"\"\"\n" +
                    "    @param root: The root of binary tree.\n" +
                    "    @return: Preorder in ArrayList which contains node values.\n" +
                    "    \"\"\"\n" +
                    "    def preorderTraversal(self, root):\n" +
                    "        if root == None:\n" +
                    "            return []\n" +
                    "\n" +
                    "        return [root.val] + self.preorderTraversal(root.left) \\\n" +
                    "                          + self.preorderTraversal(root.right)\n" +
                    "C++ Traverse - 递归遍历\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: Preorder in vector which contains node values.\n" +
                    "     */\n" +
                    "    vector preorderTraversal(TreeNode *root) {\n" +
                    "        vector val_vec;\n" +
                    "        traverse(root, val_vec);\n" +
                    "\n" +
                    "        return val_vec;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    void traverse(TreeNode *root, vector &ret) {\n" +
                    "        if (root == NULL) {\n" +
                    "            return;\n" +
                    "        }\n" +
                    "\n" +
                    "        ret.push_back(root->val);\n" +
                    "        traverse(root->left, ret);\n" +
                    "        traverse(root->right, ret);\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "使用了辅助递归函数traverse，传值时注意应使用vector的引用。\n" +
                    "\n" +
                    "题解 - 分治\n" +
                    "\n" +
                    "使用分治的方法和递归类似，但是不同的是递归是将结果作为参数传入递归函数中，而分治则是先将结果保留，随后再合并到最终结果中。\n" +
                    "\n" +
                    "C++ Divide and Conquer\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: Preorder in vector which contains node values.\n" +
                    "     */\n" +
                    "    vector preorderTraversal(TreeNode *root) {\n" +
                    "        vector val_vec;\n" +
                    "\n" +
                    "        // NULL or leaf(叶子节点)\n" +
                    "        if (root == NULL) {\n" +
                    "            return val_vec;\n" +
                    "        }\n" +
                    "\n" +
                    "        // Divide (分)\n" +
                    "        vector left = preorderTraversal(root->left);\n" +
                    "        vector right = preorderTraversal(root->right);\n" +
                    "\n" +
                    "        // Conquer (治)\n" +
                    "        val_vec.push_back(root->val);\n" +
                    "        val_vec.insert(val_vec.end(), left.begin(), left.end());\n" +
                    "        val_vec.insert(val_vec.end(), right.begin(), right.end());\n" +
                    "\n" +
                    "        return val_vec;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "由于是使用vector, 将新的vector插入另一vector不能再使用push_back, 而应该使用insert。\n" +
                    "\n" +
                    "题解 - 迭代\n" +
                    "\n" +
                    "迭代时需要利用栈来保存遍历到的节点，首先进行出栈抛出当前节点，保存当前节点的值，随后将右、左节点分别入栈，迭代到其为叶子节点(NULL)为止。\n" +
                    "\n" +
                    "Python\n" +
                    "\n" +
                    "\"\"\"\n" +
                    "Definition of TreeNode:\n" +
                    "class TreeNode:\n" +
                    "    def __init__(self, val):\n" +
                    "        this.val = val\n" +
                    "        this.left, this.right = None, None\n" +
                    "\"\"\"\n" +
                    "\n" +
                    "\n" +
                    "class Solution:\n" +
                    "    \"\"\"\n" +
                    "    @param root: The root of binary tree.\n" +
                    "    @return: Preorder in ArrayList which contains node values.\n" +
                    "    \"\"\"\n" +
                    "    def preorderTraversal(self, root):\n" +
                    "        result = []\n" +
                    "        if root == None:\n" +
                    "            return result\n" +
                    "\n" +
                    "        stack = []\n" +
                    "        stack.append(root)\n" +
                    "        while stack:\n" +
                    "            node = stack.pop()\n" +
                    "            result.append(node.val)\n" +
                    "            if node.right:\n" +
                    "                stack.append(node.right)\n" +
                    "            if node.left:\n" +
                    "                stack.append(node.left)\n" +
                    "\n" +
                    "        return result\n" +
                    "C++ Iteration\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: Preorder in vector which contains node values.\n" +
                    "     */\n" +
                    "    vector preorderTraversal(TreeNode *root) {\n" +
                    "        vector val_vec;\n" +
                    "        stack s;\n" +
                    "\n" +
                    "        if (root == NULL) {\n" +
                    "            return val_vec;\n" +
                    "        }\n" +
                    "\n" +
                    "        s.push(root);\n" +
                    "        while (!s.empty()) {\n" +
                    "            const TreeNode *node = s.top();\n" +
                    "            s.pop();\n" +
                    "\n" +
                    "            val_vec.push_back(node->val);\n" +
                    "\n" +
                    "            if (node->right != NULL) {\n" +
                    "                s.push(node->right);\n" +
                    "            }\n" +
                    "            if (node->left != NULL) {\n" +
                    "                s.push(node->left);\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return val_vec;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "对root进行异常处理\n" +
                    "将root压入栈\n" +
                    "循环终止条件为栈s为空，所有元素均已处理完\n" +
                    "访问当前栈顶元素(首先取出栈顶元素，随后pop掉栈顶元素)并存入最终结果\n" +
                    "将右、左节点分别压入栈内，以便取元素时为先左后右。\n" +
                    "返回最终结果\n" +
                    "其中步骤4,5,6为迭代的核心，对应前序遍历「根左右」。\n" +
                    "\n" +
                    "所以说到底，使用迭代，只不过是另外一种形式的递归。使用递归的思想去理解遍历问题会容易理解许多。");
            this.map.put("Binary Tree Inorder Traversal", "Source\n" +
                    "\n" +
                    "lintcode: (67) Binary Tree Inorder Traversal\n" +
                    "Given a binary tree, return the inorder traversal of its nodes' values.\n" +
                    "\n" +
                    "Example\n" +
                    "Given binary tree {1,#,2,3},\n" +
                    "\n" +
                    "   1\n" +
                    "    \\\n" +
                    "     2\n" +
                    "    /\n" +
                    "   3\n" +
                    "\n" +
                    "return [1,3,2].\n" +
                    "\n" +
                    "Challenge\n" +
                    "Can you do it without recursion?\n" +
                    "题解 - 递归版\n" +
                    "\n" +
                    "递归版最好理解，递归调用时注意返回值和递归左右子树的顺序即可。\n" +
                    "\n" +
                    "C++ Recursion\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: Inorder in vector which contains node values.\n" +
                    "     */\n" +
                    "public:\n" +
                    "    vector inorderTraversal(TreeNode *root) {\n" +
                    "        vector result;\n" +
                    "\n" +
                    "        traverse(root, result);\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    void traverse(TreeNode *root, vector &ret) {\n" +
                    "        if (root == NULL) {\n" +
                    "            return;\n" +
                    "        }\n" +
                    "\n" +
                    "        traverse(root->left, ret);\n" +
                    "        ret.push_back(root->val);\n" +
                    "        traverse(root->right, ret);\n" +
                    "    }\n" +
                    "};\n" +
                    "题解 - 迭代版\n" +
                    "\n" +
                    "使用辅助栈，空间复杂度 O(n), 时间复杂度 O(n).\n" +
                    "\n" +
                    "中序遍历没有前序遍历好写，其中之一就在于入栈出栈的顺序和限制规则。我们采用「左根右」的访问顺序可知主要有如下四步构成。\n" +
                    "\n" +
                    "首先需要一直对左子树迭代并将非空节点入栈\n" +
                    "节点指针为空后不再入栈\n" +
                    "当前节点为空时进行出栈操作，并访问栈顶节点\n" +
                    "将当前指针p用其右子节点替代\n" +
                    "步骤2,3,4对应「左根右」的遍历结构，只是此时的步骤2取的左值为空。\n" +
                    "\n" +
                    "C++ Iteration\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: Inorder in vector which contains node values.\n" +
                    "     */\n" +
                    "public:\n" +
                    "    vector inorderTraversal(TreeNode *root) {\n" +
                    "        vector result;\n" +
                    "        stack s;\n" +
                    "\n" +
                    "        while (!s.empty() || NULL != root) {\n" +
                    "            if (root) {\n" +
                    "                s.push(root);\n" +
                    "                root = root->left;\n" +
                    "            } else {\n" +
                    "                root = s.top();\n" +
                    "                s.pop();\n" +
                    "                result.push_back(root->val);\n" +
                    "\n" +
                    "                root = root->right;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "};");
            this.map.put("Binary Tree Postorder Traversal", "Source\n" +
                    "\n" +
                    "lintcode: (68) Binary Tree Postorder Traversal\n" +
                    "Given a binary tree, return the postorder traversal of its nodes' values.\n" +
                    "\n" +
                    "Example\n" +
                    "Given binary tree {1,#,2,3},\n" +
                    "\n" +
                    "   1\n" +
                    "    \\\n" +
                    "     2\n" +
                    "    /\n" +
                    "   3\n" +
                    "\n" +
                    "return [3,2,1].\n" +
                    "\n" +
                    "Challenge\n" +
                    "Can you do it without recursion?\n" +
                    "题解 - 递归\n" +
                    "\n" +
                    "首先使用递归便于理解。\n" +
                    "\n" +
                    "C++ Recursion\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: Postorder in vector which contains node values.\n" +
                    "     */\n" +
                    "public:\n" +
                    "    vector postorderTraversal(TreeNode *root) {\n" +
                    "        vector result;\n" +
                    "\n" +
                    "        traverse(root, result);\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    void traverse(TreeNode *root, vector &ret) {\n" +
                    "        if (root == NULL) {\n" +
                    "            return;\n" +
                    "        }\n" +
                    "\n" +
                    "        traverse(root->left, ret);\n" +
                    "        traverse(root->right, ret);\n" +
                    "        ret.push_back(root->val);\n" +
                    "    }\n" +
                    "};\n" +
                    "题解 - 迭代\n" +
                    "\n" +
                    "使用递归写后序遍历那是相当的简单，我们来个不使用递归的迭代版。整体思路仍然为「左右根」，由于是最后才将元素取出。因此需要区分左右的访问记录。\n" +
                    "\n" +
                    "C++ Iteration\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: Postorder in vector which contains node values.\n" +
                    "     */\n" +
                    "public:\n" +
                    "    vector postorderTraversal(TreeNode *root) {\n" +
                    "        vector result;\n" +
                    "        const TreeNode *prevNode = NULL;\n" +
                    "        const TreeNode *currNode = root;\n" +
                    "        stack s;\n" +
                    "\n" +
                    "        if (root == NULL) {\n" +
                    "            return result;\n" +
                    "        }\n" +
                    "\n" +
                    "        s.push(root);\n" +
                    "        while (!s.empty()) {\n" +
                    "            currNode = s.top();\n" +
                    "            if (prevNode == NULL || prevNode->left == currNode || prevNode->right == currNode) {\n" +
                    "                // traverse down the tree (left first)\n" +
                    "                if (currNode->left) {\n" +
                    "                    s.push(currNode->left);\n" +
                    "                } else if (currNode->right) {\n" +
                    "                    s.push(currNode->right);\n" +
                    "                }\n" +
                    "            } else if (currNode->left == prevNode) {\n" +
                    "                // traverse up the tree from the left to right\n" +
                    "                // the left node has been visited\n" +
                    "                if (currNode->right) {\n" +
                    "                    s.push(currNode->right);\n" +
                    "                }\n" +
                    "            } else {\n" +
                    "                // traverse up the tree from the right\n" +
                    "                // visit current node\n" +
                    "                result.push_back(currNode->val);\n" +
                    "                s.pop();\n" +
                    "            }\n" +
                    "\n" +
                    "            prevNode = currNode;\n" +
                    "        }\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码解析\n" +
                    "\n" +
                    "使用prevNode记录之前的访问节点，currNode记录目前正在访问/操作的节点。每次进入while循环时给currNode赋值，结束时p revNode = currNode.\n" +
                    "\n" +
                    "将递归写成迭代的难点在于如何在迭代中体现递归本质及边界条件的确立，可使用简单示例和纸上画出栈调用图辅助分析。");
            this.map.put("Binary Tree Level Order Traversal", "Source\n" +
                    "\n" +
                    "lintcode: (69) Binary Tree Level Order Traversal\n" +
                    "Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).\n" +
                    "\n" +
                    "Example\n" +
                    "Given binary tree {3,9,20,#,#,15,7},\n" +
                    "\n" +
                    "    3\n" +
                    "   / \\\n" +
                    "  9  20\n" +
                    "    /  \\\n" +
                    "   15   7\n" +
                    "\n" +
                    "return its level order traversal as:\n" +
                    "\n" +
                    "[\n" +
                    "  [3],\n" +
                    "  [9,20],\n" +
                    "  [15,7]\n" +
                    "]\n" +
                    "Challenge\n" +
                    "Using only 1 queue to implement it.\n" +
                    "题解 - 使用队列\n" +
                    "\n" +
                    "此题为广搜的基础题，使用一个队列保存每层的节点即可。\n" +
                    "\n" +
                    "C++ queue\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "\n" +
                    "class Solution {\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: Level order a list of lists of integer\n" +
                    "     */\n" +
                    "public:\n" +
                    "    vector > levelOrder(TreeNode *root) {\n" +
                    "        vector > result;\n" +
                    "\n" +
                    "        if (NULL == root) {\n" +
                    "            return result;\n" +
                    "        }\n" +
                    "\n" +
                    "        queue q;\n" +
                    "        q.push(root);\n" +
                    "        while (!q.empty()) {\n" +
                    "            vector list;\n" +
                    "            int size = q.size(); // keep the queue size first\n" +
                    "            for (int i = 0; i != size; ++i) {\n" +
                    "                TreeNode * node = q.front();\n" +
                    "                q.pop();\n" +
                    "                list.push_back(node->val);\n" +
                    "                if (node->left) {\n" +
                    "                    q.push(node->left);\n" +
                    "                }\n" +
                    "                if (node->right) {\n" +
                    "                    q.push(node->right);\n" +
                    "                }\n" +
                    "            }\n" +
                    "            result.push_back(list);\n" +
                    "        }\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常，还是异常\n" +
                    "使用STL的queue数据结构，将root添加进队列\n" +
                    "遍历当前层所有节点，注意需要先保存队列大小，因为在入队出队时队列大小会变化\n" +
                    "list保存每层节点的值，每次使用均要初始化");
            this.map.put("Maximum Depth of Binary Tree", "Source\n" +
                    "\n" +
                    "lintcode: (97) Maximum Depth of Binary Tree\n" +
                    "Given a binary tree, find its maximum depth.\n" +
                    "\n" +
                    "The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.\n" +
                    "\n" +
                    "Example\n" +
                    "Given a binary tree as follow:\n" +
                    "\n" +
                    "        1\n" +
                    "\n" +
                    "     /     \\\n" +
                    "\n" +
                    "   2       3\n" +
                    "\n" +
                    "          /    \\\n" +
                    "\n" +
                    "        4      5\n" +
                    "\n" +
                    "The maximum depth is 3\n" +
                    "题解 - 递归\n" +
                    "\n" +
                    "树遍历的题最方便的写法自然是递归，不过递归调用的层数过多可能会导致栈空间溢出，因此需要适当考虑递归调用的层数。我们首先来看看使用递归如何解这道题，要求二叉树 的最大深度，直观上来讲使用深度优先搜索判断左右子树的深度孰大孰小即可，从根节点往下一层树的深度即自增1，遇到NULL时即返回0。\n" +
                    "\n" +
                    "由于对每个节点都会使用一次maxDepth，故时间复杂度为 O(n), 树的深度最大为 n, 最小为 log\u200B2\u200B\u200Bn, 故空间复杂度介于 O(logn) 和 O(n) 之间。\n" +
                    "\n" +
                    "C++ Recursion\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int maxDepth(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        int left_depth = maxDepth(root->left);\n" +
                    "        int right_depth = maxDepth(root->right);\n" +
                    "\n" +
                    "        return max(left_depth, right_depth) + 1;\n" +
                    "    }\n" +
                    "};\n" +
                    "Java Recursion\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * public class TreeNode {\n" +
                    " *     public int val;\n" +
                    " *     public TreeNode left, right;\n" +
                    " *     public TreeNode(int val) {\n" +
                    " *         this.val = val;\n" +
                    " *         this.left = this.right = null;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "public class Solution {\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: An integer.\n" +
                    "     */\n" +
                    "    public int maxDepth(TreeNode root) {\n" +
                    "        // write your code here\n" +
                    "        if (root == null) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;  \n" +
                    "    }\n" +
                    "}\n" +
                    "题解 - 迭代(显式栈)\n" +
                    "\n" +
                    "使用递归可能会导致栈空间溢出，这里使用显式栈空间(使用堆内存)来代替之前的隐式栈空间。从上节递归版的代码(先处理左子树，后处理右子树，最后返回其中的较大值) 来看，是可以使用类似后序遍历的迭代思想去实现的。\n" +
                    "\n" +
                    "首先使用后序遍历的模板，在每次迭代循环结束处比较栈当前的大小和当前最大值max_depth进行比较。\n" +
                    "\n" +
                    "C++ Iterative with stack\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int maxDepth(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        TreeNode *curr = NULL, *prev = NULL;\n" +
                    "        stack s;\n" +
                    "        s.push(root);\n" +
                    "\n" +
                    "        int max_depth = 0;\n" +
                    "\n" +
                    "        while(!s.empty()) {\n" +
                    "            curr = s.top();\n" +
                    "            if (!prev || prev->left == curr || prev->right == curr) {\n" +
                    "                if (curr->left) {\n" +
                    "                    s.push(curr->left);\n" +
                    "                } else if (curr->right){\n" +
                    "                    s.push(curr->right);\n" +
                    "                }\n" +
                    "            } else if (curr->left == prev) {\n" +
                    "                if (curr->right) {\n" +
                    "                    s.push(curr->right);\n" +
                    "                }\n" +
                    "            } else {\n" +
                    "                s.pop();\n" +
                    "            }\n" +
                    "\n" +
                    "            prev = curr;\n" +
                    "\n" +
                    "            if (s.size() > max_depth) {\n" +
                    "                max_depth = s.size();\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return max_depth;\n" +
                    "    }\n" +
                    "};\n" +
                    "题解 - 迭代(队列)\n" +
                    "\n" +
                    "在使用了递归/后序遍历求解树最大深度之后，我们还可以直接从问题出发进行分析，树的最大深度即为广度优先搜索中的层数，故可以直接使用广度优先搜索求出最大深度，在 原结果返回处使用++max_depth替代即可。\n" +
                    "\n" +
                    "C++ Iterative with queue\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int maxDepth(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        queue q;\n" +
                    "        q.push(root);\n" +
                    "\n" +
                    "        int max_depth = 0;\n" +
                    "        while(!q.empty()) {\n" +
                    "            int size = q.size();\n" +
                    "            for (int i = 0; i != size; ++i) {\n" +
                    "                TreeNode *node = q.front();\n" +
                    "                q.pop();\n" +
                    "\n" +
                    "                if (node->left) {\n" +
                    "                    q.push(node->left);\n" +
                    "                }\n" +
                    "                if (node->right) {\n" +
                    "                    q.push(node->right);\n" +
                    "                }\n" +
                    "            }\n" +
                    "\n" +
                    "            ++max_depth;\n" +
                    "        }\n" +
                    "\n" +
                    "        return max_depth;\n" +
                    "    }\n" +
                    "};\n" +
                    "Java Iterative with queue\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * public class TreeNode {\n" +
                    " *     public int val;\n" +
                    " *     public TreeNode left, right;\n" +
                    " *     public TreeNode(int val) {\n" +
                    " *         this.val = val;\n" +
                    " *         this.left = this.right = null;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "public class Solution {\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: An integer.\n" +
                    "     */\n" +
                    "    public int maxDepth(TreeNode root) {\n" +
                    "        if (root == null) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        int level = 0;\n" +
                    "        LinkedList queue = new LinkedList();\n" +
                    "        queue.add(root);\n" +
                    "        int curNum = 1; //num of nodes left in current level\n" +
                    "        int nextNum = 0; //num of nodes in next level\n" +
                    "\n" +
                    "        while(!queue.isEmpty()) {\n" +
                    "            TreeNode n = queue.poll();\n" +
                    "            curNum--;\n" +
                    "            if (n.left != null) {\n" +
                    "                queue.add(n.left);\n" +
                    "                nextNum++;\n" +
                    "            }\n" +
                    "            if (n.right != null) {\n" +
                    "                queue.add(n.right);\n" +
                    "                nextNum++;\n" +
                    "            }\n" +
                    "            if (curNum == 0) {\n" +
                    "                curNum = nextNum;\n" +
                    "                nextNum = 0;\n" +
                    "                level++;\n" +
                    "            }\n" +
                    "        }\n" +
                    "        return level;\n" +
                    "    }\n" +
                    "}");
            this.map.put("Balanced Binary Tree", "Source\n" +
                    "\n" +
                    "lintcode: (93) Balanced Binary Tree\n" +
                    "Given a binary tree, determine if it is height-balanced.\n" +
                    "\n" +
                    "For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.\n" +
                    "\n" +
                    "Example\n" +
                    "\n" +
                    "Given binary tree A={3,9,20,#,#,15,7}, B={3,#,20,15,7}\n" +
                    "\n" +
                    "A)  3            B)    3\n" +
                    "   / \\                  \\\n" +
                    "  9  20                 20\n" +
                    "    /  \\                / \\\n" +
                    "   15   7              15  7\n" +
                    "\n" +
                    "The binary tree A is a height-balanced binary tree, but B is not.\n" +
                    "题解 - 递归\n" +
                    "\n" +
                    "根据题意，平衡树的定义是两子树的深度差最大不超过1，显然使用递归进行分析较为方便。既然使用递归，那么接下来就需要分析递归调用的终止条件。和之前的 Maximum Depth of Binary Tree | Algorithm 类似，NULL == root必然是其中一个终止条件，返回0；根据题意还需的另一终止条件应为「左右子树高度差大于1」，但对应此终止条件的返回值是多少？——INT_MAX or INT_MIN？想想都不合适，为何不在传入参数中传入bool指针或者bool引用咧？并以此变量作为最终返回值，此法看似可行，先来看看鄙人最 开始想到的这种方法。\n" +
                    "\n" +
                    "C++ Recursion with extra bool variable\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: True if this Binary tree is Balanced, or false.\n" +
                    "     */\n" +
                    "    bool isBalanced(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return true;\n" +
                    "        }\n" +
                    "\n" +
                    "        bool result = true;\n" +
                    "        maxDepth(root, result);\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    int maxDepth(TreeNode *root, bool &isBalanced) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        int leftDepth = maxDepth(root->left, isBalanced);\n" +
                    "        int rightDepth = maxDepth(root->right, isBalanced);\n" +
                    "        if (abs(leftDepth - rightDepth) > 1) {\n" +
                    "            isBalanced = false;\n" +
                    "            // speed up the recursion process\n" +
                    "            return INT_MAX;\n" +
                    "        }\n" +
                    "\n" +
                    "        return max(leftDepth, rightDepth) + 1;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码解析\n" +
                    "\n" +
                    "如果在某一次子树高度差大于1时，返回INT_MAX以减少不必要的计算过程，加速整个递归调用的过程。\n" +
                    "\n" +
                    "初看起来上述代码好像还不错的样子，但是在看了九章的实现后，瞬间觉得自己弱爆了... 首先可以确定abs(leftDepth - rightDepth) > 1肯定是需要特殊处理的，如果返回-1呢？咋一看似乎在下一步返回max(leftDepth, rightDepth) + 1时会出错，再进一步想想， 我们能否不让max...这一句执行呢？如果返回了-1，其接盘侠必然是leftDepth或者rightDepth中的一个，因此我们只需要在判断 子树高度差大于1的同时也判断下左右子树深度是否为-1即可都返回-1，不得不说这种处理方法要精妙的多，赞！\n" +
                    "\n" +
                    "C++ Recursion without extra bool variable\n" +
                    "\n" +
                    "/**\n" +
                    " * forked from http://www.jiuzhang.com/solutions/balanced-binary-tree/\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: True if this Binary tree is Balanced, or false.\n" +
                    "     */\n" +
                    "    bool isBalanced(TreeNode *root) {\n" +
                    "        return (-1 != maxDepth(root));\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    int maxDepth(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        int leftDepth = maxDepth(root->left);\n" +
                    "        int rightDepth = maxDepth(root->right);\n" +
                    "        if (leftDepth == -1 || rightDepth == -1 || \\\n" +
                    "            abs(leftDepth - rightDepth) > 1) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        return max(leftDepth, rightDepth) + 1;\n" +
                    "    }\n" +
                    "};");
            this.map.put("Binary Tree Maximum Path Sum", "Source\n" +
                    "\n" +
                    "lintcode: (94) Binary Tree Maximum Path Sum __\n" +
                    "Given a binary tree, find the maximum path sum.\n" +
                    "\n" +
                    "The path may start and end at any node in the tree.\n" +
                    "Example\n" +
                    "Given the below binary tree,\n" +
                    "\n" +
                    "       1\n" +
                    "      / \\\n" +
                    "     2   3\n" +
                    "Return 6.\n" +
                    "题解1 - 递归中仅返回子树路径长度\n" +
                    "\n" +
                    "如题目右侧的四颗半五角星所示，本题属于中等偏难的那一类题。题目很短，要求返回最大路径和。咋看一下感觉使用递归应该很快就能搞定，实则不然，因为从题目来看路 径和中不一定包含根节点！也就是说可以起止于树中任一连通节点。\n" +
                    "\n" +
                    "弄懂题意后我们就来剖析剖析，本着由简入难的原则，我们先来分析若路径和包含根节点，如何才能使其路径和达到最大呢？选定根节点后，路径和中必然包含有根节点的值，剩 下的部分则为左子树和右子树，要使路径和最大，则必然要使左子树和右子树中的路径长度都取最大。\n" +
                    "\n" +
                    ">\n" +
                    "\n" +
                    "注意区分包含根节点的路径和(题目要的答案)和左子树/右子树部分的路径长度(答案的一个组成部分)。路径和=根节点+左子树路径长度+右子树路径长度\n" +
                    "       -10\n" +
                    "       /  \\\n" +
                    "      2    -3\n" +
                    "     / \\   / \\\n" +
                    "    3   4 5   7\n" +
                    "如上所示，包含根节点-10的路径和组成的节点应为4 -> 2 -> -10 <- -3 <- 7, 对于左子树而言，其可能的路径组成节点为3 -> 2或4 -> 2, 而不是像根节点的路径和那样为3 -> 2 <- 4. 这种差异也就造成了我们不能很愉快地使用递归来求得最大路径和。\n" +
                    "\n" +
                    "我们使用分治的思想来分析路径和/左子树/右子树，设 f(root) 为root的子树到root节点(含)路径长度的最大值，那么我们有 f(root)=root−>val+max(f(root−>left), f(root−>right))\n" +
                    "\n" +
                    "递归模型已初步建立起来，接下来就是分析如何将左右子树的路径长度和最终题目要求的「路径和」挂钩。设 g(root) 为当「路径和」中根节点为root时的值，那么我们有 g(root)=root−>val+f(root−>left)+f(root−>right)\n" +
                    "\n" +
                    "顺着这个思路，我们可以遍历树中的每一个节点求得 g(node) 的值，输出最大值即可。如果不采取任何记忆化存储的措施，其时间复杂度必然是指数级别的。嗯，先来 看看这个思路的具体实现，后续再对其进行优化。遍历节点我们使用递归版的前序遍历，求单边路径长度采用递归。\n" +
                    "\n" +
                    "C++ Recursion + Iteration(Not Recommended) __\n" +
                    "\n" +
                    "Time Limit Exceeded\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int maxPathSum(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        int result = INT_MIN;\n" +
                    "        stack s;\n" +
                    "        s.push(root);\n" +
                    "        while (!s.empty()) {\n" +
                    "            TreeNode *node = s.top();\n" +
                    "            s.pop();\n" +
                    "\n" +
                    "            int temp_path_sum = node->val + singlePathSum(node->left) \\\n" +
                    "                                          + singlePathSum(node->right);\n" +
                    "\n" +
                    "            if (temp_path_sum > result) {\n" +
                    "                result = temp_path_sum;\n" +
                    "            }\n" +
                    "\n" +
                    "            if (NULL != node->right) s.push(node->right);\n" +
                    "            if (NULL != node->left) s.push(node->left);\n" +
                    "        }\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    int singlePathSum(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        int path_sum = max(singlePathSum(root->left), singlePathSum(root->right));\n" +
                    "        return max(0, (root->val + path_sum));\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "注意singlePathSum中最后的返回值，如果其路径长度path_sum比0还小，那么取这一段路径反而会减少最终的路径和，故不应取这一段，我们使 用0表示这一隐含意义。\n" +
                    "\n" +
                    "题解2 - 递归中同时返回子树路径长度和路径和\n" +
                    "\n" +
                    "C++ using std::pair\n" +
                    "\n" +
                    "上题求路径和和左右子树路径长度是分开求得的，因此导致了时间复杂度剧增的恶劣情况，从题解的递推关系我们可以看出其实是可以在一次递归调用过程中同时求得路径和和左 右子树的路径长度的，只不过此时递归程序需要返回的不再是一个值，而是路径长度和路径和这一组值！C++中我们可以使用pair或者自定义新的数据类型来相对优雅 的解决。\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "private:\n" +
                    "    pair helper(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return make_pair(0, INT_MIN);\n" +
                    "        }\n" +
                    "\n" +
                    "        pair leftTree = helper(root->left);\n" +
                    "        pair rightTree = helper(root->right);\n" +
                    "\n" +
                    "        int single_path_sum = max(leftTree.first, rightTree.first) + root->val;\n" +
                    "        single_path_sum = max(0, single_path_sum);\n" +
                    "\n" +
                    "        int max_sub_sum = max(leftTree.second, rightTree.second);\n" +
                    "        int max_path_sum = root->val + leftTree.first + rightTree.first;\n" +
                    "        max_path_sum = max(max_sub_sum, max_path_sum);\n" +
                    "\n" +
                    "        return make_pair(single_path_sum, max_path_sum);\n" +
                    "    }\n" +
                    "\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int maxPathSum(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        return helper(root).second;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "除了使用pair对其进行封装，也可使用嵌套类新建一包含单路径长度和全局路径和两个变量的类，不过我用 C++写的没编译过... 老是提示...priva te，遂用pair改写之。建议使用class而不是pair封装single_path_sum和max_path_sumpairis harmful.\n" +
                    "\n" +
                    "这种方法难以理解的地方在于这种实现方式的正确性，较为关键的语句为max_path_sum = max(max_sub_sum, max_path_sum), 这行代码是如何体现题目中以下的这句话的呢？\n" +
                    "\n" +
                    "The path may start and end at any node in the tree.\n" +
                    "简单来讲，题解2从两个方面予以保证：\n" +
                    "\n" +
                    "采用「冒泡」法返回不经过根节点的路径和的较大值。\n" +
                    "递推子树路径长度(不变值)而不是到该节点的路径和(有可能变化)，从而保证了这种解法的正确性。\n" +
                    "如果还不理解的建议就以上面那个根节点为-10的例子画一画。\n" +
                    "\n" +
                    "C++ using self-defined class\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "    class ResultType {\n" +
                    "    public:\n" +
                    "        int singlePath, maxPath;\n" +
                    "        ResultType(int s, int m):singlePath(s), maxPath(m) {}\n" +
                    "    };\n" +
                    "\n" +
                    "private:\n" +
                    "    ResultType helper(TreeNode *root) {\n" +
                    "        if (root == NULL) {\n" +
                    "            ResultType *nullResult = new ResultType(0, INT_MIN);\n" +
                    "            return *nullResult;\n" +
                    "        }\n" +
                    "        // Divide\n" +
                    "        ResultType left = helper(root->left);\n" +
                    "        ResultType right = helper(root->right);\n" +
                    "\n" +
                    "        // Conquer\n" +
                    "        int singlePath = max(left.singlePath, right.singlePath) + root->val;\n" +
                    "        singlePath = max(singlePath, 0);\n" +
                    "\n" +
                    "        int maxPath = max(left.maxPath, right.maxPath);\n" +
                    "        maxPath = max(maxPath, left.singlePath + right.singlePath + root->val);\n" +
                    "\n" +
                    "        ResultType *result = new ResultType(singlePath, maxPath);\n" +
                    "        return *result;\n" +
                    "    }\n" +
                    "\n" +
                    "public:\n" +
                    "    int maxPathSum(TreeNode *root) {\n" +
                    "        ResultType result = helper(root);\n" +
                    "        return result.maxPath;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "如果不用 ResultType *XXX = new ResultType ... 再 return *XXX 的方式，则需要在自定义 class 中重载 new operator。\n" +
                    "如果遇到 ...private 的编译错误，则是因为自定义 class 中需要把成员声明为 public，否则需要把访问这个成员的函数也做 class 内部处理。\n" +
                    "Reference\n" +
                    "\n" +
                    "pair_is_harmful. std::pair considered harmful! « Modern Maintainable Code - 作者指出了pair不能滥用的原因，如不可维护，信息量小。 ↩\n" +
                    "Binary Tree Maximum Path Sum | 九章算法");
            this.map.put("Lowest Common Ancestor", "Source\n" +
                    "\n" +
                    "lintcode: (88) Lowest Common Ancestor __\n" +
                    "Given the root and two nodes in a Binary Tree. Find the lowest common ancestor(LCA) of the two nodes.\n" +
                    "\n" +
                    "The lowest common ancestor is the node with largest depth which is the ancestor of both nodes.\n" +
                    "Example\n" +
                    "        4\n" +
                    "\n" +
                    "    /     \\\n" +
                    "\n" +
                    "  3         7\n" +
                    "\n" +
                    "          /     \\\n" +
                    "\n" +
                    "        5         6\n" +
                    "For 3 and 5, the LCA is 4.\n" +
                    "\n" +
                    "For 5 and 6, the LCA is 7.\n" +
                    "For 6 and 7, the LCA is 7.\n" +
                    "题解1 - 自底向上\n" +
                    "\n" +
                    "初次接触这种题可能会没有什么思路，在没有思路的情况下我们就从简单例子开始分析！首先看看3和5，这两个节点分居根节点4的两侧，如果可以从子节点往父 节点递推，那么他们将在根节点4处第一次重合；再来看看5和6，这两个都在根节点4的右侧，沿着父节点往上递推，他们将在节点7处第一次重合；最 后来看看6和7，此时由于7是6的父节点，故7即为所求。从这三个基本例子我们可以总结出两种思路——自顶向下(从前往后递推)和自底向上(从后 往前递推)。\n" +
                    "\n" +
                    "顺着上述实例的分析，我们首先看看自底向上的思路，自底向上的实现用一句话来总结就是——如果遍历到的当前节点是 A/B 中的任意一个，那么我们就向父节点汇报此节点，否则递归到节点为空时返回空值。具体来说会有如下几种情况：\n" +
                    "\n" +
                    "当前节点不是两个节点中的任意一个，此时应判断左右子树的返回结果。\n" +
                    "若左右子树均返回非空节点，那么当前节点一定是所求的根节点，将当前节点逐层向前汇报。// 两个节点分居树的两侧\n" +
                    "若左右子树仅有一个子树返回非空节点，则将此非空节点向父节点汇报。// 节点仅存在于树的一侧\n" +
                    "若左右子树均返回NULL, 则向父节点返回NULL. // 节点不在这棵树中\n" +
                    "当前节点即为两个节点中的一个，此时向父节点返回当前节点。\n" +
                    "根据此递归模型容易看出应该使用中序遍历来实现。\n" +
                    "\n" +
                    "C++ Recursion From Bottom to Top __\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of the binary search tree.\n" +
                    "     * @param A and B: two nodes in a Binary.\n" +
                    "     * @return: Return the least common ancestor(LCA) of the two nodes.\n" +
                    "     */\n" +
                    "    TreeNode *lowestCommonAncestor(TreeNode *root, TreeNode *A, TreeNode *B) {\n" +
                    "        // return either A or B or NULL\n" +
                    "        if (NULL == root || root == A || root == B) return root;\n" +
                    "\n" +
                    "        TreeNode *left = lowestCommonAncestor(root->left, A, B);\n" +
                    "        TreeNode *right = lowestCommonAncestor(root->right, A, B);\n" +
                    "\n" +
                    "        // A and B are on both sides\n" +
                    "        if ((NULL != left) && (NULL != right)) return root;\n" +
                    "\n" +
                    "        // either left or right or NULL\n" +
                    "        return (NULL != left) ? left : right;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "结合例子和递归的整体思想去理解代码，在root == A || root == B后即层层上浮(自底向上)，直至找到最终的最小公共祖先节点。\n" +
                    "\n" +
                    "最后一行return (NULL != left) ? left : right;将非空的左右子树节点和空值都包含在内了，十分精炼！leetcode\n" +
                    "\n" +
                    ">\n" +
                    "\n" +
                    "细心的你也许会发现，其实题解的分析漏掉了一种情况，即树中可能只含有 A/B 中的一个节点！这种情况应该返回空值，但上述实现均返回非空节点。重复节点就不考虑了，太复杂了...\n" +
                    "不会漏掉 A/B 中只有一个节点的情况的方法\n" +
                    "\n" +
                    "public class Solution {\n" +
                    "    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {\n" +
                    "        if (root == null || root == A || root == B) {\n" +
                    "            return root;\n" +
                    "        }\n" +
                    "\n" +
                    "        // Divide\n" +
                    "        TreeNode left = lowestCommonAncestor(root.left, A, B);\n" +
                    "        TreeNode right = lowestCommonAncestor(root.right, A, B);\n" +
                    "\n" +
                    "        // Conquer\n" +
                    "        if (left != null && right != null) {\n" +
                    "            return root;\n" +
                    "        } \n" +
                    "        if (left != null) {\n" +
                    "            return left;\n" +
                    "        }\n" +
                    "        if (right != null) {\n" +
                    "            return right;\n" +
                    "        }\n" +
                    "        return null;\n" +
                    "    }\n" +
                    "}\n" +
                    "其实这个代码只是把上一个版本的代码最后简洁的判断语句改成复杂的多层判断就可以了。同样是分治法实现。\n" +
                    "\n" +
                    "题解 - 自底向上(计数器)\n" +
                    "\n" +
                    "为了解决上述方法可能导致误判的情况，我们可以对返回结果添加计数器来解决。*由于此计数器的值只能由子树向上递推，故不能再使用中序遍历，而应该改用后序遍历。 *\n" +
                    "\n" +
                    "定义pair result(node, counter)表示遍历到某节点时的返回结果，返回的node表示LCA 路 径中的可能的最小节点，相应的计数器counter则表示目前和A或者B匹配的节点数，若计数器为2，则表示已匹配过两次，该节点即为所求，若只匹配过一 次，还需进一步向上递推。表述地可能比较模糊，还是看看代码吧。\n" +
                    "\n" +
                    "C++ Post-order(counter)\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of the binary search tree.\n" +
                    "     * @param A and B: two nodes in a Binary.\n" +
                    "     * @return: Return the least common ancestor(LCA) of the two nodes.\n" +
                    "     */\n" +
                    "    TreeNode *lowestCommonAncestor(TreeNode *root, TreeNode *A, TreeNode *B) {\n" +
                    "        if ((NULL == A) || (NULL == B)) return NULL;\n" +
                    "\n" +
                    "        pair result = helper(root, A, B);\n" +
                    "\n" +
                    "        if (A != B) {\n" +
                    "            return (2 == result.second) ? result.first : NULL;\n" +
                    "        } else {\n" +
                    "            return (1 == result.second) ? result.first : NULL;\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    pair helper(TreeNode *root, TreeNode *A, TreeNode *B) {\n" +
                    "        TreeNode * node = NULL;\n" +
                    "        if (NULL == root) return make_pair(node, 0);\n" +
                    "\n" +
                    "        pair left = helper(root->left, A, B);\n" +
                    "        pair right = helper(root->right, A, B);\n" +
                    "\n" +
                    "        // return either A or B\n" +
                    "        int count = max(left.second, right.second);\n" +
                    "        if (A == root || B == root)  return make_pair(root, ++count);\n" +
                    "\n" +
                    "        // A and B are on both sides\n" +
                    "        if (NULL != left.first && NULL != right.first) return make_pair(root, 2);\n" +
                    "\n" +
                    "        // return either left or right or NULL\n" +
                    "        return (NULL != left.first) ? left : right;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "在A == B时，计数器返回1的节点即为我们需要的节点，否则只取返回2的节点，如此便保证了该方法的正确性。对这种实现还有问题的在下面评论吧。\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "leetcode. Lowest Common Ancestor of a Binary Tree Part I | LeetCode - 清晰易懂的题解和实现。 ↩\n" +
                    "Lowest Common Ancestor of a Binary Tree Part II | LeetCode - 如果存在指向父节点的指针，我们能否有更好的解决方案？ * Lowest Common Ancestor of a Binary Search Tree (BST) | LeetCode - 二叉搜索树中求最小公共祖先。\n" +
                    "\n" +
                    "Lowest Common Ancestor | 九章算法 - 第一种和第二种方法可以在知道父节点时使用，但第二种 Divide and Conquer 才是本题需要的思想（第二种解法可以轻易改成不需要 parent 的指针的）。");
            this.map.put("Insert Node in a Binary Search Tree", "Source\n" +
                    "\n" +
                    "lintcode: (85) Insert Node in a Binary Search Tree\n" +
                    "Given a binary search tree  and a new tree node, insert the node into the tree. You should keep the tree still be a valid binary search tree.\n" +
                    "\n" +
                    "Example\n" +
                    "Given binary search tree as follow:\n" +
                    "\n" +
                    "     2\n" +
                    "\n" +
                    "  /    \\\n" +
                    "\n" +
                    "1        4\n" +
                    "\n" +
                    "         /\n" +
                    "\n" +
                    "       3\n" +
                    "\n" +
                    "after Insert node 6, the tree should be:\n" +
                    "\n" +
                    "     2\n" +
                    "\n" +
                    "  /    \\\n" +
                    "\n" +
                    "1        4\n" +
                    "\n" +
                    "         /   \\\n" +
                    "\n" +
                    "       3        6\n" +
                    "\n" +
                    "Challenge\n" +
                    "Do it without recursion\n" +
                    "题解 - 递归\n" +
                    "\n" +
                    "二叉树的题使用递归自然是最好理解的，代码也简洁易懂，缺点就是递归调用时栈空间容易溢出，故实际实现中一般使用迭代替代递归，性能更佳嘛。不过迭代的缺点就是代码量 稍(很)大，逻辑也可能不是那么好懂。\n" +
                    "\n" +
                    "既然确定使用递归，那么接下来就应该考虑具体的实现问题了。在递归的具体实现中，主要考虑如下两点：\n" +
                    "\n" +
                    "基本条件/终止条件 - 返回值需斟酌。\n" +
                    "递归步/条件递归 - 能使原始问题收敛。\n" +
                    "首先来找找递归步，根据二叉查找树的定义，若插入节点的值若大于当前节点的值，则继续与当前节点的右子树的值进行比较；反之则继续与当前节点的左子树的值进行比较。题 目的要求是返回最终二叉搜索树的根节点，从以上递归步的描述中似乎还难以对应到实际代码，这时不妨分析下终止条件。\n" +
                    "\n" +
                    "有了递归步，终止条件也就水到渠成了，若当前节点为空时，即返回结果。问题是——返回什么结果？当前节点为空时，说明应该将「插入节点」插入到上一个遍历节点的左子节 点或右子节点。对应到程序代码中即为root->right = node或者root->left = node. 也就是说递归步使用root->right/left = func(...)即可。\n" +
                    "\n" +
                    "C++ Recursion\n" +
                    "\n" +
                    "/**\n" +
                    " * forked from http://www.jiuzhang.com/solutions/insert-node-in-binary-search-tree/\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of the binary search tree.\n" +
                    "     * @param node: insert this node into the binary search tree\n" +
                    "     * @return: The root of the new binary search tree.\n" +
                    "     */\n" +
                    "    TreeNode* insertNode(TreeNode* root, TreeNode* node) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return node;\n" +
                    "        }\n" +
                    "\n" +
                    "        if (node->val <= root->val) {\n" +
                    "            root->left = insertNode(root->left, node);\n" +
                    "        } else {\n" +
                    "            root->right = insertNode(root->right, node);\n" +
                    "        }\n" +
                    "\n" +
                    "        return root;\n" +
                    "    }\n" +
                    "};\n" +
                    "Java Recursion\n" +
                    "\n" +
                    "public class Solution {\n" +
                    "    /**\n" +
                    "     * @param root: The root of the binary search tree.\n" +
                    "     * @param node: insert this node into the binary search tree\n" +
                    "     * @return: The root of the new binary search tree.\n" +
                    "     */\n" +
                    "    public TreeNode insertNode(TreeNode root, TreeNode node) {\n" +
                    "        if (root == null) {\n" +
                    "            return node;\n" +
                    "        }\n" +
                    "        if (root.val > node.val) {\n" +
                    "            root.left = insertNode(root.left, node);\n" +
                    "        } else {\n" +
                    "            root.right = insertNode(root.right, node);\n" +
                    "        }\n" +
                    "        return root;\n" +
                    "    }\n" +
                    "}\n" +
                    "题解 - 迭代\n" +
                    "\n" +
                    "看过了以上递归版的题解，对于这个题来说，将递归转化为迭代的思路也是非常清晰易懂的。迭代比较当前节点的值和插入节点的值，到了二叉树的最后一层时选择是链接至左子 结点还是右子节点。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of the binary search tree.\n" +
                    "     * @param node: insert this node into the binary search tree\n" +
                    "     * @return: The root of the new binary search tree.\n" +
                    "     */\n" +
                    "    TreeNode* insertNode(TreeNode* root, TreeNode* node) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return node;\n" +
                    "        }\n" +
                    "\n" +
                    "        TreeNode* tempNode = root;\n" +
                    "        while (NULL != tempNode) {\n" +
                    "            if (node->val <= tempNode->val) {\n" +
                    "                if (NULL == tempNode->left) {\n" +
                    "                    tempNode->left = node;\n" +
                    "                    return root;\n" +
                    "                }\n" +
                    "                tempNode = tempNode->left;\n" +
                    "            } else {\n" +
                    "                if (NULL == tempNode->right) {\n" +
                    "                    tempNode->right = node;\n" +
                    "                    return root;\n" +
                    "                }\n" +
                    "                tempNode = tempNode->right;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return root;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "在NULL == tempNode->right或者NULL == tempNode->left时需要在链接完node后立即返回root，避免死循环。\n" +
                    "\n" +
                    "Java Iterative\n" +
                    "\n" +
                    "public class Solution {\n" +
                    "    /**\n" +
                    "     * @param root: The root of the binary search tree.\n" +
                    "     * @param node: insert this node into the binary search tree\n" +
                    "     * @return: The root of the new binary search tree.\n" +
                    "     */\n" +
                    "    public TreeNode insertNode(TreeNode root, TreeNode node) {\n" +
                    "        // write your code here\n" +
                    "        if (root == null) return node;\n" +
                    "        if (node == null) return root;\n" +
                    "\n" +
                    "        TreeNode rootcopy = root;\n" +
                    "        while (root != null) {\n" +
                    "            if (root.val <= node.val && root.right == null) {\n" +
                    "                root.right = node;\n" +
                    "                break;\n" +
                    "            }\n" +
                    "            else if (root.val > node.val && root.left == null) {\n" +
                    "                root.left = node;\n" +
                    "                break;\n" +
                    "            }\n" +
                    "            else if(root.val <= node.val) root = root.right;\n" +
                    "            else root = root.left;\n" +
                    "        }\n" +
                    "        return rootcopy;\n" +
                    "    }\n" +
                    "}");
            this.map.put("Validate Binary Search Tree", "Source\n" +
                    "\n" +
                    "lintcode: (95) Validate Binary Search Tree\n" +
                    "Given a binary tree, determine if it is a valid binary search tree (BST).\n" +
                    "\n" +
                    "Assume a BST is defined as follows:\n" +
                    "\n" +
                    "The left subtree of a node contains only nodes with keys less than the node's key.\n" +
                    "The right subtree of a node contains only nodes with keys greater than the node's key.\n" +
                    "Both the left and right subtrees must also be binary search trees.\n" +
                    "Example\n" +
                    "An example:\n" +
                    "\n" +
                    "   1\n" +
                    "  / \\\n" +
                    " 2   3\n" +
                    "    /\n" +
                    "   4\n" +
                    "    \\\n" +
                    "     5\n" +
                    "The above binary tree is serialized as \"{1,2,3,#,#,4,#,#,5}\".\n" +
                    "题解1 - 递归(比较左右子节点的key)\n" +
                    "\n" +
                    "按照题中对二叉搜索树所给的定义递归判断，我们从递归的两个步骤出发分析：\n" +
                    "\n" +
                    "基本条件/终止条件 - 返回值需斟酌。\n" +
                    "递归步/条件递归 - 能使原始问题收敛。\n" +
                    "终止条件好确定——当前节点为空，或者不符合二叉搜索树的定义，返回值分别是什么呢？先别急，分析下递归步试试先。递归步的核心步骤为比较当前节点的key和左右 子节点的key大小，和定义不符则返回false, 否则递归处理。从这里可以看出在节点为空时应返回true, 由上层的其他条件判断。\n" +
                    "\n" +
                    "C++ Recursion(naive implementation)\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: True if the binary tree is BST, or false\n" +
                    "     */\n" +
                    "    bool isValidBST(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return true;\n" +
                    "        }\n" +
                    "\n" +
                    "        if (NULL == root->left) {\n" +
                    "            if ((NULL != root->right) && (root->val >= root->right->val)) {\n" +
                    "                return false;\n" +
                    "            } else {\n" +
                    "                return isValidBST(root->right);\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        if (NULL == root->right) {\n" +
                    "            if ((NULL != root->left) && (root->val <= root->left->val)) {\n" +
                    "                return false;\n" +
                    "            } else {\n" +
                    "                return isValidBST(root->left);\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        if ((root->val > root->left->val) && (root->val < root->right->val)) {\n" +
                    "            return isValidBST(root->left) && isValidBST(root->right);\n" +
                    "        } else {\n" +
                    "            return false;\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "这种递归方法虽然非常直观，但是需要处理节点指针值为空的边界条件，否则在进行取值操作时会产生运行时错误，这些边界处理使得代码看起来十分不雅观。那么有没有什么优 雅的方式处理这种情况呢？还真有，下面就来介绍一种不错的思路。\n" +
                    "\n" +
                    "题解2 - 递归(引入极值简化代码)\n" +
                    "\n" +
                    "对于如何处理复杂边界条件，目前我所知的有两种有效的方法：\n" +
                    "\n" +
                    "引入dummy node，这个对于链表头不确定时特别有效。\n" +
                    "引入INT_MAX, INT_MIN等最大/最小值，对于比较类问题很有效(需要考虑到本身值就为最值，这种情况一般极少见)。\n" +
                    "显然，对于这个问题，dummy node是不太适用，我们来探讨下取最值的可能性。从以上代码可知边界处理的关键在于需要判断root->left和 root-right是否为NULL, key的比较则相对固定，分别为root->left->val和root->right->val, 由此我们自然可以联想到可以使用left_val和right_val对左右子树的key进行「包装」，在子节点与根节点的key进行比较之前对l eft_val和right_val赋值即可（这一思想在 lintcode: (65) Median of two Sorted Arrays 和 lintcode: (93) Balanced Binary Tree 中也有使用）。\n" +
                    "\n" +
                    "C++ Recursion(wrapper for root->*->val)\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: True if the binary tree is BST, or false\n" +
                    "     */\n" +
                    "    bool isValidBST(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return true;\n" +
                    "        }\n" +
                    "\n" +
                    "        // wrap key root->left->val, LONG_MIN for true\n" +
                    "        long int left_val = (NULL == root->left ? LONG_MIN : root->left->val);\n" +
                    "        // wrap key root->right->val, LONG_MAX for true\n" +
                    "        long int right_val = (NULL == root->right ? LONG_MAX : root->right->val);\n" +
                    "\n" +
                    "        if ((root->val > left_val) && (root->val < right_val)) {\n" +
                    "            return isValidBST(root->left) && isValidBST(root->right);\n" +
                    "        } else {\n" +
                    "            return false;\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "根据题解部分的分析，我们使用left_val「包装」比较key时要用到的root->left->val, 当root->left为空时我们置 left_val为最小值，保证返回结果为true——也就是不影响原来的结果；对right_val的分析也是同理可得。由于我们使用了left_v al对原来的子节点值进行了「包装」，故在比较key大小时使用root->val > left_val是有一丁点bug的，因为有可能出现root->val == LONG_MIN，这种极端测试用例面试中自己心里有数就好了。\n" +
                    "\n" +
                    "后记：使用了「包装」的方法虽然简化了代码明晰了思路，但是在测试用例中如果出现较多的空节点时，朴素版的代码运行效率会高一些。嗯，不要仅仅只为了代码的优雅而忽略 了运行时的效率！\n" +
                    "\n" +
                    "题解3 - 迭代(使用栈改写递推)\n" +
                    "\n" +
                    "看过了上述递归版的思路，客官要不要来一碗迭代版的清酒？理论上来讲，任何递归版的程序都可以用迭代实现，当然「理论上来讲」一般也就意味着这玩意儿我们远远地看着她 就好，可远观而不可亵玩焉... 不卖关子了，我们挑一个简单的递归版程序来试试，嗯，就是上题包装过的递归程序。\n" +
                    "\n" +
                    "函数的每一次递归调用都相当于是一次入栈操作，返回结果则相当于是一次出栈操作。顺着这个思路我们使用一个栈来压入当前节点的左右子节点，入栈前比较其是否符合定义。\n" +
                    "\n" +
                    "C++ Iteration(using stack)\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: True if the binary tree is BST, or false\n" +
                    "     */\n" +
                    "    bool isValidBST(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return true;\n" +
                    "        }\n" +
                    "\n" +
                    "        stack s;\n" +
                    "        s.push(root);\n" +
                    "        while (!s.empty()) {\n" +
                    "            TreeNode *node = s.top();\n" +
                    "            s.pop();\n" +
                    "\n" +
                    "            // wrap the value of node->left->val\n" +
                    "            long int left_val = (NULL == node->left ? LONG_MIN : node->left->val);\n" +
                    "            // wrap the value of node->right->val\n" +
                    "            long int right_val = (NULL == node->right ? LONG_MAX : node->right->val);\n" +
                    "\n" +
                    "            if ((node->val > left_val) && (node->val < right_val)) {\n" +
                    "                if (NULL != node->right) {\n" +
                    "                    s.push(node->right);\n" +
                    "                }\n" +
                    "                if (NULL != node->left) {\n" +
                    "                    s.push(node->left);\n" +
                    "                }\n" +
                    "            } else {\n" +
                    "                return false;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return true;\n" +
                    "    }\n" +
                    "};\n" +
                    "题解4 - 迭代(使用栈)\n" +
                    "\n" +
                    "从题解3的迭代程序来看这道题似乎可以很方便地直接使用栈解决之。我们来看看迭代的直接思路，压入当前节点的非空子节点的同时判断其是否符合题目所给定义，直至栈为空 ——所有节点均已处理完。\n" +
                    "\n" +
                    "C++ Iteration\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of binary tree.\n" +
                    "     * @return: True if the binary tree is BST, or false\n" +
                    "     */\n" +
                    "    bool isValidBST(TreeNode *root) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return true;\n" +
                    "        }\n" +
                    "\n" +
                    "        stack s;\n" +
                    "        s.push(root);\n" +
                    "        while (!s.empty()) {\n" +
                    "            TreeNode *node = s.top();\n" +
                    "            s.pop();\n" +
                    "\n" +
                    "            // compare the right node\n" +
                    "            if (NULL != node->right) {\n" +
                    "                if (node->val < node->right->val) {\n" +
                    "                    s.push(node->right);\n" +
                    "                } else {\n" +
                    "                    return false;\n" +
                    "                }\n" +
                    "            } // end if (NULL...)\n" +
                    "\n" +
                    "            // compare the left node\n" +
                    "            if (NULL != node->left) {\n" +
                    "                if (node->val > node->left->val) {\n" +
                    "                    s.push(node->left);\n" +
                    "                } else {\n" +
                    "                    return false;\n" +
                    "                }\n" +
                    "            } // end if (NULL...)\n" +
                    "        }\n" +
                    "\n" +
                    "        return true;\n" +
                    "    }\n" +
                    "};\n" +
                    "Reference\n" +
                    "\n" +
                    "LeetCode: Validate Binary Search Tree 解题报告 - Yu's Garden - 博客园 - 提供了4种不同的方法，思路可以参考。");

            this.map.put("Search Range in Binary Search Tree", "Source\n" +
                    "\n" +
                    "lintcode: (11) Search Range in Binary Search Tree __\n" +
                    "Given two values k1 and k2 (where k1 < k2) and a root pointer to a Binary Search Tree.\n" +
                    "Find all the keys of tree in range k1 to k2. i.e. print all x such that k1<=x<=k2 and x is a key of given BST.\n" +
                    "Return all the keys in ascending order.\n" +
                    "\n" +
                    "Example\n" +
                    "For example, if k1 = 10 and k2 = 22, then your function should print 12, 20 and 22.\n" +
                    "\n" +
                    "          20\n" +
                    "\n" +
                    "       /        \\\n" +
                    "\n" +
                    "    8           22\n" +
                    "\n" +
                    "  /     \\\n" +
                    "\n" +
                    "4       12\n" +
                    "题解 - 中序遍历\n" +
                    "\n" +
                    "中等偏易难度题，本题涉及到二叉查找树的按序输出，应马上联想到二叉树的中序遍历，对于二叉查找树而言，使用中序遍历即可得到有序元素。对每次访问的元素加以判断即可 得最后结果，由于 OJ 上给的模板不适合递归处理，新建一个私有方法即可。\n" +
                    "\n" +
                    "C++ In-order Recursion\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param root: The root of the binary search tree.\n" +
                    "     * @param k1 and k2: range k1 to k2.\n" +
                    "     * @return: Return all keys that k1<=key<=k2 in ascending order.\n" +
                    "     */\n" +
                    "    vector searchRange(TreeNode* root, int k1, int k2) {\n" +
                    "        vector result;\n" +
                    "        inorder_dfs(result, root, k1, k2);\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    void inorder_dfs(vector &ret, TreeNode *root, int k1, int k2) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return;\n" +
                    "        }\n" +
                    "\n" +
                    "        inorder_dfs(ret, root->left, k1, k2);\n" +
                    "        if ((root->val >= k1) && (root->val <= k2)) {\n" +
                    "            ret.push_back(root->val);\n" +
                    "        }\n" +
                    "        inorder_dfs(ret, root->right, k1, k2);\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "以上为题解思路的简易实现，可以优化的地方为「剪枝过程」的处理——不递归遍历不可能有解的节点。优化后的inorder_dfs如下：\n" +
                    "\n" +
                    "    void inorder_dfs(vector &ret, TreeNode *root, int k1, int k2) {\n" +
                    "        if (NULL == root) {\n" +
                    "            return;\n" +
                    "        }\n" +
                    "\n" +
                    "        if ((NULL != root->left) && (root->val > k1)) {\n" +
                    "            inorder_dfs(ret, root->left, k1, k2);\n" +
                    "        } // cut-off for left sub tree\n" +
                    "\n" +
                    "        if ((root->val >= k1) && (root->val <= k2)) {\n" +
                    "            ret.push_back(root->val);\n" +
                    "        } // add valid value\n" +
                    "\n" +
                    "        if ((NULL != root->right) && (root->val < k2)) {\n" +
                    "            inorder_dfs(ret, root->right, k1, k2);\n" +
                    "        } // cut-off for right sub tree\n" +
                    "    }\n" +
                    ">\n" +
                    "\n" +
                    "「剪枝」的判断条件容易出错，应将当前节点的值与k1和k2进行比较而不是其左子节点或右子节点的值。");
            this.map.put("Convert Sorted Array to Binary Search Tree", "Source\n" +
                    "\n" +
                    "leetcode - Convert Sorted Array to Binary Search Tree | LeetCode OJ\n" +
                    "Given an array where elements are sorted in ascending order,\n" +
                    "convert it to a height balanced BST.\n" +
                    "题解 - 折半取中\n" +
                    "\n" +
                    "将二叉搜索树按中序遍历即可得升序 key 这个容易实现，但反过来由升序 key 逆推生成二叉搜索树呢？按照二叉搜索树的定义我们可以将较大的 key 链接到前一个树的最右侧节点，这种方法实现极其简单，但是无法达到本题「树高平衡- 左右子树的高度差绝对值不超过1」的要求，因此只能另辟蹊径以达到「平衡二叉搜索树」的要求。\n" +
                    "\n" +
                    "要达到「平衡二叉搜索树」这个条件，我们首先应从「平衡二叉搜索树」的特性入手。简单起见，我们先考虑下特殊的满二叉搜索树，满二叉搜索树的一个重要特征就是各根节点 的 key 不小于左子树的 key ，而小于右子树的所有 key；另一个则是左右子树数目均相等，那么我们只要能将所给升序序列分成一大一小的左右两半部分即可满 足题目要求。又由于此题所给的链表结构中仅有左右子树的链接而无指向根节点的链接，故我们只能从中间的根节点进行分析逐层往下递推直至取完数组中所有 key, 数组中间的索引自然就成为了根节点。由于 OJ 上方法入口参数仅有升序序列，方便起见我们可以另写一私有方法，加入start和end两个参数，至此递归模型初步建立。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition for binary tree\n" +
                    " * struct TreeNode {\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left;\n" +
                    " *     TreeNode *right;\n" +
                    " *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}\n" +
                    " * };\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    TreeNode *sortedArrayToBST(vector &num) {\n" +
                    "        if (num.empty()) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        return middleNode(num, 0, num.size() - 1);\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    TreeNode *middleNode(vector &num, const int start, const int end) {\n" +
                    "        if (start > end) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        TreeNode *root = new TreeNode(num[start + (end - start) / 2]);\n" +
                    "        root->left = middleNode(num, start, start + (end - start) / 2 - 1);\n" +
                    "        root->right = middleNode(num, start + (end - start) / 2 + 1, end);\n" +
                    "\n" +
                    "        return root;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "从题解的分析中可以看出中间根节点的建立至关重要！由于数组是可以进行随机访问的，故可取数组中间的索引为根节点，左右子树节点可递归求解。虽然这种递归的过程和「二 分搜索」的模板非常像，但是切记本题中根据所给升序序列建立平衡二叉搜索树的过程中需要做到不重不漏，故边界处理需要异常小心，不能再套用start + 1 < end的模板了。\n" +
                    "\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "递归调用middleNode方法时每个key被访问一次，故时间复杂度可近似认为是 O(n).\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "Convert Sorted Array to Binary Search Tree | 九章算法");
            this.map.put("Convert Sorted List to Binary Search Tree", "tags: linked list, binary tree, binary search tree, recursion\n" +
                    "\n" +
                    "Source\n" +
                    "\n" +
                    "leetcode - Convert Sorted List to Binary Search Tree | LeetCode OJ * lintcode - (106) Convert Sorted List to Binary Search Tree\n" +
                    "Given a singly linked list where elements are sorted in ascending order,\n" +
                    "convert it to a height balanced BST.\n" +
                    "题解 - 折半取中\n" +
                    "\n" +
                    "题 Convert Sorted Array to Binary Search Tree | Data Structure and Algorithm 的升级版，不过这里把「有序数组」换成了「有序链表」。我们可以参考上题的题解思路，思考如何才能在链表中找到「中间节点」。对 于本题的单向链表来说，要想知道中间位置的节点，则必须需要知道链表的长度，因此我们就自然联想到了可以通过遍历链表来求得其长度。求得长度我们就知道了链表中间位置 节点的索引了，进而根据头节点和当前节点则可将链表分为左右两半形成递归模型。到这里还只能算是解决了问题的一半，这道题另一比较麻烦的地方在于边界条件的取舍，很难 第一次就 AC, 下面结合代码做进一步的分析。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of ListNode\n" +
                    " * class ListNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     ListNode *next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->next = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " * Definition of TreeNode:\n" +
                    " * class TreeNode {\n" +
                    " * public:\n" +
                    " *     int val;\n" +
                    " *     TreeNode *left, *right;\n" +
                    " *     TreeNode(int val) {\n" +
                    " *         this->val = val;\n" +
                    " *         this->left = this->right = NULL;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @return: a tree node\n" +
                    "     */\n" +
                    "    TreeNode *sortedListToBST(ListNode *head) {\n" +
                    "        if (NULL == head) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        // get the size of List\n" +
                    "        ListNode *node = head;\n" +
                    "        int len = 0;\n" +
                    "        while (NULL != node) {\n" +
                    "            node = node->next;\n" +
                    "            ++len;\n" +
                    "        }\n" +
                    "\n" +
                    "        return buildBSTHelper(head, len);\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    TreeNode *buildBSTHelper(ListNode *head, int length) {\n" +
                    "        if (NULL == head || length <= 0) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        // get the middle ListNode as root TreeNode\n" +
                    "        ListNode *lnode = head;\n" +
                    "        int count = 0;\n" +
                    "        while (count < length / 2) {\n" +
                    "            lnode = lnode->next;\n" +
                    "            ++count;\n" +
                    "        }\n" +
                    "\n" +
                    "        TreeNode *root = new TreeNode(lnode->val);\n" +
                    "        root->left = buildBSTHelper(head, length / 2);\n" +
                    "        root->right = buildBSTHelper(lnode->next, length - 1 - length / 2);\n" +
                    "\n" +
                    "        return root;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理。\n" +
                    "获取链表长度。\n" +
                    "buildBSTHelper输入参数为表头节点地址以及相应的链表长度，递归获取根节点、左节点和右节点。\n" +
                    "其中buildBSTHelper的边界处理很有技巧，首先是递推的终止条件，头节点为NULL时显然应该返回NULL. 但length的终止条件又如何确定？拿不定主意时就用几个简单例子来试试，比如1, 1->2, 1->2->3.\n" +
                    "\n" +
                    "先来分析下给buildBSTHelper传入的length的含义——从表头节点head开始往后递推长度为length的链表。故length为0时表示不访问链表中的任一节点，也就是说应该返回NULL.\n" +
                    "\n" +
                    "再来分析链表的中间位置如何确定，我们引入计数器count来表示目前需要遍历count个链表节点数目才能得到中间位置的节点。看看四种不同链表长 度下的表现。\n" +
                    "\n" +
                    "链表长度为1时，中间位置即为自身，计数器的值为0.\n" +
                    "链表长度为2时，中间位置可选第一个节点，也可选第二个节点，相应的计数器值为0或1.\n" +
                    "链表长度为3时，中间位置为第二个节点，相应的计数器应为1，表示从表头节点往后递推一个节点。\n" +
                    "链表长度为4时，... 计数器的值为1或者2.\n" +
                    "从以上四种情况我们可以推断出count的值可取为length / 2或者length / 2 + 1, 简单起见我们先取length / 2试试，对应的边界条件即为count < length / 2, count初始值为0. 经过count次迭代后，目前lnode即为所需的链表中间节点，取出其值初始化为TreeNode的根节点。\n" +
                    "\n" +
                    "确定根节点后还需要做的事情就是左子树和右子树中链表头和链表长度的取舍。首先来看看左子树根节点的确定，count的含义为到达中间节点前遍历过的链表节点 数目，那么从另一方面来说它就是前半部分链表的长度！故将此长度length / 2作为得到左子树根节点所需的链表长度参数。除掉链表前半部分节点和中间位置节点这两部分外，剩下的链表长度即为length - 1 - length / 2.\n" +
                    "\n" +
                    ">\n" +
                    "\n" +
                    "length - 1 - length / 2 != length / 2 - 1\n" +
                    "有没有觉得可以进一步化简为length / 2 - 1? 我首先也是这么做的，后来发现一直遇到TERMSIG= 11错误信息，这种错误一般是指针乱指 或者指针未初始化就去访问。但自己仔细检查后发现并没有这种错误，于是乎在本地做单元测试，发现原来是死循环造成了栈空间溢出(猜的)！也就是说边界条件有问题！可自 己的分析明明是没啥问题的啊...\n" +
                    "\n" +
                    "在这种情况下我默默地打开了九章的参考代码，发现他们竟然没有用length / 2 - 1，而是length - 1 - length / 2. 立马意识到这两者可能并不相等。用错误数据试了下，长度为1或者3时两者即不相等。知道对于整型数来说，1 / 2为0，但是却没能活学活用，血泪的教训。:-( 一个美好的下午就没了。\n" +
                    "\n" +
                    "在测试出错的时候，还是要相信测试数据的力量，而不是凭自己以前认为对的方式去解决问题。\n" +
                    "\n" +
                    "复杂度分析\n" +
                    "\n" +
                    "首先遍历链表得到链表长度，复杂度为 O(n). 递归遍历链表时，每个链表节点被访问一次，故时间复杂度为 O(n), 两者加起来总的时间复杂度仍为 O(n).\n" +
                    "\n" +
                    "进一步简化代码\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    TreeNode *sortedListToBST(ListNode *head) {\n" +
                    "        int length = 0;\n" +
                    "        ListNode *curr = head;\n" +
                    "        while (curr != NULL) {\n" +
                    "            curr = curr->next;\n" +
                    "            ++length;\n" +
                    "        }\n" +
                    "        return helper(head, length);\n" +
                    "    }\n" +
                    "private:\n" +
                    "    TreeNode *helper(ListNode *&pos, int length) {\n" +
                    "        if (length <= 0) {\n" +
                    "            return NULL;\n" +
                    "        }\n" +
                    "\n" +
                    "        TreeNode *left = helper(pos, length / 2);\n" +
                    "        TreeNode *root = new TreeNode(pos->val); // the sequence cannot be changed!\n" +
                    "                                                 // this is important difference of the solution above\n" +
                    "        pos = pos->next;\n" +
                    "        root->left = left;\n" +
                    "        root->right = helper(pos, length - length / 2 - 1);\n" +
                    "        return root;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "可以进一步简化 helper 函数代码，注意参数的接口设计。\n" +
                    "即是把传入的链表指针向前递进 n 步，并返回经过的链表节点转化成的二分查找树的根节点。\n" +
                    "注意注释中的那两句实现，new root 和 new left 不可调换顺序。这才是精简的要点。但是这种方法不如上面的分治法容易理解。\n" +
                    "O(nlogn) 的实现，避免 length 边界\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition for ListNode.\n" +
                    " * public class ListNode {\n" +
                    " *     int val;\n" +
                    " *     ListNode next;\n" +
                    " *     ListNode(int val) {\n" +
                    " *         this.val = val;\n" +
                    " *         this.next = null;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " * Definition of TreeNode:\n" +
                    " * public class TreeNode {\n" +
                    " *     public int val;\n" +
                    " *     public TreeNode left, right;\n" +
                    " *     public TreeNode(int val) {\n" +
                    " *         this.val = val;\n" +
                    " *         this.left = this.right = null;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " */ \n" +
                    "public class Solution {\n" +
                    "    /**\n" +
                    "     * @param head: The first node of linked list.\n" +
                    "     * @return: a tree node\n" +
                    "     */\n" +
                    "    public TreeNode sortedListToBST(ListNode head) {\n" +
                    "        if (head == null) {\n" +
                    "            return null;\n" +
                    "        }\n" +
                    "        return helper(head);\n" +
                    "    } \n" +
                    "\n" +
                    "    private TreeNode helper(ListNode head) {\n" +
                    "        if (head == null) {\n" +
                    "            return null;\n" +
                    "        }\n" +
                    "        if (head.next == null) {\n" +
                    "            return new TreeNode(head.val);\n" +
                    "        }\n" +
                    "\n" +
                    "        ListNode pre = null;\n" +
                    "        ListNode slow = head, fast = head;\n" +
                    "\n" +
                    "        while (fast != null && fast.next != null) {\n" +
                    "            pre = slow;\n" +
                    "            slow = slow.next;\n" +
                    "            fast = fast.next.next;\n" +
                    "        }\n" +
                    "        pre.next = null;\n" +
                    "\n" +
                    "        TreeNode root = new TreeNode(slow.val);\n" +
                    "        TreeNode L = helper(head);\n" +
                    "        TreeNode R = helper(slow.next);\n" +
                    "        root.left = L;\n" +
                    "        root.right = R;\n" +
                    "\n" +
                    "        return root;\n" +
                    "    } \n" +
                    "}\n" +
                    "源码分析\n" +
                    "\n" +
                    "如果想避免上述 length 边界搞错的问题，可以使用分治法遍历树求中点的方法。\n" +
                    "但这种时间复杂度是 O(nlogn)，性能上还是比 O(n) 差一点。\n" +
                    "Reference\n" +
                    "\n" +
                    "Convert Sorted List to Binary Search Tree | 九章算法");
            this.map.put("Binary Search Tree Iterator", "Source\n" +
                    "\n" +
                    "lintcode: (86) Binary Search Tree Iterator __\n" +
                    "Design an iterator over a binary search tree with the following rules:\n" +
                    "\n" +
                    "- Elements are visited in ascending order (i.e. an in-order traversal)\n" +
                    "- next() and hasNext() queries run in O(1) time in average.\n" +
                    "\n" +
                    "Example\n" +
                    "For the following binary search tree, in-order traversal by using iterator is [1, 6, 10, 11, 12]\n" +
                    "\n" +
                    "           10\n" +
                    "         /    \\\n" +
                    "        1      11\n" +
                    "         \\       \\\n" +
                    "             6       12\n" +
                    "\n" +
                    "Challenge\n" +
                    "Extra memory usage O(h), h is the height of the tree.\n" +
                    "\n" +
                    "Super Star: Extra memory usage O(1)\n" +
                    "题解 - 中序遍历\n" +
                    "\n" +
                    "仍然考的是中序遍历，但是是非递归实现。其实这道题等价于写一个二叉树中序遍历的迭代器。需要内置一个栈，一开始先存储到最左叶子节点的路径。在遍历的过程中，只要当 前节点存在右子树，则进入右子树，存储从此处开始到当前子树里最左叶子节点的路径。\n" +
                    "\n" +
                    "Java\n" +
                    "\n" +
                    "/**\n" +
                    " * Definition of TreeNode:\n" +
                    " * public class TreeNode {\n" +
                    " *     public int val;\n" +
                    " *     public TreeNode left, right;\n" +
                    " *     public TreeNode(int val) {\n" +
                    " *         this.val = val;\n" +
                    " *         this.left = this.right = null;\n" +
                    " *     }\n" +
                    " * }\n" +
                    " * Example of iterate a tree:\n" +
                    " * Solution iterator = new Solution(root);\n" +
                    " * while (iterator.hasNext()) {\n" +
                    " *    TreeNode node = iterator.next();\n" +
                    " *    do something for node\n" +
                    " * } \n" +
                    " */\n" +
                    "public class Solution {\n" +
                    "    private Stack stack = new Stack<>();\n" +
                    "    private TreeNode curt;\n" +
                    "\n" +
                    "    // @param root: The root of binary tree.\n" +
                    "    public Solution(TreeNode root) {\n" +
                    "        curt = root;\n" +
                    "    }\n" +
                    "\n" +
                    "    //@return: True if there has next node, or false\n" +
                    "    public boolean hasNext() {\n" +
                    "        return (curt != null || !stack.isEmpty()); //important to judge curt != null\n" +
                    "    }\n" +
                    "\n" +
                    "    //@return: return next node\n" +
                    "    public TreeNode next() {\n" +
                    "        while (curt != null) {\n" +
                    "            stack.push(curt);\n" +
                    "            curt = curt.left;\n" +
                    "        }\n" +
                    "\n" +
                    "        curt = stack.pop();\n" +
                    "        TreeNode node = curt;\n" +
                    "        curt = curt.right;\n" +
                    "\n" +
                    "        return node;\n" +
                    "    }\n" +
                    "}\n" +
                    "源码分析\n" +
                    "\n" +
                    "这里容易出错的是 hasNext() 函数中的判断语句，不能漏掉 curt != null。\n" +
                    "如果是 leetcode 上的原题，由于接口不同，则不需要维护 current 指针。");
            this.map.put("Subsets", "子集类问题类似Combination。\n" +
                    "\n" +
                    "Source\n" +
                    "\n" +
                    "lintcode: (17) Subsets\n" +
                    "Given a set of distinct integers, return all possible subsets.\n" +
                    "\n" +
                    "Note\n" +
                    "Elements in a subset must be in non-descending order.\n" +
                    "\n" +
                    "The solution set must not contain duplicate subsets.\n" +
                    "\n" +
                    "Example\n" +
                    "If S = [1,2,3], a solution is:\n" +
                    "\n" +
                    "[\n" +
                    "  [3],\n" +
                    "  [1],\n" +
                    "  [2],\n" +
                    "  [1,2,3],\n" +
                    "  [1,3],\n" +
                    "  [2,3],\n" +
                    "  [1,2],\n" +
                    "  []\n" +
                    "]\n" +
                    "题解\n" +
                    "\n" +
                    "首先对数组按升序排序\n" +
                    "回溯法递归\n" +
                    "Java\n" +
                    "\n" +
                    "class Solution {\n" +
                    "    /**\n" +
                    "     * @param S: A set of numbers.\n" +
                    "     * @return: A list of lists. All valid subsets.\n" +
                    "     */\n" +
                    "    public ArrayList> subsets(ArrayList S) {\n" +
                    "\n" +
                    "        ArrayList> result = new ArrayList>();\n" +
                    "        if (S == null || S.size() == 0) {\n" +
                    "            return result;\n" +
                    "        }\n" +
                    "\n" +
                    "        ArrayList list = new ArrayList();\n" +
                    "        Collections.sort(S);\n" +
                    "        backTrack(result, list, S, 0);\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "\n" +
                    "    private void backTrack(ArrayList> result,\n" +
                    "        ArrayList list, ArrayList num, int pos) {\n" +
                    "        result.add(new ArrayList(list));\n" +
                    "\n" +
                    "        for (int i = pos; i < num.size(); i++) {\n" +
                    "            list.add(num.get(i));\n" +
                    "            backTrack(result, list, num, i + 1);\n" +
                    "            list.remove(list.size() - 1);\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "Notice: backTrack(result, list, num, i + 1);中的『i + 1』不可误写为『pos + 1』，第一次写subsets的时候在这坑了很久... :(\n" +
                    "\n" +
                    "回溯法可用图示和函数运行的堆栈图来理解，强烈建议使用图形和递归的思想分析，以数组[1, 2, 3]进行分析。下图所示为list及resul t动态变化的过程，箭头向下表示list.add及result.add操作，箭头向下表示list.remove操作。\n" +
                    "\n如果你不相信以上的图形化分析，还可以自己在纸上分析代码的调用关系，下面以数组[1,2]为例分析回溯法的调用栈。\n" +
                    "\n" +
                    "首先由主函数 subsets 进入，初始化 result 为[]，接着进行异常处理，随后初始化 list 为[]，递归调用backTrack(), num = [1, 2]。\n" +
                    "result = [], list = [], pos = 0. 调用result.add()加入[], result = [[]]。进入for循环，num.size() = 2。\n" +
                    "i = 0,\n" +
                    "list.add(num[0]) -> list = [1], 递归调用backTrack()前, result = [[]], list = [1], pos = 1\n" +
                    "递归调用backTrack([[]], [1], [1, 2]，1)\n" +
                    "reslut.add[[1]] -> result = [[], [1]]\n" +
                    "i = 1, for(i = 1 < 2)\n" +
                    "list.add(num[1]) -> list = [1, 2]\n" +
                    "递归调用backTrack([[], [1]], [1, 2], [1, 2]，2)\n" +
                    "reslut.add[[1, 2]] -> result = [[], [1], [1, 2]]\n" +
                    "i = 2 退出for循环，退出此次调用\n" +
                    "list.remove(2 - 1) -> list = [1]\n" +
                    "i++ -> i = 2\n" +
                    "i = 2, 退出for循环，退出此次调用\n" +
                    "list.remove() -> list = []\n" +
                    "i++ -> i = 1，进入下一次循环\n" +
                    "i = 1, for(i = 1 < 2)\n" +
                    "list.add(num[1]) -> list = [2]\n" +
                    "递归调用backTrack([[], [1], [1, 2]], [2], [1, 2]，2)\n" +
                    "reslut.add[[2]] -> result = [[], [1], [1, 2], [2]]\n" +
                    "i = 2 退出for循环，退出此次调用\n" +
                    "list.remove(1 - 1) -> list = []\n" +
                    "i++ -> i = 2\n" +
                    "i = 2, 退出for循环，退出此次调用\n" +
                    "返回结果result\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param S: A set of numbers.\n" +
                    "     * @return: A list of lists. All valid subsets.\n" +
                    "     */\n" +
                    "    vector > subsets(vector &nums) {\n" +
                    "        vector > result;\n" +
                    "        if (nums.empty()) {\n" +
                    "            return result;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector list;\n" +
                    "        backTrack(result, list, nums, 0);\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    void backTrack(vector > &result, vector &list, \\\n" +
                    "                   vector &nums, int pos) {\n" +
                    "        result.push_back(list);\n" +
                    "\n" +
                    "        for (int i = pos; i != nums.size(); ++i) {\n" +
                    "            list.push_back(nums[i]);\n" +
                    "            backTrack(result, list, nums, i + 1);\n" +
                    "            list.pop_back();\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "Unique Subsets\n" +
                    "\n" +
                    "Source\n" +
                    "\n" +
                    "lintcode: (18) Unique Subsets\n" +
                    "Given a list of numbers that may has duplicate numbers, return all possible subsets\n" +
                    "\n" +
                    "Note\n" +
                    "Each element in a subset must be in non-descending order.\n" +
                    "\n" +
                    "The ordering between two subsets is free.\n" +
                    "\n" +
                    "The solution set must not contain duplicate subsets.\n" +
                    "\n" +
                    "Example\n" +
                    "If S = [1,2,2], a solution is:\n" +
                    "\n" +
                    "[\n" +
                    "  [2],\n" +
                    "  [1],\n" +
                    "  [1,2,2],\n" +
                    "  [2,2],\n" +
                    "  [1,2],\n" +
                    "  []\n" +
                    "]\n" +
                    "题解\n" +
                    "\n" +
                    "此题在上一题的基础上加了有重复元素的情况，因此需要对回溯函数进行一定的剪枝，对于排列组合的模板程序，剪枝通常可以从两个地方出发，一是在返回结果result .add之前进行剪枝，另一个则是在list.add处剪枝，具体使用哪一种需要视情况而定，哪种简单就选谁。\n" +
                    "\n" +
                    "由于此题所给数组不一定有序，故首先需要排序。有重复元素对最终结果的影响在于重复元素最多只能出现n次(重复个数为n时)。具体分析过程如下(此分析过程改编自 九章算法)。\n" +
                    "\n" +
                    "以 [1,2\u200B1\u200B\u200B,2\u200B2\u200B\u200B] 为例，若不考虑重复，组合有 [],[1],[1,2\u200B1\u200B\u200B],[1,2\u200B1\u200B\u200B,2\u200B2\u200B\u200B],[1,2\u200B2\u200B\u200B],[2\u200B1\u200B\u200B],[2\u200B1\u200B\u200B,2\u200B2\u200B\u200B],[2\u200B2\u200B\u200B]. 其中重复的有 [1,2\u200B2\u200B\u200B],[2\u200B2\u200B\u200B]. 从中我们可以看出只能从重复元素的第一个持续往下添加到列表中，而不能取第二个或之后的重复元素。参考上一题Subsets的模板，能代表「重复元素的第一个」即为 for 循环中的pos变量，i == pos时，i处所代表的变量即为某一层遍历中得「第一个元素」，因此去重时只需判断i != pos && s[i] == s[i - 1].\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param S: A set of numbers.\n" +
                    "     * @return: A list of lists. All valid subsets.\n" +
                    "     */\n" +
                    "    vector > subsetsWithDup(const vector &S) {\n" +
                    "        vector > result;\n" +
                    "        if (S.empty()) {\n" +
                    "            return result;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector list;\n" +
                    "        vector source(S);\n" +
                    "        sort(source.begin(), source.end());\n" +
                    "        backtrack(result, list, source, 0);\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    void backtrack(vector > &ret, vector &list,\n" +
                    "              vector &s, int pos) {\n" +
                    "\n" +
                    "        ret.push_back(list);\n" +
                    "\n" +
                    "        for (int i = pos; i != s.size(); ++i) {\n" +
                    "            if (i != pos && s[i] == s[i - 1]) {\n" +
                    "                continue;\n" +
                    "            }\n" +
                    "            list.push_back(s[i]);\n" +
                    "            backtrack(ret, list, s, i + 1);\n" +
                    "            list.pop_back();\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "Reference - 参考\n" +
                    "\n" +
                    "[NineChap 1.2] Permutation - Woodstock Blog * 九章算法 - subsets模板\n" +
                    "LeetCode: Subsets 解题报告 - Yu's Garden - 博客园 * 九章算法 | Subsets II");
            this.map.put("Permutation", "Source\n" +
                    "\n" +
                    "lintcode: (15) Permutations\n" +
                    "Given a list of numbers, return all possible permutations.\n" +
                    "\n" +
                    "Example\n" +
                    "For nums [1,2,3], the permutaions are:\n" +
                    "\n" +
                    "[\n" +
                    "\n" +
                    "    [1,2,3],\n" +
                    "\n" +
                    "    [1,3,2],\n" +
                    "\n" +
                    "    [2,1,3],\n" +
                    "\n" +
                    "    [2,3,1],\n" +
                    "\n" +
                    "    [3,1,2],\n" +
                    "\n" +
                    "    [3,2,1]\n" +
                    "\n" +
                    "]\n" +
                    "\n" +
                    "Challenge\n" +
                    "Do it without recursion\n" +
                    "题解\n" +
                    "\n" +
                    "使用之前subsets的模板，但是在取结果时只能取list.size() == nums.size()的解，且在添加list元素的时候需要注意除重。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param nums: A list of integers.\n" +
                    "     * @return: A list of permutations.\n" +
                    "     */\n" +
                    "    vector > permute(vector nums) {\n" +
                    "        vector > result;\n" +
                    "        if (nums.empty()) {\n" +
                    "            return result;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector list;\n" +
                    "        backTrack(result, list, nums);\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    void backTrack(vector > &result, vector &list, \\\n" +
                    "                   vector &nums) {\n" +
                    "        if (list.size() == nums.size()) {\n" +
                    "            result.push_back(list);\n" +
                    "            return;\n" +
                    "        }\n" +
                    "\n" +
                    "        for (int i = 0; i != nums.size(); ++i) {\n" +
                    "            // remove the element belongs to list\n" +
                    "            if (find(list.begin(), list.end(), nums[i]) != list.end()) {\n" +
                    "                continue;\n" +
                    "            }\n" +
                    "            list.push_back(nums[i]);\n" +
                    "            backTrack(result, list, nums);\n" +
                    "            list.pop_back();\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "在除重时使用了标准库find(不可使用时间复杂度更低的binary_search，因为list中元素不一定有序)，时间复杂度为 O(N), 也可使用hashmap记录nums中每个元素是否被添加到list中，这样一来空间复杂度为 O(N), 查找的时间复杂度为 O(1).\n" +
                    "\n" +
                    "在list.size() == nums.size()时，已经找到需要的解，及时return避免后面不必要的for循环调用开销。\n" +
                    "\n" +
                    "使用回溯法解题的关键在于如何确定正确解及排除不符条件的解(剪枝)。\n" +
                    "\n" +
                    "Unique Permutations\n" +
                    "\n" +
                    "Source\n" +
                    "\n" +
                    "lintcode: (16) Unique Permutations\n" +
                    "Given a list of numbers with duplicate number in it. Find all unique permutations.\n" +
                    "\n" +
                    "Example\n" +
                    "For numbers [1,2,2] the unique permutations are:\n" +
                    "\n" +
                    "[\n" +
                    "\n" +
                    "    [1,2,2],\n" +
                    "\n" +
                    "    [2,1,2],\n" +
                    "\n" +
                    "    [2,2,1]\n" +
                    "\n" +
                    "]\n" +
                    "\n" +
                    "Challenge\n" +
                    "Do it without recursion.\n" +
                    "题解\n" +
                    "\n" +
                    "在上题的基础上进行剪枝，剪枝的过程和 Subsets | Algorithm 中的 Unique Subsets 一题极为相似。为了便于分析，我们可以先分析简单的例子，以 [1,2\u200B1\u200B\u200B,2\u200B2\u200B\u200B] 为例。按照上题 Permutations 的解法，我们可以得到如下全排列。\n" +
                    "\n" +
                    "[1,2\u200B1\u200B\u200B,2\u200B2\u200B\u200B]\n" +
                    "[1,2\u200B2\u200B\u200B,2\u200B1\u200B\u200B]\n" +
                    "[2\u200B1\u200B\u200B,1,2\u200B2\u200B\u200B]\n" +
                    "[2\u200B1\u200B\u200B,2\u200B2\u200B\u200B,1]\n" +
                    "[2\u200B2\u200B\u200B,1,2\u200B1\u200B\u200B]\n" +
                    "[2\u200B2\u200B\u200B,2\u200B1\u200B\u200B,1]\n" +
                    "从以上结果我们注意到1和2重复，5和3重复，6和4重复，从重复的解我们可以发现其共同特征均是第二个 2\u200B2\u200B\u200B 在前，而第一个 2\u200B1\u200B\u200B 在后，因此我们的剪枝方法为：对于有相同的元素来说，我们只取不重复的一次。嗯，这样说还是有点模糊，下面以 [1,2\u200B1\u200B\u200B,2\u200B2\u200B\u200B] 和 [1,2\u200B2\u200B\u200B,2\u200B1\u200B\u200B] 进行说明。\n" +
                    "\n" +
                    "首先可以确定 [1,2\u200B1\u200B\u200B,2\u200B2\u200B\u200B] 是我们要的一个解，此时list为 [1,2\u200B1\u200B\u200B,2\u200B2\u200B\u200B], 经过两次list.pop_back()之后，list为 [1], 如果不进行剪枝，那么接下来要加入list的将为 2\u200B2\u200B\u200B, 那么我们剪枝要做的就是避免将 2\u200B2\u200B\u200B 加入到list中，如何才能做到这一点呢？我们仍然从上述例子出发进行分析，在第一次加入 2\u200B2\u200B\u200B 时，相对应的visited[1]为true(对应 2\u200B1\u200B\u200B)，而在第二次加入 2\u200B2\u200B\u200B 时，相对应的visited[1]为false，因为在list为 [1,2\u200B1\u200B\u200B] 时，执行list.pop_back()后即置为false。\n" +
                    "\n" +
                    "一句话总结即为：在遇到当前元素和前一个元素相等时，如果前一个元素visited[i - 1] == false, 那么我们就跳过当前元素并进入下一次循环，这就是剪枝的关键所在。另一点需要特别注意的是这种剪枝的方法能使用的前提是提供的nums是有序数组，否则无效。\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param nums: A list of integers.\n" +
                    "     * @return: A list of unique permutations.\n" +
                    "     */\n" +
                    "    vector > permuteUnique(vector &nums) {\n" +
                    "        vector > ret;\n" +
                    "        if (nums.empty()) {\n" +
                    "            return ret;\n" +
                    "        }\n" +
                    "\n" +
                    "        // important! sort before call `backTrack`\n" +
                    "        sort(nums.begin(), nums.end());\n" +
                    "        vector visited(nums.size(), false);\n" +
                    "        vector list;\n" +
                    "        backTrack(ret, list, visited, nums);\n" +
                    "\n" +
                    "        return ret;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    void backTrack(vector > &result, vector &list, \\\n" +
                    "                   vector &visited, vector &nums) {\n" +
                    "        if (list.size() == nums.size()) {\n" +
                    "            result.push_back(list);\n" +
                    "            // avoid unnecessary call for `for loop`, but not essential\n" +
                    "            return;\n" +
                    "        }\n" +
                    "\n" +
                    "        for (int i = 0; i != nums.size(); ++i) {\n" +
                    "            if (visited[i] || (i != 0 && nums[i] == nums[i - 1] \\\n" +
                    "                && !visited[i - 1])) {\n" +
                    "                continue;\n" +
                    "            }\n" +
                    "            visited[i] = true;\n" +
                    "            list.push_back(nums[i]);\n" +
                    "            backTrack(result, list, visited, nums);\n" +
                    "            list.pop_back();\n" +
                    "            visited[i] = false;\n" +
                    "        }\n" +
                    "    }\n" +
                    "};\n" +
                    "源码解析\n" +
                    "\n" +
                    "Unique Subsets 和 Unique Permutations 的源码模板非常经典！建议仔细研读并体会其中奥义。\n" +
                    "\n" +
                    "后记：在理解 Unique Subsets 和 Unique Permutations 的模板我花了差不多一整天时间才基本理解透彻，建议在想不清楚某些问题时先分析简单的问题，在纸上一步一步分析直至理解完全。\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "九章算法 | Permutation II");
            this.map.put("Triangle", "Source\n" +
                    "\n" +
                    "lintcode: (109) Triangle\n" +
                    "Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.\n" +
                    "\n" +
                    "Note\n" +
                    "Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.\n" +
                    "\n" +
                    "Example\n" +
                    "For example, given the following triangle\n" +
                    "\n" +
                    "[\n" +
                    "     [2],\n" +
                    "    [3,4],\n" +
                    "   [6,5,7],\n" +
                    "  [4,1,8,3]\n" +
                    "]\n" +
                    "The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).\n" +
                    "题解\n" +
                    "\n" +
                    "题中要求最短路径和，每次只能访问下行的相邻元素，将triangle视为二维坐标。此题方法较多，下面分小节详述。\n" +
                    "\n" +
                    "Method 1 - Traverse without hashmap\n" +
                    "\n" +
                    "首先考虑最容易想到的方法——递归遍历，逐个累加所有自上而下的路径长度，最后返回这些不同的路径长度的最小值。由于每个点往下都有2条路径，使用此方法的时间复杂度 约为 O(2\u200Bn\u200B\u200B), 显然是不可接受的解，不过我们还是先看看其实现思路。\n" +
                    "\n" +
                    "C++ Traverse without hashmap\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param triangle: a list of lists of integers.\n" +
                    "     * @return: An integer, minimum path sum.\n" +
                    "     */\n" +
                    "    int minimumTotal(vector > &triangle) {\n" +
                    "        if (triangle.empty()) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        int result = INT_MAX;\n" +
                    "        dfs(0, 0, 0, triangle, result);\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    void dfs(int x, int y, int sum, vector > &triangle, int &result) {\n" +
                    "        const int n = triangle.size();\n" +
                    "        if (x == n) {\n" +
                    "            if (sum < result) {\n" +
                    "                result = sum;\n" +
                    "            }\n" +
                    "            return;\n" +
                    "        }\n" +
                    "\n" +
                    "        dfs(x + 1, y, (sum + triangle[x][y]), triangle, result);\n" +
                    "        dfs(x + 1, y + 1, (sum + triangle[x][y]), triangle, result);\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "dfs()的循环终止条件为x == n，而不是x == n - 1，主要是方便在递归时sum均可使用sum + triangle[x][y] ，而不必根据不同的y和y+1改变，代码实现相对优雅一些。理解方式则变为从第x行走到第x+1行时的最短路径和，也就是说在此之前并不将第x行的元素值计算在内。\n" +
                    "\n" +
                    "这种遍历的方法时间复杂度如此之高的主要原因是因为在n较大时递归计算了之前已经得到的结果，而这些结果计算一次后即不再变化，可再次利用。因此我们可以使用hash map记忆已经计算得到的结果从而对其进行优化。\n" +
                    "\n" +
                    "Method 2 - Divide and Conquer without hashmap\n" +
                    "\n" +
                    "既然可以使用递归遍历，当然也可以使用「分治」的方法来解。「分治」与之前的遍历区别在于「分治」需要返回每次「分治」后的计算结果，下面看代码实现。\n" +
                    "\n" +
                    "C++ Divide and Conquer without hashmap\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param triangle: a list of lists of integers.\n" +
                    "     * @return: An integer, minimum path sum.\n" +
                    "     */\n" +
                    "    int minimumTotal(vector > &triangle) {\n" +
                    "        if (triangle.empty()) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        int result = dfs(0, 0, triangle);\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    int dfs(int x, int y, vector > &triangle) {\n" +
                    "        const int n = triangle.size();\n" +
                    "        if (x == n) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        return min(dfs(x + 1, y, triangle), dfs(x + 1, y + 1, triangle))  + triangle[x][y];\n" +
                    "    }\n" +
                    "};\n" +
                    "使用「分治」的方法代码相对简洁一点，接下来我们使用hashmap保存triangle中不同坐标的点计算得到的路径和。\n" +
                    "\n" +
                    "Method 3 - Divide and Conquer with hashmap\n" +
                    "\n" +
                    "新建一份大小和triangle一样大小的hashmap，并对每个元素赋以INT_MIN以做标记区分。\n" +
                    "\n" +
                    "C++ Divide and Conquer with hashmap\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param triangle: a list of lists of integers.\n" +
                    "     * @return: An integer, minimum path sum.\n" +
                    "     */\n" +
                    "    int minimumTotal(vector > &triangle) {\n" +
                    "        if (triangle.empty()) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector > hashmap(triangle);\n" +
                    "        for (int i = 0; i != hashmap.size(); ++i) {\n" +
                    "            for (int j = 0; j != hashmap[i].size(); ++j) {\n" +
                    "                hashmap[i][j] = INT_MIN;\n" +
                    "            }\n" +
                    "        }\n" +
                    "        int result = dfs(0, 0, triangle, hashmap);\n" +
                    "\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    int dfs(int x, int y, vector > &triangle, vector > &hashmap) {\n" +
                    "        const int n = triangle.size();\n" +
                    "        if (x == n) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        // INT_MIN means no value yet\n" +
                    "        if (hashmap[x][y] != INT_MIN) {\n" +
                    "            return hashmap[x][y];\n" +
                    "        }\n" +
                    "        int x1y = dfs(x + 1, y, triangle, hashmap);\n" +
                    "        int x1y1 = dfs(x + 1, y + 1, triangle, hashmap);\n" +
                    "        hashmap[x][y] =  min(x1y, x1y1) + triangle[x][y];\n" +
                    "\n" +
                    "        return hashmap[x][y];\n" +
                    "    }\n" +
                    "};\n" +
                    "由于已经计算出的最短路径值不再重复计算，计算复杂度由之前的 O(2\u200Bn\u200B\u200B)，变为 O(n\u200B2\u200B\u200B), 每个坐标的元素仅计算一次，故共计算的次数为 1+2+...+n≈O(n\u200B2\u200B\u200B).\n" +
                    "\n" +
                    "Method 4 - Dynamic Programming\n" +
                    "\n" +
                    "从主章节中对动态规划的简介我们可以知道使用动态规划的难点和核心在于状态的定义及转化方程的建立。那么问题来了，到底如何去找适合这个问题的状态及转化方程 呢？\n" +
                    "\n" +
                    "我们仔细分析题中可能的状态和转化关系，发现从triangle中坐标为 triangle[x][y] 的元素出发，其路径只可能为 triangle[x][y]−>triangle[x+1][y] 或者 triangle[x][y]−>triangle[x+1][y+1]. 以点 (x,y) 作为参考，那么可能的状态 f(x,y) 就可以是：\n" +
                    "\n" +
                    "从 (x,y) 出发走到最后一行的最短路径和\n" +
                    "从 (0,0) 走到 (x,y)的最短路径和\n" +
                    "如果选择1作为状态，则相应的状态转移方程为： f\u200B1\u200B\u200B(x,y)=min{f\u200B1\u200B\u200B(x+1,y),f\u200B1\u200B\u200B(x+1,y+1)}+triangle[x][y]\n" +
                    "\n" +
                    "如果选择2作为状态，则相应的状态转移方程为： f\u200B2\u200B\u200B(x,y)=min{f\u200B2\u200B\u200B(x−1,y),f\u200B2\u200B\u200B(x−1,y−1)}+triangle[x][y]\n" +
                    "\n" +
                    "两个状态所对应的初始状态分别为 f\u200B1\u200B\u200B(n−1,y),0≤y≤n−1 和 f\u200B2\u200B\u200B(0,0). 在代码中应注意考虑边界条件。下面分别就这种不同的状态进行动态规划。\n" +
                    "\n" +
                    "C++ From Bottom to Top\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param triangle: a list of lists of integers.\n" +
                    "     * @return: An integer, minimum path sum.\n" +
                    "     */\n" +
                    "    int minimumTotal(vector > &triangle) {\n" +
                    "        if (triangle.empty()) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector > hashmap(triangle);\n" +
                    "\n" +
                    "        // get the total row number of triangle\n" +
                    "        const int N = triangle.size();\n" +
                    "        for (int i = 0; i != N; ++i) {\n" +
                    "            hashmap[N-1][i] = triangle[N-1][i];\n" +
                    "        }\n" +
                    "\n" +
                    "        for (int i = N - 2; i >= 0; --i) {\n" +
                    "            for (int j = 0; j < i + 1; ++j) {\n" +
                    "                hashmap[i][j] = min(hashmap[i + 1][j], hashmap[i + 1][j + 1]) + triangle[i][j];\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return hashmap[0][0];\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理\n" +
                    "使用hashmap保存结果\n" +
                    "初始化hashmap[N-1][i], 由于是自底向上，故初始化时保存最后一行元素\n" +
                    "使用自底向上的方式处理循环\n" +
                    "最后返回结果hashmap[0][0]\n" +
                    "从空间利用角度考虑也可直接使用triangle替代hashmap，但是此举会改变triangle的值，不推荐。\n" +
                    "\n" +
                    "C++ From Top to Bottom\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param triangle: a list of lists of integers.\n" +
                    "     * @return: An integer, minimum path sum.\n" +
                    "     */\n" +
                    "    int minimumTotal(vector > &triangle) {\n" +
                    "        if (triangle.empty()) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector > hashmap(triangle);\n" +
                    "\n" +
                    "        // get the total row number of triangle\n" +
                    "        const int N = triangle.size();\n" +
                    "        //hashmap[0][0] = triangle[0][0];\n" +
                    "        for (int i = 1; i != N; ++i) {\n" +
                    "            for (int j = 0; j <= i; ++j) {\n" +
                    "                if (j == 0) {\n" +
                    "                    hashmap[i][j] = hashmap[i - 1][j];\n" +
                    "                }\n" +
                    "                if (j == i) {\n" +
                    "                    hashmap[i][j] = hashmap[i - 1][j - 1];\n" +
                    "                }\n" +
                    "                if ((j > 0) && (j < i)) {\n" +
                    "                    hashmap[i][j] = min(hashmap[i - 1][j], hashmap[i - 1][j - 1]);\n" +
                    "                }\n" +
                    "                hashmap[i][j] += triangle[i][j];\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        int result = INT_MAX;\n" +
                    "        for (int i = 0; i != N; ++i) {\n" +
                    "            result = min(result, hashmap[N - 1][i]);\n" +
                    "        }\n" +
                    "        return result;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码解析\n" +
                    "\n" +
                    "自顶向下的实现略微有点复杂，在寻路时需要考虑最左边和最右边的边界，还需要在最后返回结果时比较最小值。");
            this.map.put("Knapsack", "在一次抢珠宝店的过程中，抢劫犯只能抢走以下三种珠宝，其重量和价值如下表所述。\n" +
                    "\n" +
                    "Item(jewellery)\tWeight\tValue\n" +
                    "1\t6\t23\n" +
                    "2\t3\t13\n" +
                    "3\t4\t11\n" +
                    "抢劫犯这次过来光顾珠宝店只带了一个最多只能承重17 kg的粉红色小包，于是问题来了，怎样搭配这些不同重量不同价值的珠宝才能不虚此行呢？哎，这年头抢劫也不容易啊...\n" +
                    "\n" +
                    "用数学语言来描述这个问题就是： 背包最多只能承重 W kg, 有 n 种珠宝可供选择，这 n 种珠宝的重量分别为 ω\u200B1\u200B\u200B,⋯,ω\u200Bn\u200B\u200B, 相应的价值为 v\u200B1\u200B\u200B,⋯,v\u200Bn\u200B\u200B. 问如何选择这些珠宝使得放进包里的珠宝价值最大化？\n" +
                    "\n" +
                    "Knapsack with repetition - 物品重复可用的背包问题\n" +
                    "\n" +
                    "由于这类背包问题中，同一物品可以被多次选择，因此称为Knapsack with repetition, 又称Unbounded knapsack problem(无界背包问题).\n" +
                    "\n" +
                    "动态规划是解决背包问题的有力武器，而在动态规划中，主要的问题之一就是——状态(子问题)是什么？在本题中我们可以从两个方面对原始问题进行化大为小：要么是是更小 的背包容量 ω≤W, 要么尝试更少的珠宝数目(如珠宝 1,2,⋯,j, for j≤n). 这两个状态(子问题)究竟哪个对于解题更为方便，还需进一步论证——能否根据状态(子问题)很方便地写出状态转移方程。\n" +
                    "\n" +
                    "先来看看第一种状态：在背包容量为 ω 时抢劫犯所能获得的最优值为 K(ω). 对应此状态的状态转移方程并不是那么直观，先从 K(ω) 所包含的信息出发，K(ω)>0 时，背包中必然含有某件值钱的珠宝，不妨假设最优值 K(ω) 包含某珠宝 i, 那么将珠宝 i 从背包中移除后，背包中剩余珠宝的价值加上珠宝 i 的价值即为 K(ω). 哪尼？这不就是个天然的状态转移方程么？抢劫犯灵机一动，立马想出了如下状态转移方程： K(ω)=F(ω−ω\u200Bi\u200B\u200B)+v\u200Bi\u200B\u200B (ω\u200Bi\u200B\u200B∈Ω)\n" +
                    "\n" +
                    "其中 F(ω−ω\u200Bi\u200B\u200B) 为拿出珠宝 i 后的价值映射函数(用人话来说就是把粉红色小包里剩下的珠宝价值加起来)，取出来的珠宝重量 ω\u200Bi\u200B\u200B<ω(总不能取出大于背包重量的珠宝吧...), Ω 即为 K(ω) 中 ω\u200Bi\u200B\u200B 的所有可能取值。想了想好像哪里不对劲，K(ω) 的转移关系没鼓捣出来，反而新添了个 F(ω−ω\u200Bi\u200B\u200B), 真是旧爱未了又添新欢... 别急，再仔细瞅瞅以上等式两端，拿出珠宝 i 后，其价值 v\u200Bi\u200B\u200B 就可以认为是一个定值了，故要想 K(ω) 为最大值，F(ω−ω\u200Bi\u200B\u200B) 也理应是背包容量为 ω−ω\u200Bi\u200B\u200B 时的包内珠宝的最大价值，如若不是，则必然存在 F(ω−ω\u200Bi\u200B\u200B)\n" +
                    "\n" +
                    "嗯，好像还是有哪里不对劲，千斤顶虽然已晋级为备胎，可备胎这个身份实在是不怎么好听，这不还有下标 i 这个标记嘛，我们给抢劫犯想想法子，怎么才能让备胎尽快转正呢？！仔细分析发现我们刚才取出d的价值 v\u200Bi\u200B\u200B 是从已知背包容量为 ω 时取出来的珠宝 i, 重量为 ω\u200Bi\u200B\u200B. 那么到底那几个珠宝才是可能被取出来的呢？答案不得而知，只知道肯定是小于背包容量 ω 中的某一个。既然是这样，我们把所有小于背包容量 ω 的珠宝挨个拿出来比一比不就完了么？但这样一来又有了新的问题：取出来的珠宝 ω\u200Bi\u200B\u200B 不一定是最大值 K(ω)中所包含的珠宝，那假如我们一定要拿出来比一比呢？得到的结果自然是不大于最大值 K(ω)(如果不是，反证法证之), 用数学语言表示就是： K(ω)≥K(ω−ω\u200Bj\u200B\u200B)+v\u200Bj\u200B\u200B (ω\u200Bj\u200B\u200B∉Ω)\n" +
                    "\n" +
                    "整理一下思路，用优雅的数学语言来表示就是： K(ω)=max\u200Bi: ω\u200Bi\u200B\u200B≤ω\u200B\u200B{K(ω−ω\u200Bi\u200B\u200B)+v\u200Bi\u200B\u200B}\n" +
                    "\n" +
                    "备胎终于得以登堂入室，警察叔叔，就是她了... 状态转移方程终于完整的找到了，千斤顶窃喜道：皇天不负有心人，我也有转正的一天，蛤蛤蛤...\n" +
                    "\n" +
                    "Knapsack without repetition - 01背包问题\n" +
                    "\n" +
                    "上节讲述的是最原始的背包问题，这节我们探讨条件受限情况下的背包问题。若一件珠宝最多只能带走一件，请问现在抢劫犯该如何做才能使得背包中的珠宝价值总价最大？\n" +
                    "\n" +
                    "显然，无界背包中的状态及状态方程已经不适用于01背包问题，那么我们来比较这两个问题的不同之处，无界背包问题中同一物品可以使用多次，而01背包问题中一个背包仅 可使用一次，区别就在这里。我们将 K(ω) 改为 K(i,ω) 即可，新的状态表示前 i 件物品放入一个容量为 ω 的背包可以获得的最大价值。\n" +
                    "\n" +
                    "现在从以上状态定义出发寻找相应的状态转移方程。K(i−1,ω)为 K(i,ω) 的子问题，如果不放第 i 件物品，那么问题即转化为「前 i−1 件物品放入容量为 ω 的背包」，此时背包内获得的总价值为 K(i−1,ω)；如果放入第 i 件物品，那么问题即转化为「前 i−1 件物品放入容量为 ω−ω\u200Bi\u200B\u200B 的背包」，此时背包内获得的总价值为 K(i−1,ω−ω\u200Bi\u200B\u200B)+v\u200Bi\u200B\u200B. 新的状态转移方程用数学语言来表述即为： K(i,ω)=max{K(i−1,ω),K(i−1,ω−ω\u200Bi\u200B\u200B)+v\u200Bi\u200B\u200B}\n" +
                    "\n" +
                    "Reference\n" +
                    "\n" +
                    "Chapter 6.4 Knapsack Algorithm - S. Dasgupta\n" +
                    "0019算法笔记——【动态规划】0-1背包问题 - liufeng_king的专栏 * 崔添翼 § 翼若垂天之云 › 《背包问题九讲》2.0 alpha1");
            this.map.put("Backpack", "Source\n" +
                    "\n" +
                    "lintcode: (92) Backpack\n" +
                    "Given n items with size A[i], an integer m denotes the size of a backpack. How full you can fill this backpack?\n" +
                    "\n" +
                    "Note\n" +
                    "You can not divide any item into small pieces.\n" +
                    "\n" +
                    "Example\n" +
                    "If we have 4 items with size [2, 3, 5, 7], the backpack size is 11, we can select 2, 3 and 5, so that the max size we can fill this backpack is 10. If the backpack size is 12. we can select [2, 3, 7] so that we can fulfill the backpack.\n" +
                    "\n" +
                    "You function should return the max size we can fill in the given backpack.\n" +
                    "题解\n" +
                    "\n" +
                    "本题是典型的01背包问题，每种类型的物品最多只能选择一件。先来看看 九章算法 的### 题解\n" +
                    "\n" +
                    "状态: result[i][S] 表示前i个物品，取出一些物品能否组成体积和为S的背包\n" +
                    "状态转移方程: f[i][S]=f[i−1][S−A[i]] or f[i−1][S] (A[i]为第i个物品的大小)\n" +
                    "欲从前i个物品中取出一些组成体积和为S的背包，可从两个状态转换得到。\n" +
                    "f[i−1][S−A[i]]: 放入第i个物品，前 i−1 个物品能否取出一些体积和为 S−A[i] 的背包。\n" +
                    "f[i−1][S]: 不放入第i个物品，前 i−1 个物品能否取出一些组成体积和为S的背包。\n" +
                    "状态初始化: f[1⋯n][0]=true; f[0][1⋯m]=false. 前1~n个物品组成体积和为0的背包始终为真，其他情况为假。\n" +
                    "返回结果: 寻找使 f[n][S] 值为true的最大S (1≤S≤m)\n" +
                    "C++ 2D vector for result\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param m: An integer m denotes the size of a backpack\n" +
                    "     * @param A: Given n items with size A[i]\n" +
                    "     * @return: The maximum size\n" +
                    "     */\n" +
                    "    int backPack(int m, vector A) {\n" +
                    "        if (A.empty() || m < 1) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int N = A.size() + 1;\n" +
                    "        const int M = m + 1;\n" +
                    "        vector > result;\n" +
                    "        result.resize(N);\n" +
                    "        for (vector::size_type i = 0; i != N; ++i) {\n" +
                    "            result[i].resize(M);\n" +
                    "            std::fill(result[i].begin(), result[i].end(), false);\n" +
                    "        }\n" +
                    "\n" +
                    "        result[0][0] = true;\n" +
                    "        for (int i = 1; i != N; ++i) {\n" +
                    "            for (int j = 0; j != M; ++j) {\n" +
                    "                if (j < A[i - 1]) {\n" +
                    "                    result[i][j] = result[i - 1][j];\n" +
                    "                } else {\n" +
                    "                    result[i][j] = result[i - 1][j] || result[i - 1][j - A[i - 1]];\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        // return the largest i if true\n" +
                    "        for (int i = M; i > 0; --i) {\n" +
                    "            if (result[N - 1][i - 1]) {\n" +
                    "                return (i - 1);\n" +
                    "            }\n" +
                    "        }\n" +
                    "        return 0;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理\n" +
                    "初始化结果矩阵，注意这里需要使用resize而不是reserve，否则可能会出现段错误\n" +
                    "实现状态转移逻辑，一定要分j < A[i - 1]与否来讨论\n" +
                    "返回结果，只需要比较result[N - 1][i - 1]的结果，返回true的最大值\n" +
                    "状态转移逻辑中代码可以进一步简化，即：\n" +
                    "\n" +
                    "        for (int i = 1; i != N; ++i) {\n" +
                    "            for (int j = 0; j != M; ++j) {\n" +
                    "                result[i][j] = result[i - 1][j];\n" +
                    "                if (j >= A[i - 1] && result[i - 1][j - A[i - 1]]) {\n" +
                    "                    result[i][j] = true;\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "考虑背包问题的核心——状态转移方程，如何优化此转移方程？原始方案中用到了二维矩阵来保存result，注意到result的第i行仅依赖于第i-1行的结果，那么 能否用一维数组来代替这种隐含的关系呢？我们在内循环j处递减即可。如此即可避免result[i][S]的值由本轮result[i][S-A[i] ]递推得到。\n" +
                    "\n" +
                    "C++ 1D vector for result\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param m: An integer m denotes the size of a backpack\n" +
                    "     * @param A: Given n items with size A[i]\n" +
                    "     * @return: The maximum size\n" +
                    "     */\n" +
                    "    int backPack(int m, vector A) {\n" +
                    "        if (A.empty() || m < 1) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int N = A.size();\n" +
                    "        vector result;\n" +
                    "        result.resize(m + 1);\n" +
                    "        std::fill(result.begin(), result.end(), false);\n" +
                    "\n" +
                    "        result[0] = true;\n" +
                    "        for (int i = 0; i != N; ++i) {\n" +
                    "            for (int j = m; j >= 0; --j) {\n" +
                    "                if (j >= A[i] && result[j - A[i]]) {\n" +
                    "                    result[j] = true;\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        // return the largest i if true\n" +
                    "        for (int i = m; i > 0; --i) {\n" +
                    "            if (result[i]) {\n" +
                    "                return i;\n" +
                    "            }\n" +
                    "        }\n" +
                    "        return 0;\n" +
                    "    }\n" +
                    "};\n" +
                    "Backpack II\n" +
                    "\n" +
                    "Source\n" +
                    "\n" +
                    "lintcode: (125) Backpack II\n" +
                    "Given n items with size A[i] and value V[i], and a backpack with size m. What's the maximum value can you put into the backpack?\n" +
                    "\n" +
                    "Note\n" +
                    "You cannot divide item into small pieces and the total size of items you choose should smaller or equal to m.\n" +
                    "Example\n" +
                    "Given 4 items with size [2, 3, 5, 7] and value [1, 5, 2, 4], and a backpack with size 10. The maximum value is 9.\n" +
                    "题解\n" +
                    "\n" +
                    "首先定义状态 K(i,w) 为前 i 个物品放入size为 w 的背包中所获得的最大价值，则相应的状态转移方程为： K(i,w)=max{K(i−1,w),K(i−1,w−w\u200Bi\u200B\u200B)+v\u200Bi\u200B\u200B}\n" +
                    "\n" +
                    "详细分析过程见本节。\n" +
                    "\n" +
                    "C++ 2D vector for result\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param m: An integer m denotes the size of a backpack\n" +
                    "     * @param A & V: Given n items with size A[i] and value V[i]\n" +
                    "     * @return: The maximum value\n" +
                    "     */\n" +
                    "    int backPackII(int m, vector A, vector V) {\n" +
                    "        if (A.empty() || V.empty() || m < 1) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "        const int N = A.size() + 1;\n" +
                    "        const int M = m + 1;\n" +
                    "        vector > result;\n" +
                    "        result.resize(N);\n" +
                    "        for (vector::size_type i = 0; i != N; ++i) {\n" +
                    "            result[i].resize(M);\n" +
                    "            std::fill(result[i].begin(), result[i].end(), 0);\n" +
                    "        }\n" +
                    "\n" +
                    "        for (vector::size_type i = 1; i != N; ++i) {\n" +
                    "            for (int j = 0; j != M; ++j) {\n" +
                    "                if (j < A[i - 1]) {\n" +
                    "                    result[i][j] = result[i - 1][j];\n" +
                    "                } else {\n" +
                    "                    int temp = result[i - 1][j - A[i - 1]] + V[i - 1];\n" +
                    "                    result[i][j] = max(temp, result[i - 1][j]);\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return result[N - 1][M - 1];\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "使用二维矩阵保存结果result\n" +
                    "返回result矩阵的右下角元素——背包size限制为m时的最大价值\n" +
                    "按照第一题backpack的思路，这里可以使用一维数组进行空间复杂度优化。优化方法为逆序求result[j]，优化后的代码如下：\n" +
                    "\n" +
                    "C++ 1D vector for result\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param m: An integer m denotes the size of a backpack\n" +
                    "     * @param A & V: Given n items with size A[i] and value V[i]\n" +
                    "     * @return: The maximum value\n" +
                    "     */\n" +
                    "    int backPackII(int m, vector A, vector V) {\n" +
                    "        if (A.empty() || V.empty() || m < 1) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int M = m + 1;\n" +
                    "        vector result;\n" +
                    "        result.resize(M);\n" +
                    "        std::fill(result.begin(), result.end(), 0);\n" +
                    "\n" +
                    "        for (vector::size_type i = 0; i != A.size(); ++i) {\n" +
                    "            for (int j = m; j >= 0; --j) {\n" +
                    "                if (j < A[i]) {\n" +
                    "                    // result[j] = result[j];\n" +
                    "                } else {\n" +
                    "                    int temp = result[j - A[i]] + V[i];\n" +
                    "                    result[j] = max(temp, result[j]);\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return result[M - 1];\n" +
                    "    }\n" +
                    "};\n" +
                    "Reference\n" +
                    "\n" +
                    "Lintcode: Backpack - neverlandly - 博客园 * Lintcode: Backpack II - neverlandly - 博客园\n" +
                    "九章算法 | 背包问题 * 崔添翼 § 翼若垂天之云 › 《背包问题九讲》2.0 alpha1");
            this.map.put("Matrix", "本节主要总结矩阵类动态规划问题，根据动态规划解题的四要素，矩阵类动态规划问题可以从以下四个方面进行分析：\n" +
                    "\n" +
                    "State: f[x][y] 从起点走到坐标(x,y)的值\n" +
                    "Function: 走到坐标(x,y)之前的状态转移\n" +
                    "Initialization: 初始状态 - 起点\n" +
                    "Answer: 终点");

            this.map.put("Minimum Path Sum", "Source\n" +
                    "\n" +
                    "lintcode: (110) Minimum Path Sum\n" +
                    "Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.\n" +
                    "\n" +
                    "Note\n" +
                    "You can only move either down or right at any point in time.\n" +
                    "题解\n" +
                    "\n" +
                    "State: f[x][y] 从坐标(0,0)走到(x,y)的最短路径和\n" +
                    "Function: f[x][y] = (x, y) + min{f[x-1][y], f[x][y-1]}\n" +
                    "Initialization: f[0][0] = A[0][0], f[i][0] = sum(0,0 -> i,0), f[0][i] = sum(0,0 -> 0,i)\n" +
                    "Answer: f[m-1][n-1]\n" +
                    "注意最后返回为f[m-1][n-1]而不是f[m][n].\n" +
                    "\n" +
                    "首先看看如下正确但不合适的答案，OJ上会出现TLE。 未使用hashmap并且使用了递归的错误版本。\n" +
                    "\n" +
                    "C++ dfs without hashmap: Wrong answer\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param grid: a list of lists of integers.\n" +
                    "     * @return: An integer, minimizes the sum of all numbers along its path\n" +
                    "     */\n" +
                    "    int minPathSum(vector > &grid) {\n" +
                    "        if (grid.empty()) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int m = grid.size() - 1;\n" +
                    "        const int n = grid[0].size() - 1;\n" +
                    "\n" +
                    "        return helper(grid, m, n);\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "private:\n" +
                    "    int helper(vector > &grid_in, int x, int y) {\n" +
                    "        if (0 == x && 0 == y) {\n" +
                    "            return grid_in[0][0];\n" +
                    "        }\n" +
                    "        if (0 == x) {\n" +
                    "            return helper(grid_in, x, y - 1) + grid_in[x][y];\n" +
                    "        }\n" +
                    "        if (0 == y) {\n" +
                    "            return helper(grid_in, x - 1, y) + grid_in[x][y];\n" +
                    "        }\n" +
                    "\n" +
                    "        return grid_in[x][y] + min(helper(grid_in, x - 1, y), helper(grid_in, x, y - 1));\n" +
                    "    }\n" +
                    "};\n" +
                    "使用迭代思想进行求解的正确实现：\n" +
                    "\n" +
                    "C++ Iterative\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param grid: a list of lists of integers.\n" +
                    "     * @return: An integer, minimizes the sum of all numbers along its path\n" +
                    "     */\n" +
                    "    int minPathSum(vector > &grid) {\n" +
                    "        if (grid.empty() || grid[0].empty()) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int M = grid.size();\n" +
                    "        const int N = grid[0].size();\n" +
                    "        vector > ret(M, vector (N, 0));\n" +
                    "\n" +
                    "        ret[0][0] = grid[0][0];\n" +
                    "        for (int i = 1; i != M; ++i) {\n" +
                    "            ret[i][0] = grid[i][0] + ret[i - 1][0];\n" +
                    "        }\n" +
                    "        for (int i = 1; i != N; ++i) {\n" +
                    "            ret[0][i] = grid[0][i] + ret[0][i - 1];\n" +
                    "        }\n" +
                    "\n" +
                    "        for (int i = 1; i != M; ++i) {\n" +
                    "            for (int j = 1; j != N; ++j) {\n" +
                    "                ret[i][j] = grid[i][j] + min(ret[i - 1][j], ret[i][j - 1]);\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return ret[M - 1][N - 1];\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理，不仅要对grid还要对grid[0]分析\n" +
                    "对返回结果矩阵进行初始化，注意ret[0][0]须单独初始化以便使用ret[i-1]\n" +
                    "递推时i和j均从1开始\n" +
                    "返回结果ret[M-1][N-1]，注意下标是从0开始的\n" +
                    "此题还可进行空间复杂度优化，和背包问题类似，使用一维数组代替二维矩阵也行，具体代码可参考 水中的鱼: [LeetCode] Minimum Path Sum 解题报告\n" +
                    "\n" +
                    "优化空间复杂度，要么对行遍历进行优化，要么对列遍历进行优化，通常我们习惯先按行遍历再按列遍历，有状态转移方程 f[x][y] = (x, y) + min{f[x-1][y], f[x][y-1]} 知，想要优化行遍历，那么f[y]保存的值应为第x行第y列的和。由于无行下标信息，故初始化时仅能对第一个元素初始化，分析时建议画图理解。\n" +
                    "\n" +
                    "C++ 1D vector\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param grid: a list of lists of integers.\n" +
                    "     * @return: An integer, minimizes the sum of all numbers along its path\n" +
                    "     */\n" +
                    "    int minPathSum(vector > &grid) {\n" +
                    "        if (grid.empty() || grid[0].empty()) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int M = grid.size();\n" +
                    "        const int N = grid[0].size();\n" +
                    "        vector ret(N, INT_MAX);\n" +
                    "\n" +
                    "        ret[0] = 0;\n" +
                    "\n" +
                    "        for (int i = 0; i != M; ++i) {\n" +
                    "            ret[0] =  ret[0] + grid[i][0];\n" +
                    "            for (int j = 1; j != N; ++j) {\n" +
                    "                ret[j] = grid[i][j] + min(ret[j], ret[j - 1]);\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return ret[N - 1];\n" +
                    "    }\n" +
                    "};\n" +
                    "初始化时需要设置为INT_MAX，便于i = 0时取ret[j].");
            this.map.put("Unique Paths", "Source\n" +
                    "\n" +
                    "lintcode: (114) Unique Paths\n" +
                    "A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).\n" +
                    "\n" +
                    "The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).\n" +
                    "\n" +
                    "How many possible unique paths are there?\n" +
                    "\n" +
                    "Note\n" +
                    "m and n will be at most 100.\n" +
                    "题解\n" +
                    "\n" +
                    "题目要求：给定m x n矩阵，求左上角到右下角的路径总数，每次只能向左或者向右前进。按照动态规划中矩阵类问题的通用方法：\n" +
                    "\n" +
                    "State: f[m][n] 从起点到坐标(m,n)的路径数目\n" +
                    "Function: f[m][n] = f[m-1][n] + f[m][n-1] 分析终点与左边及右边节点的路径数，发现从左边或者右边到达终点的路径一定不会重合，相加即为唯一的路径总数\n" +
                    "Initialization: f[i][j] = 1, 到矩阵中任一节点均至少有一条路径，其实关键之处在于给第0行和第0列初始化，免去了单独遍历第0行和第0列进行初始化\n" +
                    "Answer: f[m - 1][n - 1]\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param n, m: positive integer (1 <= n ,m <= 100)\n" +
                    "     * @return an integer\n" +
                    "     */\n" +
                    "    int uniquePaths(int m, int n) {\n" +
                    "        if (m < 1 || n < 1) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector > ret(m, vector(n, 1));\n" +
                    "\n" +
                    "        for (int i = 1; i != m; ++i) {\n" +
                    "            for (int j = 1; j != n; ++j) {\n" +
                    "                ret[i][j] = ret[i - 1][j] + ret[i][j - 1];\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return ret[m - 1][n - 1];\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理，虽然题目有保证为正整数，但还是判断一下以防万一\n" +
                    "初始化二维矩阵，值均为1\n" +
                    "按照转移矩阵函数进行累加\n" +
                    "任何ret[m - 1][n - 1]\n" +
                    "Unique Paths II\n" +
                    "\n" +
                    "Source\n" +
                    "\n" +
                    "lintcode: (115) Unique Paths II\n" +
                    "Follow up for \"Unique Paths\":\n" +
                    "\n" +
                    "Now consider if some obstacles are added to the grids. How many unique paths would there be?\n" +
                    "\n" +
                    "An obstacle and empty space is marked as 1 and 0 respectively in the grid.\n" +
                    "Note\n" +
                    "m and n will be at most 100.\n" +
                    "\n" +
                    "Example\n" +
                    "For example,\n" +
                    "There is one obstacle in the middle of a 3x3 grid as illustrated below.\n" +
                    "\n" +
                    "[\n" +
                    "  [0,0,0],\n" +
                    "  [0,1,0],\n" +
                    "  [0,0,0]\n" +
                    "]\n" +
                    "The total number of unique paths is 2.\n" +
                    "题解\n" +
                    "\n" +
                    "在上题的基础上加了obstacal这么一个限制条件，那么也就意味着凡是遇到障碍点，其路径数马上变为0，需要注意的是初始化环节和上题有较大不同。首先来看看错误 的初始化实现。\n" +
                    "\n" +
                    "C++ initialization error\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param obstacleGrid: A list of lists of integers\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int uniquePathsWithObstacles(vector > &obstacleGrid) {\n" +
                    "        if(obstacleGrid.empty() || obstacleGrid[0].empty()) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int M = obstacleGrid.size();\n" +
                    "        const int N = obstacleGrid[0].size();\n" +
                    "\n" +
                    "        vector > ret(M, vector(N, 0));\n" +
                    "\n" +
                    "        for (int i = 0; i != M; ++i) {\n" +
                    "            if (0 == obstacleGrid[i][0]) {\n" +
                    "                ret[i][0] = 1;\n" +
                    "            }\n" +
                    "        }\n" +
                    "        for (int i = 0; i != N; ++i) {\n" +
                    "            if (0 == obstacleGrid[0][i]) {\n" +
                    "                ret[0][i] = 1;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        for (int i = 1; i != M; ++i) {\n" +
                    "            for (int j = 1; j != N; ++j) {\n" +
                    "                if (obstacleGrid[i][j]) {\n" +
                    "                    ret[i][j] = 0;\n" +
                    "                } else {\n" +
                    "                    ret[i][j] = ret[i -1][j] + ret[i][j - 1];\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return ret[M - 1][N - 1];\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "错误之处在于初始化第0行和第0列时，未考虑到若第0行/列有一个坐标出现障碍物，则当前行/列后的元素路径数均为0！\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param obstacleGrid: A list of lists of integers\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int uniquePathsWithObstacles(vector > &obstacleGrid) {\n" +
                    "        if(obstacleGrid.empty() || obstacleGrid[0].empty()) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int M = obstacleGrid.size();\n" +
                    "        const int N = obstacleGrid[0].size();\n" +
                    "\n" +
                    "        vector > ret(M, vector(N, 0));\n" +
                    "\n" +
                    "        for (int i = 0; i != M; ++i) {\n" +
                    "            if (obstacleGrid[i][0]) {\n" +
                    "                break;\n" +
                    "            } else {\n" +
                    "                ret[i][0] = 1;\n" +
                    "            }\n" +
                    "        }\n" +
                    "        for (int i = 0; i != N; ++i) {\n" +
                    "            if (obstacleGrid[0][i]) {\n" +
                    "                break;\n" +
                    "            } else {\n" +
                    "                ret[0][i] = 1;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        for (int i = 1; i != M; ++i) {\n" +
                    "            for (int j = 1; j != N; ++j) {\n" +
                    "                if (obstacleGrid[i][j]) {\n" +
                    "                    ret[i][j] = 0;\n" +
                    "                } else {\n" +
                    "                    ret[i][j] = ret[i -1][j] + ret[i][j - 1];\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return ret[M - 1][N - 1];\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "异常处理\n" +
                    "初始化二维矩阵(全0阵)，尤其注意遇到障碍物时应break跳出当前循环\n" +
                    "递推路径数\n" +
                    "返回`ret[M - 1][N - 1]");
            this.map.put("Sequence", "本节主要总结序列类动态规划题，按照动态规划的四要素，此类题可从以下四个角度分析。\n" +
                    "\n" +
                    "State: f[i] 前i个位置/数字/字母...\n" +
                    "Function: f[i] = f[i-1]... 找递推关系\n" +
                    "Initialization: 根据题意进行必要的初始化\n" +
                    "Answer: f[n-1]");
            this.map.put("Climbing Stairs", "Source\n" +
                    "\n" +
                    "lintcode: (111) Climbing Stairs\n" +
                    "You are climbing a stair case. It takes n steps to reach to the top.\n" +
                    "\n" +
                    "Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?\n" +
                    "\n" +
                    "Example\n" +
                    "Given an example n=3 , 1+1+1=2+1=1+2=3\n" +
                    "\n" +
                    "return 3\n" +
                    "题解\n" +
                    "\n" +
                    "题目问的是到达顶端的方法数，我们采用序列类问题的通用分析方法，可以得到如下四要素：\n" +
                    "\n" +
                    "State: f[i] 爬到第i级的方法数\n" +
                    "Function: f[i]=f[i-1]+f[i-2]\n" +
                    "Initialization: f[0]=1,f[1]=1\n" +
                    "Answer: f[n]\n" +
                    "尤其注意状态转移方程的写法，f[i]只可能由两个中间状态转化而来，一个是f[i-1]，由f[i-1]到f[i]其方法总数并未增加；另一个是f[i-2]，由f [i-2]到f[i]隔了两个台阶，因此有1+1和2两个方法，因此容易写成 f[i]=f[i-1]+f[i-2]+1，但仔细分析后能发现，由f[i-2]到f[ i]的中间状态f[i-1]已经被利用过一次，故f[i]=f[i-1]+f[i-2]\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param n: An integer\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int climbStairs(int n) {\n" +
                    "        if (n < 1) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector ret(n + 1, 1);\n" +
                    "\n" +
                    "        for (int i = 2; i != n + 1; ++i) {\n" +
                    "            ret[i] = ret[i - 1] + ret[i - 2];\n" +
                    "        }\n" +
                    "\n" +
                    "        return ret[n];\n" +
                    "    }\n" +
                    "};\n" +
                    "异常处理\n" +
                    "初始化n+1个元素，初始值均为1。之所以用n+1个元素是下标分析起来更方便\n" +
                    "状态转移方程\n" +
                    "返回ret[n]\n" +
                    "初始化ret[0]也为1，可以认为到第0级也是一种方法。\n" +
                    "\n" +
                    "以上答案的空间复杂度为 O(n)，仔细观察后可以发现在状态转移方程中，我们可以使用三个变量来替代长度为n+1的数组。具体代码可参考 climbing- stairs | 九章算法\n" +
                    "\n" +
                    "C++\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param n: An integer\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int climbStairs(int n) {\n" +
                    "        if (n < 1) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        int ret0 = 1, ret1 = 1, ret2 = 1;\n" +
                    "\n" +
                    "        for (int i = 2; i != n + 1; ++i) {\n" +
                    "            ret0 = ret1 + ret2;\n" +
                    "            ret2 = ret1;\n" +
                    "            ret1 = ret0;\n" +
                    "        }\n" +
                    "\n" +
                    "        return ret0;\n" +
                    "    }\n" +
                    "};");
            this.map.put("Jump Game", "Source\n" +
                    "\n" +
                    "lintcode:\n" +
                    "(116) Jump Game\n" +
                    "\n" +
                    "Given an array of non-negative integers, you are initially positioned at the first index of the array.\n" +
                    "\n" +
                    "Each element in the array represents your maximum jump length at that position.\n" +
                    "\n" +
                    "Determine if you are able to reach the last index.\n" +
                    "\n" +
                    "Example\n" +
                    "A = [2,3,1,1,4], return true.\n" +
                    "\n" +
                    "A = [3,2,1,0,4], return false.\n" +
                    "题解(自顶向下-动态规划)\n" +
                    "\n" +
                    "State: f[i] 从起点出发能否达到i\n" +
                    "Function: f[i] = OR (f[j], j < i ~\\&\\&~ j + A[j] \\geq i), 状态 j 转移到 i, 所有小于i的下标j的元素中是否存在能从j跳转到i得\n" +
                    "Initialization: f[0] = true;\n" +
                    "Answer: 递推到第 N - 1 个元素时，f[N-1]\n" +
                    "这种自顶向下的方法需要使用额外的 O(n) 空间，保存小于N-1时的状态。且时间复杂度在恶劣情况下有可能变为 1\u200B2\u200B\u200B+2\u200B2\u200B\u200B+⋯+n\u200B2\u200B\u200B=O(n\u200B3\u200B\u200B), 出现 TLE 无法AC的情况，不过工作面试能给出这种动规的实现就挺好的了。\n" +
                    "\n" +
                    "C++ from top to bottom\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param A: A list of integers\n" +
                    "     * @return: The boolean answer\n" +
                    "     */\n" +
                    "    bool canJump(vector A) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return true;\n" +
                    "        }\n" +
                    "\n" +
                    "        vector jumpto(A.size(), false);\n" +
                    "        jumpto[0] = true;\n" +
                    "\n" +
                    "        for (int i = 1; i != A.size(); ++i) {\n" +
                    "            for (int j = i - 1; j >= 0; --j) {\n" +
                    "                if (jumpto[j] && (j + A[j] >= i)) {\n" +
                    "                    jumpto[i] = true;\n" +
                    "                    break;\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return jumpto[A.size() - 1];\n" +
                    "    }\n" +
                    "};\n" +
                    "题解(自底向上-贪心法)\n" +
                    "\n" +
                    "题意为问是否能从起始位置到达最终位置，我们首先分析到达最终位置的条件，从坐标i出发所能到达最远的位置为 f[i]=i+A[i]，如果要到达最终位置，即存在某个 i 使得f[i]≥N−1, 而想到达 i, 则又需存在某个 j 使得 f[j]≥i−1. 依此类推直到下标为0.\n" +
                    "\n" +
                    "以下分析形式虽为动态规划，实则贪心法！\n" +
                    "\n" +
                    "State: f[i] 从 i 出发能否到达最终位置\n" +
                    "Function: f[j]=j+A[j]≥i, 状态 j 转移到 i, 置为true\n" +
                    "Initialization: 第一个为true的元素为 A.size() - 1\n" +
                    "Answer: 递推到第 0 个元素时，若其值为true返回true\n" +
                    "C++ greedy, from bottom to top\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param A: A list of integers\n" +
                    "     * @return: The boolean answer\n" +
                    "     */\n" +
                    "    bool canJump(vector A) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return true;\n" +
                    "        }\n" +
                    "\n" +
                    "        int index_true = A.size() - 1;\n" +
                    "        for (int i = A.size() - 1; i >= 0; --i) {\n" +
                    "            if (i + A[i] >= index_true) {\n" +
                    "                index_true = i;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return 0 == index_true ? true : false;\n" +
                    "    }\n" +
                    "};\n" +
                    "题解(自顶向下-贪心法)\n" +
                    "\n" +
                    "针对上述自顶向下可能出现时间复杂度过高的情况，下面使用贪心思想对i进行递推，每次遍历A中的一个元素时更新最远可能到达的元素，最后判断最远可能到达的元素是否大 于 A.size() - 1\n" +
                    "\n" +
                    "C++ greedy, from top to bottom\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param A: A list of integers\n" +
                    "     * @return: The boolean answer\n" +
                    "     */\n" +
                    "    bool canJump(vector A) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return true;\n" +
                    "        }\n" +
                    "\n" +
                    "        int farthest = A[0];\n" +
                    "\n" +
                    "        for (int i = 1; i != A.size(); ++i) {\n" +
                    "            if ((i <= farthest) && (i + A[i] > farthest)) {\n" +
                    "                farthest = i + A[i];\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return farthest >= A.size() - 1;\n" +
                    "    }\n" +
                    "};\n" +
                    "Jump Game II\n" +
                    "\n" +
                    "Source\n" +
                    "\n" +
                    "lintcode: (117) Jump Game II\n" +
                    "Given an array of non-negative integers, you are initially positioned at the first index of the array.\n" +
                    "\n" +
                    "Each element in the array represents your maximum jump length at that position.\n" +
                    "\n" +
                    "Your goal is to reach the last index in the minimum number of jumps.\n" +
                    "\n" +
                    "Example\n" +
                    "Given array A = [2,3,1,1,4]\n" +
                    "\n" +
                    "The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)\n" +
                    "题解(自顶向下-动态规划)\n" +
                    "\n" +
                    "首先来看看使用动态规划的解法，由于复杂度较高在A元素较多时会出现TLE，因为时间复杂度接近O(n\u200B3\u200B\u200B). 工作面试中给出动规的实现就挺好了。\n" +
                    "\n" +
                    "State: f[i] 从起点跳到这个位置最少需要多少步\n" +
                    "Function: f[i] = MIN(f[j]+1, j < i && j + A[j] >= i) 取出所有能从j到i中的最小值\n" +
                    "Initialization: f[0] = 0，即一个元素时不需移位即可到达\n" +
                    "Answer: f[n-1]\n" +
                    "C++ Dynamic Programming\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param A: A list of lists of integers\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int jump(vector A) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int N = A.size() - 1;\n" +
                    "        vector steps(N, INT_MAX);\n" +
                    "        steps[0] = 0;\n" +
                    "\n" +
                    "        for (int i = 1; i != N + 1; ++i) {\n" +
                    "            for (int j = 0; j != i; ++j) {\n" +
                    "                if ((steps[j] != INT_MAX) && (j + A[j] >= i)) {\n" +
                    "                    steps[i] = steps[j] + 1;\n" +
                    "                    break;\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return steps[N];\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "状态转移方程为\n" +
                    "\n" +
                    "if ((steps[j] != INT_MAX) && (j + A[j] >= i)) {\n" +
                    "    steps[i] = steps[j] + 1;\n" +
                    "    break;\n" +
                    "}\n" +
                    "其中break即体现了MIN操作，最开始满足条件的j即为最小步数。\n" +
                    "\n" +
                    "题解(贪心法-自底向上)\n" +
                    "\n" +
                    "使用动态规划解Jump Game的题复杂度均较高，这里可以使用贪心法达到线性级别的复杂度。\n" +
                    "\n" +
                    "贪心法可以使用自底向上或者自顶向下，首先看看我最初使用自底向上做的。对A数组遍历，找到最小的下标min_index，并在下一轮中用此min_index替代上一次的end, 直至min_index为0，返回最小跳数jumps。以下的实现有个 bug，细心的你能发现吗？\n" +
                    "\n" +
                    "C++ greedy from bottom to top, bug version\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param A: A list of lists of integers\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int jump(vector A) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int N = A.size() - 1;\n" +
                    "        int jumps = 0;\n" +
                    "        int last_index = N;\n" +
                    "        int min_index = N;\n" +
                    "\n" +
                    "        for (int i = N - 1; i >= 0; --i) {\n" +
                    "            if (i + A[i] >= last_index) {\n" +
                    "                min_index = i;\n" +
                    "            }\n" +
                    "\n" +
                    "            if (0 == min_index) {\n" +
                    "                return ++jumps;\n" +
                    "            }\n" +
                    "\n" +
                    "            if ((0 == i) && (min_index < last_index)) {\n" +
                    "                ++jumps;\n" +
                    "                last_index = min_index;\n" +
                    "                i = last_index - 1;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return jumps;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "使用jumps记录最小跳数，last_index记录离终点最远的坐标，min_index记录此次遍历过程中找到的最小下标。\n" +
                    "\n" +
                    "以上的bug在于当min_index为1时，i = 0, for循环中仍有--i，因此退出循环，无法进入if (0 == min_index)语句，因此返回的结果会小1个。\n" +
                    "\n" +
                    "C++ greedy, from bottom to top\n" +
                    "\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param A: A list of lists of integers\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int jump(vector A) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int N = A.size() - 1;\n" +
                    "        int jumps = 0, end = N, min_index = N;\n" +
                    "\n" +
                    "        while (end > 0) {\n" +
                    "            for (int i = end - 1; i >= 0; --i) {\n" +
                    "                if (i + A[i] >= end) {\n" +
                    "                    min_index = i;\n" +
                    "                }\n" +
                    "            }\n" +
                    "\n" +
                    "            if (min_index < end) {\n" +
                    "                ++jumps;\n" +
                    "                end = min_index;\n" +
                    "            } else {\n" +
                    "                // cannot jump to the end\n" +
                    "                return -1;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return jumps;\n" +
                    "    }\n" +
                    "};\n" +
                    "源码分析\n" +
                    "\n" +
                    "之前的 bug version 代码实在是太丑陋了，改写了个相对优雅的实现，加入了是否能到达终点的判断。在更新min_index的内循环中也可改为如下效率更高的方式：\n" +
                    "\n" +
                    "            for (int i = 0; i != end; ++i) {\n" +
                    "                if (i + A[i] >= end) {\n" +
                    "                    min_index = i;\n" +
                    "                    break;\n" +
                    "                }\n" +
                    "            }\n" +
                    "题解(贪心法-自顶向下)\n" +
                    "\n" +
                    "看过了自底向上的贪心法，我们再来瞅瞅自顶向下的实现。自顶向下使用farthest记录当前坐标出发能到达的最远坐标，遍历当前start与end之间 的坐标，若i+A[i] > farthest时更新farthest(寻找最小跳数)，当前循环遍历结束时递推end = farthest。`end\n" +
                    "\n" +
                    "= A.size() - 1`时退出循环，返回最小跳数。\n" +
                    "C++\n" +
                    "\n" +
                    "/**\n" +
                    " * http://www.jiuzhang.com/solutions/jump-game-ii/\n" +
                    " */\n" +
                    "class Solution {\n" +
                    "public:\n" +
                    "    /**\n" +
                    "     * @param A: A list of lists of integers\n" +
                    "     * @return: An integer\n" +
                    "     */\n" +
                    "    int jump(vector A) {\n" +
                    "        if (A.empty()) {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        const int N = A.size() - 1;\n" +
                    "        int start = 0, end = 0, jumps = 0;\n" +
                    "\n" +
                    "        while (end < N) {\n" +
                    "            int farthest = end;\n" +
                    "            for (int i = start; i <= end; ++i) {\n" +
                    "                if (i + A[i] >= farthest) {\n" +
                    "                    farthest = i + A[i];\n" +
                    "                }\n" +
                    "            }\n" +
                    "\n" +
                    "            if (end < farthest) {\n" +
                    "                ++jumps;\n" +
                    "                start = end + 1;\n" +
                    "                end = farthest;\n" +
                    "            } else {\n" +
                    "                // cannot jump to the end\n" +
                    "                return -1;\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        return jumps;\n" +
                    "    }\n" +
                    "};");
            this.map.put("", "");
        }

        public HashMap getAir() {
            return this.map;
        }

        public void setAir(HashMap map) {
            this.map = map;
        }
}
