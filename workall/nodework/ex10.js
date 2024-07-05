class Student{
    constructor(name){
        this.name = name;
    }
}

let s1 = new Student("lee");
console.log("이름: " + s1.name);

let Sawon = class{
    constructor(name, buseo){
        this.name = name;
        this.buseo = buseo;
    }
}

let sa1 = new Sawon("son", "인사부");
let sa2 = new Sawon("kim", "교육부");
console.log(`${sa1.name}님은 ${sa1.buseo}입니다`);
console.log(`${sa2.name}님은 ${sa2.buseo}입니다`);