class ListNode {
    val: number;
    next: ListNode | null;
    constructor(val: number, next: ListNode | null = null) {
        this.val = val;
        this.next = next;
    }
}

function addLast(head: ListNode, val: number): void {
    let currNode: ListNode = head;
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

function swapNodes(head: ListNode | null, k: number): ListNode | null {

    //! Add elements in an array
    let arr: number[] = [];
    let currNode: ListNode | null = head;
    while (currNode != null) {
        arr.push(currNode.val);
        currNode = currNode.next;
    }

    //! Validate k
    let arrLen: number = arr.length;
    if (k < 1 || k > arrLen) {
        return head;
    }

    //! Swap elements
    let leftIdx: number = k - 1;
    let rightIdx: number = arrLen - k;
    let temp: number = arr[leftIdx];
    arr[leftIdx] = arr[rightIdx];
    arr[rightIdx] = temp;

    //! Create a new linkedList and return it
    let newHead: ListNode | null = new ListNode(arr[0]);
    let tailNode: ListNode | null = newHead;
    for (let i: number = 1; i < arr.length; i++) {
        tailNode.next = new ListNode(arr[i]);
        tailNode = tailNode.next;
    }
    return newHead;

};

let head: ListNode | null = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 4);
addLast(head, 5);
console.log("Before swapping: ");
printList(head);
console.log("After swapping: ");
head = swapNodes(head, 2);
printList(head as ListNode);

export { };