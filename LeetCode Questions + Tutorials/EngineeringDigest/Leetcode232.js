var Stack = /** @class */ (function () {
    function Stack() {
        this.items = [];
    }
    Stack.prototype.isEmpty = function () {
        return this.items.length === 0;
    };
    Stack.prototype.add = function (elm) {
        this.items.push(elm);
    };
    Stack.prototype.peek = function () {
        if (this.isEmpty()) {
            throw new Error("Stack is Empty.");
        }
        else {
            return this.items[this.items.length - 1];
        }
    };
    Stack.prototype.pop = function () {
        if (this.isEmpty()) {
            throw new Error("Stack is empty.");
        }
        else {
            return this.items.pop();
        }
    };
    return Stack;
}());
var MyQueue = /** @class */ (function () {
    function MyQueue() {
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }
    MyQueue.prototype.push = function (x) {
        if (this.stack2.isEmpty()) {
            this.stack2.add(x);
        }
        else {
            while (!this.stack2.isEmpty()) {
                this.stack1.add(this.stack2.pop());
            }
            this.stack2.add(x);
            while (!this.stack1.isEmpty()) {
                this.stack2.add(this.stack1.pop());
            }
        }
    };
    MyQueue.prototype.pop = function () {
        return this.stack2.pop();
    };
    MyQueue.prototype.peek = function () {
        return this.stack2.peek();
    };
    MyQueue.prototype.empty = function () {
        return this.stack2.isEmpty();
    };
    return MyQueue;
}());
