function numIdenticalPairs(nums) {
    var map = new Map();
    var sum = 0;
    for (var _i = 0, nums_1 = nums; _i < nums_1.length; _i++) {
        var i = nums_1[_i];
        map.set(i, (map.get(i) || 0) + 1);
    }
    console.log('Map contents:', map);
    console.log('Starting loop');
    for (var _a = 0, _b = map.entries(); _a < _b.length; _a++) {
        var _c = _b[_a], key = _c[0], value = _c[1];
        console.log("Value: ".concat(value, ", Key: ").concat(key));
        sum += (value * (value - 1)) / 2;
    }
    return sum;
}
;
var nums = [1, 2, 3, 1, 1, 3];
console.log(numIdenticalPairs(nums));
