"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var MyCricketCoach_1 = require("./MyCricketCoach");
var MySwimSchedule_1 = require("./MySwimSchedule");
var myCoach = new MyCricketCoach_1.MyCricketCoach();
console.log(myCoach.getDailyWorkout());
console.log(myCoach.a());
var myswimcoach = new MySwimSchedule_1.MySwimSchedule();
console.log(myswimcoach.swimschedule());
console.log(myswimcoach.getDailyWorkout());
console.log(myswimcoach.a());
