function longestOnes(nums: number[], flips: number): number {
    let left: number = 0, ans: number = 0, count: number = 0;
    for (let right: number = 0; right < nums.length; right++) {
        if (nums[right] == 0) {
            count++;
        }
        while (count > flips) {
            if (nums[left] == 0) {
                count--;
            }
            left++;
        }
        ans = Math.max(ans, right - left + 1);
    }
    return ans;
}

let arr: number[] = [0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1];
let flips: number = 3;
console.log(longestOnes(arr, flips));

export { };