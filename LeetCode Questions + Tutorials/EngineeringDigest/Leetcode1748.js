"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function sumOfUnique(nums) {
    var map = new Map();
    var sum = 0;
    for (var _i = 0, nums_1 = nums; _i < nums_1.length; _i++) {
        var num = nums_1[_i];
        map.set(num, (map.get(num) || 0) + 1);
    }
    for (var _a = 0, _b = map.entries(); _a < _b.length; _a++) {
        var _c = _b[_a], key = _c[0], value = _c[1];
        if (value === 1) {
            sum += key;
        }
    }
    return sum;
}
var nums = [1, 2, 3, 2];
console.log(sumOfUnique(nums));
