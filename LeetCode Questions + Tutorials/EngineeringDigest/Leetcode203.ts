class ListNode {
    val: number;
    next: ListNode | null;
    constructor(val: number, next: ListNode | null = null) {
        this.val = val;
        this.next = next;
    }
}

function addLast(head: ListNode, val: number): void {
    let currNode: ListNode | null = head;
    while (currNode.next != null) {
        currNode = currNode.next;
    }
    currNode.next = new ListNode(val);
}

function printList(head: ListNode): void {
    let currNode: ListNode | null = head;
    let result: string = "";
    while (currNode != null) {
        result += `${currNode.val} --> `;
        currNode = currNode.next;
    }
    result += "Null";
    console.log(result);
}

function removeElements(head: ListNode | null, val: number): ListNode | null {
    while (head != null && head.val == val) {
        head = head.next;
    }
    let currNode = head;
    while (currNode != null && currNode.next != null) {
        if (currNode.next.val === val) {
            currNode.next = currNode.next.next;
            continue;
        } else {
            currNode = currNode.next;
        }
    }
    return head;
};

let head: ListNode | null = new ListNode(1);
addLast(head, 2);
addLast(head, 6);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
addLast(head, 6);
console.log("Before removing the value: ");
printList(head);
console.log("After removing the value: ");
head = removeElements(head, 6);
printList(head as ListNode);

export { };