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
function getDecimalValue(head) {
    var res = 0;
    while (head != null) {
        if (head.val === 0) {
            res += res << 1;
        }
        else {
            res += (res << 1) + 1;
        }
        head = head.next;
    }
    return res;
}
;
var head = new ListNode(1);
addLast(head, 0);
addLast(head, 1);
printList(head);
console.log("Decimal value: ".concat(getDecimalValue(head)));
