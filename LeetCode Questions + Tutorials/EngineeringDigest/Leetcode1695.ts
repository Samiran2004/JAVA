function maximumUniqueSubarray(nums: number[]): number {
    let res: number = 0, left: number = 0, sum: number = 0;
    let set = new Set<number>();
    for (let right: number = 0; right < nums.length; right++) {
        while (set.has(nums[right])) {
            set.delete(nums[left]);
            sum -= nums[left];
            left++;
        }
        sum += nums[right];
        set.add(nums[right]);
        res = Math.max(res, sum);
    }
    return res;
};

let nums: number[] = [4, 2, 4, 5, 6];
console.log(maximumUniqueSubarray(nums));

export { };