class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProf = 0
        curLow = prices[0]
        for i in range(1,len(prices)):
            if prices[i] - curLow > maxProf:
                maxProf = prices[i] - curLow
            elif prices[i] < curLow:
                curLow = prices[i]
        return maxProf