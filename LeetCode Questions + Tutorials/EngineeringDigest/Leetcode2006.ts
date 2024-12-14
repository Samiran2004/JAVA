function countKDifference(nums: number[], k: number): number {
    let result: number = 0;
    let map = new Map();
    for (let i: number = 0; i < nums.length; i++) {
        result += map.get(nums[i] - k) || 0;
        result += map.get(nums[i] + k) || 0;
        map.set(nums[i], (map.get(nums[i]) || 0) + 1);
    }
    return result;
};

let nums: number[] = [1, 2, 2, 1];
let k: number = 1;
console.log(countKDifference(nums, k));

export { };