class ListNode {
    val: number
    next: ListNode | null
    constructor(val?: number, next?: ListNode | null) {
        this.val = (val === undefined ? 0 : val)
        this.next = (next === undefined ? null : next)
    }
}

function reverseList(head: ListNode | null): ListNode | null {
    let prevNode: ListNode | null = null;
    let presNode: ListNode | null = head;
    let nextNode: ListNode | null;
    while (presNode != null) {
        nextNode = presNode.next;
        presNode.next = prevNode;
        prevNode = presNode;
        presNode = nextNode;
    }
    return prevNode;
};
function addLast(head: ListNode, data: number): void {
    let currNode: ListNode | null = head;
    while (currNode?.next != null) {
        currNode = currNode.next;
    }
    currNode.next = new ListNode(data);
}

function printList(head: ListNode): void {
    let currNode: ListNode | null = head;
    let result: string = "";
    while (currNode != null) {
        result += `${currNode.val} --> `;
        currNode = currNode.next;
    }
    result += "Null";
}

let head: ListNode = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
addLast(head, 6);
printList(head);
reverseList(head);
printList(head);