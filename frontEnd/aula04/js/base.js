//JS é case sensitive
//ponto e vírgula não é obrigatório

// console do browser
console.log('Olá, usando o console');
console.log('Outra mensagem');

//variáveis
// Não existem tipos na declaração de variável
// JS possui timpagem automatica, conforme valor é atribuído
// usar let ou const - var NÃO USAR 
let nomeUsuario = 'Israel Marques';
let idUsuario = 789456;
let logado = true;
const DATA_NASCIMENTO = '02/12';

console.log(nomeUsuario, typeof nomeUsuario);
console.log(idUsuario, typeof idUsuario);
console.log(logado, typeof(logado));
console.log(DATA_NASCIMENTO, typeof DATA_NASCIMENTO);

logado = 321698;
console.log(logado, typeof logado);

// concatenação NÃO FAZER
console.log("Nome: " + nomeUsuario + " logado" + logado);

// Template String
// Iniciar e terminar com sinal de crase ``
// placeholder ${ variável, método, função, objeto...}
console.log(`Nome: ${nomeUsuario} - id: ${idUsuario}
    ${40*40} ${Math.ceil(Math.random()*100)}`);

let primeiroNumero = 10;
let segundoNumero = '10';

console.log(`${primeiroNumero} == ${segundoNumero} : ${primeiroNumero == segundoNumero}`);
console.log(`${primeiroNumero} === ${segundoNumero} : ${primeiroNumero === segundoNumero}`);

// Arrays
// const pessoas = new Array();
const pessoas = ['Eu','Tu','Ele','Nós','Vós','Eles'];
console.log(pessoas);
console.table(pessoas);

// inserindo no primeiro índice
pessoas.unshift('Eu mesmo');
console.table(pessoas);

// excluir o valor do primeiro índice
// ELE EXCLUI MESMO - CUIDADO
pessoas.shift();
console.table(pessoas);

// inserir no último índice
pessoas.push('Eu mesmo');
console.table(pessoas);

// excluir o valor do último índice
// ELE EXCLUI MESMO - CUIDADO
pessoas.pop();
console.table(pessoas);

//excluindo em qq parte do array
pessoas.splice(2,2);
console.table(pessoas);

// incluir em qq parte do array
pessoas.splice(2,0,'Nós','Eles', 9876, true, 789.546, 'Eu mesmo');
console.table(pessoas);




