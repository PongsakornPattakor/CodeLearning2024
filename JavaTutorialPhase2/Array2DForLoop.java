public class Array2DForLoop {
    public static void main(String[] args) {
        String [][] furni = {
            {"เก้าอี้","โต๊ะ","โคมไฟ"},
            {"คีย์บอร์ด","เมาส์","แป้นพิมพ์"}, 
            {"ลิปติก","โรลออน","ครีม"}
        };
        for(int row=0 ; row<furni.length ; row++){
            for(int col=0 ; col<furni[row].length ; col++){
            System.out.println("ตำแหน่งสมาชิกfurni แถวที่ "+ row + " คอลัมน์ที่ " + col + " = " + furni[row][col]);
            }
        }
    }
}
