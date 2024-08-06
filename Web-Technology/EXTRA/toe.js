let boxes = document.querySelectorAll('.box');
let reset = document.querySelector('#reset-btn');
let newGamebtn = document.querySelector("#new-btn");
let msgcontainer = document.querySelector(".msg-container");
let winner = document.querySelector("#winner");


let turnO = true;
let count = 0;

// let start = document.querySelector('.start');

// function start(){
    
// }

// using 2D array
const WinPattern = [
    [0,1,2],
    [3,4,5],
    [6,7,8],
    [0,3,6],
    [1,4,7],
    [2,5,8],
    [0,4,8],
    [2,4,6],
];

    const resetGame = () => {
        turnO = true;
        EnableBox();
        msgcontainer.classList.add("hide");
        count = 0;
    }

boxes.forEach((box) => {
    box.addEventListener("click",() => {
        console.log("button has been clicked");
        if(turnO){
            box.innerText = "O";
            turnO = false;
        }
        else{
            box.innerText = "X";
            turnO = true;
        }
        box.disabled = true;
        count++;

       let iswinner =  CheckWinner();

       if(count == 9 && !iswinner){
        gameDraw();
       }
    })
});

    const gameDraw = () => {
        msgcontainer.innerText = `Game was a Draw`;
        msgcontainer.classList.remove("hide");
        DisableBox();
    }

    const DisableBox = () => {
        for(let box of boxes){
            box.disabled = true;
        }
    }

    const EnableBox = () => {
        for(let box of boxes){
            box.disabled = false;
            box.innerText = "";
        }
    }

    const showWinner = (winner) => {
        winner.innerText = `Congratulation the winner is ${winner}`;
        msgcontainer.classList.remove("hide");
        DisableBox();
    }

const CheckWinner = () => {
    for(let pattern of WinPattern){
        let pos1Val = boxes[pattern[0]].innerText;
        let pos2Val = boxes[pattern[1]].innerText;
        let pos3Val = boxes[pattern[2]].innerText;

        if(pos1Val != "" && pos2Val != "" && pos3Val != ""){
            if(pos1Val === pos2Val && pos2Val === pos3Val){
                showWinner(pos1Val);
                return true;
            }
        }
    }
};


newGamebtn.addEventListener("click",resetGame);
reset.addEventListener("click",resetGame);