"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var ListNode = /** @class */ (function () {
    function ListNode(val, next) {
        this.val = (val === undefined ? 0 : val);
        this.next = (next === undefined ? null : next);
    }
    return ListNode;
}());
function deleteDuplicates(head) {
    var currNode = head;
    while (currNode != null && currNode.next != null) {
        if (currNode.val == currNode.next.val) {
            currNode.next = currNode.next.next;
        }
        else {
            currNode = currNode.next;
        }
    }
    return head;
}
;
function addLast(head, data) {
    var currNode = head;
    while ((currNode === null || currNode === void 0 ? void 0 : currNode.next) != null) {
        currNode = currNode.next;
    }
    currNode.next = new ListNode(data);
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
var head = new ListNode(1);
addLast(head, 2);
addLast(head, 2);
addLast(head, 3);
addLast(head, 3);
addLast(head, 4);
addLast(head, 4);
addLast(head, 5);
addLast(head, 5);
addLast(head, 6);
addLast(head, 6);
printList(head);
console.log("After Removing: ");
deleteDuplicates(head);
printList(head);
