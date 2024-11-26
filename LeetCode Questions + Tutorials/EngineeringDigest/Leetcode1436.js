"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function destCity(paths) {
    var set = new Set();
    for (var _i = 0, paths_1 = paths; _i < paths_1.length; _i++) {
        var path = paths_1[_i];
        set.add(path[0]);
    }
    for (var _a = 0, paths_2 = paths; _a < paths_2.length; _a++) {
        var path = paths_2[_a];
        if (!set.has(path[1])) {
            return path[1];
        }
    }
    return null;
}
;
var paths = [
    ["London", "New York"],
    ["New York", "Lima"],
    ["Lima", "Sao Paulo"]
];
console.log(destCity(paths));
