"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function findMaxAverage(nums, k) {
    var ans = 0, window = 0;
    for (var i = 0; i < k; i++) {
        window += nums[i];
    }
    ans = window / k;
    for (var i = k; i < nums.length; i++) {
        window += nums[i] - nums[i - k];
        ans = Math.max(ans, window / k);
    }
    return ans;
}
var nums = [1, 12, -5, -6, 50, 3];
var k = 4;
console.log(findMaxAverage(nums, k));
