function maior(a, b, c){
    if (a > b && a > c){
        return a;
    } else if (b > a && b > c) {
        return b;
    } else {
        return c;
    }
}

function menor (a, b, c){
    var r = a < b && a < c ? a : b < a && b < c ? b : c;
    return r;
}
function formataMes (mes){
    switch (mes) {
            case 1:
            console.log("janeiro");
            break;

            case 2:
            console.log("fevereiro");
            break;

            case 3:
            console.log("março");
            break;

            case 4:
            console.log("abril");

            break;
            default:
            console.log ("nao implementei ainda")

    }
}
console.log (maior(4, 7, 87));
console.log (menor(23, 54, 60));
formataMes(3)