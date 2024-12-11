"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Stack = /** @class */ (function () {
    function Stack() {
        this.items = [];
    }
    Stack.prototype.push = function (elm) {
        this.items.push(elm);
    };
    Stack.prototype.pop = function () {
        if (this.isEmpty()) {
            throw new Error("Stack is empty.");
        }
        else {
            return this.items.pop();
        }
    };
    Stack.prototype.isEmpty = function () {
        return this.items.length == 0;
    };
    Stack.prototype.peek = function () {
        if (this.isEmpty()) {
            throw new Error("Stack is empty.");
        }
        else {
            return this.items[this.items.length - 1];
        }
    };
    return Stack;
}());
function combineStackToString(stack) {
    var result = "";
    while (!stack.isEmpty()) {
        result = stack.pop() + result;
    }
    return result;
}
function removeDuplicates(s) {
    var stack = new Stack();
    for (var _i = 0, s_1 = s; _i < s_1.length; _i++) {
        var c = s_1[_i];
        if (!stack.isEmpty() && stack.peek() == c) {
            stack.pop();
        }
        else {
            stack.push(c);
        }
    }
    return combineStackToString(stack);
}
;
var str = "abbaca";
console.log(removeDuplicates(str));
