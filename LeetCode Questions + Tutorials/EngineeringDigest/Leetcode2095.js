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
    while (currNode != null) {
        var result = "";
        while (currNode != null) {
            result += "".concat(currNode.val, " --> ");
            currNode = currNode.next;
        }
        result += "Null";
        console.log(result);
    }
}
function removeMiddleNode(head) {
    if (head == null) {
        return head;
    }
    if (head.next == null) {
        return null;
    }
    var prevNode = head;
    var nextNode = head;
    var slowPtr = head;
    var fastPtr = head;
    while (fastPtr != null && fastPtr.next != null) {
        prevNode = slowPtr;
        slowPtr = slowPtr.next;
        fastPtr = fastPtr.next.next;
        nextNode = slowPtr.next;
    }
    prevNode.next = nextNode;
    return head;
}
var head = new ListNode(3);
addLast(head, 4);
addLast(head, 7);
addLast(head, 1);
addLast(head, 2);
addLast(head, 6);
printList(head);
head = removeMiddleNode(head);
printList(head);
