"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function repeatedCharacter(s) {
    var set = new Set();
    for (var i = 0; i < s.length; i++) {
        if (set.has(s.charAt(i))) {
            return s.charAt(i);
        }
        else {
            set.add(s.charAt(i));
        }
    }
    return s.charAt(0);
}
var str = "abccbaacz";
console.log(repeatedCharacter(str));
