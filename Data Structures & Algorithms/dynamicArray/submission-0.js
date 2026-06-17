class DynamicArray {
    /**
     * @constructor
     * @param {number} capacity
     */
    constructor(capacity) {
        this.capacity = capacity;
        this.size = 0; // number of elements in array
        this.arr = new Array(capacity);
    }

    /**
     * @param {number} i
     * @returns {number}
     */
    get(i) {
        return this.arr[i];
    }

    /**
     * @param {number} i
     * @param {number} n
     * @returns {void}
     */
    set(i, n) {
        // console.log(this.arr[i]);
        if (this.arr[i] === undefined) {
            this.size+=1;
        }
        this.arr[i] = n;
    }

    /**
     * @param {number} n
     * @returns {void}
     */
    pushback(n) {
        var oldSize = this.size;
        // console.log(this.size, this.capacity);
        if (this.size === this.capacity) {
            this.resize();
        }
        this.set(oldSize, n);
        // console.log(this.arr);
    }

    /**
     * @returns {number}
     */
    popback() {
        var val = this.arr[this.size-1];
        this.arr[this.size-1] = undefined;
        this.size--;
        return val;
    }

    /**
     * @returns {void}
     */
    resize() {
        var newArr = new Array(this.capacity);
        this.arr = this.arr.concat(newArr);
        this.capacity *= 2;
        // console.log('cap increased', this.capacity);
    }

    /**
     * @returns {number}
     */
    getSize() {
        return this.size;
    }

    /**
     * @returns {number}
     */
    getCapacity() {
        return this.capacity;
    }
}
