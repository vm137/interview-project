The main idea is, the element is said to be minimum in the rotated sorted array if the previous element to it is greater than it or there is no previous element(i.e. no rotation). We can do this using Binary search

Find the mid element i.e. mid = (low+high)/2
If the (mid+1)th element is less than mid element then return (mid+1)th element
If the mid element is less than (mid-1)th element then return the mid element
If the last element is greater than mid element then search in left half
If the last element is less than mid element then search in right half

Time Complexity: O(logn)
Space Complexity: O(1)
