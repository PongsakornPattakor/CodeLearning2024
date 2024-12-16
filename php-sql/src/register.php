<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>แบบฟอร์มบันทึกข้อมูล</title>
    <link rel="stylesheet" href="output.css">
    <!-- <script src="https://cdn.tailwindcss.com"></script> -->
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

<body class="bg-[url('https://cdn.pixabay.com/photo/2024/07/12/03/03/bacteria-8889330_1280.jpg')] bg-cover bg-center bg-no-repeat h-[100vh] content-center">
    <main class="container-fluid bg-white/50 backdrop-blur-md ring ring-2 ring-black flex flex-row justify-self-center md:w-[50vw] md:h-[60vh] my-6 mx-2 p-4 rounded-md self-center">
        <div class="md:w-full overflow-auto">
            <h1 class="my-3 text-center text-xl md:text-3xl font-bold">แบบฟอร์มบันทึกข้อมูล</h1>
            <form action="insertData.php" method="POST">
                <!-- fname     -->
                <div class="my-2">
                    <label class="md:text-2xl md:font-bold" for="fname">ชื่อจริง</label>
                    <input type="text" name="fname" id="" class="border border-black rounded-md md:w-full w-9/12 md:h-auto md:text-xl text-center">
                </div>
                <!-- lname -->
                <div class="my-2">
                    <label class="md:text-2xl md:font-bold" for="lname">นามสกุล</label>
                    <input type="text" name="lname" id="" class="border border-black rounded-md md:w-full w-9/12 md:h-auto md:text-xl text-center">
                </div>
                <!-- gender -->
                <div class="my-2">
                    <label class="md:text-2xl md:font-bold" for="gender">เพศ</label>
                    <input type="radio" name="gender" class="md:size-5" value="male"><span class="mx-2 md:text-xl">ชาย</span>
                    <input type="radio" name="gender" class="md:size-5" value="female"><span class="mx-2 md:text-xl">หญิง</span>
                    <input type="radio" name="gender" class="md:size-5" value="others"><span class="mx-2 md:text-xl">อื่นๆ</span>
                </div>
                <!-- age -->
                <div class="my-2">
                    <label class="md:text-2xl md:font-bold" for="age">อายุ</label>
                    <input type="number" name="age" id="" class="border border-black rounded-md md:w-full w-9/12 md:h-auto md:text-xl text-center">
                </div>
                <!-- email -->
                <div class="my-2">
                    <label class="md:text-2xl md:font-bold" for="email">e-mail</label>
                    <input type="email" name="email" id="" class="border border-black rounded-md md:w-full w-9/12 md:h-auto md:text-xl text-center">
                </div>
                <!-- skills -->
                <div class="my-2">
                    <label class="md:text-2xl md:font-bold" for="skills">ทักษะด้านโปรแกรมมิ่ง</label><br>
                    <input type="checkbox" name="skills[]" class="md:size-5" value="Java"><span class="mx-2 md:text-xl">Java</span>
                    <input type="checkbox" name="skills[]" class="md:size-5" value="JavaScript"><span class="mx-2 md:text-xl">JavaScript</span>
                    <input type="checkbox" name="skills[]" class="md:size-5" value="HTML"><span class="mx-2 md:text-xl">HTML</span>
                    <input type="checkbox" name="skills[]" class="md:size-5" value="PHP"><span class="mx-2 md:text-xl">PHP</span>
                    <input type="checkbox" name="skills[]" class="md:size-5" value="Python"><span class="mx-2 md:text-xl">Python</span>
                    <input type="checkbox" name="skills[]" class="md:size-5" value="SQL"><span class="mx-2 md:text-xl">SQL</span>
                    <input type="checkbox" name="skills[]" class="md:size-5" value="other"><span class="mx-2 md:text-xl">อื่นๆ</span>
                </div>
                <div class="mt-2 flex md:justify-center md:self-end gap-4">
                    <input type="submit" value="บันทึกข้อมูล" class="p-1 w-[10vw] text-wrap grow md:grow-0 border border-black bg-[#47ab15] text-white rounded-md hover:cursor-pointer  transition-all duration-200 md:hover:grow delay-200">
                    <input type="reset" value="ล้างข้อมูล" class="p-1 w-[10vw] text-wrap grow md:grow-0 border border-black bg-[#ff1414] text-white rounded-md hover:cursor-pointer transition-all duration-200 md:hover:grow delay-200">
                    <a href="index.php" class="p-1 w-[10vw] text-wrap grow md:grow-0 border border-black bg-[#2273f5] text-white rounded-md text-center transition-all duration-200 md:hover:grow delay-200">กลับหน้าแรก</a>
                </div>
            </form>
        </div>
    </main>
</body>

</html>