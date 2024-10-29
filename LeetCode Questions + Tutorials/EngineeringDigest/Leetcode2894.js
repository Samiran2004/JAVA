"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function differenceOfSums(n, m) {
    var arr1 = [];
    var arr2 = [];
    for (var i = 0; i < n; i++) {
        var currChar = i + 1;
        if (currChar % m == 0) {
            arr2.push(currChar);
        }
        else if (currChar % m != 0) {
            arr1.push(currChar);
        }
    }
    var sum1 = 0;
    var sum2 = 0;
    for (var i = 0; i < arr1.length; i++) {
        sum1 += arr1[i];
    }
    for (var i = 0; i < arr2.length; i++) {
        sum2 += arr2[i];
    }
    return sum1 - sum2;
}
console.log(differenceOfSums(10, 3));
console.log(differenceOfSums(5, 6));
console.log(differenceOfSums(5, 1));
