class Stack<T> {
    // Array to hold stack elements
    private items: T[] = [];

    // Push an element onto the stack
    push(elm: T): void {
        this.items.push(elm);
    }

    // Pop an element off the stack
    pop(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty."); // Error if stack is empty
        } else {
            return this.items.pop(); // Remove and return the top element
        }
    }

    // Check if the stack is empty
    isEmpty(): boolean {
        return this.items.length == 0;
    }

    // Peek at the top element without removing it
    peek(): T | undefined {
        if (this.isEmpty()) {
            throw new Error("Stack is empty."); // Error if stack is empty
        } else {
            return this.items[this.items.length - 1]; // Return the top element
        }
    }
}

// Function to combine elements of a stack into a single string
function combineStackToString(stack: Stack<string>): string {
    let result: string = ""; // Initialize result string
    while (!stack.isEmpty()) {
        result = stack.pop() + result; // Append popped elements in reverse order
    }
    return result;
}

// Function to remove adjacent duplicates from a string
function removeDuplicates(s: string): string {
    let stack: Stack<string> = new Stack<string>(); // Create a new stack
    for (let c of s) { // Loop through each character in the string
        if (!stack.isEmpty() && stack.peek() == c) {
            stack.pop(); // Remove the top element if it matches the current character
        } else {
            stack.push(c); // Push the current character onto the stack
        }
    }
    return combineStackToString(stack); // Combine stack elements into a string
};

let str: string = "abbaca";
console.log(removeDuplicates(str)); // Output: "ca"

export { };