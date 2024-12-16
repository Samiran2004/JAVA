class ListNode {
    val: number;
    next: ListNode | null;
    constructor(val: number, next: ListNode | null = null) {
        this.val = val;
        this.next = next;
    }
}
function addLast(head: ListNode, val: number): void {
    let currNode: ListNode = head;
    while (currNode.next != null) {
        currNode = currNode.next;
    }
    currNode.next = new ListNode(val);
}
function printList(head: ListNode): void {
    let currNode: ListNode | null = head;
    while (currNode != null) {
        let result: string = "";
        while (currNode != null) {
            result += `${currNode.val} --> `;
            currNode = currNode.next;
        }
        result += "Null";
        console.log(result);
    }
}
function removeMiddleNode(head: ListNode): ListNode | null {
    if (head == null) {
        return head;
    }
    if (head.next == null) {
        return null;
    }
    let prevNode: ListNode | null = head;
    let nextNode: ListNode | null = head;
    let slowPtr: ListNode | null = head;
    let fastPtr: ListNode | null = head;
    while (fastPtr != null && fastPtr.next != null) {
        prevNode = slowPtr;
        slowPtr = slowPtr.next as ListNode;
        fastPtr = fastPtr.next.next;
        nextNode = slowPtr.next;
    }
    prevNode.next = nextNode;
    return head;
}

let head: ListNode | null = new ListNode(3);
addLast(head, 4);
addLast(head, 7);
addLast(head, 1);
addLast(head, 2);
addLast(head, 6);
printList(head);
head = removeMiddleNode(head);
printList(head as ListNode);

export { };