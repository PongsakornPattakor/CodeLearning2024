let weekndSong: string[] = ["reminder", "blinding-light", "starboy"];

// for loop
for (let count = 0; count < weekndSong.length; count++) {
  console.log(`เพลงที่ ${count + 1} คือ ${weekndSong[count]}`);
}

// for each
weekndSong.forEach((e) => {
  console.log(e);
});
