"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function checkIfPangram(sentence) {
    var arr = new Array(26).fill(false);
    for (var i = 0; i < sentence.length; i++) {
        var charCode = sentence.charCodeAt(i);
        arr[charCode - 97] = true;
    }
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] == false) {
            return false;
        }
    }
    return true;
}
var sentence = "abcdefghijklmnopqrstuwxyz";
console.log(checkIfPangram(sentence));
