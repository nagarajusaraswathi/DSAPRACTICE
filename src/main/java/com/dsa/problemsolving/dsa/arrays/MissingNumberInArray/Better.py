
def find_missing_sum(arr):
    n = len(arr) 
    expected_sum = n * (n + 1) // 2
    actual_sum = sum(arr)
    return expected_sum - actual_sum

array = [0, 1]
print("Missing number (sum formula):", find_missing_sum(array))
