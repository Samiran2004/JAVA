function reverseOnlyLetters(s: string): string {
    let i: number = 0, j: number = s.length - 1;
    let arr: string[] = s.split("");
    while (i < j) {
        while (i < j && !isEnglish(arr[i])) {
            i++;
        }
        while (i < j && !isEnglish(arr[j])) {
            j--;
        }
        if (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    return arr.join('');
}

function isEnglish(c: string): boolean {
    return (c.charCodeAt(0) >= 65 && c.charCodeAt(0) <= 90) || (c.charCodeAt(0) >= 97 && c.charCodeAt(0) <= 122);
}

function swap(arr: string[], i: number, j: number): void {
    let temp: string = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

let s: string = "Test1ng-Leet=code-Q!";
console.log(reverseOnlyLetters(s));

export { };