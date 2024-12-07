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
    result += "Null";
    console.log(result);
}
function removeElements(head, val) {
    while (head != null && head.val == val) {
        head = head.next;
    }
    var currNode = head;
    while (currNode != null && currNode.next != null) {
        if (currNode.next.val === val) {
            currNode.next = currNode.next.next;
            continue;
        }
        else {
            currNode = currNode.next;
        }
    }
    return head;
}
;
var head = new ListNode(1);
addLast(head, 2);
addLast(head, 6);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
addLast(head, 6);
console.log("Before removing the value: ");
printList(head);
console.log("After removing the value: ");
head = removeElements(head, 6);
printList(head);
