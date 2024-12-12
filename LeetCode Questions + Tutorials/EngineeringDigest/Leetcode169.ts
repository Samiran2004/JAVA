function majorityElement(nums: number[]): number {
    // Initialize the candidate for the majority element and a counter
    let candidate: number = 0, count: number = 0;

    // Loop through each number in the array
    for (let i: number = 0; i < nums.length; i++) {
        let curr: number = nums[i]; // Current number being checked

        // If the count is 0, set the current number as the new candidate
        if (candidate != curr && count == 0) {
            candidate = curr;
            count++;
        } 
        // If the current number is different from the candidate, decrease the count
        else if (candidate != curr && count != 0) {
            count--;
        } 
        // If the current number matches the candidate, increase the count
        else {
            count++;
        }
    }

    // Return the candidate, which is the majority element
    return candidate;
};

// Example usage: 
let nums: number[] = [2, 2, 1, 1, 1, 2, 2];
console.log(majorityElement(nums)); // Output: 2

export { };