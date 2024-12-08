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
function mergeNodes(head) {
    if (head == null || head.next == null) {
        return head;
    }
    var currNode = head;
    var arr = [];
    var sum = 0;
    while (currNode != null) {
        if (currNode.val != 0) {
            while (currNode.val != 0) {
                sum += currNode.val;
                currNode = currNode.next;
            }
            arr.push(sum);
            sum = 0;
        }
        else {
            currNode = currNode.next;
        }
    }
    var newHead = new ListNode(arr[0]);
    var tailNode = newHead;
    for (var i = 1; i < arr.length; i++) {
        var newNode = new ListNode(arr[i]);
        tailNode.next = newNode;
        tailNode = newNode;
    }
    return newHead;
}
;
var head = new ListNode(0);
addLast(head, 3);
addLast(head, 1);
addLast(head, 0);
addLast(head, 4);
addLast(head, 5);
addLast(head, 2);
addLast(head, 0);
printList(head);
var newHead = mergeNodes(head);
printList(newHead);
