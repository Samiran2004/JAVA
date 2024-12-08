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

function getDecimalValue(head: ListNode | null): number {
    let res: number = 0;
    while (head != null) {
        if (head.val === 0) {
            res = res << 1;
        } else {
            res = (res << 1) + 1;
        }
        head = head.next;
    }
    return res;
};

let head: ListNode = new ListNode(1);
addLast(head, 0);
addLast(head, 1);
printList(head);
console.log(`Decimal value: ${getDecimalValue(head)}`);

export { };