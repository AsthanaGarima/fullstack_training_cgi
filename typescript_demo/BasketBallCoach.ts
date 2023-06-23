import { Coach } from "./Coach";
import { FortuneService } from "./FortuneService";

export class BasketBallCoach implements Coach{
    constructor(private _fortuneService: FortuneService){

    }
    getDailyWorkout(): string {
        return "Practice Free-throws";
    }
    getDailyFortune(): string {
        return this._fortuneService.getFortune();
    }
    
}