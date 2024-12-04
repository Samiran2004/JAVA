var ListNode = /** @class */ (function () {
    function ListNode(val, next) {
        this.val = (val === undefined ? 0 : val);
        this.next = (next === undefined ? null : next);
    }
    return ListNode;
}());
function reverseList(head) {
    var prevNode = null;
    var presNode = head;
    var nextNode;
    while (presNode != null) {
        nextNode = presNode.next;
        presNode.next = prevNode;
        prevNode = presNode;
        presNode = nextNode;
    }
    return prevNode;
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
}
var head = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
addLast(head, 6);
printList(head);
reverseList(head);
printList(head);
