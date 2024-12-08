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

function isPalindrome(head: ListNode | null): boolean {
    //!Find middle of the list
    let slowPtr: ListNode = new ListNode(-1);
    slowPtr.next = head;
    let fastPtr = head;
    while (fastPtr != null && fastPtr.next != null) {
        slowPtr = slowPtr.next as ListNode;
        fastPtr = fastPtr.next.next;
    }

    //!Reverse the list from middle
    let prevNode: ListNode | null = null;
    let currNode: ListNode | null = slowPtr.next;
    while (currNode != null) {
        let nextPtr: ListNode | null = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = nextPtr;
    }

    //!Verify
    while (prevNode != null) {
        if (head?.val != prevNode.val) {
            return false;
        }
        head = head.next;
        prevNode = prevNode.next;
    }
    return true;
};

let head: ListNode = new ListNode(1);
addLast(head, 2);
addLast(head, 2);
addLast(head, 1);
printList(head);
console.log(isPalindrome(head));

export { };