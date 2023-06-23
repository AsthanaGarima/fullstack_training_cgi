"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var BasketBallCoach_1 = require("./BasketBallCoach");
var CricketCoach_1 = require("./CricketCoach");
var HappyFortuneService_1 = require("./HappyFortuneService");
var SadFortuneService_1 = require("./SadFortuneService");
var SwimmingCoach_1 = require("./SwimmingCoach");
var myCoach;
var coaches = [];
var fortueService;
fortueService = new HappyFortuneService_1.HappyFortuneService();
myCoach = new CricketCoach_1.CricketCoach(fortueService);
coaches.push(myCoach);
// console.log(myCoach.getDailyWorkout());
// console.log(myCoach.getDailyFortune());
fortueService = new SadFortuneService_1.SadFortuneService();
myCoach = new SwimmingCoach_1.SwimmingCoach(fortueService);
coaches.push(myCoach);
// console.log(myCoach.getDailyWorkout());
console.log(myCoach.getDailyFortune());
fortueService = new HappyFortuneService_1.HappyFortuneService();
// console.log(myCoach.getDailyWorkout());
myCoach = new BasketBallCoach_1.BasketBallCoach(fortueService);
coaches.push(myCoach);
// console.log(myCoach.getDailyFortune());
// console.log(myCoach.getDailyWorkout());
for (var temp in coaches) {
    console.log(coaches[temp]);
}
