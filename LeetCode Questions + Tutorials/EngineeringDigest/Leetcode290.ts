function wordPattern(pattern: string, s: string): boolean {
    let map = new Map<string, string>();
    let reverseMap = new Map<string, string>();
    let sArr: string[] = s.split(" ");
    if(sArr.length != pattern.length) {
        return false;
    }
    for(let i: number = 0; i < pattern.length; i++) {
        let currChar: string = pattern.charAt(i);
        let currWord: string = sArr[i];
        if (map.has(currChar) && map.get(currChar) !== currWord) {
            return false;
        }
        if (reverseMap.has(currWord) && reverseMap.get(currWord) !== currChar) {
            return false;
        }
        map.set(currChar, currWord);
        reverseMap.set(currWord, currChar);
    }
    return true;
};

let pattern: string = "abba";
let s: string = "dog cat cat dog";
console.log(wordPattern(pattern, s));

export { };