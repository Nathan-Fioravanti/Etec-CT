import express from 'express';

const router = express.Router();

router.get('/cadastro', (req, res) => {
    const { success, error } = req.query; // Obtém os parâmetros da query
    res.render('cadastro', { success, error }); // Passa as mensagens para o template
});

router.get('/paginaPrincipal', (req, res) => {
    res.render('paginaPrincipal');
});

export default router;
