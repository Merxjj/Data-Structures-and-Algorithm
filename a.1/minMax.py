def min_max(arr,low,high):
    if low == high :
        return arr[low ] , arr[high]
    elif low == high-1 :
        if(arr[low]<arr[high]):
            return arr[low] ,arr[high]
        else:  return arr[high] ,arr[low]
    else :
        mid = low+(high-low)/2
        min_max(arr,low,mid)
        min_max(arr,mid+1,high)
        
arr= [2,3,4,6,2,3,3,34,6]
print(min_max(arr,0,len(arr)))