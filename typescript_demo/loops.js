// for(let i=0; i<10;i++){
//     console.log(i);
// };
// let j = 0;
// while(j<5){
//     console.log(j);
//     j++;
// }
var a = 0;
var b = 1;
var c = 0;
console.log(a);
console.log(b);
while (c < 20) {
    c = a + b;
    console.log(c);
    a = b;
    b = c;
    // reviews.push(10)
}
var reviews = [5, 4, 3, 2, 1];
reviews.push(10);
var reviews_sum = 0;
reviews.push(10);
var max = 0;
for (var i = 0; i < reviews.length; i++) {
    reviews_sum += reviews[i];
    if (reviews[i] > max) {
        max = reviews[i];
    }
}
var avg = reviews_sum / reviews.length;
console.log(avg);
console.log(max);
