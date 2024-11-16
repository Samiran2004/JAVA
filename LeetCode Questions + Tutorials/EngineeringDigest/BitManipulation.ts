function decimalTOBinary(num: number): string {
    let res: string = "";
    while (num > 0) {
        let rem: number = num % 2;
        res = rem + res;
        num = Math.floor(num / 2);
    }
    return res || "0";
}

function binaryToDecimal(num: string): number {
    let length = num.length;
    let m: number = 1;
    let res: number = 0;
    for (let i = length - 1; i >= 0; i--) {
        let lastChar: string = num.charAt(i);
        let lastBit: number = parseInt(lastChar)
        res = res + m * lastBit;
        m = m * 2;
    }
    return res;
}


console.log(`Binary value of 2: ${decimalTOBinary(2)}`);
console.log(`Decimal value of 101: ${binaryToDecimal("101")}`);

console.log(`5 & 6 = ${5 & 6}`);
console.log(`5 | 6 = ${5 | 6}`);
console.log(`5 ^ 6 = ${5 ^ 6}`);
console.log(`5 << 1 = ${5 << 1}`);
console.log(`5 >> 1 = ${5 >> 1}`);

export { };