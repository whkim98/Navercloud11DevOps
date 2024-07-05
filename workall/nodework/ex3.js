const PI = 3.141592;
// PI = 2.345;
let r = 3;
let area = r * r * PI;

console.log("반지름이 %d인 원넓이: %f", r, area);

const pp = {
    "name": "홍길동",
    "addr": "서울"
}

console.log("이름: " + pp.name);
console.log("주소: " + pp.addr);

pp.name = "강호동";
console.log("이름: " + pp.name);

// pp = {
//     "name" : "홍길동2",
//     "addr": "서울2"
// }

// console.log("이름: " + pp.name);