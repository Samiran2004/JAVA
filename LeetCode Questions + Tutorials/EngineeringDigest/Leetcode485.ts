// function findMaxConsecutiveOnes(nums: number[]): number {
//     let left: number = 0, sum: number = 0, ans: number = -1;
//     for (let right: number = 0; right < nums.length; right++) {
//         sum += nums[right];
//         while (right - left + 1 != sum) {
//             sum -= nums[left];
//             left++;
//         }
//         ans = Math.max(ans, sum);
//     }
//     return ans;
// }

function findMaxConsecutiveOnes(nums: number[]): number {
    let count: number = 0, maxCount: number = 0;
    for (let i: number = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            maxCount = Math.max(count, maxCount);
            count = 0;
        } else {
            count++;
        }
    }
    return Math.max(count, maxCount);
}

let arr: number[] = [1, 1, 0, 1, 1, 1];
console.log(findMaxConsecutiveOnes(arr));


export { };