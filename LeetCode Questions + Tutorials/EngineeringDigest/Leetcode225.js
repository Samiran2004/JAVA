"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var CustomQueue = /** @class */ (function () {
    function CustomQueue() {
        this.items = [];
    }
    CustomQueue.prototype.isEmpty = function () {
        return this.items.length === 0;
    };
    CustomQueue.prototype.add = function (elm) {
        this.items.push(elm);
    };
    CustomQueue.prototype.peek = function () {
        if (this.isEmpty()) {
            throw new Error("Queue is empty.");
        }
        else {
            return this.items[0];
        }
    };
    CustomQueue.prototype.poll = function () {
        if (this.isEmpty()) {
            throw new Error("Queue is empty.");
        }
        else {
            var pollElm = this.items[0];
            // for (let i: number = 0; i < this.items.length - 1; i++) {
            //     this.items[i] = this.items[i + 1];
            // }
            // this.items.length = this.items.length - 1;
            this.items.splice(0, 1);
            return pollElm;
        }
    };
    return CustomQueue;
}());
var MyStack = /** @class */ (function () {
    function MyStack() {
        this.queue1 = new CustomQueue();
        this.queue2 = new CustomQueue();
    }
    MyStack.prototype.push = function (x) {
        while (!this.queue2.isEmpty()) {
            this.queue1.add(this.queue2.poll());
        }
        this.queue2.add(x);
        while (!this.queue1.isEmpty()) {
            this.queue2.add(this.queue1.poll());
        }
    };
    MyStack.prototype.pop = function () {
        return this.queue2.poll();
    };
    MyStack.prototype.top = function () {
        return this.queue2.peek();
    };
    MyStack.prototype.empty = function () {
        return this.queue2.isEmpty();
    };
    return MyStack;
}());
