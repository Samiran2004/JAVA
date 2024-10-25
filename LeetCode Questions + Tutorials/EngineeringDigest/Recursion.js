"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function factorial(n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}
function printOneToN(n) {
    if (n == 1) {
        console.log(n);
        return;
    }
    printOneToN(n - 1);
    console.log(n);
}
function printNtoOne(n) {
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
