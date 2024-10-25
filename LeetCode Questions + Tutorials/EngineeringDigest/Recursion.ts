function factorial(n: number): number {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

function printOneToN(n: number): void {
    if (n == 1) {
        console.log(n);
        return;
    }
    printOneToN(n - 1);
    console.log(n);
}

function printNtoOne(n: number): void {
    if (n == 1) {
        console.log(n);
        return;
    }
    console.log(n);
    printNtoOne(n - 1);
}

console.log(factorial(5));
printOneToN(5);
printNtoOne(5);

export { };