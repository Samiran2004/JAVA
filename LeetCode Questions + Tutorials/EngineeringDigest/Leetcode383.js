"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function canConstruct(ransomNote, magazine) {
    // Initialize an array to count characters
    var arr = [];
    for (var i = 0; i < 26; i++) {
        arr.push(0);
    }
    // Count characters in ransomNote
    for (var i = 0; i < ransomNote.length; i++) {
        var currCharCode = ransomNote.charCodeAt(i);
        arr[currCharCode - 97]++;
    }
    // Count characters in magazine
    for (var i = 0; i < magazine.length; i++) {
        var currCharCode = magazine.charCodeAt(i);
        arr[currCharCode - 97]--;
    }
    // Check if all characters are available
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            return false;
        }
    }
    return true;
}
// Test the function
var ransomNote = 'aa';
var magazine = 'aab';
console.log(canConstruct(ransomNote, magazine)); // Output: true
