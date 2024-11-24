function checkIfPangram(sentence: string): boolean {
    let arr: boolean[] = new Array(26).fill(false);
    for (let i: number = 0; i < sentence.length; i++) {
        const charCode = sentence.charCodeAt(i);
        arr[charCode - 97] = true;
    }
    for (let i: number = 0; i < arr.length; i++) {
        if (arr[i] == false) {
            return false;
        }
    }
    return true;
}

let sentence: string = "abcdefghijklmnopqrstuvwxyz";
console.log(checkIfPangram(sentence));

export { };
