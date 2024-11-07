"use strict";
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
Object.defineProperty(exports, "__esModule", { value: true });
function findMaxConsecutiveOnes(nums) {
    var count = 0, maxCount = 0;
    for (var i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            maxCount = Math.max(count, maxCount);
            count = 0;
        }
        else {
            count++;
        }
    }
    return Math.max(count, maxCount);
}
var arr = [1, 1, 0, 1, 1, 1];
console.log(findMaxConsecutiveOnes(arr));
