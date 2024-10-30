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

// }

function countPairs(arr: number[], target: number): number {
    arr.sort((a, b) => a - b);
    let result = 0;
    let leftPtr = 0;
    let rightPtr = arr.length - 1;
    while (leftPtr != rightPtr) {
        if (arr[leftPtr] + arr[rightPtr] < target) {
            result += rightPtr - leftPtr;
            leftPtr++;
        } else {
            rightPtr--;
        }
    }
    return result;
}

let arr: number[] = [-1, 1, 2, 3, 1];
let target: number = 2;

console.log(countPairs(arr, target));

export { };