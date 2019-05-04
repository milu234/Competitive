let userScore = 0;
let computerScore = 0;
const userScore_span = document.getElementById("user-score");
const computerScore_span = document.getElementById("computer-score");
const scoreBoard_div = document.querySelector(".score-board");
const result_p = document.querySelector(".result > p");
const rock_div = document.getElementById("r");
const paper_div = document.getElementById("p");
const scissors_div = document.getElementById("s");

function getComputerChoice() {
	const choices = ['r','p','s'];
	// console.log(Math.random());
	const randomNumber = Math.floor(Math.random()*3);
	return choices[randomNumber];
}

function convertToWord(letter){
	if (letter === "r") return "Rock";
	if (letter === "p") return "Paper";
	return "Scissors";
}



function win(userChoice, computerChoice){
	userScore++;
	userScore_span.innerHTML = userScore;
	computerScore_span.innerHTML = computerScore;
	result_p.innerHTML = convertToWord(userChoice) + " beats " + convertToWord(computerChoice) + " . You win!!!!!";
} 

function draw(){
	
}

function lose(){
	
}

// console.log(getComputerChoice());


function game(userChoice){
	const computerChoice = getComputerChoice();
	switch(userChoice + computerChoice){
		case "rs":
		case "pr":
		case "sp":
			// console.log("USER WINS");
			win(userChoice ,computerChoice);
			break;
		case "rp":
		case "ps":
		case "sr":
			// console.log("USER LOSES");
			lose(userChoice + computerChoice);
			break;
		case "rr":
		case "pp":
		case "ss":
			// console.log("Its a draw");
			draw(userChoice + computerChoice);
			break;

	}
	// console.log("user choice =>" + userChoice);
	// console.log("Computer Choice =>" + computerChoice);

		// console.log("**********" + userChoice);
}

// game("c");

function main() {

	rock_div.addEventListener('click', function () {
	game("r");
	})

	paper_div.addEventListener('click', function () {
	game("p");
	})

	scissors_div.addEventListener('click', function () {
	game("s");
	})

}

main();