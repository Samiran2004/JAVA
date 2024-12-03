function containsNearbyDuplicate(nums: number[], k: number): boolean {
    let map = new Map<number, number>();
    for (let index = 0; index < nums.length; index++) {
        const num = nums[index];
        if (map.has(num) && (index - map.get(num)!) <= k) {
            return true;
        } else {
            map.set(num, index);
        }
    }
    return false;
};

let nums: number[] = [1, 2, 3, 1, 2, 3];
let k: number = 2;
console.log(containsNearbyDuplicate(nums, k));

export { };