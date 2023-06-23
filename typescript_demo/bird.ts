import { flyer } from "./flyer";

export class bird implements flyer{
    land(): string {
        return "bird landed off safely"
    }
    takeoff(): string {
        return "bird is ready for take off"
    }
    fly(): string {
       return "bird is flying above in the air"
    }

}