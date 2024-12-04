class ListNode {
    val: number
    next: ListNode | null
    constructor(val?: number, next?: ListNode | null) {
        this.val = (val === undefined ? 0 : val)
        this.next = (next === undefined ? null : next)
    }
}

function addLast(head: ListNode, val: number): void {
    let currNode = head;
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

function reverseList(head: ListNode, left: number, right: number): ListNode | null {
    if (head == null || head.next == null || left == right) {
        return head;
    }
    let currNode: ListNode | null = head;
    let prevNode: ListNode | null = null;
    let i: number = 1;
    while (currNode != null && i != left) {
        prevNode = currNode;
        currNode = currNode.next;
        i++;
    }
    let pointerToStart: ListNode | null = prevNode;
    let start: ListNode | null = currNode;
    while (currNode != null && i != right + 1) {
        let nextNode: ListNode | null = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = nextNode;
        i++;
    }
    start.next = currNode;
    if (pointerToStart != null) {
        pointerToStart.next = prevNode;
    } else {
        return prevNode;
    }
    return head;
}

let head: ListNode | null = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
addLast(head, 6);
addLast(head, 7);
addLast(head, 8);
addLast(head, 9);
console.log("Before reversing the list is: ");
printList(head);
console.log("After reversing the list is: ");
head = reverseList(head, 2, 6);
printList(head as ListNode);

export { };