# [Minimum Cost to Move Chips](https://github.com/surya8980/Greedy_Problems/tree/main/MinimumCostToMoveChips)
# Problem Statement:
We have n chips, where the position of the ith chip is position[i].

We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

- position[i] + 2 or position[i] - 2 with cost = 0.
- position[i] + 1 or position[i] - 1 with cost = 1.

Return the minimum cost needed to move all the chips to the same position.

 # Examples:

**Example 1:**

![image](https://github.com/user-attachments/assets/3f943e95-77ee-4885-a9b8-d419be787233)


**Input:** position = [1,2,3]

**Output:** 1

**Explanation:** First step: Move the chip at position 3 to position 1 with cost = 0.  
Second step: Move the chip at position 2 to position 1 with cost = 1.  
Total cost is 1.

**Example 2:**

![image](https://github.com/user-attachments/assets/f4150e21-7ed0-4b0b-826a-6b513fdcf871)

**Input:** position = [2,2,2,3,3]

**Output:** 2

**Explanation:** We can move the two chips at position  3 to position 2. Each move has cost = 1. The total cost = 2.

**Example 3:**

**Input:** position = [1,1000000000]

**Output:** 1 

# Constraints:

- 1 <= position.length <= 100
- 1 <= position[i] <= 10^9
