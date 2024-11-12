"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function reverseOnlyLetters(s) {
    var i = 0, j = s.length - 1;
    var arr = s.split("");
    while (i < j) {
        while (i < j && !isEnglish(arr[i])) {
            i++;
        }
        while (i < j && !isEnglish(arr[j])) {
            j--;
        }
        if (i < j) { // ensure indices are valid before swapping
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    return arr.join('');
}
function isEnglish(c) {
    return (c.charCodeAt(0) >= 65 && c.charCodeAt(0) <= 90) || (c.charCodeAt(0) >= 97 && c.charCodeAt(0) <= 122);
}
function swap(arr, i, j) {
    var temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
var s = "Test1ng-Leet=code-Q!";
console.log(reverseOnlyLetters(s));
