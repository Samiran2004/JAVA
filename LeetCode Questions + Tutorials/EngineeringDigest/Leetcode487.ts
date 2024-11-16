function findMaxConsecutiveOnes(nums: number[]): number {
    let left: number = 0, sum: number = 0, ans: number = 0;
    for (let right: number = 0; right < nums.length; right++) {
        sum += nums[right];
        while (!(sum == right - left + 1 || sum == right - left)) {
            sum -= nums[left];
            left++;
        }
        ans = Math.max(ans, right - left + 1);
    }
    return ans;
}

let arr: number[] = [1, 1, 0, 1, 0, 1];
console.log(findMaxConsecutiveOnes(arr));

export { };