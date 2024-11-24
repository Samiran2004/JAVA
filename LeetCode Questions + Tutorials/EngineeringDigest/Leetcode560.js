"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function subarraySum(nums, k) {
    var map = new Map();
    var result = 0, curr = 0;
    map.set(0, 1);
    for (var _i = 0, nums_1 = nums; _i < nums_1.length; _i++) {
        var i = nums_1[_i];
        curr += i;
        result += map.get(curr - k) || 0;
        map.set(curr, (map.get(curr) || 0) + 1);
    }
    return result;
}
var nums = [1, 2, 3];
var k = 3;
console.log(subarraySum(nums, k));
