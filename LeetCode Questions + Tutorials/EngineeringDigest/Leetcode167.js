"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function twoSum(numbers, target) {
    var start = 0;
    var end = numbers.length - 1;
    var res = [];
    while (start <= end) {
        if (numbers[start] + numbers[end] == target) {
            res.push(start + 1);
            res.push(end + 1);
            return res;
        }
        else if (numbers[start] + numbers[end] > target) {
            end--;
        }
        else {
            start++;
        }
    }
    return res;
}
var arr = [2, 7, 11, 15];
var target = 9;
console.log(twoSum(arr, target));
