def hoare_partition(arr, low, high):
    pivot = arr[low]  
    p = low + 1
    q = high

    while True:
       
        while p <= q and arr[p] < pivot:
            p += 1
        
       
        while p <= q and arr[q] > pivot:
            q -= 1

        if p >= q: 
            break

        
        arr[p], arr[q] = arr[q], arr[p]

    
    arr[low], arr[q] = arr[q], arr[low]

    return q 

def quick_sort(arr, low, high):
    if low < high:
        pi = hoare_partition(arr, low, high)  
        quick_sort(arr, low, pi - 1)  
        quick_sort(arr, pi + 1, high)  

arr = [10, 7, 8, 9, 1, 5]
print("Unsorted array:", arr)
quick_sort(arr, 0, len(arr) - 1)
print("Sorted array:", arr)



def hoare_partition(arr, low, high):
    pivot = arr[low]
    p= arr[low]
    q=high

    while True:
        while p<=q and p<pivot:
            p+=1
        while p<=q and q>pivot:
            p-=1

        if p>=q:
     


//quick sort