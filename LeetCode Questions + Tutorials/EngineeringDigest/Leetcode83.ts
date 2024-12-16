class ListNode {
    val: number
    next: ListNode | null
    constructor(val?: number, next?: ListNode | null) {
        this.val = (val === undefined ? 0 : val)
        this.next = (next === undefined ? null : next)
    }
}

function deleteDuplicates(head: ListNode | null): ListNode | null {
    let currNode: ListNode | null = head;
    while (currNode != null && currNode.next != null) {
        if (currNode.val == currNode.next.val) {
            currNode.next = currNode.next.next;
        } else {
            currNode = currNode.next;
        }
    }
    return head;
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
    console.log(result);
}

let head: ListNode = new ListNode(1);
addLast(head, 2);
addLast(head, 2);
addLast(head, 3);
addLast(head, 3);
addLast(head, 4);
addLast(head, 4);
addLast(head, 5);
addLast(head, 5);
addLast(head, 6);
addLast(head, 6);
printList(head);
console.log("After Removing: ");
deleteDuplicates(head);
printList(head);

export { };