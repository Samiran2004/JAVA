"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function majorityElement(nums) {
    var candidate = 0, count = 0;
    for (var i = 0; i < nums.length; i++) {
        var curr = nums[i];
        if (candidate != curr && count == 0) {
            candidate = curr;
            count++;
        }
        else if (candidate != curr && count != 0) {
            count--;
        }
        else {
            count++;
        }
    }
    return candidate;
}
;
var nums = [2, 2, 1, 1, 1, 2, 2];
console.log(majorityElement(nums));
