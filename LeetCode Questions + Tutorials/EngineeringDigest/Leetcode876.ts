class ListNode {
    data: number;
    next: ListNode | null;
    constructor(data: number, next?: ListNode | null) {
        this.data = data === undefined ? 0 : data;
        this.next = next === undefined ? null : next;
    }
}

function addLast(head: ListNode, data: number): void {
    let currNode: ListNode = head;
    while (currNode.next != null) {
        currNode = currNode.next;
    }
    currNode.next = new ListNode(data);
}

function middleNode(head: ListNode | null): ListNode | null {
    // Initialize two pointers: slowPtr and fastPtr, both starting at the head of the list.
    let slowPtr: ListNode | null = head;
    let fastPtr: ListNode | null = head;

    // Traverse the list until fastPtr reaches the end of the list or its next node is null.
    // fastPtr moves two steps at a time, while slowPtr moves one step at a time.
    while (fastPtr != null && fastPtr.next != null) {
        // Move slowPtr one step forward.
        slowPtr = slowPtr.next;

        // Move fastPtr two steps forward.
        fastPtr = fastPtr.next.next;
    }

    // When the loop ends, slowPtr will be at the middle node of the linked list.
    return slowPtr;
}

let head: ListNode = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
addLast(head, 6);

let middle: ListNode | null = middleNode(head);
console.log(middle ? middle.data : "null");

export { };