def find_missing_xor(arr):
    n = len(arr)
    xor_full = 0
    xor_arr = 0
    
    for i in range(n + 1):
        xor_full ^= i
    for num in arr:
        xor_arr ^= num
    return xor_full ^ xor_arr

array = [0, 1]
print("Missing number (XOR):", find_missing_xor(array))


