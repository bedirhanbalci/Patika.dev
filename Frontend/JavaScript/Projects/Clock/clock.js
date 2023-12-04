let userName = prompt("Lütfen Adınızı Giriniz : ");
let myName = document.querySelector("#myName");
myName.innerHTML = `${userName}`;

let myClock = document.querySelector("#myClock");
function showTime() {
  let now = new Date();

  let hour = now.getHours();
  let minute = now.getMinutes();
  let second = now.getSeconds();
  let day = now.getDay();

  hour = hour < 10 ? "0" + hour : hour;
  minute = minute < 10 ? "0" + minute : minute;
  second = second < 10 ? "0" + second : second;

  let dayNumber = now.getDay();
  switch (dayNumber) {
    case 0:
      day = "Pazar";
      break;
    case 1:
      day = "Pazartesi";
      break;
    case 2:
      day = "Salı";
      break;
    case 3:
      day = "Çarşamba";
      break;
    case 4:
      day = "Perşembe";
      break;
    case 5:
      day = "Cuma";
      break;
    case 6:
      day = "Cumartesi";
      break;
  }

  let time = hour + ":" + minute + ":" + second + "   " + day;

  myClock.innerHTML = time;
}
setInterval(() => {
  showTime();
}, 1000);
