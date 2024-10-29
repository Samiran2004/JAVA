"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function decimalTOBinary(num) {
    var res = "";
    while (num > 0) {
        var rem = num % 2;
        res = rem + res;
        num = Math.floor(num / 2);
    }
    return res || "0";
}
function binaryToDecimal(num) {
    var length = num.length;
    var m = 1;
    var res = 0;
    for (var i = length - 1; i >= 0; i--) {
        var lastChar = num.charAt(i);
        var lastBit = parseInt(lastChar);
        res = res + m * lastBit;
        m = m * 2;
    }
    return res;
}
console.log("Binary value of 2: ".concat(decimalTOBinary(2)));
console.log("Decimal value of 101: ".concat(binaryToDecimal("101")));
console.log("5 & 6 = ".concat(5 & 6));
console.log("5 | 6 = ".concat(5 | 6));
console.log("5 ^ 6 = ".concat(5 ^ 6));
console.log("5 << 1 = ".concat(5 << 1));
console.log("5 >> 1 = ".concat(5 >> 1));
