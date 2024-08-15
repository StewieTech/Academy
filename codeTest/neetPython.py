

from sys import prefix
from typing import List


numberList = [4,5,6] 
class TwoSumSolution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {} ; 
        for key, val in enumerate(nums):
           diff = target - val ; 
           if diff in seen :
              return [seen[diff], key] ; 
           seen[val] = key ;  


# class Solution:
#     def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
#         seen = {}
#         for key , word in enumerate(strs):
#             () = word ; 
#             seen[n] = key ; 
            
from collections import Counter ; 
import heapq ;

class topKSolution:
    def topKFrequent( nums: List[int], k: int) -> List[int]:
        count = Counter(nums) ; 
        most_frequent = heapq.nlargest(k,count.keys(), key = count.get) ;

        return most_frequent ; 

# class Solution:
#     def threeSum(self, nums: List[int]) -> List[List[int]]:

class ProductExceptSolution:
    def productExcept(self,nums: List[int]) -> List[int]:
        res = [1] * (len(nums))
        prefix = 1 ; 
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i] ; 
        postfix = 1 
        for i in range(len(nums) -1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i] 
        return res
        
class maxAreaSolution:
    def maxArea(self, heights: List[int]) -> int:
        l,r = 0, len(heights) -1 ; 
        res = 0 ; 
        
        while l < r:
            area = (r - l) * (min(heights[l], (heights[r]))) ; 
            res = max(res, area)
            
            if heights[l] < heights[r]:
                l += 1 ; 
            else :
                r -=1 ; 
        return res ; 
                




class Main() :
    numList = [1,2,4,6] ; 
    maxArealist = [1,7,2,5,4,7,3,6] ; 
    # solution = TwoSumSolution()
    # print(solution.twoSum([2, 7, 11, 15], 9))  # Output: [0, 1]

    # solution = topKSolution()
    # print(topKSolution.topKFrequent([1,1,1,2,2,3], 2))  # Output: [1, 2]
    # print(topKSolution.topKFrequent([1,1,1,2,2,2,3,3,3,4,4], 3))  # Output: [1, 2, 3]
    print(ProductExceptSolution().productExcept(numList))
    print(maxAreaSolution().maxArea(maxArealist)) ; 



def merge_two_lists(l1, l2):
     if not l1 or (l2 and l1.value > l2.value): l1, l2 = l2, l1
     if l1: l1.next = merge_two_lists(l1.next, l2)
     return l1