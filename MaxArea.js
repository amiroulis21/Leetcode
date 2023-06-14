/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    
    let left = 0;
    let right = height.length - 1;
    let maxAr = 0;

    while (left < right) {
        const area = Math.min(height[left], height[right]) * (right - left);
        maxAr = Math.max(maxAr, area);

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxAr;
    
};