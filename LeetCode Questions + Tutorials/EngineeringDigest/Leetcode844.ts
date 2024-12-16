class Stack<T> {
    private items: T[] = [];

    push(elm: T): void {
        this.items.push(elm);
    }

    pop(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty.");
        }
        return this.items.pop();
    }
    peek(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty.")
        }
        return this.items[this.items.length - 1];
    }
    isEmpty(): boolean {
        return this.items.length === 0;
    }
    size(): number {
        return this.items.length;
    }
    isEqual(otherStack: Stack<T>): boolean {
        if (this.size() !== otherStack.size()) {
            return false;
        }

        for (let i = 0; i < this.size(); i++) {
            if (this.items[i] !== otherStack.items[i]) {
                return false;
            }
        }

        return true;
    }
}

function backspaceCompare(s: string, t: string): boolean {
    let stack1: Stack<string> = new Stack<string>();
    let stack2: Stack<string> = new Stack<string>();
    //!For 1st string...
    for (let c of s) {
        if (c === '#' && !stack1.isEmpty() && stack1.peek() !== '#') {
            stack1.pop();
        } else if (c !== '#') {
            stack1.push(c);
        }
    }
    //!For 2nd string...
    for (let c of t) {
        if (c === '#' && !stack2.isEmpty() && stack2.peek() !== '#') {
            stack2.pop();
        } else if (c !== '#') {
            stack2.push(c);
        }
    }
    if (!stack1.isEqual(stack2)) {
        return false;
    }
    return true;

};

let s: string = "xywrrmp";
let t: string = "xywrrmu#p";
console.log(backspaceCompare(s, t));

export { };