"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var ListNode = /** @class */ (function () {
    function ListNode(val, next) {
        if (next === void 0) { next = null; }
        this.val = val;
        this.next = next;
    }
    return ListNode;
}());
function addLast(head, val) {
    var currNode = head;
    while (currNode.next != null) {
        currNode = currNode.next;
    }
    currNode.next = new ListNode(val);
}
function printList(head) {
    var currNode = head;
    var result = "";
    while (currNode != null) {
        result += "".concat(currNode.val, " --> ");
        currNode = currNode.next;
    }
    result += "NULL";
    console.log(result);
}
function isPalindrome(head) {
    //!Find middle of the list
    var slowPtr = new ListNode(-1);
    slowPtr.next = head;
    var fastPtr = head;
    while (fastPtr != null && fastPtr.next != null) {
        slowPtr = slowPtr.next;
        fastPtr = fastPtr.next.next;
    }
    //!Reverse the list from middle
    var prevNode = null;
    var currNode = slowPtr.next;
    while (currNode != null) {
        var nextPtr = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = nextPtr;
    }
    //!Verify
    while (prevNode != null) {
        if ((head === null || head === void 0 ? void 0 : head.val) != prevNode.val) {
            return false;
        }
        head = head.next;
        prevNode = prevNode.next;
    }
    return true;
}
;
var head = new ListNode(1);
addLast(head, 2);
addLast(head, 2);
addLast(head, 1);
printList(head);
console.log(isPalindrome(head));
