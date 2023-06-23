// for(let i=0; i<10;i++){
//     console.log(i);
// };

// let j = 0;
// while(j<5){


//     console.log(j);
//     j++;
// }


let a = 0; let b = 1;

let c = 0;


console.log(a);
console.log(b);
while(c<20){
    c = a+b;
    console.log(c);
    a =b;
    b = c;
    // reviews.push(10)
}

let reviews:number[]= [5,4,3,2,1]
reviews.push(10)
let reviews_sum = 0
reviews.push(10)
let max = 0
for(let i =0;i<reviews.length;i++)
{
    reviews_sum+=reviews[i];
    if (reviews[i]> max){
        max = reviews[i]
    }

}
let avg = reviews_sum/reviews.length
console.log(avg);
console.log(max);
