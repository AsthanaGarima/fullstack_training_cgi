import { flyer } from "./flyer";

export class airbus implements flyer{
    land(): string {
        return "airbus landed off safely"
    }
    takeoff(): string {
        return "airbus is ready for take off"
    }
    fly(): string {
       return "airbus is flying above in the air"
    }
    
}