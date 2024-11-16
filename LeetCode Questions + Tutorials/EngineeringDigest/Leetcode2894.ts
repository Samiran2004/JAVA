function differenceOfSums(n: number, m: number): number {
    let arr1: number[] = [];
    let arr2: number[] = [];
    for (let i: number = 0; i < n; i++) {
        let currNum: number = i + 1;
        if (currNum % m == 0) {
            arr2.push(currNum);
        } else {
            arr1.push(currNum);
        }
    }
    let sum1: number = 0;
    let sum2: number = 0;
    for (let i = 0; i < arr1.length; i++) {
        sum1 += arr1[i];
    }
    for (let i = 0; i < arr2.length; i++) {
        sum2 += arr2[i];
    }
    return sum1 - sum2;
}

console.log(differenceOfSums(10, 3));
console.log(differenceOfSums(5, 6));
console.log(differenceOfSums(5, 1));


export { };