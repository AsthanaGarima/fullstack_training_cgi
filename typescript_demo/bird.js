"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.bird = void 0;
var bird = /** @class */ (function () {
    function bird() {
    }
    bird.prototype.land = function () {
        return "bird landed off safely";
    };
    bird.prototype.takeoff = function () {
        return "bird is ready for take off";
    };
    bird.prototype.fly = function () {
        return "bird is flying above in the air";
    };
    return bird;
}());
exports.bird = bird;
