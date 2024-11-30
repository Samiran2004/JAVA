"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function wordPattern(pattern, s) {
    var map = new Map();
    var reverseMap = new Map();
    var sArr = s.split(" ");
    if (sArr.length != pattern.length) {
        return false;
    }
    for (var i = 0; i < pattern.length; i++) {
        var currChar = pattern.charAt(i);
        var currWord = sArr[i];
        if (map.has(currChar) && map.get(currChar) !== currWord) {
            return false;
        }
        if (reverseMap.has(currWord) && reverseMap.get(currWord) !== currChar) {
            return false;
        }
        map.set(currChar, currWord);
        reverseMap.set(currWord, currChar);
    }
    return true;
}
;
var pattern = "abba";
var s = "dog cat cat dog";
console.log(wordPattern(pattern, s));
