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
function oddEvenList(head) {
    if (head == null || head.next == null) {
        return head;
    }
    var oddNode = head;
    var evenNode = oddNode.next;
    var evenHead = evenNode;
    while (evenNode != null && evenNode.next != null) {
        oddNode.next = evenNode.next;
        oddNode = oddNode.next;
        evenNode.next = oddNode.next;
        evenNode = evenNode.next;
    }
    oddNode.next = evenHead;
    return head;
}
;
var head = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
printList(head);
head = oddEvenList(head);
printList(head);
