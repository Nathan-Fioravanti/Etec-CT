let display = document.getElementById('display');

// Função para adicionar valores ao visor
function adicionarValor(valor) {
    display.value += valor;
 }

// Função para apagar apenas um dígito do visor
function limparUm() {
    display.value = display.value.slice(0, -1);
}

// Função para limpar todo o visor
function limparTudo() {
    display.value = '';
}

//-------------------------------------------------

// Função para calcular a expressão no visor
function calcular() {
    fetch("http://localhost:3000/calcular", {
         method: "POST",
         headers: {
             "Content-Type": "application/json",
         },
         body: JSON.stringify({
             calculo: display.value,
         }),
    })
    .then((response) => response.json())
    .then((data) => {display.value = data.resultado})
 }

// Função para calcular a raiz quadrada do número exibido
function calcularRaiz() {
    fetch("http://localhost:3000/calcularRaiz", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify({
            raiz: display.value,
        }),
    })
    .then((response) => response.json())
    .then((data) => {display.value = data.resultado})
}

// Função para calcular o quadrado do número exibido
function calcularQuadrado() {
    fetch("http://localhost:3000/calcularQuadrado", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify({
            potenciacao: display.value,
        }),
    })
    .then((response) => response.json())
    .then((data) => {display.value = data.resultado})
}
