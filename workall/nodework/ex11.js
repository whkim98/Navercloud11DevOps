class Person{
    constructor(name, age){
        this.name = name;
        this.age = age;
    }

printprofile(){
    console.log(`이름: ${this.name}, 나이: ${this.age}`);
}

static showTitle(){
    console.log("es6의 정적함수");
}

}

let p = new Person("손흥민", 25);
p.printprofile();
console.log("pringprofile" in p.__proto__);
console.log("printprofile" in Person.prototype);

Person.showTitle();

