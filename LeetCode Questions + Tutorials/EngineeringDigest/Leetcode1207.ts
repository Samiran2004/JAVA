function uniqueOccurrences(arr: number[]): boolean {
    let map = new Map<number, number>();
    let set = new Set<number>();
    for (let i of arr) {
        map.set(i, (map.get(i) || 0) + 1);
    }
    for (const [key, value] of map.entries()) {
        if (set.has(value)) {
            return false;
        } else {
            set.add(value);
        }
    }
    return true;
};

let arr: number[] = [1, 2, 2, 1, 1, 3];
console.log(uniqueOccurrences(arr));