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


class Person{

    private _firstname:string;
    private _lastname:string;
    private _email: string;
    private _age:number;
    private _isTrue:boolean;

    public get firstname():string{
        return this._firstname
    }

    public get lastname():string{
        return this._lastname
    }

    public get email():string{
        return this._email
    }

    public get age():number{
        return this._age
    }

    public get isTrue():boolean{
        return this._isTrue
    }

    public set firstname(fname:string){
         this._firstname = fname
    }

    public set lastname(lname:string){
         this._lastname = lname
    }

    public set email(em:string){
         this._email = em
    }

    public set age(ag:number){
         this._age = ag
    }

    public set isTrue(IT:boolean){
         this._isTrue = IT
    }
}

let myPerson = new Person();
myPerson.firstname = "xyz"
myPerson.lastname = "abc"
myPerson.email = "g.a@gmail.com"
myPerson.age = 10
myPerson.isTrue = true

console.log(`${myPerson.firstname} ${myPerson.lastname} ${myPerson.email} ${myPerson.age} ${myPerson.isTrue}`)