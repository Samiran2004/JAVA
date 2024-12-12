class Stack<T> {
    private items: T[] = [];

    isEmpty(): boolean {
        return this.items.length === 0;
    }

    peek(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty!");
        } else {
            return this.items[this.items.length - 1];
        }
    }

    add(elm: T): void {
        this.items.push(elm);
    }

    pop(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty!");
        } else {
            return this.items.pop();
        }
    }
}

function checkUpperCase(c: string): boolean {
    return c === c.toUpperCase();
}

function checkLowerCase(c: string): boolean {
    return c === c.toLowerCase();
}
function combineStackToString(stack: Stack<string>): string {
    let result: string = "";
    while (!stack.isEmpty()) {
        result = stack.pop() + result;
    }
    return result;
}

function makeGood(s: string): string {
    let stack: Stack<string> = new Stack<string>();
    for (let c of s) {
        if (!stack.isEmpty()) {
            const topElm: string = stack.peek() as string;
            if ((checkLowerCase(topElm) && checkUpperCase(c) && topElm.toLowerCase() === c.toLowerCase()) ||
                (checkUpperCase(topElm) && checkLowerCase(c) && topElm.toUpperCase() === c.toUpperCase())
            ) {
                stack.pop();
                continue;
            }
        }
        stack.add(c);
    }
    return combineStackToString(stack);
};

let s: string = "leEeetcode";
console.log(makeGood(s));

export { };