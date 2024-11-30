"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var ListNode = /** @class */ (function () {
    function ListNode(data, next) {
        this.data = data === undefined ? 0 : data;
        this.next = next === undefined ? null : next;
    }
    return ListNode;
}());
function addLast(head, data) {
    var currNode = head;
    while (currNode.next != null) {
        currNode = currNode.next;
    }
    currNode.next = new ListNode(data);
}
function middleNode(head) {
    var slowPtr = head;
    var fastPtr = head;
    while (fastPtr != null && fastPtr.next != null) {
        slowPtr = slowPtr.next;
        fastPtr = fastPtr.next.next;
    }
    return slowPtr;
}
var head = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
addLast(head, 6);
var middle = middleNode(head);
console.log(middle ? middle.data : "null");
