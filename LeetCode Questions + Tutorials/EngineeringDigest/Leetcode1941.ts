function areOccurrencesEqual(s: string): boolean {
    let countMap = new Map<string, number>();
    let count = -1;

    for (const c of s) {
        countMap.set(c, (countMap.get(c) || 0) + 1);
    }

    for (const value of countMap.values()) {
        if (count == -1) {
            count = value;
        } else if (count != value) {
            return false; 
        }
    }

    return true;
}

let str: string = "abcasbc";
console.log(areOccurrencesEqual(str));

export { };
