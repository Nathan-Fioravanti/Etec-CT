document.getElementById('registrationForm').addEventListener('submit', async function(e) {
    e.preventDefault(); // Impede o envio do formulário

    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;

    // Verifica se as senhas coincidem
    if (password !== confirmPassword) {
        alert('As senhas não coincidem.'); // Alerta ao usuário
        return; // Interrompe a execução se as senhas não forem iguais
    }

    // Enviar dados para o servidor
    try {
        const response = await fetch('/cadastro', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({username, email,  password, confirmPassword})
        });

        if (!response.ok) {
            throw new Error('Erro ao cadastrar usuário');
        }

        // Aqui você pode lidar com a resposta, por exemplo:
        const result = await response.json();
        if (result.success) {
            alert('Cadastro realizado com sucesso!');
            // Redirecionar ou limpar o formulário, se necessário
        } else {
            alert('Erro: ' + result.message);
        }
    } catch (error) {
        alert('Erro ao cadastrar usuário: ' + error.message);
    }
});

// Exibir mensagens de sucesso ou erro, se existirem
const urlParams = new URLSearchParams(window.location.search);
if (urlParams.has('success')) {
    alert(urlParams.get('success'));
}
if (urlParams.has('error')) {
    alert(urlParams.get('error'));
}

