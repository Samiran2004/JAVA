"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function areOccurrencesEqual(s) {
    var countMap = new Map();
    var count = -1;
    for (var _i = 0, s_1 = s; _i < s_1.length; _i++) {
        var c = s_1[_i];
        countMap.set(c, (countMap.get(c) || 0) + 1);
    }
    for (var _a = 0, _b = countMap.values(); _a < _b.length; _a++) {
        var value = _b[_a];
        if (count == -1) {
            count = value;
        }
        else if (count != value) {
            return false;
        }
    }
    return true;
}
var str = "abcasbc";
console.log(areOccurrencesEqual(str));
