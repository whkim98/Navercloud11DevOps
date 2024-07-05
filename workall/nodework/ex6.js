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

let {name, age} = obj1;
console.log("es6 name" + name);
console.log("es6 age" + age);

function f1({name = "수지", age = 22} = {}){
    console.log("name" + name);
    console.log("age" + age);
}

f1();
f1(obj1);

