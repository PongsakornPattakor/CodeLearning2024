<?php

require('dbconnect.php');

$sql = "SELECT * FROM employee_info ORDER BY fname ASC";
$result = mysqli_query($connect, $sql);

$count = mysqli_num_rows($result);

$numId = 1;
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ข้อมูลผู้เข้าชมเว็บไซต์</title>
    <link rel="stylesheet" href="output.css">
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Anuphan:wght@100..700&family=Chakra+Petch:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&family=Chonburi&family=Kanit:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
    <style>
        * {
            font-family: "Kanit";
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }
    </style>
</head>

<body class="container-fluid h-[100vh] w-[100vw] flex justify-center bg-[url('https://cdn.pixabay.com/photo/2020/07/08/04/12/work-5382501_960_720.jpg')] bg-no-repeat bg-cover">
    <main class="container-fluid md:w-[80vw] my-5 bg-white/60 backdrop-blur-md p-3 shadow-2xl shadow-white rounded-xl">
        <h1 class="text-center text-xl md:text-3xl my-3">รายชื่อผู้เข้าชมเว็บไซต์</h1>
        <div class="flex gap-2 justify-self-end">
            <button onclick="checkAll()" class="bg-green-500 border border-black text-white p-2 rounded-md text-center">เลือกทั้งหมด</button>
            <button onclick="uncheckAll()" class="bg-slate-500 border border-black text-white p-2 rounded-md text-center">ยกเลิกการเลือก</button>
        </div>
        <?php if ($count > 0) { ?>
            <div class="bg-black/70 my-3 p-2 flex justify-center rounded-md">
                <table class="border-separate md:w-full">
                    <thead class="text-center text-xl md:text-2xl">
                        <tr class="bg-white">
                            <th class="rounded-md">รหัส</th>
                            <th class="rounded-md">ชื่อ</th>
                            <th class="rounded-md">นามสกุล</th>
                            <th class="rounded-md">ทักษะ</th>
                            <th class="rounded-md">เลือกข้อมูล</th>
                        </tr>
                    </thead>
                    <tbody class="text-center text-md md:text-xl">
                        <?php while ($row = mysqli_fetch_object($result)) { ?>
                            <tr class="bg-white">
                                <td class="rounded-md"><?php echo $numId++ ?></td>
                                <td class="rounded-md"><?php echo $row->fname ?></td>
                                <td class="rounded-md"><?php echo $row->lname ?></td>
                                <td class="rounded-md"><?php echo $row->skills ?></td>
                                <td class="rounded-md">
                                    <form action="multiDel.php" method="POST">
                                        <input type="checkbox" name="idCheck[]" id="" class="size-4" value="<?php echo $row->id ?>">
                                </td>
                            </tr>
                        <?php } ?>
                    </tbody>
                </table>
            </div>
            <div class="flex justify-center gap-2">
                <?php if ($count > 0) { ?>
                    <input type="submit" value="ลบข้อมูลที่เลือก" onclick="return confirm('ต้องการลบข้อมูลที่เลือกหรือไม่')" class="bg-red-500 border border-black text-white p-2 rounded-md text-center hover:cursor-pointer">
                <?php } ?>
                </form>
                <a href="index.php" class="bg-indigo-500 border border-black text-white p-2 rounded-md text-center">กลับหน้าแรก</a>
            <?php } else { ?>
            </div>
            <div class="flex justify-center my-2 text-center">
                <!-- alert when no data -->
                <div class="flex items-center p-4 mb-4 text-xl text-red-800 border border-red-300 rounded-lg bg-white " role="alert">
                    <svg class="flex-shrink-0 inline w-4 h-4 me-3" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                        <path d="M10 .5a9.5 9.5 0 1 0 9.5 9.5A9.51 9.51 0 0 0 10 .5ZM9.5 4a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0-3ZM12 15H8a1 1 0 0 1 0-2h1v-3H8a1 1 0 0 1 0-2h2a1 1 0 0 1 1 1v4h1a1 1 0 0 1 0 2Z" />
                    </svg>
                    <span class="sr-only">Info</span>
                    <div>
                        <span class="font-medium">ไม่พบข้อมูลพนักงาน</span>
                    </div>
                </div>
            </div>
            <div class="flex justify-center">
                <a href="index.php" class="bg-indigo-500 border border-black text-white p-2 rounded-md text-center">กลับหน้าแรก</a>
            </div>
        <?php } ?>
    </main>
</body>
<script>
    function checkAll() {
        let formEle = document.forms[0].length; // ฟอร์มมีค่าเป็น array
        for (let i = 0; i < formEle - 1; i++) {
            document.forms[0].elements[i].checked = true;
        }
    }

    function uncheckAll() {
        let formEle = document.forms[0].length; // ฟอร์มมีค่าเป็น array
        for (let i = 0; i < formEle - 1; i++) {
            document.forms[0].elements[i].checked = false;
        }
    }
</script>

</html>