def find_missing_brute(arr):
    n = len(arr)
    for num in range(n + 1):  
        if num not in arr:   
            return num

array = [0, 1]
print("Missing number (brute force):", find_missing_brute(array))
