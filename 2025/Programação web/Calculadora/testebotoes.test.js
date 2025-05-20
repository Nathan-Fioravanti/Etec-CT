const { Craiz, Cquadrado } = require('../server/calculos'); 

test('Deve calcular a raiz quadrada de 16', () => {
  expect(Craiz(16)).toBe(4);
});

test('calcular a raiz quadrada de 25 ', () => {
  expect(Craiz(25)).toBe(5);
});

test(' calcular a raiz quadrada de 9 ', () => {
  expect(Craiz(9)).toBe(3);
});

test(' calcular o quadrado de 4 ', () => {
  expect(Cquadrado(4)).toBe(16);
});

test('calcular o quadrado de 5 ', () => {
  expect(Cquadrado(5)).toBe(25);
});

test(' calcular o quadrado de 0 ', () => {
  expect(Cquadrado(0)).toBe(0);
});
