class Stack<T> {
    private items: T[] = [];

    push(elm: T): void {
        this.items.push(elm);
    }

    pop(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty.");
        } else {
            return this.items.pop();
        }
    }

    isEmpty(): boolean {
        return this.items.length == 0;
    }

    peek(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty.");
        } else {
            return this.items[this.items.length - 1];
        }
    }
}

function combineStackToString(stack: Stack<string>): string {
    let result: string = "";
    while (!stack.isEmpty()) {
        result = stack.pop() + result;
    }
    return result;
}

function removeDuplicates(s: string): string {
    let stack: Stack<string> = new Stack<string>();
    for (let c of s) {
        if (!stack.isEmpty() && stack.peek() == c) {
            stack.pop();
        } else {
            stack.push(c);
        }
    }
    return combineStackToString(stack);
};

let str: string = "abbaca";
console.log(removeDuplicates(str));

export { };