"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function findLucky(arr) {
    var map = new Map();
    var result = -1;
    for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
        var i = arr_1[_i];
        map.set(i, (map.get(i) || 0) + 1);
    }
    for (var _a = 0, _b = map.entries(); _a < _b.length; _a++) {
        var _c = _b[_a], key = _c[0], value = _c[1];
        if (key === value) {
            result = Math.max(result, key);
        }
    }
    return result;
}
;
var arr = [1, 2, 2, 3, 3, 3];
console.log(findLucky(arr));
