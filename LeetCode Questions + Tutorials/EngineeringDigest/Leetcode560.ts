function subarraySum(nums: number[], k: number): number {
    let map = new Map<number, number>();
    let result: number = 0, curr: number = 0;
    map.set(0, 1);
    for (let i of nums) {
        curr += i;
        result += map.get(curr - k) || 0;
        map.set(curr, (map.get(curr) || 0) + 1);
    }
    return result;
}

let nums: number[] = [1, 2, 3];
let k: number = 3;
console.log(subarraySum(nums, k));

export { };