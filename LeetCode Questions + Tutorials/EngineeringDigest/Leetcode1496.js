"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function isPathCrossing(path) {
    var set = new Set();
    var x = 0, y = 0;
    var coordinate = "".concat(x, ",").concat(y);
    set.add(coordinate);
    for (var _i = 0, path_1 = path; _i < path_1.length; _i++) {
        var c = path_1[_i];
        if (c == 'N') {
            y++;
        }
        else if (c == 'W') {
            x--;
        }
        else if (c == 'S') {
            y--;
        }
        else if (c == 'E') {
            x++;
        }
        coordinate = "".concat(x, ",").concat(y);
        if (set.has(coordinate)) {
            return true;
        }
        set.add(coordinate);
    }
    return false;
}
;
var path = "NEW";
console.log(isPathCrossing(path));
