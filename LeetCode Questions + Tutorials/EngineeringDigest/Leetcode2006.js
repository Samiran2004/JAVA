"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function countKDifference(nums, k) {
    var result = 0;
    var map = new Map();
    for (var i = 0; i < nums.length; i++) {
        result += map.get(nums[i] - k) || 0;
        result += map.get(nums[i] + k) || 0;
        map.set(nums[i], (map.get(nums[i]) || 0) + 1);
    }
    return result;
}
;
var nums = [1, 2, 2, 1];
var k = 1;
console.log(countKDifference(nums, k));
