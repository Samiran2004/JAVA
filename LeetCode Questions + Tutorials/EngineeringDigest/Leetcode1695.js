"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function maximumUniqueSubarray(nums) {
    var res = 0, left = 0, sum = 0;
    var set = new Set();
    for (var right = 0; right < nums.length; right++) {
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
}
;
var nums = [4, 2, 4, 5, 6];
console.log(maximumUniqueSubarray(nums));
