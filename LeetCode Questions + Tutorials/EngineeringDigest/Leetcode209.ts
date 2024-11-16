function minSubArrayLen(target: number, nums: number[]): number {
    let left = 0, window = 0, ans = nums.length + 1;
    for (let right: number = 0; right < nums.length; right++) {
        window += nums[right];
        while (window >= target) {
            ans = Math.min(ans, right - left + 1);
            window -= nums[left++];
        }
    }
    return ans == nums.length + 1 ? 0 : ans;
}

let nums: number[] = [2, 3, 1, 2, 4, 3];
let target: number = 7;
console.log(minSubArrayLen(target, nums));


export { };