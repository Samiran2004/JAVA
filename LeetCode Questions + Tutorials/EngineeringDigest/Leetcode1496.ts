function isPathCrossing(path: string): boolean {
    let set = new Set<string>();
    let x: number = 0, y: number = 0;
    let coordinate: string = `${x},${y}`;
    set.add(coordinate);
    for (let c of path) {
        if (c === 'N') {
            y++;
        } else if (c === 'W') {
            x--;
        } else if (c === 'S') {
            y--;
        } else if (c === 'E') {
            x++;
        }
        coordinate = `${x},${y}`;
        if (set.has(coordinate)) {
            return true;
        }
        set.add(coordinate);
    }
    return false;
}

let path: string = "NEWSW";
console.log(isPathCrossing(path)); // Output: true

export {};