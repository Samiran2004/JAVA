function destCity(paths: string[][]): string {
    let set = new Set<string>();
    for(let path of paths) {
        set.add(path[0]);
    }
    for(let path of paths) {
        if(!set.has(path[1])){
            return path[1];
        }
    }
    return null;
};

const paths: string[][] = [
    ["London", "New York"],
    ["New York", "Lima"],
    ["Lima", "Sao Paulo"]
];

console.log(destCity(paths));

export { };