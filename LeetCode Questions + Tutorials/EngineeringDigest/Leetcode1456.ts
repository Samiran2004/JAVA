function maxVowels(s: string, k: number): number {
    let left: number = 0, right: number = 0, res: number = 0, window: number = 0;
    for (; right < k; right++) {
        if (isVowel(s.charAt(right))) {
            window += 1;
        }
    }
    res = window;
    while (right < s.length) {
        if (isVowel(s.charAt(left))) {
            window -= 1;
        }
        if (isVowel(s.charAt(right))) {
            window += 1;
        }
        res = Math.max(res, window);
        left++;
        right++;
    }
    return res;
}
function isVowel(c: string): boolean {
    return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u');
}

let str: string = "leetcode";
let k: number = 3;
console.log(maxVowels(str, k));


export { };