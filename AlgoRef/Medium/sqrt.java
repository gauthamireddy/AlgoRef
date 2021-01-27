function squareroot(number) {
    for (var i = 0; i * i <= number; i++) {
        if (i * i === number)
            return i;
   }
   return number; // don't know if you should have this line in case nothing found
}


//alternative sqrt
function squareroot(number) {
    var lo = 0, hi = number;
    while(lo <= hi) {
         var mid = Math.floor((lo + hi) / 2);
         if(mid * mid > number) hi = mid - 1;
         else lo = mid + 1;
    }
    return hi;
}

