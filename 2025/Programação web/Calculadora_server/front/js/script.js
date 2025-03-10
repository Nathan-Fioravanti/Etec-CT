const url = 'http://localhost:3000/'

async function getUrl(){
    const resp = await fetch(url);
    const retorno = await resp.json();
    return retorno;
}

async function exibirUrl() {
    const retorno = await getUrl();
    console.log(retorno);
}

exibirUrl();