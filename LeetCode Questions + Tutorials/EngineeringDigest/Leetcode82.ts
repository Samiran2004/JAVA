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
    let result = "";
    while (currNode != null) {
        result += `${currNode.val} --> `
        currNode = currNode.next;
    }
    result += "NULL";
    console.log(result);
}

function deleteDuplicates(head: ListNode | null): ListNode | null {
    if (head == null || head.next == null) {
        return head;
    }
    let dummyNode: ListNode = new ListNode(0);
    dummyNode.next = head;
    let prevNode: ListNode | null = dummyNode;
    let currNode: ListNode | null = head;
    while (currNode != null && currNode.next != null) {
        if (currNode.val === currNode.next.val) {
            while (currNode.next != null && currNode.val === currNode.next.val) {
                currNode = currNode.next;
            }
            prevNode.next = currNode.next;
        } else {
            prevNode = currNode;
        }
        currNode = currNode.next;
    }
    return dummyNode.next;
}

let head: ListNode | null = new ListNode(1);
addLast(head, 2);
addLast(head, 3);
addLast(head, 3);
addLast(head, 4);
addLast(head, 4);
addLast(head, 5);
printList(head);
head = deleteDuplicates(head);
printList(head as ListNode);

export { };