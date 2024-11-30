var ListNode = /** @class */ (function () {
    function ListNode(data, next) {
        this.data = data;
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
function printList(head) {
    var currNode = head;
    var result = "";
    while (currNode != null) {
        result += "".concat(currNode.data, " --> ");
        currNode = currNode.next;
    }
    result += "Null";
    console.log(result);
}
function removeNthFromEnd(head, n) {
    var slowPtr = head;
    var fastPtr = head;
    for (var i = 1; i <= n; i++) {
        fastPtr = fastPtr.next;
    }
    if (fastPtr == null) {
        return head.next;
    }
    while (fastPtr != null && fastPtr.next != null) {
        slowPtr = slowPtr.next;
        fastPtr = fastPtr.next;
    }
    if (slowPtr != null && slowPtr.next != null) {
        slowPtr.next = slowPtr.next.next;
    }
    return head;
}
;
var head = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
printList(head);
head = removeNthFromEnd(head, 2);
printList(head);
