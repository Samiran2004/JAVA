"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function intersection(nums) {
    var n = nums.length;
    var map = new Map();
    for (var _i = 0, nums_1 = nums; _i < nums_1.length; _i++) {
        var arr = nums_1[_i];
        for (var _a = 0, arr_1 = arr; _a < arr_1.length; _a++) {
            var i = arr_1[_a];
            map.set(i, (map.get(i) || 0) + 1);
        }
    }
    var result = [];
    for (var _b = 0, _c = map.entries(); _b < _c.length; _b++) {
        var _d = _c[_b], key = _d[0], value = _d[1];
        if (value === n) {
            result.push(key);
        }
    }
    result.sort(function (a, b) { return a + b; });
    return result;
}
var nums = [[3, 1, 2, 4, 5], [1, 2, 3, 4], [3, 4, 5, 6]];
console.log(intersection(nums));
