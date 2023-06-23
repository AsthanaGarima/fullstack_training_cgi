"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.MySwimSchedule = void 0;
var MySwimmingCoach_1 = require("./MySwimmingCoach");
var MySwimSchedule = /** @class */ (function (_super) {
    __extends(MySwimSchedule, _super);
    function MySwimSchedule() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    MySwimSchedule.prototype.swimschedule = function () {
        return "practice at 7 in morning!";
    };
    MySwimSchedule.prototype.getDailyWorkout = function () {
        return "work out daily!";
    };
    MySwimSchedule.prototype.a = function () {
        return "a function called";
    };
    return MySwimSchedule;
}(MySwimmingCoach_1.MySwimmingCoach));
exports.MySwimSchedule = MySwimSchedule;
