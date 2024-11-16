let arr: number[] = [2, 3, 4, 5, 6];

function rotateArray(arr: number[], d: number): number[] {
    if (arr.length == 0 || d == 0) {
        return arr;
    }
    //Step 1: Rotate the d number of elements...
    reverse(arr, 0, d - 1);
    // Step 2: Rotate the remaining elements...
    reverse(arr, d, arr.length - 1);
    // Step 3: Rotate the full array...
    reverse(arr, 0, arr.length - 1);
    return arr;
}
function reverse(arr: number[], i: number, j: number): void {
    while (i <= j) {
        let temp: number = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}


console.log(rotateArray(arr, 2));


export { };