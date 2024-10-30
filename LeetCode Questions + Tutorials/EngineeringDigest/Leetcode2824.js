"use strict";
// function countPairs(arr: number[], target: number): number {
//     arr.sort((a: number, b: number) => a - b);
//     let result = 0;
//     for (let i = 0; i < arr.length - 1; i++) {
//         for (let j = i + 1; j < arr.length; j++) {
//             if (arr[i] + arr[j] < target) {
//                 result++;
//             } else {
//                 break;
//             }
//         }
//     }
//     return result;
Object.defineProperty(exports, "__esModule", { value: true });
// }
function countPairs(arr, target) {
    arr.sort(function (a, b) { return a - b; });
    var result = 0;
    var leftPtr = 0;
    var rightPtr = arr.length - 1;
    while (leftPtr != rightPtr) {
        if (arr[leftPtr] + arr[rightPtr] < target) {
            result += rightPtr - leftPtr;
            leftPtr++;
        }
        else {
            rightPtr--;
        }
    }
    return result;
}
var arr = [-1, 1, 2, 3, 1];
var target = 2;
console.log(countPairs(arr, target));
