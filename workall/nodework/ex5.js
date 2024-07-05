let arr = [3, 5, 7];
let f1 = (a, b) => console.log(a, b);

f1(arr[0], arr[1]);
f1(...arr);

let arr1 = [4, 6];
let arr2 = [10, 20, 30];
let arr3 = [3, 4, ...arr1, 15, ...arr2];

console.log(arr3.length);
console.log(arr3);

let sum = 0;
for(let su of arr3){
    sum += su;
}

console.log(sum);

let [a, ...b] = [1, 2, 3, 4, 5, 6, 7, 8];
console.log(a);
console.log(b);

let [x, y, z] = [23, 45];
console.log(x);
console.log(y);
console.log(z);