## Algorithms

|  #  |      Title     |   Solutions   | Resource  |  Complexity  | Point to Remember                   
|-----|----------------|---------------|--------|-------------|-----------------
|953|[Verifying an Alien Dictionary](https://leetcode.com/problems/verifying-an-alien-dictionary/)|[Solution](../master/src/main/java/_953.java)| | O(M) |
|937|[Reorder Data in Log Files](https://leetcode.com/problems/reorder-data-in-log-files/)|[Solution](../master/src/main/java/_937.java)| | O(M * NlogN )| Comparator for String[]
|17|[Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)|[Solution](../master/src/main/java/_17.java)| |O(M^N*N)| Generate permutations - use backtracking
|763|[Partition Labels](https://leetcode.com/problems/partition-labels/)|[Solution](../master/src/main/java/_763.java)| |O(N)| Greedy
|1041|[Robot Bounded In Circle](https://leetcode.com/problems/robot-bounded-in-circle/)|[Solution](../master/src/main/java/_1041.java)| |O(N)| Drifting away if not facing north after 1 pass 
|1333|[Filter Restaurants by Vegan-Friendly, Price and Distance](https://leetcode.com/problems/filter-restaurants-by-vegan-friendly-price-and-distance/)|[Solution](../master/src/main/java/_1333.java)| |O(N)| Streams & Comparator
|49|[Group Anagrams](https://leetcode.com/problems/group-anagrams/)|[Solution](../master/src/main/java/_49.java)| |O(NK)| Key from Count Array
|208|[Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/)|[Solution](../master/src/main/java/_208.java)| |O(M)| Trie
|211|[Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/)|[Solution](../master/src/main/java/_211.java)| |O(M)| Trie
|380|[Insert Delete GetRandom O(1)](https://leetcode.com/problems/insert-delete-getrandom-o1/)|[Solution](../master/src/main/java/_380.java)| || 
|381|[Insert Delete GetRandom O(1)- Duplicates Allowed](https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/)|[Solution](../master/src/main/java/_381.java)| || 


## Arrays

|  #  |      Title     |   Solutions   | Resource  | Complexity | Point to Remember                   
|-----|----------------|---------------|-----------|-------------|----------------
|189|[Rotate Array](https://leetcode.com/problems/rotate-array/)|[Solution](../master/src/main/java/_189.java)|[URL](https://betterprogramming.pub/3-ways-to-rotate-an-array-2a45b39f7bec)| |  Reverse All & then Reverse first K & last (n-K) AND Handle for cases where k > nums.length
|136|[Single Number](https://leetcode.com/problems/single-number/)|[Solution](../master/src/main/java/_136.java)| | | a⊕b⊕a=(a⊕a)⊕b=0⊕b=b and 2∗(a+b+c)−(a+a+b+b+c)=c
|88|[Merge Sorted Arrays](https://leetcode.com/problems/merge-sorted-array/)|[Solution](../master/src/main/java/_88.java)| | | Two pointers
|27|[Remove Element](https://leetcode.com/problems/remove-element/)|[Solution](../master/src/main/java/_27.java)| | | Two pointers
|26|[Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)|[Solution](../master/src/main/java/_26.java)| | | Two pointers
|1346|[Check If N and Its Double Exist](https://leetcode.com/problems/check-if-n-and-its-double-exist/)|[Solution](../master/src/main/java/_1346.java)| | | Set
|941|[Valid Mountain Array](https://leetcode.com/problems/valid-mountain-array/)|[Solution](../master/src/main/java/_941.java)| | | Strictly Increasing then Strictly Decreasing
|283|[Move Zeros](https://leetcode.com/problems/move-zeroes/)|[Solution](../master/src/main/java/_283.java)| | | Two pointers
|905|[Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/)|[Solution](../master/src/main/java/_905.java)| | | Two pointers
|1299|[Replace Elements with Greatest Element on Right Side](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/)|[Solution](../master/src/main/java/_1299.java)| | | Greatest on Right- Traverse from last ?
|487|[Max Consecutive Ones II](https://leetcode.com/problems/max-consecutive-ones-ii/)|[Solution](../master/src/main/java/_487.java)| | | Sliding Window
|977|[Squares of a sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)|[Solution](../master/src/main/java/_977.java)| | | Two pointers
|448|[Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)|[Solution](../master/src/main/java/_448.java)| | | Consider values as indices
|48|[Rotate Image](https://leetcode.com/problems/rotate-image/)|[Solution](../master/src/main/java/_48.java)| CTCI| | 
|73|[Set Matrix Zeros](https://leetcode.com/problems/set-matrix-zeroes/)|[Solution](../master/src/main/java/_73.java)| | |
|11|[Container with most water](https://leetcode.com/problems/container-with-most-water/)|[Solution](../master/src/main/java/_11.java)| | | Two pointer
|42|[Trapping water](https://leetcode.com/problems/trapping-rain-water/)|[Solution](../master/src/main/java/_42.java)| [Two Pointer-First comment](https://leetcode.com/problems/trapping-rain-water/discuss/17391/Share-my-short-solution)| | Stack/Two pointer
|238|[Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)|[Solution](../master/src/main/java/_238.java)| | | Left Product and Right Product
|34|[Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)|[Solution](../master/src/main/java/_34.java)| | | Binary Search
|169|[Majority Elements](https://leetcode.com/problems/majority-element/)|[Solution](../master/src/main/java/_169.java)|[URL](https://gregable.com/2013/10/majority-vote-algorithm-find-majority.html) | O(n) | Boyers and Moore Voting
|229|[Majority Elements II](https://leetcode.com/problems/majority-element-ii/)|[Solution](../master/src/main/java/_229.java)|[URL](https://leetcode.com/problems/majority-element-ii/discuss/63520/Boyer-Moore-Majority-Vote-algorithm-and-my-elaboration) | O(n) | Boyers and Moore Voting
|849|[Maximize Distance to Closest Person](https://leetcode.com/problems/maximize-distance-to-closest-person/)|[Solution](../master/src/main/java/_849.java)|[URL](https://www.youtube.com/watch?v=Zoi9JyGpCX8) | O(n) | Two pointer
|1423|[Maximum Points You Can Obtain from Cards](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/)|[Solution](../master/src/main/java/_1423.java)| | O(n) | Sliding Window
|605|[Can Place FLowers](https://leetcode.com/problems/can-place-flowers/)|[Solution](../master/src/main/java/_605.java)| | O(n) | 
|852|[Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/)|[Solution](../master/src/main/java/_852.java)| | O(logn) | 
|33|[Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)|[Solution](../master/src/main/java/_33.java)| | O(logn) | LC premium description. Also ALWAYS mid=start+(end-start)/2 otherwise overflow
|81|[Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)|[Solution](../master/src/main/java/_81.java)|[Video](https://www.youtube.com/watch?v=WkihvY2rJjc&ab_channel=KnowledgeCenter)| Avg-O(logn) Worst Case - O(n)|
|349|[Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)|[Solution](../master/src/main/java/_349.java)| | O(n+m)|Set.retainAll() for intersection , Two Pointer for O(n) - Only if given arrays are sorted
|350|[Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)|[Solution](../master/src/main/java/_350.java)|[External Sort](https://www.youtube.com/watch?v=Bp7fGofslng&ab_channel=GATEAppliedCourse) [Large Data Solution](https://leetcode.com/problems/intersection-of-two-arrays-ii/discuss/82243/Solution-to-3rd-follow-up-question) | O(n+m)|HashMap to store keys & count of smaller array , Two Pointer for O(n) - Only if given arrays are sorted, If data is more and cannot be loaded in memory at once -External sort
|NonLC3|[Find numbers present in at least two of the three arrays](https://www.careercup.com/question?id=5106869203369984)|[Solution](https://www.careercup.com/question?id=5106869203369984)| | 
|56|[Merge Intervals](https://leetcode.com/problems/merge-intervals/)|[Solution](../master/src/main/java/_56.java)| | | Sort
|253|[Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/)|[Solution](../master/src/main/java/_253.java)| | | Sort & Heap
|1094|[Car Pooling](https://leetcode.com/problems/car-pooling/)|[Solution](../master/src/main/java/_1094.java)| | | Sort & Heap Or Bucket Sort
|347|[Top k frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)|[Solution](../master/src/main/java/_347.java)| HashMap - O(nLogn) | Sort haspMap by Value - comparingByValue OR Heap
|215|[Kth element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)|[Solution](../master/src/main/java/_215.java)| | | 
|703|[Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/)|[Solution](../master/src/main/java/_703.java)| | | 
|451|[Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/)|[Solution](../master/src/main/java/_451.java)| | | HashMap and Sort O(nLog(n)) OR Bucket Sort - O(n)
|1636|[Sort Array By Increasing Frequency](https://leetcode.com/problems/sort-array-by-increasing-frequency/)|[Solution](../master/src/main/java/_1636.java)| | | HashMap and Sort O(nLog(n)) OR Bucket Sort - O(n)

## Arrays - Prefix Sum

|  #  |      Title     |   Solutions   | Resource  | Complexity | Point to Remember                   
|-----|----------------|---------------|-----------|-------------|----------------
|303|[Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/)|[Solution](../master/src/main/java/_303.java)| | O(n) | 
|304|[Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/)|[Solution](../master/src/main/java/_304.java)| | O(n) | 
|523|[Continuous Subarray Sum](https://leetcode.com/problems/continuous-subarray-sum/)|[Solution](../master/src/main/java/_523.java)| [Check Comments](https://leetcode.com/problems/continuous-subarray-sum/discuss/99499/Java-O(n)-time-O(k)-space)| | PrefixSum O(n)
|974|[Subarray Sum Divisible by K](https://leetcode.com/problems/subarray-sums-divisible-by-k/)|[Solution](../master/src/main/java/_974.java)| [Modulus for negative](https://www.youtube.com/watch?v=2rbeCUMBYgk&ab_channel=LearnMathTutorials) [Videos](https://www.youtube.com/watch?v=u9m-hnlcydk&ab_channel=KnowledgeCenter) [Ref](https://www.geeksforgeeks.org/count-sub-arrays-sum-divisible-k/)| | PrefixSum O(n)
|560|[Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)|[Solution](../master/src/main/java/_560.java)| [Ref](https://leetcode.com/problems/subarray-sum-equals-k/discuss/102106/Java-Solution-PreSum-%2B-HashMap) | | PrefixSum O(n) + HashMap
|930|[Binary Subarrays with Sum](https://leetcode.com/problems/binary-subarrays-with-sum/)|[Solution](../master/src/main/java/_930.java)| [Good Ref](https://leetcode.com/problems/binary-subarrays-with-sum/discuss/186647/Java-Clean-Solution-2-Sum-%2B-Prefix-Sum-Caching) | | PrefixSum O(n) + HashMap

## Strings

|  #  |      Title     |   Solutions   | Resource  | Complexity | Point to Remember                   
|-----|----------------|---------------|-----------|-------------|----------------
|387|[First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)|[Solution](../master/src/main/java/_387.java)|| O(n) | 
|443|[String Compression](https://leetcode.com/problems/string-compression/)|[Solution](../master/src/main/java/_443.java)|| O(n) | 
|38|[Count and Say](https://leetcode.com/problems/count-and-say/)|[Solution](../master/src/main/java/_38.java)|| O(n) | 
|1313|[Decompress Run-Length Encoded List](https://leetcode.com/problems/decompress-run-length-encoded-list/)|[Solution](../master/src/main/java/_1313.java)|| O(n) | 
|844|[Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/)|[Solution](../master/src/main/java/_844.java)|| O(n) | Stack & Two ptr
|925|[Long Pressed Name](https://leetcode.com/problems/long-pressed-name/)|[Solution](../master/src/main/java/_925.java)|[URL](https://leetcode.com/problems/long-pressed-name/discuss/183965/Short-Java-Solution)| O(n) | 
|3|[Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)|[Solution](../master/src/main/java/_3.java)|| O(n) | 
|125|[Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)|[Solution](../master/src/main/java/_125.java)|| O(n) | 
|680|[Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/)|[Solution](../master/src/main/java/_680.java)|| O(n) | 
|205|[Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/)|[Solution](../master/src/main/java/_205.java)|[HasMap](https://www.educative.io/edpresso/how-to-check-if-two-strings-are-isomorphic) [Count Array](https://leetcode.com/problems/isomorphic-strings/discuss/57796/My-6-lines-solution)| O(n) | 
|NA-NonLC|[Removing string that is an anagram of an earlier string](https://www.geeksforgeeks.org/removing-string-that-is-an-anagram-of-an-earlier-string/)|[Solution](../master/src/main/java/_NonLC2.java)||| 
|NA-NonLC|[Number of Substrings with the count of each Character as K](https://www.thecodingshala.com/2020/12/find-number-of-substrings-with-count-of-each-character-as-k.html)|[Solution](../master/src/main/java/_NonLC1.java)||| 
|816|[Ambiguous Coordinates](https://leetcode.com/problems/ambiguous-coordinates/)|[Solution](../master/src/main/java/_816.java)|[Video](https://www.youtube.com/watch?v=rt-lJS5nlOQ)| O(n^3) | 
|1160|[Find Words That Can Be Formed by Characters](https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/)|[Solution](../master/src/main/java/_1160.java)|| | 
|583|[Delete Operation for Two Strings](https://leetcode.com/problems/delete-operation-for-two-strings/)|[Solution](../master/src/main/java/_583.java)|| | 

## Linked List

|  #  |      Title     |   Solutions   | Resource  | Complexity | Point to Remember                   
|-----|----------------|---------------|-----------|-------------|----------------
|206|[Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)|[Solution](../master/src/main/java/_206.java)|| O(n) | 
|96|[Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/)|[Solution](../master/src/main/java/_96.java)|| O(n) | 
|430|[Flatten a Multilevel Doubly Linked List](https://leetcode.com/problems/reverse-linked-list-ii/)|[Solution](../master/src/main/java/_430.java)|||BFS/DFS 
|141|[Linked List Cycle](https://leetcode.com/problems/reverse-linked-list-ii/)|[Solution](../master/src/main/java/_141.java)|| worst case time complexity is O(N+K)|Tortoise and Hare
|21|[Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)|[Solution](../master/src/main/java/_21.java)|| O(N+M)|

## Stack

|  #  |      Title     |   Solutions   | Resource  | Complexity | Point to Remember                   
|-----|----------------|---------------|-----------|-------------|----------------
|20|[Valid Paranthesis](https://leetcode.com/problems/valid-parentheses/)|[Solution](../master/src/main/java/_20.java)|| O(n) | 
|1249|[Minimum Remove to Make Valid Parentheses](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/)|[Solution](../master/src/main/java/_1249.java)|| O(n) | 
|232|[Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)|[Solution](../master/src/main/java/_232.java)|| O(n) | 
|225|[Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/)|[Solution](../master/src/main/java/_225.java)|| O(n) | 
|155|[Min Stack](https://leetcode.com/problems/min-stack/)|[Solution](../master/src/main/java/_155.java)|| Space O(n) | 2 -Stack with Pair

## Graphs & 2D Grid

|  #  |      Title     |   Solutions   | Resource  | Complexity | Point to Remember                   
|-----|----------------|---------------|-----------|-------------|----------------
|207|[Course Schedule](https://leetcode.com/problems/course-schedule/)|[Solution](../master/src/main/java/_207.java)|[Kahns BFS + Queue](https://github.com/williamfiset/Algorithms/blob/master/src/main/java/com/williamfiset/algorithms/graphtheory/Kahns.java)| O(V+E) | 
|210|[Course Schedule II](https://leetcode.com/problems/course-schedule-ii)|[Solution](../master/src/main/java/_210.java)|[DFS + Stack](https://leetcode.com/problems/course-schedule-ii/discuss/59317/Two-AC-solution-in-Java-using-BFS-and-DFS-with-explanation)| O(V+E) | 
|463|[Island Perimeter](https://leetcode.com/problems/island-perimeter/)|[Solution](../master/src/main/java/_463.java)|[DFS](https://leetcode.com/problems/island-perimeter/discuss/95004/Java-solution-with-DFS) | O(N) | Counting - LC premium
|733|[Flood Fill](https://leetcode.com/problems/flood-fill/)|[Solution](../master/src/main/java/_733.java)|  | O(N) | Call dfs only if newColour and sourceColur are different otherwise stackoverflow
|1034|[Coloring A Border](https://leetcode.com/problems/coloring-a-border/)|[Solution](../master/src/main/java/_1034.java)| [Reference](https://leetcode.com/problems/coloring-a-border/discuss/284935/Java-DFS-Easy-to-understand!) | O(N) | DFS
|200|[Number of Islands](https://leetcode.com/problems/number-of-islands/)|[Solution](../master/src/main/java/_200.java)| [Reference](https://leetcode.com/problems/coloring-a-border/discuss/284935/Java-DFS-Easy-to-understand!) | O(N) | DFS
|1091|[Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/)|[Solution](../master/src/main/java/_1091.java)|Shortest Path -BFS| | 
|542|[01 Matrix](https://leetcode.com/problems/01-matrix/)|[Solution](../master/src/main/java/_542.java)| [BFS](https://leetcode.com/problems/01-matrix/discuss/248525/Java-BFS-solution-with-comments)| | 
|994|[Rotting Oranges](https://leetcode.com/problems/rotting-oranges/)|[Solution](../master/src/main/java/_994.java)|  | | 

## Dynamic Programming

|  #  |      Title     |   Solutions   | Resource  | Complexity | Point to Remember                   
|-----|----------------|---------------|-----------|-------------|----------------
|121|[Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)|[Solution](../master/src/main/java/_121.java)|| O(n) | 
|53|[Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)|[Solution](../master/src/main/java/_53.java)|| O(n) | 
|45|[Jump Game II](https://leetcode.com/problems/jump-game-ii/)|[Solution](../master/src/main/java/_45.java)|[URL](https://www.youtube.com/watch?v=cfdwhSmLt3w&ab_channel=CodeforCause)| O(n) | Greedy-DP
|1143|[Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)|[Solution](../master/src/main/java/_1143.java)|[Tushar](https://www.youtube.com/watch?v=NnD96abizww) [Abdul](https://www.youtube.com/watch?v=sSno9rV8Rhg)| Time - O(n*m)  Space - O(min(m,n))| DP
|5|[Longest Palindrome Substring](https://leetcode.com/problems/longest-palindromic-substring/solution/)|[Solution](../master/src/main/java/_5.java)|[ExpandFromCentre](https://www.youtube.com/watch?v=DK5OKKbF6GI) [DP](https://www.youtube.com/watch?v=UflHuQj6MVA) [DP Code](https://www.geeksforgeeks.org/longest-palindrome-substring-set-1/)|| Expand From Centre, DP, Manacher's - REMAINING 
|198|[House Robber](https://leetcode.com/problems/house-robber/)|[Solution](../master/src/main/java/_198.java)|[Kevin](https://www.youtube.com/watch?v=xlvhyfcoQa4&ab_channel=KevinNaughtonJr.)||DP 


## Mathematical

|  #  |      Title     |   Solutions   | Resource  | Complexity | Point to Remember                   
|-----|----------------|---------------|-----------|-------------|----------------
|231|[Power of Two](https://leetcode.com/problems/power-of-two/)|[Solution](../master/src/main/java/_231.java)|| O(1) | n& n-1==0
|326|[Power of Three](https://leetcode.com/problems/power-of-three)|[Solution](../master/src/main/java/_326.java)|| O(logn) | 
|172|[Factorial Trailing Zeroes](https://leetcode.com/problems/factorial-trailing-zeroes/)|[Solution](../master/src/main/java/_231.java)|| O(1) | Number of 5's infactprial n
|13|[Roman to Integer](https://leetcode.com/problems/roman-to-integer/)|[Solution](../master/src/main/java/_13.java)|| O(n) | 
|906|[Super Palindromes](https://leetcode.com/problems/super-palindromes/)|[Solution](../master/src/main/java/_906.java)|| O(n) | 
|204|[Prime Numbers](https://leetcode.com/problems/count-primes/)|[Solution](../master/src/main/java/_204.java)|[URL](https://leetcode.com/problems/count-primes/discuss/57588/My-simple-Java-solution)| Time- O(log(log(n)) Space - O(n) | Sieve of Eratosthenes
