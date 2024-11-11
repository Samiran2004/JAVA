function findMaxAverage(nums: number[], k: number): number {
    let ans: number = 0, window: number = 0;
    for (let i: number = 0; i < k; i++) {
        window += nums[i];
    }
    ans = window / k;
    for (let i: number = k; i < nums.length; i++) {
        window += nums[i] - nums[i - k];
        ans = Math.max(ans, window / k);
    }
    return ans;
}

let nums: number[] = [1, 12, -5, -6, 50, 3];
let k = 4;
console.log(findMaxAverage(nums, k));

export { };
