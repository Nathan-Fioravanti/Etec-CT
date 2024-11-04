import express from 'express';
import fs from "fs";
import path from 'path';
import exphbs from 'express-handlebars';
import router from "./views/routers/index.js";

const app = express();
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// Configuração do handlebars
const hbs = exphbs.create({
  helpers: {
    eq: function (a, b) {
      return a == b;
    }
  }
});
app.engine('handlebars', hbs.engine);
app.set('view engine', 'handlebars');
app.use(express.static('public'));

// Rota para a página inicial
app.get("/", (req, res) => res.render("home"));
app.use('/', router);


//cadastrar
const dirPath = 'arquivosTxt';

if (!fs.existsSync(dirPath)) {
    fs.mkdirSync(dirPath);
}

app.post('/cadastro', (req, res) => {
    const { username, email, password, confirmPassword } = req.body;

    if (!username || !email || !password || !confirmPassword) {
        return res.status(400).redirect('/cadastro?error=Campos obrigatórios não preenchidos.');
    }

    if (password !== confirmPassword) {
        return res.status(400).redirect('/cadastro?error=As senhas não coincidem.');
    }

    const userData = `Nome: ${username}\nEmail: ${email}\nSenha: ${password}\n------------------\r\n`;

    // Salva os dados no arquivo user.txt
    fs.appendFile(`${dirPath}/user.txt`, userData, (err) => {
        if (err) {
            console.error("Erro ao salvar o usuário:", err);
            return res.status(500).redirect('/cadastro?error=Erro ao salvar o usuário.');
        }
        console.log("Usuário cadastrado com sucesso:", username);
        res.redirect('/cadastro?success=Usuário cadastrado com sucesso!');
    });
});

// Inicia o servidor
app.listen(5000, () => console.log('Rodando na porta 5000'));
