"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function maxVowels(s, k) {
    var left = 0, right = 0, res = 0, window = 0;
    for (; right < k; right++) {
        if (isVowel(s.charAt(right))) {
            window += 1;
        }
    }
    res = window;
    while (right < s.length) {
        if (isVowel(s.charAt(left))) {
            window -= 1;
        }
        if (isVowel(s.charAt(right))) {
            window += 1;
        }
        res = Math.max(res, window);
        left++;
        right++;
    }
    return res;
}
function isVowel(c) {
    return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u');
}
var str = "leetcode";
var k = 3;
console.log(maxVowels(str, k));
