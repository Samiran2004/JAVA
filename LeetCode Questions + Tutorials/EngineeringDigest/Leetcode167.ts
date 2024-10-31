function twoSum(numbers: number[], target: number): number[] {
    let start: number = 0;
    let end: number = numbers.length - 1;
    let res: number[] = [];
    while (start <= end) {
        if (numbers[start] + numbers[end] == target) {
            res.push(start + 1);
            res.push(end + 1);
            return res;
        } else if (numbers[start] + numbers[end] > target) {
            end--;
        } else {
            start++;
        }
    }
    return res;
}

let arr: number[] = [2, 7, 11, 15];
let target: number = 9;
console.log(twoSum(arr, target));

export { };