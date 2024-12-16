function findLucky(arr: number[]): number {
    let map = new Map<number, number>();
    let result: number = -1;
    for(let i of arr) {
        map.set(i, (map.get(i) || 0) + 1);
    }
    for(const [key, value] of map.entries()) {
        if(key === value) {
            result = Math.max(result, key);
        }
    }
    return result;
};

let arr: number[] = [1, 2, 2, 3, 3, 3];
console.log(findLucky(arr));

export { };