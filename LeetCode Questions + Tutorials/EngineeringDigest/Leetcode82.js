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
function deleteDuplicates(head) {
    if (head == null || head.next == null) {
        return head;
    }
    var dummyNode = new ListNode(0);
    dummyNode.next = head;
    var prevNode = dummyNode.next;
    var currNode = head;
    while (currNode != null && currNode.next != null) {
        if (currNode.val === currNode.next.val) {
            while (currNode.next != null && currNode.val === currNode.next.val) {
                currNode = currNode.next;
            }
            prevNode.next = currNode.next;
        }
        else {
            prevNode = currNode;
        }
        currNode = currNode.next;
    }
    return dummyNode.next;
}
var head = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 3);
addLast(head, 4);
addLast(head, 4);
addLast(head, 5);
printList(head);
head = deleteDuplicates(head);
printList(head);