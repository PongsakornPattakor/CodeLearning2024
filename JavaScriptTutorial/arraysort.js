let points = [20,-5,-2,40,100,-500,-150];
console.log(points);

//เรียงลำดับ น้อย>มาก
points.sort(function(a,b){
    return a-b;
});
console.log(points);

//เรียงลำดับ มาก>น้อย
points.sort(function(a,b){
    return b-a;
})
console.log(points);