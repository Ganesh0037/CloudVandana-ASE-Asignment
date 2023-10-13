let currentInput = '';
let result = 0;

function appendToDisplay(value) {
    currentInput += value;
    document.getElementById('result').value = currentInput;
}

function clearDisplay() {
    currentInput = '';
    result = 0;
    document.getElementById('result').value = '';
}

function calculateResult() {
    try {
        result = eval(currentInput);
        document.getElementById('result').value = result;
    } catch (error) {
        document.getElementById('result').value = 'Error';
    }
    currentInput = '';
}