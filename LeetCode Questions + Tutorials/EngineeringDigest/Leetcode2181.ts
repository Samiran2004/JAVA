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
    result += "NULL";
    console.log(result);
}

function mergeNodes(head: ListNode | null): ListNode | null {
    if (head == null || head.next == null) {
        return head;
    }
    let currNode: ListNode = head;
    let arr: number[] = [];
    let sum: number = 0;
    while (currNode != null) {
        if (currNode.val != 0) {
            while (currNode.val != 0) {
                sum += currNode.val;
                currNode = currNode.next;
            }
            arr.push(sum);
            sum = 0;
        } else {
            currNode = currNode.next;
        }
    }
    let newHead: ListNode = new ListNode(arr[0]);
    let tailNode: ListNode | null = newHead;
    for (let i: number = 1; i < arr.length; i++) {
        let newNode: ListNode = new ListNode(arr[i]);
        tailNode.next = newNode;
        tailNode = newNode;
    }
    return newHead;
};

let head: ListNode | null = new ListNode(0);
addLast(head, 3);
addLast(head, 1);
addLast(head, 0);
addLast(head, 4);
addLast(head, 5);
addLast(head, 2);
addLast(head, 0);
printList(head);
let newHead: ListNode = mergeNodes(head) as ListNode;
printList(newHead);