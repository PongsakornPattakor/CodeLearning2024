function deleteData(){
    let result = confirm("คุณต้องการลบข้อมูลหรือไม่?");
    if(result){
        console.log("ลบข้อมูลทั้งหมดแล้ว");
    }else{
        console.log("ยังไม่ได้ลบข้อมูล");
    }
}