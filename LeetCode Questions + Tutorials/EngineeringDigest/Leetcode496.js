"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
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
            throw new Error("Stack is empty!");
        }
        else {
            return this.items[this.items.length - 1];
        }
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
function nextGreaterElement(nums1, nums2) {
    var result = [];
    var stack = new Stack();
    var map = new Map();
    for (var i = nums2.length - 1; i >= 0; i--) {
        var currElm = nums2[i];
        while (!stack.isEmpty() && stack.peek() <= currElm) {
            stack.pop();
        }
        map.set(currElm, stack.isEmpty() ? -1 : stack.peek());
        stack.add(currElm);
    }
    for (var i = 0; i < nums1.length; i++) {
        result[i] = map.get(nums1[i]) || -1;
    }
    return result;
}
;
var nums1 = [4, 1, 2], nums2 = [1, 3, 4, 2];
console.log(nextGreaterElement(nums1, nums2));
