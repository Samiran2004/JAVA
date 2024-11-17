function repeatedCharacter(s: string): string {
    let set = new Set();
    for (let i: number = 0; i < s.length; i++) {
        if (set.has(s.charAt(i))) {
            return s.charAt(i);
        } else {
            set.add(s.charAt(i));
        }
    }
    return s.charAt(0);
}

let str = "abccbaacz";
console.log(repeatedCharacter(str));


export { };