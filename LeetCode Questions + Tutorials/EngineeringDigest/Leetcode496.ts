class Stack<T> {
    private items: T[] = [];

    isEmpty(): boolean {
        return this.items.length === 0;
    }

    add(elm: T): void {
        this.items.push(elm);
    }

    peek(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty!")
        } else {
            return this.items[this.items.length - 1];
        }
    }

    pop(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty!");
        } else {
            return this.items.pop();
        }
    }
}

function nextGreaterElement(nums1: number[], nums2: number[]): number[] {
    let result: number[] = [];
    let stack: Stack<number> = new Stack<number>();
    let map = new Map();
    for (let i: number = nums2.length - 1; i >= 0; i--) {
        let currElm: number = nums2[i];
        while (!stack.isEmpty() && stack.peek()! <= currElm) {
            stack.pop();
        }
        map.set(currElm, stack.isEmpty() ? -1 : stack.peek());
        stack.add(currElm);
    }
    for (let i: number = 0; i < nums1.length; i++) {
        result[i] = map.get(nums1[i]) || -1;
    }
    return result;
};

let nums1: number[] = [4, 1, 2], nums2: number[] = [1, 3, 4, 2];
console.log(nextGreaterElement(nums1, nums2));

export { };