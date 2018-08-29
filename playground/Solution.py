def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
    for i in range(len(nums)):
        while 0 <= nums[i] < len(nums) and nums[nums[i]-1] != nums[i]:
            nums[i], nums[nums[i]-1] = nums[nums[i]-1], nums[i]
    # print("nums: ", nums)
    for i in range(len(nums)):
        if nums[i] != i+1:
            return i+1
    return len(nums)+1

nums = [3, 4, -1, 1]
ret = firstMissingPositive(nums)
print("ret: ", ret)