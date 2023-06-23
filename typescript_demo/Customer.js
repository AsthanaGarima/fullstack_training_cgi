// class Customer{
//     //properties
//     firstname: string = 'Mary';
//     lastname: string = 'public';
// }
// //object of the class
//     let myCustomer  = new Customer();
//     console.log(myCustomer.firstname)
//     console.log(myCustomer.lastname)
// class Customer{
//     //properties
//     private firstname: string;
//     private lastname: string;
//     constructor(thefirst:string, thelast:string){
//         console.log("constructor called...")
//        this.firstname = thefirst;
//        this.lastname = thelast;
//     }
// }
// //object of the classprivate 
//     console.log("constructor calling...")
//     let myCustomer  = new Customer('ramesh', 'tendulkar');
//     console.log(myCustomer.firstname)
//     console.log(myCustomer.lastname)
// class Customer{
//     //properties
//     constructor(firstname:string, lastname:string){
//     }
// }
// //object of the classprivate 
//     console.log("constructor calling...")
//     let myCustomer  = new Customer('ramesh', 'tendulkar');
//     console.log(myCustomer.firstname)
//     console.log(myCustomer.lastnamfirstname
// class Customer{
//     //properties
//     private firstname:string;
//     private lastname: string;
//     public getfirstname():string{
//         console.log("get firstname")
//         return this.firstname
//     }
//     public getlastname():string{
//         console.log("get lastname")
//         return this.lastname
//     }
//     public setfirstnameandlastname(fName:string, lName:string){
//         console.log("set firstname and lastname")
//         this.firstname = fName;
//         this.lastname = lName;
//     }
// }
// //object of the classprivate 
//     console.log("constructor calling...")
//     let myCustomer  = new Customer();
//     myCustomer.setfirstnameandlastname('ramesh', 'tendulkar')
//     console.log(myCustomer.getfirstname())
//     console.log(myCustomer.getlastname())
// class Customer
// {
//    private _firstName:string;
//    private _lastName:string;
//    
//    
// public get firstName():string
// {
//     return this._firstName;
// }
// public get lastName():string
// {
//     return this._lastName;
// }
// public set firstName(fname:string)
// {
//     this._firstName=fname;
// }
// public set lastName(lName:string)
// {
//     this._lastName=lName;
// }
// }
// //object of customer class
// console.log('constructor calling....');
// let myCustomer=new Customer()
// myCustomer.firstName="John";
// myCustomer.lastName="Doe";
// console.log(myCustomer.firstName);
// console.log(myCustomer.lastName);
var Person = /** @class */ (function () {
    function Person() {
    }
    Object.defineProperty(Person.prototype, "firstname", {
        get: function () {
            return this._firstname;
        },
        set: function (fname) {
            this._firstname = fname;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Person.prototype, "lastname", {
        get: function () {
            return this._lastname;
        },
        set: function (lname) {
            this._lastname = lname;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Person.prototype, "email", {
        get: function () {
            return this._email;
        },
        set: function (em) {
            this._email = em;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Person.prototype, "age", {
        get: function () {
            return this._age;
        },
        set: function (ag) {
            this._age = ag;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Person.prototype, "isTrue", {
        get: function () {
            return this._isTrue;
        },
        set: function (IT) {
            this._isTrue = IT;
        },
        enumerable: false,
        configurable: true
    });
    return Person;
}());
var myPerson = new Person();
myPerson.firstname = "Garima";
myPerson.lastname = "Asthana";
myPerson.email = "g.a@gmail.com";
myPerson.age = 27;
myPerson.isTrue = true;
console.log("".concat(myPerson.firstname, " ").concat(myPerson.lastname, " ").concat(myPerson.email, " ").concat(myPerson.age, " ").concat(myPerson.isTrue));
