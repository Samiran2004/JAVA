"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function numberOfSubarrays(nums, k) {
    var result = 0, curr = 0;
    var map = new Map();
    map.set(0, 1);
    for (var _i = 0, nums_1 = nums; _i < nums_1.length; _i++) {
        var i = nums_1[_i];
        curr += i % 2;
        result += map.get(curr - k) || 0;
        map.set(curr, (map.get(curr) || 0) + 1);
    }
    return result;
}
;
var nums = [2, 2, 2, 1, 2, 2, 1, 2, 2, 2];
var k = 2;
console.log(numberOfSubarrays(nums, k));
