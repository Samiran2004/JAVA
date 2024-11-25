function numberOfSubarrays(nums: number[], k: number): number {
    let result: number = 0, curr: number = 0;
    let map = new Map<number, number>();
    map.set(0, 1);
    for (let i of nums) {
        curr += i % 2;
        result += map.get(curr - k) || 0;
        map.set(curr, (map.get(curr) || 0) + 1);
    }
    return result;
};

let nums: number[] = [2, 2, 2, 1, 2, 2, 1, 2, 2, 2];
let k: number = 2;
console.log(numberOfSubarrays(nums, k));

export { };