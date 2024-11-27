function numIdenticalPairs(nums: number[]): number {
    let map = new Map<number, number>();
    let sum: number = 0;

    for (let i of nums) {
        map.set(i, (map.get(i) || 0) + 1);
    }
    console.log('Map contents:', map);

    console.log('Starting loop');
    for (const [key, value] of map.entries()) {
        console.log(`Value: ${value}, Key: ${key}`);
        sum += (value * (value - 1)) / 2;
    }

    return sum;
};
const nums = [1, 2, 3, 1, 1, 3];
console.log(numIdenticalPairs(nums));