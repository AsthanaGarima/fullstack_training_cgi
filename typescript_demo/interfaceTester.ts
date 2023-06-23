import { BasketBallCoach } from "./BasketBallCoach";
import {​​​​​​ Coach }​​​​​​ from "./Coach";
import {​​​​​​ CricketCoach }​​​​​​ from "./CricketCoach";
import {​​​​​​ FortuneService }​​​​​​ from "./FortuneService";
import {​​​​​​ HappyFortuneService }​​​​​​ from "./HappyFortuneService";
import { MyCoach } from "./MyCoach";
import {​​​​​​ SadFortuneService }​​​​​​ from "./SadFortuneService";
import {​​​​​​ SwimmingCoach }​​​​​​ from "./SwimmingCoach";
let  myCoach:Coach;
let coaches:Coach[]=[]
let fortueService:FortuneService;
fortueService=new HappyFortuneService();
myCoach=new CricketCoach(fortueService);
coaches.push(myCoach);
// console.log(myCoach.getDailyWorkout());
// console.log(myCoach.getDailyFortune());
fortueService=new SadFortuneService();
myCoach=new SwimmingCoach(fortueService);
coaches.push(myCoach);
// console.log(myCoach.getDailyWorkout());
console.log(myCoach.getDailyFortune());
fortueService=new HappyFortuneService();
// console.log(myCoach.getDailyWorkout());
myCoach = new BasketBallCoach(fortueService);
coaches.push(myCoach);
// console.log(myCoach.getDailyFortune());
// console.log(myCoach.getDailyWorkout());
 for(let temp in coaches){
    console.log(coaches[temp]);
 }