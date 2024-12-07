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
function swapNodes(head, k) {
    //! Add elements in an array
    var arr = [];
    var currNode = head;
    while (currNode != null) {
        arr.push(currNode.val);
        currNode = currNode.next;
    }
    //! Validate k
    var arrLen = arr.length;
    if (k < 1 || k > arrLen) {
        return head;
    }
    //! Swap elements
    var leftIdx = k - 1;
    var rightIdx = arrLen - k;
    var temp = arr[leftIdx];
    arr[leftIdx] = arr[rightIdx];
    arr[rightIdx] = temp;
    //! Create a new linkedList and return it
    var newHead = new ListNode(arr[0]);
    var tailNode = newHead;
    for (var i = 1; i < arr.length; i++) {
        tailNode.next = new ListNode(arr[i]);
        tailNode = tailNode.next;
    }
    return newHead;
}
;
var head = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
console.log("Before swapping: ");
printList(head);
console.log("After swapping: ");
head = swapNodes(head, 2);
printList(head);
