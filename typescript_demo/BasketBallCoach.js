"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.BasketBallCoach = void 0;
var BasketBallCoach = /** @class */ (function () {
    function BasketBallCoach(_fortuneService) {
        this._fortuneService = _fortuneService;
    }
    BasketBallCoach.prototype.getDailyWorkout = function () {
        return "Practice Free-throws";
    };
    BasketBallCoach.prototype.getDailyFortune = function () {
        return this._fortuneService.getFortune();
    };
    return BasketBallCoach;
}());
exports.BasketBallCoach = BasketBallCoach;
