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

function printList(head: ListNode | null): void {
    let currNode: ListNode | null = head;
    let result: string = "";
    while (currNode != null) {
        result += `${currNode.val} --> `;
        currNode = currNode.next;
    }
    result += "NULL";
    console.log(result);
}

function oddEvenList(head: ListNode | null): ListNode | null {
    if (head == null || head.next == null) {
        return head;
    }
    let oddNode: ListNode | null = head;
    let evenNode: ListNode | null = oddNode.next;
    let evenHead: ListNode | null = evenNode;
    while (evenNode != null && evenNode.next != null) {
        oddNode.next = evenNode.next;
        oddNode = oddNode.next;
        evenNode.next = oddNode.next;
        evenNode = evenNode.next;
    }
    oddNode.next = evenHead;
    return head;
};

let head: ListNode | null = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
printList(head);
head = oddEvenList(head);
printList(head);

export { };