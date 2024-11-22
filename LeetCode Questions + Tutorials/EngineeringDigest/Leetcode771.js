"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function numJewelsInStones(jewels, stones) {
    var count = 0;
    var set = new Set();
    for (var i = 0; i < jewels.length; i++) {
        set.add(jewels.charAt(i));
    }
    for (var i = 0; i < stones.length; i++) {
        if (set.has(stones.charAt(i))) {
            count++;
        }
    }
    return count;
}
var jewels = 'aA';
var stones = 'aAAbbbb';
console.log(numJewelsInStones(jewels, stones));
