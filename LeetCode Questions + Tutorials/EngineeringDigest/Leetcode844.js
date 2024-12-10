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
        return this.items.pop();
    };
    Stack.prototype.peek = function () {
        if (this.isEmpty()) {
            throw new Error("Stack is empty.");
        }
        return this.items[this.items.length - 1];
    };
    Stack.prototype.isEmpty = function () {
        return this.items.length === 0;
    };
    Stack.prototype.size = function () {
        return this.items.length;
    };
    Stack.prototype.isEqual = function (otherStack) {
        if (this.size() !== otherStack.size()) {
            return false;
        }
        for (var i = 0; i < this.size(); i++) {
            if (this.items[i] !== otherStack.items[i]) {
                return false;
            }
        }
        return true;
    };
    return Stack;
}());
function backspaceCompare(s, t) {
    var stack1 = new Stack();
    var stack2 = new Stack();
    //!For 1st string...
    for (var _i = 0, s_1 = s; _i < s_1.length; _i++) {
        var c = s_1[_i];
        if (c === '#' && !stack1.isEmpty() && stack1.peek() !== '#') {
            stack1.pop();
        }
        else if (c !== '#') {
            stack1.push(c);
        }
    }
    //!For 2nd string...
    for (var _a = 0, t_1 = t; _a < t_1.length; _a++) {
        var c = t_1[_a];
        if (c === '#' && !stack2.isEmpty() && stack2.peek() !== '#') {
            stack2.pop();
        }
        else if (c !== '#') {
            stack2.push(c);
        }
    }
    if (!stack1.isEqual(stack2)) {
        return false;
    }
    return true;
}
;
var s = "xywrrmp";
var t = "xywrrmu#p";
console.log(backspaceCompare(s, t));
