//...

function add() {
  addEdit();
}

function del(index) {
    arr.splice(index, 1);
    display();
}

function edit(index) {
  btn1.innerHTML = "Edit";
  document.getElementById("name").value = arr[index];
  index = index;
}

function display() {
  let dis = document.getElementById("displayarea");
  dis.innerHTML = "";
  for (let i = 0; i < arr.length; i++) {
    dis.innerHTML += arr[i] + 
      "<button onclick='edit(" + i + ")'>Edit</button>" + 
      "<button onclick='del(" + i + ")'>Delete</button>";
  }
}