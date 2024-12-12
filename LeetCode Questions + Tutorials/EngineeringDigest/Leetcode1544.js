"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Stack = /** @class */ (function () {
    function Stack() {
        this.items = [];
    }
    Stack.prototype.isEmpty = function () {
        return this.items.length === 0;
    };
    Stack.prototype.peek = function () {
        if (this.isEmpty()) {
            throw new Error("Stack is empty!");
        }
        else {
            return this.items[this.items.length - 1];
        }
    };
    Stack.prototype.add = function (elm) {
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
    return Stack;
}());
function checkUpperCase(c) {
    return c === c.toUpperCase();
}
function checkLowerCase(c) {
    return c === c.toLowerCase();
}
function combineStackToString(stack) {
    var result = "";
    while (!stack.isEmpty()) {
        result = stack.pop() + result;
    }
    return result;
}
function makeGood(s) {
    var stack = new Stack();
    for (var _i = 0, s_1 = s; _i < s_1.length; _i++) {
        var c = s_1[_i];
        if (!stack.isEmpty()) {
            var topElm = stack.peek();
            if ((checkLowerCase(topElm) && checkUpperCase(c) && topElm.toLowerCase() === c.toLowerCase()) ||
                (checkUpperCase(topElm) && checkLowerCase(c) && topElm.toUpperCase() === c.toUpperCase())) {
                stack.pop();
                continue;
            }
        }
        stack.add(c);
    }
    return combineStackToString(stack);
}
;
var s = "leEeetcode";
console.log(makeGood(s));
