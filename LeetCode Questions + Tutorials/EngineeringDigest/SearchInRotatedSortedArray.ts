let arr: number[] = [5, 6, 7, 8, 9, 10, 1, 2, 3];
let key: number = 8;

function search(arr: number[], start: number, end: number, key: number): number {
    let pivot = getPivot(arr, start, end);
    let result = binarySearch(arr, 0, pivot, key);
    if (result === -1) {
        result = binarySearch(arr, pivot + 1, end, key);
    }
    return result;
}

function getPivot(arr: number[], start: number, end: number): number {
    while (start <= end) {
        let mid: number = Math.floor((start + end) / 2);
        if (arr[mid] > arr[mid + 1]) {
            return mid;
        } else if (arr[mid] < arr[mid - 1]) {
            return mid - 1;
        } else if (arr[mid] > arr[start]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
}

function binarySearch(arr: number[], start: number, end: number, key: number): number {
    while (start <= end) {
        let mid = Math.floor((start + end) / 2);
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
}

console.log(search(arr, 0, arr.length - 1, key));

export { };