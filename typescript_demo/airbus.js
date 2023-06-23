"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.airbus = void 0;
var airbus = /** @class */ (function () {
    function airbus() {
    }
    airbus.prototype.land = function () {
        return "airbus landed off safely";
    };
    airbus.prototype.takeoff = function () {
        return "airbus is ready for take off";
    };
    airbus.prototype.fly = function () {
        return "airbus is flying above in the air";
    };
    return airbus;
}());
exports.airbus = airbus;
