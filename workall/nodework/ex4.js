// function func(x, y = 100, z = 200){
//     console.log(x,y,z);
// }

let func = (x, y = 100, z = 200) => console.log(x, y, z);

let add = (a, b) => a + b;

let mul = (a, b) => a * b;

func(4);
func(5, 6);
func(1, 2, 3);

console.log(add(3, 5));
console.log(mul(3, 5));
