"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function maxNumberOfBalloons(text) {
    var map = new Map();
    for (var _i = 0, text_1 = text; _i < text_1.length; _i++) {
        var c = text_1[_i];
        if (c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {
            map.set(c, (map.get(c) || 0) + 1);
        }
    }
    var fCat = Math.min(map.get('b') || 0, Math.min(map.get('a') || 0, map.get('n') || 0));
    var sCat = Math.min(map.get('l') || 0, map.get('o') || 0);
    return Math.min(sCat / 2, fCat);
}
;
var text = "loonbalxballpoon";
console.log(maxNumberOfBalloons(text));
