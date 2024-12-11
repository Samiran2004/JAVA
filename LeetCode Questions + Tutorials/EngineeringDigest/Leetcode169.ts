function majorityElement(nums: number[]): number {
    let candidate: number = 0, count: number = 0;
    for (let i: number = 0; i < nums.length; i++) {
        let curr: number = nums[i];
        if (candidate != curr && count == 0) {
            candidate = curr;
            count++;
        } else if (candidate != curr && count != 0) {
            count--;
        } else {
            count++;
        }
    }
    return candidate;
};

let nums: number[] = [2, 2, 1, 1, 1, 2, 2];
console.log(majorityElement(nums));

export { };