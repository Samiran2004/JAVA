function canConstruct(ransomNote: string, magazine: string): boolean {
    // Initialize an array to count characters
    let arr: number[] = [];
    for (let i = 0; i < 26; i++) {
        arr.push(0);
    }
    // Count characters in ransomNote
    for (let i: number = 0; i < ransomNote.length; i++) {
        let currCharCode = ransomNote.charCodeAt(i);
        arr[currCharCode - 97]++;
    }

    // Count characters in magazine
    for (let i: number = 0; i < magazine.length; i++) {
        let currCharCode = magazine.charCodeAt(i);
        arr[currCharCode - 97]--;
    }

    // Check if all characters are available
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            return false;
        }
    }

    return true;
}

// Test the function
let ransomNote: string = 'aa';
let magazine: string = 'aab';
console.log(canConstruct(ransomNote, magazine)); // Output: true

export { };