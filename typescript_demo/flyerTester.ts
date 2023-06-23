import { bird } from "./bird";
import { airbus } from "./airbus";
import { superman } from "./superman";
import { flyer } from "./flyer";

let myFlyer: flyer
let mybird: bird;

mybird = new bird();

console.log(mybird.land())
console.log(mybird.takeoff())
console.log(mybird.takeoff())

mybird = new airbus();

console.log(mybird.land())
console.log(mybird.takeoff())
console.log(mybird.takeoff())

mybird = new superman();

console.log(mybird.land())
console.log(mybird.takeoff())
console.log(mybird.takeoff())