"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function containsNearbyDuplicate(nums, k) {
    var map = new Map();
    for (var index = 0; index < nums.length; index++) {
        var num = nums[index];
        if (map.has(num) && (index - map.get(num)) <= k) {
            return true;
        }
        else {
            map.set(num, index);
        }
    }
    return false;
}
;
var nums = [1, 2, 3, 1, 2, 3];
var k = 2;
console.log(containsNearbyDuplicate(nums, k));
