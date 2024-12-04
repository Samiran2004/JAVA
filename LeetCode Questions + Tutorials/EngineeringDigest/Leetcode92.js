"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var ListNode = /** @class */ (function () {
    function ListNode(val, next) {
        this.val = (val === undefined ? 0 : val);
        this.next = (next === undefined ? null : next);
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
function reverseList(head, left, right) {
    if (head == null || head.next == null || left == right) {
        return head;
    }
    var currNode = head;
    var prevNode = null;
    var i = 1;
    while (currNode != null && i != left) {
        prevNode = currNode;
        currNode = currNode.next;
        i++;
    }
    var pointerToStart = prevNode;
    var start = currNode;
    while (currNode != null && i != right + 1) {
        var nextNode = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = nextNode;
        i++;
    }
    start.next = currNode;
    if (pointerToStart != null) {
        pointerToStart.next = prevNode;
    }
    else {
        return prevNode;
    }
    return head;
}
var head = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
addLast(head, 6);
addLast(head, 7);
addLast(head, 8);
addLast(head, 9);
console.log("Before reversing the list is: ");
printList(head);
console.log("After reversing the list is: ");
head = reverseList(head, 2, 6);
printList(head);
