function maxNumberOfBalloons(text: string): number {
    let map = new Map<string, number>();
    for (let c of text) {
        if (c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {
            map.set(c, (map.get(c) || 0) + 1);
        }
    }
    let fCat: number = Math.min(map.get('b') || 0, Math.min(map.get('a') || 0, map.get('n') || 0));
    let sCat: number = Math.min(map.get('l') || 0, map.get('o') || 0);
    return Math.min(sCat / 2, fCat);
};

let text: string = "loonbalxballpoon";
console.log(maxNumberOfBalloons(text));

export { };