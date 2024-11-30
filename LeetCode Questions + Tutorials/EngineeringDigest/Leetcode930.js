"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function numSubarraysWithSum(nums, goal) {
    var result = 0, prefixSum = 0;
    var map = new Map();
    map.set(0, 1);
    for (var _i = 0, nums_1 = nums; _i < nums_1.length; _i++) {
        var i = nums_1[_i];
        prefixSum += i;
        result += map.get(prefixSum - goal) || 0;
        map.set(prefixSum, (map.get(prefixSum) || 0) + 1);
    }
    return result;
}
;
var nums = [1, 0, 1, 0, 1];
var goal = 2;
console.log(numSubarraysWithSum(nums, goal));
