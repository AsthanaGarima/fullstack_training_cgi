// class Address {
//         private _addressLine1: string;
//         private _addressLine2: string;
//         private _city: string;
//         constructor(addressLine1: string, addressLine2: string, city: string) {
//             this._addressLine1 = addressLine1;
//             this._addressLine2 = addressLine2;
//             this._city = city;
//         }
//         public set addressLine1(line1: string) {
//             this._addressLine1 = line1;
//         }
//         public set addressLine2(line2: string) {
//             this._addressLine2 = line2;
//         }
//         public set city(c: string) {
//             this._city = c;
//         }
//         public get addressLine1(): string {
//             return this._addressLine1;
//         }
//         public get addressLine2(): string {


//             return this._addressLine2;
//         }
//         public get city(): string {
//             return this._city;
//         }
//     }
//     class Customer {
//         private _firstName: string;
//         private _lastName: string;
//         private _address: Address;
//         constructor(fName: string, lName: string, address: Address) {
//             this._firstName = fName;
//             this._lastName = lName;
//             this._address = address;
//         }
//         public set firstName(fName:string)
//         {
//             this._firstName=fName;
//         }
//         public set lastName(lName:string)
//         {
//             this._lastName=lName;
//         }
//         public set address(add:Address)
//         {
//             this._address=add;
//         }


//         public get firstName():string
//         {
//             return this._firstName;
//         }
//         public get lastName():string
//         {
//             return this._lastName;
//         }
//         public get address():Address
//         {
//             return this._address;
//         }
//     }
//     let myAddress=new Address("Telengana","India","Hyderabad");
//     let myCustomer=new Customer("Ram","Kumar",myAddress);
//     console.log("First Name Is: "+myCustomer.firstName);
//     console.log("Last Name: "+myCustomer.lastName);
//     console.log("Address As Follows: \n"+myCustomer.address.addressLine1+" "+myCustomer.address.addressLine2+" "+myCustomer.address.city);




    class Course{

        private _courseId: number;
        private _courseName: string;
        private _instructorName: string;

        constructor(courseId:number, courseName:string, instructorName:string){
            this._courseId = courseId;
            this._courseName = courseName;
            this._instructorName = instructorName;
        }

        get courseId():number{
            return this._courseId
        }

        get courseName():string{
            return this._courseName
        }

        get instructorName():string{
            return this._instructorName
        }

        set courseId(courseId:number){
            this._courseId= courseId
        }

        set courseName(courseName:string){
            this._courseName= courseName
        }

        set instructorName(instructorName:string){
            this.instructorName= instructorName
        }
    }

    class Student{

        private _studentId: number;
        private _studentName: string;
        private _course:any[] ;

        constructor(studentId:number, studentName:string, course:Course){
            this._studentId = studentId;
            this._studentName = studentName;
            this._course = [];
        }

        get studentId():number{
            return this._studentId
        }

        get studentName():string{
            return this._studentName
        }

        get course():Course[]{
            return this._course
        }

        set studentId(studentId:number){
            this._studentId= studentId
        }

        set studentName(studentName:string){
            this._studentName= studentName
        }

        set course(course:Course[]){
            this._course= course
        }
    }

    let myCourse=new Course(1,"abc","xyz");
    let myStudent=new Student(1,"student1",myCourse);
    console.log("Student id Is: "+myStudent.studentId);
    console.log("Student Name: "+myStudent.studentName);
    console.log(myStudent.course[ ])
    for (let val of myStudent.course){
        console.log("important---"+val.courseId)
    }

