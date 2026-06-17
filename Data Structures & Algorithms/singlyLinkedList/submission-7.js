class Node {
    constructor(val, next = null) {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
    }

    /**
     * @param {number} index
     * @return {number}
     */
    get(index) {
        var node = this.getNode(index);
        if (node === null) {
            return -1;
        }
        return node.val;
    }

    getNode(index) {
        var node = this.head;
        for (var i = 0; i < index; i++) {
            if (node === null) {
                return null;
            }
            node = node.next;
        }
        return node;
    }

    /**
     * @param {number} val
     * @return {void}
     */
    insertHead(val) {
        var node = new Node(val, this.head);
        this.head = node;
    }

    /**
     * @param {number} val
     * @return {void}
     */
    insertTail(val) {
        var newtail = new Node(val, null);
        var node = this.head;
        if (this.head === null) {
            this.head = newtail;
            return;
        }
        while (node.next !== null) {
            node = node.next;
        }
        node.next = newtail;
    }

    /**
     * @param {number} index
     * @return {boolean}
     */
    remove(index) {
        var removeNode = this.getNode(index);
        if (removeNode === null) {
            return false;
        }
        if (index === 0){
            this.head = removeNode.next;
            return true;
        }
        var prevNode = this.getNode(index - 1);
        prevNode.next = removeNode.next;
        return true;
    }

    /**
     * @return {number[]}
     */
    getValues() {
        var arr = new Array();
        var node = this.head;
        while (node !== null) {
            arr.push(node.val);
            node = node.next;
        }
        return arr;
    }
}
