let obj1 = {"name" : "lee", "age" : 23, "addr" : "seoul"};
console.log(obj1.name);
console.log(obj1.age);
console.log(obj1.addr);

let obj2 = obj1;
console.log(obj2.name);
console.log(obj2.age);
console.log(obj2.addr);

let name1 = obj1.name;
let age1 = obj1.age;
console.log(name1, age1);