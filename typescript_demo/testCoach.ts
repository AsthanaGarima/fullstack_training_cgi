import { MyCoach } from "./MyCoach";
import { MyCricketCoach } from "./MyCricketCoach";
import { MySwimSchedule } from "./MySwimSchedule";
import { MySwimmingCoach } from "./MySwimmingCoach";

let myCoach = new MyCricketCoach();
console.log(myCoach.getDailyWorkout())
console.log(myCoach.a());

let myswimcoach = new MySwimSchedule();
console.log(myswimcoach.swimschedule())
console.log(myswimcoach.getDailyWorkout())
console.log(myswimcoach.a())