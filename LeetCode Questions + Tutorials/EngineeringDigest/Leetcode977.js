"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function sortedSquares(nums) {
    var newArr = [];
    var start = 0, end = nums.length - 1;
    for (var i = nums.length - 1; i >= 0; i--) {
        if (Math.abs(nums[start]) > Math.abs(nums[end])) {
            newArr[i] = nums[start] * nums[start];
            start++;
        }
        else {
            newArr[i] = nums[end] * nums[end];
            end--;
        }
    }
    return newArr;
}
var nums = [-4, -2, 0, 3, 10];
console.log(sortedSquares(nums));
