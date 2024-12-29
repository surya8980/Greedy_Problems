# [Activity Selection](https://github.com/surya8980/Greedy_Problems/blob/main/ActivitySelection/Solution.java)
# Problem Statement:
 Given N activities with their start and finish day given in array start[ ] and end[ ]. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a given day.
 
 Note : Duration of the activity includes both starting and ending day.

 # Examples:

**Input:** start[] = [2, 1], end[] = [2, 2]

**Output:** 1

**Explanation:** A person can perform only one of the given activities.

**Input:** start[] = [1, 3, 2, 5], end[] = [2, 4, 3, 6]

**Output:** 3

**Explanation:** A person can perform activities 1, 2 and 4.

**Input:** start[] = [1, 3, 0, 5, 8, 5], end[] = [2, 4, 6, 7, 9, 9]

**Output:** 4

**Explanation:** A person can perform activities 0, 1, 3, and 4.
# Constraints:
- 1 ≤ start.size() = end.size() ≤ 2*10^5
- 1 ≤ start[i] ≤ end[i] ≤ 10^9
