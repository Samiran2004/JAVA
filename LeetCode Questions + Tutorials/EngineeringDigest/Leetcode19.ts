class ListNode {
    data: number;
    next: ListNode | null;
    constructor(data: number, next?: ListNode | null) {
        this.data = data;
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

function printList(head: ListNode): void {
    let currNode: ListNode | null = head;
    let result: string = "";
    while (currNode != null) {
        result += `${currNode.data} --> `;
        currNode = currNode.next;
    }
    result += "Null";
    console.log(result);
}

function removeNthFromEnd(head: ListNode | null, n: number): ListNode | null {
    let slowPtr: ListNode | null = head;
    let fastPtr: ListNode | null = head;
    for(let i: number = 1; i <= n; i++) {
        fastPtr = fastPtr.next;
    }
    if(fastPtr == null) {
        return head.next;
    }
    while(fastPtr != null && fastPtr.next != null) {
        slowPtr = slowPtr.next;
        fastPtr = fastPtr.next;
    }
    if(slowPtr != null && slowPtr.next != null) {
        slowPtr.next = slowPtr.next.next;
    }
    return head;
};

let head: ListNode = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
printList(head);

head = removeNthFromEnd(head, 2);
printList(head);