function closeStrings(word1: string, word2: string): boolean {
    if (word1.length !== word2.length) {
        return false; // Different lengths can't be transformed
    }

    const map1 = new Map<string, number>();
    const map2 = new Map<string, number>();

    // Count frequencies for word1 and word2
    for (const c of word1) {
        map1.set(c, (map1.get(c) || 0) + 1);
    }
    for (const c of word2) {
        map2.set(c, (map2.get(c) || 0) + 1);
    }

    // Compare unique character sets
    const set1 = new Set(map1.keys());
    const set2 = new Set(map2.keys());
    if (set1.size !== set2.size || [...set1].some((key) => !set2.has(key))) {
        return false; // Different unique characters
    }
    // if (set1.size !== set2.size) {
    //     return false; // Different unique characters
    // }

    // Compare sorted frequency arrays
    const freq1 = Array.from(map1.values()).sort((a, b) => a - b);
    const freq2 = Array.from(map2.values()).sort((a, b) => a - b);

    return freq1.join() === freq2.join();
};

let word1: string = "abc";
let word2: string = "bca";
console.log(closeStrings(word1, word2));

export { };