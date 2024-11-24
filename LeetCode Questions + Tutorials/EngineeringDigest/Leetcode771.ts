function numJewelsInStones(jewels: string, stones: string): number {
    let count: number = 0;
    let set: Set<string> = new Set();
    for (let i: number = 0; i < jewels.length; i++) {
        set.add(jewels.charAt(i));
    }
    for (let i: number = 0; i < stones.length; i++) {
        if (set.has(stones.charAt(i))) {
            count++;
        }
    }
    return count;
}

let jewels: string = 'aA';
let stones: string = 'aAAbbbb';
console.log(numJewelsInStones(jewels, stones));

export { };