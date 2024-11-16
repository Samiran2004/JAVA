function sortedSquares(nums: number[]): number[] {
    let newArr: number[] = [];
    let start = 0, end = nums.length - 1;
    for (let i: number = nums.length - 1; i >= 0; i--) {
        if (Math.abs(nums[start]) > Math.abs(nums[end])) {
            newArr[i] = nums[start] * nums[start];
            start++;
        } else {
            newArr[i] = nums[end] * nums[end];
            end--;
        }
    }
    return newArr;
}

let nums: number[] = [-4, -2, 0, 3, 10];
console.log(sortedSquares(nums));


export { };