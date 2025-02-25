        let display = document.getElementById('display');

        // Função para adicionar valores ao visor
        function adicionarValor(valor) {
            display.value += valor;
        }

        // Função para calcular a expressão no visor
        function calcular() {
            try {
                display.value = eval(display.value);
            } catch {
                display.value = 'Erro';
            }
        }

        // Função para calcular a raiz quadrada do número exibido
        function calcularRaiz() {
            display.value = Math.sqrt(parseFloat(display.value));
        }

        // Função para calcular o quadrado do número exibido
        function calcularQuadrado() {
            display.value = Math.pow(parseFloat(display.value), 2);
        }

        // Função para apagar apenas um dígito do visor
        function limparUm() {
            display.value = display.value.slice(0, -1);
        }

        // Função para limpar todo o visor
        function limparTudo() {
            display.value = '';
        }
  
  