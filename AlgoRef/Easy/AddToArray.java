
//more options
https://stackoverflow.com/questions/351409/how-to-append-something-to-an-array

//end 
arr[arr.length] = 4
        
arr.push = 4
        
arr.concat([4])
        
//es6
console.log([...arr, 4 ])
        
//specific index
        
let arr = [1,2,3,5]
arr[3] = 4 
        
arr.splice(3,0,4)

// beginning of the array
arr.unshift(4)
