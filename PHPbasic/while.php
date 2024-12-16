<?php
    $count = 1;
    $limit = 15;
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>While loop</title>
</head>
<body>
    <select name="" id="">
        <?php while($count<=$limit){?>
            <option value="<?php echo $count;?>">รายการที่ <?php echo $count;?></option>
        <?php $count++;
        }?>
    </select>
</body>
</html>