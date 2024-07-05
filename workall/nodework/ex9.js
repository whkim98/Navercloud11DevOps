let set1 = new Set("abcdabcdabcdabcdabcd");

console.log("set1의 갯수: " + set1.size);

set1.add(12);
console.log("set1의 갯수: " + set1.size);
console.log(...set1);

set1.delete('b');
console.log("set1의 갯수: " + set1.size);
console.log(...set1);
set1.clear();
console.log("set1의 갯수: " + set1.size);

let map1 = new Map();
let a = {n:1};
map1.set(a, "A");
map1.set("name", "김태희");
console.log(map1.size);
console.log(...map1);
console.log(map1.has("name"));
console.log(map1.has("blood"));

map1.delete("name");
console.log(map1.has("name"));
map1.clear();
console.log("제거 후 갯수: " + map1.size);