function intersection(nums: number[][]): number[] {
    let n: number = nums.length;
    let map = new Map<number, number>();

    for (let arr of nums) {
        for (let i of arr) {
            map.set(i, (map.get(i) || 0) + 1);
        }
    }

    let result: number[] = [];
    for (const [key, value] of map.entries()) {
        if (value === n) {
            result.push(key);
        }
    }

    result.sort((a, b) => a - b);
    return result;
}

let nums: number[][] = [[3, 1, 2, 4, 5], [1, 2, 3, 4], [3, 4, 5, 6]];
console.log(intersection(nums));

export { };