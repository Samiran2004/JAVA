function sumOfUnique(nums: number[]): number {
    const map = new Map<number, number>();
    let sum = 0;
    for (const num of nums) {
        map.set(num, (map.get(num) || 0) + 1); 
    }
    for (const [key, value] of map.entries()) {
        if (value === 1) {
            sum += key;
        }
    }
    return sum;
}

let nums: number[] = [1, 2, 3, 2];
console.log(sumOfUnique(nums));

export { };