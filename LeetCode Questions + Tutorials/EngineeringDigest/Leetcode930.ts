function numSubarraysWithSum(nums: number[], goal: number): number {
    let result: number = 0, prefixSum: number = 0;
    let map = new Map<number, number>();
    map.set(0, 1);
    for (let i of nums) {
        prefixSum += i;
        result += map.get(prefixSum - goal) || 0;
        map.set(prefixSum, (map.get(prefixSum) || 0) + 1);
    }
    return result;
};

let nums: number[] = [1, 0, 1, 0, 1];
let goal: number = 2;
console.log(numSubarraysWithSum(nums, goal));

export { };