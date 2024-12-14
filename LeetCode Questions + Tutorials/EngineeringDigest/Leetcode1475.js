"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Stack = /** @class */ (function () {
    function Stack() {
        this.items = [];
    }
    Stack.prototype.isEmpty = function () {
        return this.items.length === 0;
    };
    Stack.prototype.push = function (elm) {
        this.items.push(elm);
    };
    Stack.prototype.pop = function () {
        if (this.isEmpty()) {
            throw new Error("Stack is empty!");
        }
        else {
            return this.items.pop();
        }
    };
    Stack.prototype.peek = function () {
        if (this.isEmpty()) {
            throw new Error("Stack is empty!");
        }
        else {
            return this.items[this.items.length - 1];
        }
    };
    return Stack;
}());
function finalPrices(prices) {
    var stack = new Stack();
    var result = [];
    for (var i = 0; i < prices.length; i++) {
        while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
            var idx = stack.pop();
            result[idx] = prices[idx] - prices[i];
        }
        stack.push(i);
    }
    while (!stack.isEmpty()) {
        var idx = stack.pop();
        result[idx] = prices[idx];
    }
    return result;
}
;
var prices = [8, 4, 6, 2, 3];
console.log(finalPrices(prices));
