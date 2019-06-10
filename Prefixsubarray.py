def length_max_subarray(array, K):
    head, tail = 0, 0
    length = 0
    current_sum = 0
    while(tail<len(array)):
        if current_sum + array[tail]<=K:
            current_sum += array[tail]
            tail+=1
            if tail-head > length:
                length = tail-head
        else:
            current_sum -= array[head]
            head+=1

    return current_sum

array = [1 , 2 ,3 , 2 ,3]
K = 5
print(length_max_subarray(array,K))