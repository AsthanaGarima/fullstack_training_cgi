import { flyer } from "./flyer";

export class superman implements flyer{
    land(): string {
        return "superman landed off safely"
    }
    takeoff(): string {
        return "superman is ready for take off"
    }
    fly(): string {
       return "superman is flying above in the air"
    }
}